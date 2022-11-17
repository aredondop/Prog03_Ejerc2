/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog03.figuras;

/**
 *
 * @author Ángel
 */
public class Rectangulo {
    
    //Definimos lo mínimo
    private int base, altura;
    
    //Los constructores
    public Rectangulo(){
        this.base = 0;
        this.altura = 0;
    }
    public Rectangulo( int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    //Setters y Getters
    public void setBase( int base){ this.base = base; }
    public void setAltura( int altura){ this.altura = altura; }
    
    public int getBase(){ return base; }
    public int getAltura(){ return altura; }
    
    //Funciones auxiliares
    public float getArea(){
        float area = altura * base;
        return area;
    }
    public String toString(){
        String toString = "base: " + this.getBase() +" altura: " + this.getAltura();
        return toString;
    }
    public boolean isCuadrado(){  
        boolean isCuadrado;
        isCuadrado = (altura == base  ) ? true:false;
        return isCuadrado;
    }
}
