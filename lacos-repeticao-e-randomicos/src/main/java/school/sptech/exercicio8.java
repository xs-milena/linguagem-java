package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class exercicio8 {
    public static void main(String[] args) {

            Integer contador = 0;
            Integer mussarela = 0;
            Integer queijo = 0;
            Integer calabresa = 0;

            while(contador < 10) {
                contador++;
               Integer Votacao =ThreadLocalRandom.current().nextInt(4);
                if (Votacao == 1) {
                    mussarela++;
                } else if (Votacao == 2) {
                    calabresa++;
                } else {
                    queijo++;
                }
            }

            String mensagem = String.format("pizza de calabresa: %d votos / pizza de mussarela: %d votos / pizza de queijo: %d votos", calabresa, mussarela, queijo);
            System.out.println(mensagem);

            if( (calabresa > mussarela) && (calabresa > queijo)) {
                System.out.println("pizza de calabresa ganhou");
            } else if ((mussarela > calabresa) && (mussarela > queijo)) {
                System.out.println("pizza de mussarela ganhou");
            } else {
                System.out.println("pizza de queijo ganhou");
            }
        }
}
