package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class exercicio6 {
    public static void main(String[] args) {
       Integer numEscolhido = 50;
       Integer numSorteado = ThreadLocalRandom.current().nextInt(101);
       Integer pares = 0;
       Integer impares = 0;
       Integer index = -1;

        for (int i = 0; i < 200; i++) {

         numSorteado = ThreadLocalRandom.current().nextInt(101);
            if(numSorteado.equals(numEscolhido) && index == -1) {
                index = i;
                String mensagem = String.format("Número %d sorteado pela 1ª vez na posição %d", numEscolhido, index);
                System.out.println(mensagem);
        }else if (numSorteado % 2 == 0) {
              pares++;
        } else if (numSorteado % 2 == 1) {
            impares++;
        }
    }

        System.out.println("Foram sorteados " + pares + " números pares");
        System.out.println("Foram sorteados " + impares + " números impares");
}
}
