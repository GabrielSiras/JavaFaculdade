package Aula04.Exercício4;

public class Principal {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("João", "123.456.789-00", "MG-12.345.678");
        f.exibeDados();
        System.out.println("Salário com aumento: R$ " + f.calcularAumento(2000));

        System.out.println();

        Gerente g = new Gerente("Maria", "987.654.321-00", "SP-87.654.321", "Sênior");
        g.exibeDados();
        System.out.println("Salário com aumento: R$ " + g.calcularAumento(2000));
    }
}
