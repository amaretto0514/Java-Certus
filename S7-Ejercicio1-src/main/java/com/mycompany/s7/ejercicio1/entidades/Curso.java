/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s7.ejercicio1.entidades;

/**
 *
 * @author Usuario
 */
public class Curso {
    
    private int id;
    private String nombre;
    private int creditos;
    private int horas;

    public Curso(int id, String nombre, int creditos, int horas) {
        this.id = id;
        this.nombre = nombre;
        this.creditos = creditos;
        this.horas = horas;
    }
      
    public Curso() {
       }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

   

    @Override
    public String toString() {
        return "Curso{" + "id=" + id + ", nombre=" + nombre + ", creditos=" + creditos + ", horas=" + horas + '}';
    }
    
}
