package com.pojos.model;
// Generated May 28, 2015 4:10:50 PM by Hibernate Tools 3.6.0



/**
 * Bancos generated by hbm2java
 */
public class Bancos  implements java.io.Serializable {


     private int idBanco;
     private Bancoentidades bancoentidades;
     private String banNombre;

    public Bancos() {
    }

	
    public Bancos(Bancoentidades bancoentidades) {
        this.bancoentidades = bancoentidades;
    }
    public Bancos(Bancoentidades bancoentidades, String banNombre) {
       this.bancoentidades = bancoentidades;
       this.banNombre = banNombre;
    }
   
    public int getIdBanco() {
        return this.idBanco;
    }
    
    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
    }
    public Bancoentidades getBancoentidades() {
        return this.bancoentidades;
    }
    
    public void setBancoentidades(Bancoentidades bancoentidades) {
        this.bancoentidades = bancoentidades;
    }
    public String getBanNombre() {
        return this.banNombre;
    }
    
    public void setBanNombre(String banNombre) {
        this.banNombre = banNombre;
    }




}


