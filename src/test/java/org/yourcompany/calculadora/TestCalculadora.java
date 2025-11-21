package org.yourcompany.calculadora;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
public class TestCalculadora {
    @Test
    public void Test1() {
        assertEquals(3, Calculadora.sumaPrimersNumeros(123));
        assertEquals(3, Calculadora.sumaPrimersNumeros(123));
        assertEquals(3, Calculadora.sumaPrimersNumeros(123));
        assertEquals(3, Calculadora.sumaPrimersNumeros(123));
        
    }
    public void Test2() {
        assertEquals(6, Calculadora.calcularFactorial(3));
        assertEquals(24, Calculadora.calcularFactorial(4));
        assertEquals(120, Calculadora.calcularFactorial(5));
        assertEquals(720, Calculadora.calcularFactorial(6));
       
    }
    public void Test3() {
        assertEquals(14, Calculadora.sumaQuadrats(3));
        assertEquals(30, Calculadora.sumaQuadrats(4));
        assertEquals(55, Calculadora.sumaQuadrats(5));
        assertEquals(91, Calculadora.sumaQuadrats(6));
       
    }
    public void Test4() {
        assertEquals(8, Calculadora.calcularPotencia(2, 3));
        assertEquals(27, Calculadora.calcularPotencia(3, 3));
        assertEquals(16, Calculadora.calcularPotencia(4, 2));
        assertEquals(81, Calculadora.calcularPotencia(3, 4));
       
    }
    public void Test5() {
        assertEquals(3, Calculadora.nombreDigits(123));
        assertEquals(4, Calculadora.nombreDigits(1234));
        assertEquals(5, Calculadora.nombreDigits(12345));
        assertEquals(6, Calculadora.nombreDigits(123456));
       
    }
}