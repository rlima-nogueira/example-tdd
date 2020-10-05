package br.com.exampletdd;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testePoupanca {

    public testePoupanca(){

    }

    //Testa a funcionalidade de investimento
    //Dar o valor de entrada + o tempo que ficará investido e ai compara o retorno
    @Test
    public void testInvest(){
        Double valor = 1000.00;
        int tempo = 10;
        Double retorno = 1051.1401320407906;

        Poupanca poup = new Poupanca(valor, tempo);
        assertEquals(retorno, poup.simulador());
    }
}
