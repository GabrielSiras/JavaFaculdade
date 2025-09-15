package Aula01.Exercícios;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        final String Oi_Mundo = "Olá mundo!";
        System.out.println(Oi_Mundo);

        int numero;

        Scanner in = new Scanner(System.in);

        System.out.println("Informe um número:");
        numero = in.nextInt();

        // next() - lê Strings de uma palavra
        // nextLine() - lê frases completas até o “enter”
        // nextFloat() - lê floats
        // nextDouble() - lê doubles

        System.out.println("Seu número é: " + numero);

        in.close();
    }
}