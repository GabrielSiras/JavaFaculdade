package Aula04.Exercício4;

public class Gerente extends Funcionario{
    private String nivelGerencial;

    public Gerente(String nome, String cpf, String rg, String nivelGerencial){
        super(nome,cpf,rg);
        this.nivelGerencial = nivelGerencial;
    }

    public String getNivelGerencial() {
        return nivelGerencial;
    }
    public void setNivelGerencial(String nivelGerencial) {
        this.nivelGerencial = nivelGerencial;
    }

    @Override //override sobreescreve um método da classe pai
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Nível Gerencial: " + nivelGerencial);
    }

    @Override
    public double calcularAumento(double salario) {
        return salario + (salario * 0.15);
    }

}
