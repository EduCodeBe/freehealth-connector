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

package org.taktik.freehealth.middleware.dto.genins

import org.taktik.freehealth.middleware.dto.genins.PeriodDto
import java.io.Serializable
import java.time.Instant

/**
 * Created with IntelliJ IDEA.
 * User: aduchate
 * Date: 28/05/13
 * Time: 09:23
 * To change this template use File | Settings | File Templates.
 */
class InsurabilityItemDto(
        val regNrWithMut: String? = null,
        val mutuality: String? = null,
        val period: PeriodDto? = null,
        val ct1: String? = null,
        val ct2: String? = null,
        val paymentApproval: String? = null,
        val insurabilityDate: Long? = null
) : Serializable
