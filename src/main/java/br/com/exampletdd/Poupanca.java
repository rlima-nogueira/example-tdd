package br.com.exampletdd;

public class Poupanca {

    private Double valor;
    private int tempo;

    public Poupanca (Double valor, int tempo){
        this.valor = valor;
        this.tempo = tempo;
    }
    public Double simulador(){
        //o tempo que o dinheiro fica na poupança vezes o valor = valor que vai render
        //se virar o mês rende 0.05% do valor

        Double total = valor;
        for (int i=0; i<tempo; i++){
            total = (total/100)*0.5 + total;
        }

        return total; //rendendo 0.05% a.m
    }

}
