package com.pojos.model;
// Generated May 28, 2015 4:10:50 PM by Hibernate Tools 3.6.0



/**
 * Entidadrazondirecciones generated by hbm2java
 */
public class Entidadrazondirecciones  implements java.io.Serializable {


     private EntidadrazondireccionesId id;
     private Direcciones direcciones;
     private Razonsociales razonsociales;
     private Giros giros;
     private Entidades entidades;

    public Entidadrazondirecciones() {
    }

    public Entidadrazondirecciones(EntidadrazondireccionesId id, Direcciones direcciones, Razonsociales razonsociales, Giros giros, Entidades entidades) {
       this.id = id;
       this.direcciones = direcciones;
       this.razonsociales = razonsociales;
       this.giros = giros;
       this.entidades = entidades;
    }
   
    public EntidadrazondireccionesId getId() {
        return this.id;
    }
    
    public void setId(EntidadrazondireccionesId id) {
        this.id = id;
    }
    public Direcciones getDirecciones() {
        return this.direcciones;
    }
    
    public void setDirecciones(Direcciones direcciones) {
        this.direcciones = direcciones;
    }
    public Razonsociales getRazonsociales() {
        return this.razonsociales;
    }
    
    public void setRazonsociales(Razonsociales razonsociales) {
        this.razonsociales = razonsociales;
    }
    public Giros getGiros() {
        return this.giros;
    }
    
    public void setGiros(Giros giros) {
        this.giros = giros;
    }
    public Entidades getEntidades() {
        return this.entidades;
    }
    
    public void setEntidades(Entidades entidades) {
        this.entidades = entidades;
    }




}


