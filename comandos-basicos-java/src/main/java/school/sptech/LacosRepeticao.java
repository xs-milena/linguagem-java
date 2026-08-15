package school.sptech;

public class LacosRepeticao {

    public static void main(String[] args) {
        // while, for, do-while

        // atalho = fori

        // EXEMPLO COM FOR
            // Já tem a quantidade de i definidas

        System.out.println("EXEMPLO COM FOR");
        for (int i = 0; i < 10; i++) {
            System.out.println("Número da vez: " + i);
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println("Número for da vez: " + i);
        }

        // EXEMPLO DE WHILE
            // Não tem a quantidade de i definidas

        System.out.println("EXEMPLO COM WHILE");

        // não chega a fazer o laço, já q o contador é menor que 11
        int contador = 11;
        while (contador < 10) {
            System.out.println("Número while da vez: " + contador);
            contador++;
        }

        // do-while verifica pelo menos uma vez

        int contadorDoWhile = 11;
        do {
            System.out.println("Contador do-while: " + contadorDoWhile);
            contadorDoWhile++;
        } while (contadorDoWhile < 10);

    }
}
