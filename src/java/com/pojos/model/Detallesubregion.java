package com.pojos.model;
// Generated May 28, 2015 4:10:50 PM by Hibernate Tools 3.6.0


import java.util.HashSet;
import java.util.Set;

/**
 * Detallesubregion generated by hbm2java
 */
public class Detallesubregion  implements java.io.Serializable {


     private Integer idDetalleSubRegion;
     private Subregiones subregiones;
     private Areas areas;
     private Zonas zonas;
     private Ciudades ciudades;
     private Set direccioneses = new HashSet(0);

    public Detallesubregion() {
    }

    public Detallesubregion(Subregiones subregiones, Areas areas, Zonas zonas, Ciudades ciudades, Set direccioneses) {
       this.subregiones = subregiones;
       this.areas = areas;
       this.zonas = zonas;
       this.ciudades = ciudades;
       this.direccioneses = direccioneses;
    }
   
    public Integer getIdDetalleSubRegion() {
        return this.idDetalleSubRegion;
    }
    
    public void setIdDetalleSubRegion(Integer idDetalleSubRegion) {
        this.idDetalleSubRegion = idDetalleSubRegion;
    }
    public Subregiones getSubregiones() {
        return this.subregiones;
    }
    
    public void setSubregiones(Subregiones subregiones) {
        this.subregiones = subregiones;
    }
    public Areas getAreas() {
        return this.areas;
    }
    
    public void setAreas(Areas areas) {
        this.areas = areas;
    }
    public Zonas getZonas() {
        return this.zonas;
    }
    
    public void setZonas(Zonas zonas) {
        this.zonas = zonas;
    }
    public Ciudades getCiudades() {
        return this.ciudades;
    }
    
    public void setCiudades(Ciudades ciudades) {
        this.ciudades = ciudades;
    }
    public Set getDireccioneses() {
        return this.direccioneses;
    }
    
    public void setDireccioneses(Set direccioneses) {
        this.direccioneses = direccioneses;
    }




}


