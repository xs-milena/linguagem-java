package school.sptech;

public class Variaveis {

    public static void main(String[] args) {
        // let idade = 10
        // Java é uma linguagem fortemente tipada, ou seja, vocẽ tem de escolher o nome de tudo. Para assim, saber o que a variável é

        // variáveis de letra minuscula são variáveis do TIPO PRIMITIVO
            // eles não aceitam NULL
            // forma mais fácil do Java conversar com o código
            // não é uma classe

        int idade = 10; // 32 bits
        long numeroGrande = 1000L; // 64 bitS.

        float peso = 60.0f; // num quebrado
        double altura = 1.76; // num quebrado
        boolean temModo = false; // true or false
        char letra = 'L'; // char = 1 letra e é aspas simples

        // variáveis de letra maiuscula são variáveis do TIPO WRAPPER
            // eles aceitam null
            // eles possuem "funções" a mais por serem classes
            // são classes, ent da para usar eles com funções

        String frase = "Bom dia";
        String fraseMinuscula = frase.toLowerCase();
        Integer wIdade = 10;
        Long wNumeroGrande = 10000L;

        Float wPeso = 60.0f;
        Double wAltura = 1.90;

        Boolean wTemMoto = false;
        Character wLetra = 'L';



        //Toda variável precisa ser inicializada (com = "")

        String mensagem = "";
        //sout
        System.out.println("Mensagem: " + mensagem);

    }
}
