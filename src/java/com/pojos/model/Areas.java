package com.pojos.model;
// Generated May 28, 2015 4:10:50 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Areas generated by hbm2java
 */
public class Areas  implements java.io.Serializable {


     private int idArea;
     private String area;
     private Set detallesubregions = new HashSet(0);

    public Areas() {
    }

	
    public Areas(int idArea) {
        this.idArea = idArea;
    }
    public Areas(int idArea, String area, Set detallesubregions) {
       this.idArea = idArea;
       this.area = area;
       this.detallesubregions = detallesubregions;
    }

    public Areas(int idArea, String area) {
        this.idArea = idArea;
        this.area = area;
    }
   
    public int getIdArea() {
        return this.idArea;
    }
    
    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }
    public String getArea() {
        return this.area;
    }
    
    public void setArea(String area) {
        this.area = area;
    }
    public Set getDetallesubregions() {
        return this.detallesubregions;
    }
    
    public void setDetallesubregions(Set detallesubregions) {
        this.detallesubregions = detallesubregions;
    }




}


