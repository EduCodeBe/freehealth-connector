package org.taktik.freehealth.middleware.drugs.civics;

import java.util.Date;

public class Wada {

	String wadaCv;
	Date startDate;
	Date createdTms;
	String createdUserId;
	Date endDate;
	Long nameId;
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWadaCv() {
        return wadaCv;
    }

    public void setWadaCv(String wadaCv) {
        this.wadaCv = wadaCv;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getCreatedTms() {
        return createdTms;
    }

    public void setCreatedTms(Date createdTms) {
        this.createdTms = createdTms;
    }

    public String getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(String createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getNameId() {
        return nameId;
    }

    public void setNameId(Long nameId) {
        this.nameId = nameId;
    }
}

