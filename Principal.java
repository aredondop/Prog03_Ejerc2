/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prog03.figuras;

/**
 *
 * @author Ángel
 */
public class Principal {
    public static void main(String[] args) {
        //Empezamos
        Rectangulo objRectangulo1 = new Rectangulo();
        System.out.println("Creamos rectangulo con el 1er constructor");
        objRectangulo1.setAltura(10);
        objRectangulo1.setBase(5);
        System.out.println("Modificamos el rectangulo y queda " + objRectangulo1.toString() );
        System.out.println( (objRectangulo1.isCuadrado()) ? "Es un cuadrado":"No es un cuadrado" );
        System.out.println( "El area es " +objRectangulo1.getArea() + "\r");
        
        Rectangulo objRectangulo2 = new Rectangulo( 10,8);
        System.out.println("Creamos rectangulo con el 2o constructor "+ objRectangulo2.toString());
        System.out.println("La base es "+ objRectangulo2.getBase());
        objRectangulo2.setAltura(10);
        System.out.println("Modificamos la altura y es "+ objRectangulo2.getBase());
        System.out.println( (objRectangulo2.isCuadrado()) ? "Es un cuadrado":"No es un cuadrado" );
        System.out.println( "El area es " +objRectangulo2.getArea() + "\r");
        
    }
}
