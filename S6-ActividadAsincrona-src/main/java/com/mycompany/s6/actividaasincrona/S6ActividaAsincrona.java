/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.s6.actividaasincrona;

import com.mycompany.s6.actividaasincrona.ui.FormAlicorp;

/**
Caso Propuesto:
Crear un programa en Java SWING donde se ingrese el código, nombre, sueldo básico y número faltas de un 
* empleado de la fábrica ALICORP. Se pide calcular las siguientes bonificaciones: Familiar 9% del básico, 
* Producción: 7.5% del básico. También calcular el descuento por EPS 15% del básico. Por cada falta se le 
* descuenta el 4.2% del básico. En el caso que no tenga ninguna falta se le dará un bono especial del 5% del 
* básico. Finalmente calcular el sueldo neto. Mostrar todos los datos de entrada y salida en un reporte del 
* formulario.

 */
public class S6ActividaAsincrona {

    public static void main(String[] args) {
        FormAlicorp Form= new FormAlicorp();
        Form.setVisible(true);
    }
}
