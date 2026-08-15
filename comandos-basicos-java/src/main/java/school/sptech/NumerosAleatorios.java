package school.sptech;

import java.util.concurrent.ThreadLocalRandom;

public class NumerosAleatorios {
    public static void main(String[] args) {

        // Para gerar de 0 até 10l colocae 11
        Integer numeroAleatorio = ThreadLocalRandom.current().nextInt(11);
        System.out.println("Número aleatório: " + numeroAleatorio);

        // De 10 até 20
        Integer numeroAleatorio2 = ThreadLocalRandom.current().nextInt(10,21);
        System.out.println("Número aleatório2: " + numeroAleatorio2);

        Double numeroDoubleAleatorio = ThreadLocalRandom.current().nextDouble(11);
        System.out.println("Double aleatório: " + numeroDoubleAleatorio);
    }
}
