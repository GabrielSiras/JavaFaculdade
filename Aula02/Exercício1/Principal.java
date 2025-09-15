package Aula02.Exercício1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a largura do terreno: ");
        int largura = sc.nextInt();

        System.out.println("Informe o comprimento do terreno: ");
        int comprimento = sc.nextInt();

        sc.close();

        Terreno terreno = new Terreno();

        terreno.comprimento = comprimento;
        terreno.largura = largura;

        System.out.println("A área do terreno com a largura de: " + largura + " e com o comprimento de: " + comprimento + " é: " + terreno.getArea());

    }
}
