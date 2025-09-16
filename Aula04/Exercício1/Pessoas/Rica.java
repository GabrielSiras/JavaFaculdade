package Aula04.Exercício1.Pessoas;

public class Rica extends Pessoa{
    private double dinheiro;

    public double getDinheiro(){
        return dinheiro;
    }
    public void setDinheiro(double dinheiro){
        this.dinheiro = dinheiro;
    }

    public void fazCompras(){
        System.out.println("A pessoa rica está fazendo compras!");
    }
}
