package Aula04.Exercício3;

public class Novo extends Imovel{
    private double valorAdicional;

    public Novo(String endereco, double precoImovel, double valorAdicional){
        super(endereco, precoImovel);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional(){
        return valorAdicional;
    }
    public void setValorAdicional(double valorAdicional){
        this.valorAdicional = valorAdicional;
    }

    public double getValorImovelNovo(){
        return getPrecoImovel() + valorAdicional;
    }

    public void imprimeValorImovelNovo(){
        System.out.println("Valor do imóvel novo: R$: " + getValorImovelNovo());
    }
}
