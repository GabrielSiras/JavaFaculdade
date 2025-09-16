package Aula04.Exercício4;

public class Assistente extends Funcionario {
    private String numeroMatricula;

    public Assistente(String nome, String cpf, String rg, String numeroMatricula){
        super(nome,cpf,rg);
        this.numeroMatricula = numeroMatricula;
    }

    public String getNumeroMatricula(){
        return numeroMatricula;
    }
    public void setNumeroMatricula(String numeroMatricula){
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void exibeDados(){
        super.exibeDados();
        System.out.println("Número da matrícula: " + numeroMatricula);
    }
}
