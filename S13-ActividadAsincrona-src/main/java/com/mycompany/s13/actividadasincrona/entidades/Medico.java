/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s13.actividadasincrona.entidades;

public class Medico extends Persona{
    int nroColegiatura;
    String especialidad;

    public Medico(int nroColegiatura, String especialidad, String nombre, int edad, String sexo, String estadoCivil, double peso, double altura) {
        super(nombre, edad, sexo, estadoCivil, peso, altura);
        this.nroColegiatura = nroColegiatura;
        this.especialidad = especialidad;
    }

    public Medico() {
    }

    public int getNroColegiatura() {
        return nroColegiatura;
    }

    public void setNroColegiatura(int nroColegiatura) {
        this.nroColegiatura = nroColegiatura;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    
    public double calcularprecioConsulta(){
        double precio = 0;
        if("otorrino".equals(this.especialidad)){
            precio=40;
        }else if("traumatología".equals(this.especialidad)){
            precio=45;
        }else if("dermatología".equals(this.especialidad)){
            precio=50;
        } else{
            precio=65;
        }
        return precio;
    }
    
    @Override
    public String toString() {
        return "Medico{" + "nroColegiatura=" + nroColegiatura + ", especialidad=" + especialidad +", precio="+ calcularprecioConsulta()+'}';
    }

   



}
