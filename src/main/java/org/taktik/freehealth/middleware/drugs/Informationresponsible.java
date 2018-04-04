package org.taktik.freehealth.middleware.drugs;
// Generated Feb 27, 2008 11:38:04 AM by Hibernate Tools 3.2.0.CR1


import org.taktik.freehealth.middleware.drugs.dto.InformationresponsibleId;

/**
 * Informationresponsible generated by hbm2java
 */
public class Informationresponsible  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
     private InformationresponsibleId id;
     private String name;
     private Boolean deleted;
     private String type;

    public Informationresponsible() {
    }

	
    public Informationresponsible(InformationresponsibleId id) {
        this.id = id;
    }
    public Informationresponsible(InformationresponsibleId id, String name, Boolean deleted, String type) {
       this.id = id;
       this.name = name;
       this.deleted = deleted;
       this.type = type;
    }
   
    public InformationresponsibleId getId() {
        return this.id;
    }
    
    public void setId(InformationresponsibleId id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }
    
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
    	return name;
    }


}


