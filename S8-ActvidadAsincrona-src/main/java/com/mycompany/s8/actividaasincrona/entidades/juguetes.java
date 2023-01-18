/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.s8.actividaasincrona.entidades;

/**
 *
 * @author Usuario
 */
public class juguetes {
    private int producto;
    private int cantidad;
    private String NomProducto;
     private double PrecioProducto;
    private double Descuento;
    private double precioFinal;

    public juguetes(int producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public juguetes() {
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }

    public String getNomProducto() {
        String NombreProducto="";
        switch (this.producto) {
            case 0:
                NombreProducto="Monopolio";
                break;
            case 1:
                NombreProducto="Ajedrez";
                break;
            case 2:
                NombreProducto="Lego";
                break;       
        }
        this.NomProducto=NombreProducto;
        return NomProducto;
    }

    public double getPrecioProducto() {
         double PreProducto=0;
        switch (this.producto) {
            case 0:
                PreProducto=70.99;
                break;
            case 1:
                PreProducto=55.99;
                break;
            case 2:
                PreProducto=100.99;
                break;       
        }
        this.PrecioProducto=PreProducto;
        return PrecioProducto;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public double getDescuento() {
        double descuento=0;
        if(this.cantidad<10){
            descuento=3.5;
        }else if(this.cantidad >9 || this.cantidad<20){
            descuento=7;
        } else if(this.cantidad>19){
            descuento=9.5;
        }
        this.Descuento=descuento;
        return Descuento;
    }
    

    public double getPrecioFinal() {
        double precioF;
        precioF= this.cantidad *( getPrecioProducto()-(getPrecioProducto()*getDescuento()/100));
        
        this.precioFinal=precioF;
        return precioFinal;
    }

    @Override
    public String toString() {
        return "juguetes{" + "producto=" + producto + ", cantidad=" + cantidad + ", NomProducto=" + NomProducto + ", Descuento=" + Descuento + ", precioFinal=" + precioFinal + '}';
    }

    
  
}
