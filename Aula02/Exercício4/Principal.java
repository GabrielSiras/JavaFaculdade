package Aula02.Exercício4;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o salário que você recebe: ");
        double salarioT = sc.nextDouble();

        sc.close();

        Salario salario = new Salario();
        salario.setSalario(salarioT);

        System.out.println("Você recebe: " + salario.quantosSalarios() + " salarios mínimos.");
    }
}
