/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeratarea;

import java.util.Arrays;

/**
 *
 * @author Celeritech Peru
 */
public class Calculadora {

    public static int agregar(String numeros) {
        return (numeros == null || numeros.isEmpty())?0: obtenerSumar(numeros);
    }

    private static int obtenerSumar(String numeros) {
        
        String delimitadores = obtenerPosiblesDelimitadores(numeros);
        //Java 8 - Streams
        return Arrays.stream(numeros.split(delimitadores))
                .filter( p -> 1000>=Integer.parseInt(p))
                .mapToInt(Integer::parseInt)
                .sum();
    }

    private static String obtenerPosiblesDelimitadores(String numeros) {
         return ",|\n";
    }

    
    

}
