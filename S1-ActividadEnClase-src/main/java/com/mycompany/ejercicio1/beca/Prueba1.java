/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio1.beca;

/**
 *
 * @author Usuario
 */
public class Prueba1 {

    /**
     1. Hacer un programar que permita ver cuantos procesadores y memoria libre tiene tu PC.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //interpreta el bytecode para ejecutarlo en tu pc?
        long memoriaLibre =((Runtime.getRuntime().freeMemory()/1024)/1024);
        System.out.println("Memoria Libre: "+memoriaLibre);
    }
    
}
