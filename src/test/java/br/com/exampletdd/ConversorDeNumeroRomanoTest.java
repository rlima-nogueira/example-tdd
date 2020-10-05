package br.com.exampletdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorDeNumeroRomanoTest {

    @Test
    public void deveEntenderOSimboloI(){
        ConversorDeNumeroRomano converteRomano = new ConversorDeNumeroRomano();
        int numero = converteRomano.converte("I");
        assertEquals(1, numero);
    }

    @Test
    public void deveEntenderOSimboloV(){
        ConversorDeNumeroRomano converteRomano = new ConversorDeNumeroRomano();
        int numero = converteRomano.converte("V");
        assertEquals(5, numero);
    }

    @Test
    public void deveEntenderOSimboloX(){
        ConversorDeNumeroRomano converteRomano = new ConversorDeNumeroRomano();
        int numero = converteRomano.converte("X");
        assertEquals(10, numero);
    }

    @Test
    public void deveEntenderOSimboloL(){
        ConversorDeNumeroRomano converteRomano = new ConversorDeNumeroRomano();
        int numero = converteRomano.converte("L");
        assertEquals(50, numero);
    }

    @Test
    public void deveEntenderOSimboloC(){
        ConversorDeNumeroRomano converteRomano = new ConversorDeNumeroRomano();
        int numero = converteRomano.converte("C");
        assertEquals(100, numero);
    }

    @Test
    public void deveEntenderOSimboloD(){
        ConversorDeNumeroRomano converteRomano = new ConversorDeNumeroRomano();
        int numero = converteRomano.converte("D");
        assertEquals(500, numero);
    }

    @Test
    public void deveEntenderOSimboloM(){
        ConversorDeNumeroRomano converteRomano = new ConversorDeNumeroRomano();
        int numero = converteRomano.converte("M");
        assertEquals(1000, numero);
    }

    @Test
    public void deveEntenderOSimboloXXII(){
        ConversorDeNumeroRomano converteRomano = new ConversorDeNumeroRomano();
        int numero = converteRomano.converte("XXII");
        assertEquals(22, numero);
    }

    @Test
    public void deveEntenderOSimboloIX(){
        ConversorDeNumeroRomano converteRomano = new ConversorDeNumeroRomano();
        int numero = converteRomano.converte("IX");
        assertEquals(9, numero);
    }

    @Test
    public void deveEntenderOSimboloXXIV(){
        ConversorDeNumeroRomano converteRomano = new ConversorDeNumeroRomano();
        int numero = converteRomano.converte("XXIV");
        assertEquals(24, numero);
    }
}
