public class IPI implements Imposto {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public int calculaImposto(double valor) {
        if (getValor() < 25000){
            setValor(getValor() * 0.5);
        }else if (valor >= 25000){
            setValor(getValor() * 0.10);
        }
        System.out.println("Valor IPI: " + getValor());
        return 0;
    }
}
