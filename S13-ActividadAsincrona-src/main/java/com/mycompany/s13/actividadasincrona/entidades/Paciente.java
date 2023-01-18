/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s13.actividadasincrona.entidades;

/**
 *
 * @author Usuario
 */
public class Paciente extends Persona{
  private int nroHistoria;
  private String FechaPrimeraConslta;

    public Paciente(int nroHistoria, String FechaPrimeraConslta, String nombre, int edad, String sexo, String estadoCivil, double peso, double altura) {
        super(nombre, edad, sexo, estadoCivil, peso, altura);
        this.nroHistoria = nroHistoria;
        this.FechaPrimeraConslta = FechaPrimeraConslta;
    }

    public Paciente() {
       
    }

    public int getNroHistoria() {
        return nroHistoria;
    }

    public void setNroHistoria(int nroHistoria) {
        this.nroHistoria = nroHistoria;
    }

    public String getFechaPrimeraConslta() {
        return FechaPrimeraConslta;
    }

    public void setFechaPrimeraConslta(String FechaPrimeraConslta) {
        this.FechaPrimeraConslta = FechaPrimeraConslta;
    }

    public String calcularMC(){
        String MC="";
        if( this.peso < 18.5) {
            MC="Bajo de peso";
        } else if(this.peso >= 18.5 && this.peso< 25.0) {
            MC="Normal";
        }else if(this.peso >= 25.0 && this.peso< 30.0) {
            MC="Sobrepeso";
        }else if(this.peso >= 30.0) {
            MC="Obeso";
        }
        return MC;
    }

}
