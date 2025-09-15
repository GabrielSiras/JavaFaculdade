package Aula02.Exercício6;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Informe quantos anos você tem: ");
        int anos = sc.nextInt();

        sc.close();

        Vida vida = new Vida();
        vida.setNome(nome);
        vida.setAnos(anos);

        System.out.println(nome + "você tem: " + vida.vidaTotal() + " dias de vida");
    }
}
