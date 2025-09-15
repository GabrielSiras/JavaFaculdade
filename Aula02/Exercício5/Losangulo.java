package Aula02.Exercício5;

public class Losangulo {
    double diagMaior;
    double diagMenor;

    public double getDiagMaior(){
        return diagMaior;
    }

    public void setDiagMaior(double diagMaior){
        this.diagMaior = diagMaior;
    }

    public double getDiagMenor(){
        return diagMenor;
    }

    public void setDiagMenor(double diagMenor){
        this.diagMenor = diagMenor;
    }

    public double getDiagPrin(){
        return (diagMaior * diagMenor) / 2;
    }
}
