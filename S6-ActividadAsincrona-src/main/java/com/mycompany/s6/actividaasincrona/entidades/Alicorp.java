/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s6.actividaasincrona.entidades;

/**
 *
 * @author Usuario
 */
public class Alicorp {
    private String id;
    private String nombre;
    private int sueldoBasico;
    private int numFaltas;
    private double bonificaciones;
    private double eps;
    private double sueldoFinal;
    private double descuentos;

    public Alicorp(String id, String nombre, int sueldoBasico, int numFaltas) {
        this.id = id;
        this.nombre = nombre;
        this.sueldoBasico = sueldoBasico;
        this.numFaltas = numFaltas;
    }

    public Alicorp() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(int sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getNumFaltas() {
        return numFaltas;
    }

    public void setNumFaltas(int numFaltas) {
        this.numFaltas = numFaltas;
    }

    public double getBonificaciones() {
        double bonificacionF=0;
        
        if( this.numFaltas== 0) bonificacionF= this.sueldoBasico*0.05;
        
        this.bonificaciones=bonificacionF;
        
        return bonificaciones;
    }

    public double getEps() {
        double epsSu;
        epsSu=this.sueldoBasico*0.15;
        this.eps=epsSu;
        return eps;
    }

    public double getDescuentos() {
      double descuentosF=0;
        if( this.numFaltas!= 0)
            descuentosF=this.numFaltas* this.sueldoBasico*0.042;
         this.descuentos=descuentosF;
        return descuentos;
    }
    
    public double getSueldoFinal() {
        double sueldoF;
        sueldoF=this.sueldoBasico+getBonificaciones()- getDescuentos()- getEps();
        this.sueldoFinal=sueldoF;
        return sueldoFinal;
    }

    @Override
    public String toString() {
        return "Alicorp{" + "id=" + id + ", nombre=" + nombre + ", sueldoBasico=" + sueldoBasico + ", numFaltas=" + numFaltas + ", bonificaciones=" + bonificaciones + ", eps=" + eps + ", sueldoFinal=" + sueldoFinal + ", descuentos=" + descuentos + '}';
    }

        
    
}
