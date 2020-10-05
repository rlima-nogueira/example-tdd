package br.com.exampletdd;

public class Calculadora {

    private Double num1;
    private Double num2;

    public Calculadora(Double num1, Double num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public Double soma(){
        Double resultado = num1+num2;

        return resultado;
    }

    public Double subtracao(){
        Double resultado = num1-num2;

        return resultado;
    }

    public Double multiplicacao(){
        Double resultado = num1*num2;

        return resultado;
    }

    public Double divisao(){
        Double resultado = num1/num2;

        return resultado;
    }

    public Double equacao(){
        Double resultado = ((num1+num2)*num2)/num1;
        return resultado;
    }
}
