package Aula02.Exercício1;

public class Terreno {
    int comprimento;
    int largura;

    public int getComprimento(){
        return comprimento;
    }

    public void setComprimento(int comprimento){
        this.comprimento = comprimento;
    }

    public int getLargura(){
        return largura;
    }

    public void setLargura(int largura){
        this.largura = largura;
    }

    public int getArea(){
        return largura * comprimento;
    }
}
