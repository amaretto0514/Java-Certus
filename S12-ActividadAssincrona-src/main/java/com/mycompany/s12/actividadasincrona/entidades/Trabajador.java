/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s12.actividadasincrona.entidades;

/**
 *
 * @author Usuario
 */
public class Trabajador {
    String Nombre;
    String Apellido;
    String codigo;
    int cargo;

    public Trabajador(String Nombre, String Apellido, String codigo, int cargo) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.codigo = codigo;
        this.cargo = cargo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public String NombreCargo( ){
        String Nombre="";
        switch (this.cargo) {
            case 1:
                Nombre="Jefe";
                break;
            case 2:
                Nombre="DBA";
                break;
            case 3:
                Nombre="Analista";
                break;
            case 4:
                Nombre="Programador";
                break;
            case 5:
                Nombre="Soporte";
                break;
        }
    return Nombre;
}  
    
    public int SueldoBruto(){
        int index=0;
        switch (this.cargo) {
            case 1:
                index=7000;
                break;
            case 2:
                index=5000;
                break;
            case 3:
                index=4000;
                break;
            case 4:
                index=3000;
                break;
            case 5:
                index=2000;
                break;
        }
    return index;
}  
    
    public double Descuento(){
       int monto = 0;
       double des=0;
       des= SueldoBruto()*0.122;
    return des;
}
 
     public double SueldoNeto( ){
       double sueldNeto=SueldoBruto()- Descuento();
     return sueldNeto;
}
 
}
