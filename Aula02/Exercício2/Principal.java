package Aula02.Exercício2;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int ferraduras = 4;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de cavalos que você possui: ");
        int cavalos = sc.nextInt();

        sc.close();

        Haras haras = new Haras();
        haras.setCavalos(cavalos);
        int qtdFerraduras = ferraduras * cavalos;

        System.out.println("A quantidade de ferraduras para seus cavalos é: " + qtdFerraduras);
    }
}
