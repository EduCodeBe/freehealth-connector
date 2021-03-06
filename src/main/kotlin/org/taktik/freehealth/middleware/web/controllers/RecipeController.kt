/*
 *
 * Copyright (C) 2018 Taktik SA
 *
 * This file is part of FreeHealthConnector.
 *
 * FreeHealthConnector is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation.
 *
 * FreeHealthConnector is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with FreeHealthConnector.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.taktik.freehealth.middleware.web.controllers

import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController
import org.taktik.freehealth.middleware.domain.recipe.Feedback
import org.taktik.freehealth.middleware.domain.recipe.Prescription
import org.taktik.freehealth.middleware.domain.recipe.PrescriptionFullWithFeedback
import org.taktik.freehealth.middleware.dto.Code
import org.taktik.freehealth.middleware.dto.recipe.PrescriptionRequest
import org.taktik.freehealth.middleware.exception.MissingTokenException
import org.taktik.freehealth.middleware.service.RecipeService
import org.taktik.freehealth.utils.FuzzyValues
import java.util.*
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("/recipe")
class RecipeController(val recipeService: RecipeService) {
    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(MissingTokenException::class)
    @ResponseBody
    fun handleBadRequest(req: HttpServletRequest, ex: Exception): String = ex.message ?: "unknown reason"

    @ResponseStatus(HttpStatus.UNAUTHORIZED)
    @ExceptionHandler(javax.xml.ws.soap.SOAPFaultException::class)
    @ResponseBody

fun handleBadRequest(req: HttpServletRequest, ex: javax.xml.ws.soap.SOAPFaultException): String = ex.message ?: "unknown reason"

@PostMapping("", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun createPrescription(@RequestHeader(name = "X-FHC-keystoreId") keystoreId: UUID, @RequestHeader(name = "X-FHC-tokenId") tokenId: UUID, @RequestParam hcpQuality: String, @RequestParam hcpNihii: String, @RequestParam hcpSsin: String, @RequestParam hcpName: String, @RequestHeader(name = "X-FHC-passPhrase") passPhrase: String, @RequestBody prescription: PrescriptionRequest): Prescription =
        recipeService.createPrescription(
            keystoreId = keystoreId,
            tokenId = tokenId,
            hcpQuality = hcpQuality,
            hcpNihii = hcpNihii,
            hcpSsin = hcpSsin,
            hcpName = hcpName,
            passPhrase = passPhrase,
            patient = prescription.patient!!,
            hcp = prescription.hcp!!,
            feedback = prescription.feedback!!,
            medications = prescription.medications!!,
            prescriptionType = prescription.prescriptionType,
            notification = prescription.notification,
            executorId = prescription.executorId,
            deliveryDate = prescription.deliveryDate?.let {FuzzyValues.getLocalDateTime(it)}
        )

    @GetMapping("", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun listOpenPrescriptions(@RequestHeader(name = "X-FHC-keystoreId") keystoreId: UUID, @RequestHeader(name = "X-FHC-tokenId") tokenId: UUID, @RequestParam hcpQuality: String, @RequestParam hcpNihii: String, @RequestParam hcpSsin: String, @RequestParam hcpName: String, @RequestHeader(name = "X-FHC-passPhrase") passPhrase: String): List<Prescription> =
        recipeService.listOpenPrescriptions(
            keystoreId = keystoreId,
            tokenId = tokenId,
            hcpQuality = hcpQuality,
            hcpNihii = hcpNihii,
            hcpSsin = hcpSsin,
            hcpName = hcpName,
            passPhrase = passPhrase
        )

    @GetMapping("/patient", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun listOpenPrescriptionsByPatient(@RequestHeader(name = "X-FHC-keystoreId") keystoreId: UUID, @RequestHeader(name = "X-FHC-tokenId") tokenId: UUID, @RequestParam hcpQuality: String, @RequestParam hcpNihii: String, @RequestParam hcpSsin: String, @RequestParam hcpName: String, @RequestParam patientId: String, @RequestHeader(name = "X-FHC-passPhrase") passPhrase: String): List<Prescription> =
        recipeService.listOpenPrescriptions(
            keystoreId = keystoreId,
            tokenId = tokenId,
            hcpQuality = hcpQuality,
            hcpNihii = hcpNihii,
            hcpSsin = hcpSsin,
            hcpName = hcpName,
            passPhrase = passPhrase,
            patientId = patientId
        )

    @PostMapping("/notify/{rid}", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun sendNotification(
        @RequestHeader(name = "X-FHC-keystoreId") keystoreId: UUID,
        @RequestHeader(name = "X-FHC-tokenId") tokenId: UUID,
        @RequestParam hcpQuality: String,
        @RequestParam hcpNihii: String,
        @RequestParam hcpSsin: String,
        @RequestParam hcpName: String,
        @RequestHeader(name = "X-FHC-passPhrase") passPhrase: String,
        patientId: String,
        executorId: String,
        @PathVariable rid: String,
        text: String
    ) = recipeService.sendNotification(
        keystoreId = keystoreId,
        tokenId = tokenId,
        hcpQuality = hcpQuality,
        hcpNihii = hcpNihii,
        hcpSsin = hcpSsin,
        hcpName = hcpName,
        passPhrase = passPhrase,
        patientId = patientId,
        executorId = executorId,
        rid = rid,
        text = text
    )

    @DeleteMapping("/{rid}")
    fun revokePrescription(@RequestHeader(name = "X-FHC-keystoreId") keystoreId: UUID, @RequestHeader(name = "X-FHC-tokenId") tokenId: UUID, @RequestParam hcpQuality: String, @RequestParam hcpNihii: String, @RequestParam hcpSsin: String, @RequestParam hcpName: String, @RequestHeader(name = "X-FHC-passPhrase") passPhrase: String, @PathVariable rid: String, @RequestParam reason: String) =
        recipeService.revokePrescription(
            keystoreId = keystoreId,
            tokenId = tokenId,
            hcpQuality = hcpQuality,
            hcpNihii = hcpNihii,
            hcpSsin = hcpSsin,
            hcpName = hcpName,
            passPhrase = passPhrase,
            rid = rid,
            reason = reason
        )

    @PutMapping("/{rid}/feedback/{feedbackFlag}")
    fun updateFeedbackFlag(@RequestHeader(name = "X-FHC-keystoreId") keystoreId: UUID, @RequestHeader(name = "X-FHC-tokenId") tokenId: UUID, @RequestParam hcpQuality: String, @RequestParam hcpNihii: String, @RequestParam hcpSsin: String, @RequestParam hcpName: String, @RequestHeader(name = "X-FHC-passPhrase") passPhrase: String, @PathVariable rid: String, @PathVariable feedbackFlag: Boolean) =
        recipeService.updateFeedbackFlag(
            keystoreId = keystoreId,
            tokenId = tokenId,
            hcpQuality = hcpQuality,
            hcpNihii = hcpNihii,
            hcpSsin = hcpSsin,
            hcpName = hcpName,
            passPhrase = passPhrase,
            rid = rid,
            feedbackFlag = feedbackFlag
        )

    @GetMapping("/all/feedbacks", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun listFeedbacks(@RequestHeader(name = "X-FHC-keystoreId") keystoreId: UUID, @RequestHeader(name = "X-FHC-tokenId") tokenId: UUID, @RequestParam hcpQuality: String, @RequestParam hcpNihii: String, @RequestParam hcpSsin: String, @RequestParam hcpName: String, @RequestHeader(name = "X-FHC-passPhrase") passPhrase: String): List<Feedback> =
        recipeService.listFeedbacks(
            keystoreId = keystoreId,
            tokenId = tokenId,
            hcpQuality = hcpQuality,
            hcpNihii = hcpNihii,
            hcpSsin = hcpSsin,
            hcpName = hcpName,
            passPhrase = passPhrase
        )

    @GetMapping("/gal/{galId}", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun getGalToAdministrationUnit(@PathVariable galId: String): Code? = recipeService.getGalToAdministrationUnit(galId)

    @GetMapping("/{rid}", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun getPrescription(@PathVariable rid: String): PrescriptionFullWithFeedback? = recipeService.getPrescription(rid)

    @GetMapping("/prescription/{rid}", produces = [MediaType.APPLICATION_JSON_UTF8_VALUE])
    fun getPrescriptionMessage(@RequestHeader(name = "X-FHC-keystoreId") keystoreId: UUID, @RequestHeader(name = "X-FHC-tokenId") tokenId: UUID, @RequestParam hcpQuality: String, @RequestParam hcpNihii: String, @RequestParam hcpSsin: String, @RequestParam hcpName: String, @RequestHeader(name = "X-FHC-passPhrase") passPhrase: String, @PathVariable rid: String): org.taktik.connector.business.domain.kmehr.v20161201.be.fgov.ehealth.standards.kmehr.schema.v1.Kmehrmessage? =
        recipeService.getPrescriptionMessage(keystoreId = keystoreId,
            tokenId = tokenId,
            hcpQuality = hcpQuality,
            hcpNihii = hcpNihii,
            hcpSsin = hcpSsin,
            hcpName = hcpName,
            passPhrase = passPhrase,
            rid = rid)
}
