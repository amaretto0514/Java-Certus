/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PRINCIPAL;
import MCD_MCM.operacion;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class EXE {
    public static void main(String[] args) {
        int a,b;
        operacion datos= new operacion();
        Scanner leer= new Scanner(System.in);
        System.out.print("Ingrese el 1° Numero: ");
        a=leer.nextInt();
        System.out.println("Ingrese el 2° Numero: ");
        b=leer.nextInt();
        System.out.println("MCD= "+datos.mcd(a,b));
        System.out.println("MCM= "+datos.mcm(a,b));
    }
}
