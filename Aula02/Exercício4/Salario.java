package Aula02.Exercício4;

public class Salario {
    public static final double salarioMinimo = 1518;
    double salarioT;

    public double getSalario(){
        return salarioT;
    }
    
    public void setSalario(double salarioT){
        this.salarioT = salarioT;
    }

    public double quantosSalarios(){
        return salarioT / salarioMinimo;
    }
}
