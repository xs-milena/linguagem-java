package school.sptech;

public class exercicio4 {

    public static void main(String[] args) {

        String nome = "Milena";
        Double nota1 = 10.0;
        Double nota2 = 8.0;

        Double media = (nota1 + nota2) / 2;

        String mensagem = String.format("Olá, %s. Sua média foi de %.2f", nome, media);
        System.out.println(mensagem);
    }
}
