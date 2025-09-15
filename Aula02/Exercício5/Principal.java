package Aula02.Exercício5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a diagonal maior:");
        double diagMaior = sc.nextDouble();

        System.out.println("Informe a diagonal menor:");
        double diagMenor = sc.nextDouble();

        sc.close();

        Losangulo losangulo = new Losangulo();
        losangulo.setDiagMaior(diagMaior);
        losangulo.setDiagMenor(diagMenor);

        System.out.println("A diagonal principal é: " + losangulo.getDiagPrin());
    }
}
