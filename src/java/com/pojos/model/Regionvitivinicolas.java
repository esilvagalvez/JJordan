package com.pojos.model;
// Generated May 28, 2015 4:10:50 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Regionvitivinicolas generated by hbm2java
 */
public class Regionvitivinicolas  implements java.io.Serializable {


     private Integer idRegionVitinicola;
     private String regionVitinicola;
     private Set subregioneses = new HashSet(0);

    public Regionvitivinicolas() {
    }

    public Regionvitivinicolas(String regionVitinicola, Set subregioneses) {
       this.regionVitinicola = regionVitinicola;
       this.subregioneses = subregioneses;
    }
   
    public Integer getIdRegionVitinicola() {
        return this.idRegionVitinicola;
    }
    
    public void setIdRegionVitinicola(Integer idRegionVitinicola) {
        this.idRegionVitinicola = idRegionVitinicola;
    }
    public String getRegionVitinicola() {
        return this.regionVitinicola;
    }
    
    public void setRegionVitinicola(String regionVitinicola) {
        this.regionVitinicola = regionVitinicola;
    }
    public Set getSubregioneses() {
        return this.subregioneses;
    }
    
    public void setSubregioneses(Set subregioneses) {
        this.subregioneses = subregioneses;
    }




}


