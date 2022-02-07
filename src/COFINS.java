public class COFINS implements Imposto {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int calculaImposto(double valor) {
        if (getValor() > 1700){
            setValor(getValor() * 0.8);
        }else {
            setValor(0);
        }
        System.out.println("Valor COFINS: " + getValor());
        return 0;
    }
}
