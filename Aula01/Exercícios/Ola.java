package Aula01.Exercícios;

import java.util.Scanner;

public class Ola {
    public static void main(String[] args) {
        String nome;

        Scanner sc = new Scanner(System.in);
        System.out.println("Olá usuário, por favor, informe seu nome: ");
        nome = sc.nextLine();
        
        System.out.println("Olá " + nome + ", tudo bem?");
        sc.close();
    }
}
