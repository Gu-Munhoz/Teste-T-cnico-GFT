public class ICMS implements Imposto{
        private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int calculaImposto(double valor) {
       setValor(getValor() * 0.3);
        System.out.println("Valor ICMS: " + getValor());
        return 0;
    }
}
