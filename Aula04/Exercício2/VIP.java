package Aula04.Exercício2;

public class VIP extends Ingresso {
    private double valorAdicional;
    
    public VIP(double valorDoIngresso, double valorAdicional){
        super(valorAdicional);
        this.valorAdicional = valorAdicional;
    }

    public double valorAdicional(){;
        return valorAdicional;
    }

    public void setValorAdicional(double valorAdicional){
        this.valorAdicional = valorAdicional;
    }

    public double getValorVIP(){
        return getValorVIP() + valorAdicional;
    }

    public void imprimeValorVIP(){
        System.out.println("O valor do ingresso VIP é: R$: " + getValorVIP());
    }
}
