package Aula04.Exercício1.Animais;

public class Animal {
    private String nome;
    private String raca;

    public Animal(){}

    public Animal(String nome){
        this.nome = nome;
    }

    public String caminha(){
        return "O animal está caminhando!";
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRaca(){
        return raca;
    }

    public void setRaca(String raca){
        this.raca = raca;
    }

}
