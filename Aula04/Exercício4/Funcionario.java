package Aula04.Exercício4;

public class Funcionario {
    private String nome;
    private String cpf;
    private String rg;
    
    public Funcionario(){}
    
    public Funcionario(String nome, String cpf, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }

    public void exibeDados(){
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
    }

    public double calcularAumento(double salario){
        return salario + (salario * 0.10);
    }
}
