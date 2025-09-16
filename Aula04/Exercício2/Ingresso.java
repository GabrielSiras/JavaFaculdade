package Aula04.Exercício2;

public class Ingresso {
    private double valorDoIngresso;

    public Ingresso(){}

    public Ingresso(double valorDoIngresso){
        this.valorDoIngresso = valorDoIngresso;
    }

    public double getValor(){
        return valorDoIngresso;
    }
    public void setValor(double valorDoIngresso){
        this.valorDoIngresso = valorDoIngresso;
    }

    public void imprimeValor(){
        System.out.println("O valor do ingresso: R$: " + valorDoIngresso);
    }
}
