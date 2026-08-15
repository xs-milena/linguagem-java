package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class exercicio2 {
    public static void main(String[] args) {

        Integer soma = 0;
        Integer numSorteado = ThreadLocalRandom.current().nextInt(11);
        while(numSorteado != 0) {
            numSorteado = ThreadLocalRandom.current().nextInt(11);
            soma += numSorteado;
        }
        if(soma >= 0) {
            System.out.println("A soma dos números anteriores é:" + soma);
        }
    }
}
