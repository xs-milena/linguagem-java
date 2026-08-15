package school.sptech;

public class exercicio5 {
    public static void main(String[] args) {


        Integer B = 2;
        Integer E = 5;
        Integer resultado = 1;

        for (int i = 1; i <= E; i++) {
            resultado = B * resultado;
        }

        System.out.println(B + " elevado a " + E + " é: " + resultado);
    }
}
