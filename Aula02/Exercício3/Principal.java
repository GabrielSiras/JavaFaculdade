package Aula02.Exercício3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o cateto A: ");
        double catetoA = sc.nextInt();

        System.out.println("Informe o cateto B: ");
        double catetoB = sc.nextInt();

        Hipotenusa hipotenusa = new Hipotenusa();
        hipotenusa.catetoA = catetoA;
        hipotenusa.catetoB = catetoB;

        System.out.println("A hipotenúsa é: " + hipotenusa.getTotal());

        sc.close();
    }
}
