/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicio1.beca;

/**
 *
 * @author Usuario
 */
public class Prueba3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here}
        try {
            Runtime.getRuntime().exec("calc");
            System.out.println("Comando ejectado con exito");
        } catch (Exception e) {
        System.out.println("Comando cn error");
        }
    }
    
}
