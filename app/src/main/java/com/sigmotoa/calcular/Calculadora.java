package com.sigmotoa.calcular;

/**
 * Created by sigmotoa on 3/04/18.
 */

public class Calculadora {

    public static void main(String[] args) {

        Operaciones operar=new Operaciones();

        System.out.println(operar.sumar(3.0,5.2));
        
        System.out.println(operar.multiplicar(5.2*3.5));

    }
}
