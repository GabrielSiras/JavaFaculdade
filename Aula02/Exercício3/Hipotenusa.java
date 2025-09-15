package Aula02.Exercício3;

public class Hipotenusa {
    double catetoA;
    double catetoB;
    
    public double getCatetoA(){
        return catetoA;
    }

    public void setCatetoA(double catetoA){
        this.catetoA = catetoA;
    }

    public double getCatetoB(){
        return catetoB;
    }

    public void setCatetoB(double catetoB){
        this.catetoB = catetoB;
    }

    public double getTotal(){
        return Math.sqrt(Math.pow(catetoA,2) + Math.pow(catetoB,2));
    }
}
