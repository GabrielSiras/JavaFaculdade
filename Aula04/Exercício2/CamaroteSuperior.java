package Aula04.Exercício2;

public class CamaroteSuperior extends VIP {

    private double valorAdicionalSuperior;

        public CamaroteSuperior(double valorDoIngresso, double valorAdicional, double valorAdicionalSuperior) {
            super(valorDoIngresso, valorAdicional);
            this.valorAdicionalSuperior = valorAdicionalSuperior;
        }

        public double getValorCamaroteSuperior() {
            return getValorVIP() + valorAdicionalSuperior;
        }

    public void imprimeValorCamaroteSuperior() {
        System.out.println("Valor do ingresso do Camarote Superior: R$ " + getValorCamaroteSuperior());
    }
}
