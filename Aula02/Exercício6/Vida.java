package Aula02.Exercício6;

public class Vida {
    int anos;
    String nome;

    public int getAnos(){
        return anos;
    }

    public void setAnos(int anos){
        this.anos = anos;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int vidaTotal(){
        return (anos * 365);
    }
}
