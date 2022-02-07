import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {
        double valor ;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um valor para consultar impostos:");
        valor = scan.nextDouble();

        ICMS i1 = new ICMS();
        IPI i2 = new IPI();
        COFINS i3 = new COFINS();
        i1.setValor(valor);
        i2.setValor(valor);
        i3.setValor(valor);
        i1.calculaImposto(valor);
        i2.calculaImposto(valor);
        i3.calculaImposto(valor);

        double valorFinal = valor + i1.getValor() + i2.getValor() + i3.getValor();

        System.out.println("Valor final: " + valorFinal);
    }
}