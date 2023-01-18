/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MCD_MCM;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class operacion {
         
    public int mcd(int a, int b){
      int aux;
      if (a>0 && b>0) {
            while(a%b>0){
                aux =b;
                b=a%b;
                a=aux;
            }  
      } else {
          JOptionPane.showMessageDialog(null, "Los datos deben ser validos...");
      }
      
     return b; 
  }  
  
   public int mcm(int a, int b){
      
     return a*b/mcd(a,b); 
  }
}
