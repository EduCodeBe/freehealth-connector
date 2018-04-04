package org.taktik.freehealth.middleware.drugs;
// Generated Feb 27, 2008 11:38:04 AM by Hibernate Tools 3.2.0.CR1


import org.taktik.freehealth.middleware.drugs.dto.AtcId;

/**
 * Atc generated by hbm2java
 */
public class Atc implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
     private AtcId id;
     private Boolean current;
     private String offmarket;
     private Float dosespropackage;
     private String code;
     private String name;
     private Float defineddailydose;
     private String defineddailydoseunits;
     private String type;

    public Atc() {
    }

	
    public Atc(AtcId id) {
        this.id = id;
    }
    public Atc(AtcId id, Boolean current, String offmarket, Float dosespropackage, String code, String name, Float defineddailydose, String defineddailydoseunits, String type) {
       this.id = id;
       this.current = current;
       this.offmarket = offmarket;
       this.dosespropackage = dosespropackage;
       this.code = code;
       this.name = name;
       this.defineddailydose = defineddailydose;
       this.defineddailydoseunits = defineddailydoseunits;
       this.type = type;
    }
   
    public AtcId getId() {
        return this.id;
    }
    
    public void setId(AtcId id) {
        this.id = id;
    }
    public Boolean getCurrent() {
        return this.current;
    }
    
    public void setCurrent(Boolean current) {
        this.current = current;
    }
    public String getOffmarket() {
        return this.offmarket;
    }
    
    public void setOffmarket(String offmarket) {
        this.offmarket = offmarket;
    }
    public Float getDosespropackage() {
        return this.dosespropackage;
    }
    
    public void setDosespropackage(Float dosespropackage) {
        this.dosespropackage = dosespropackage;
    }
    public String getCode() {
        return this.code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Float getDefineddailydose() {
        return this.defineddailydose;
    }
    
    public void setDefineddailydose(Float defineddailydose) {
        this.defineddailydose = defineddailydose;
    }
    public String getDefineddailydoseunits() {
        return this.defineddailydoseunits;
    }
    
    public void setDefineddailydoseunits(String defineddailydoseunits) {
        this.defineddailydoseunits = defineddailydoseunits;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }




}


