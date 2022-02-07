package ex01;

public class ContarLetras {
    public static void main(String[] args) {
        quantidadeCaracteresUltimaPalavra("Na minha máquina funciona");
        quantidadeCaracteresUltimaPalavra("Eu posso pular o teste");
        quantidadeCaracteresUltimaPalavra("Isso não deve funcionar");
    }

    private static void quantidadeCaracteresUltimaPalavra(String frase) {
        String[] tratamento = frase.split(" ");

        System.out.println("Resultado: "+ tratamento[tratamento.length - 1].length());
    }
}
