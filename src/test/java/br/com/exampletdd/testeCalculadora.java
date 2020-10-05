package br.com.exampletdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testeCalculadora {

    public testeCalculadora(){

    }

    @Test
    public void adicao(){

        Double num1 = 2.0;
        Double num2 = 3.9;
        Double resultado = 5.9;

        Calculadora calc = new Calculadora(num1, num2);
        assertEquals(resultado, calc.soma());
    }

    @Test
    public void subtracao(){

        Double num1 = 2.0;
        Double num2 = 3.9;
        Double resultado = -1.9;

        Calculadora calc = new Calculadora(num1, num2);
        assertEquals(resultado, calc.subtracao());
    }

    @Test
    public void multiplicaco(){

        Double num1 = 8.0;
        Double num2 = 4.0;
        Double resultado = 32.0;

        Calculadora calc = new Calculadora(num1, num2);
        assertEquals(resultado, calc.multiplicacao());

    }

    @Test
    public void divisao(){

        Double num1 = 8.0;
        Double num2 = 4.0;
        Double resultado = 2.0;

        Calculadora calc = new Calculadora(num1, num2);
        assertEquals(resultado, calc.divisao());

    }

    @Test
    public void equacao(){

        Double num1 = 5.0;
        Double num2 = 5.0;
        Double resultado = 10.0;

        Calculadora calc = new Calculadora(num1, num2);
        assertEquals(resultado, calc.equacao());

    }
}
