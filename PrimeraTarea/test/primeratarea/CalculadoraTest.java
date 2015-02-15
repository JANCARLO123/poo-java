/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeratarea;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Celeritech Peru
 */
@RunWith(Parameterized.class)
public class CalculadoraTest {
    
    private String entrada;
    private int resultado;
    
    @Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
            {"",0},
            {null,0},
            {"0",0},
            {"1", 1},
            {"2", 2},
            {"3", 3},
            {"0,1,2,3,4,555", 565},
            {"1,2,3",6},
            {"3\n2",5},
            {"1\n2,3",6},
            {"1\n2\n3,4,5", 15},    
            {"0,3,1001", 3},
            {"0,3,1000", 1003},
        });
    }
    
    public CalculadoraTest(String entrada, int resultado){
        super();
        this.entrada = entrada;
        this.resultado = resultado;
    }
    
    @Test 
    public void agregarRetornaCeroCuandoLaEntradaEsVacia() {
        assertEquals(this.resultado, Calculadora.agregar(entrada));
    }


}
