/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.certus.aa2_villaltadelgadovictor;

import java.util.Scanner;

/**
 *
 * @author agust
 */
public class AA2_VillaltaDelgadoVictor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
    System.out.println("Introduce el monto:");
    
    int monto=scan.nextInt();
    
    double mantenimiento = monto*0.15 ;
    double pyj= monto*0.5;
    double exploracion=monto*0.05;
    double limpieza=monto*0.3;
    
    System.out.println("El monto destinado para el mantenimiento es de: " + mantenimiento);
    System.out.println("El monto destinado para parques y jardines es de: " + pyj);
    System.out.println("El monto destinado para la exploracion es de: " + exploracion);
    System.out.println("El monto destinado para el mantenimiento es de: " + limpieza);
    }
}
