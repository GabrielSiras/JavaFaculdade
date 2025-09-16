package Aula04.Exercício3;

public class Imovel {
    private String endereco;
    private double precoImovel;

    public Imovel(){}

    public Imovel(String endereco, double precoImovel){
        this.endereco = endereco;
        this.precoImovel = precoImovel;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public double getPrecoImovel(){
        return precoImovel;
    }
    public void setPrecoImovel(double precoImovel){
        this.precoImovel = precoImovel;
    }
}
