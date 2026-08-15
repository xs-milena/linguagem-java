package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class exercicio1 {
    public static void main(String[] args) {

        Integer Loteria = ThreadLocalRandom.current().nextInt(11);
        Integer numeroEscolhido = 5;
        Integer iteracoes = 0;


        while (Loteria != numeroEscolhido) {
            iteracoes++;
            Loteria = ThreadLocalRandom.current().nextInt(11);
        }

        String mensagem = String.format("Iteração: %d", iteracoes);
        System.out.println(mensagem);

        if (iteracoes <= 3) {
            System.out.println("Você é MUITO sortudo");

        }else if (iteracoes <= 10) {

            System.out.println("Você é sortudo");
        } else {

            System.out.println("É melhor você parar de apostar e ir trabalhar");
        }
    }
}
