package Aula04.Exercício3;

public class Velho extends Imovel{
    private double descontoValor;

    public Velho(String endereco, double precoImovel, double descontoValor){
         super(endereco, precoImovel);
         this.descontoValor = descontoValor;
    }

    public double getDescontoValor() {
        return descontoValor;
    }
    public void setDescontoValor(double descontoValor) {
        this.descontoValor = descontoValor;
    }

    public double getValorImovelVelho() {
    return getPrecoImovel() - descontoValor;
}


    public void imprimeValorImovelVelho(){
        System.out.println("O valor do imóvel velho é: R$: " + getValorImovelVelho());
    }
}
