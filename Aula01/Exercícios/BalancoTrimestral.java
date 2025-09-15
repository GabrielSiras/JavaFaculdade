package Aula01.Exercícios;

public class BalancoTrimestral {
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        String mediaMensal = "Valor da média mensal = " + gastosTrimestre;

        System.out.println(mediaMensal);


    }
}
