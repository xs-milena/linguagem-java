package school.sptech;

public class Condicionais {
    //main
    public static void main(String[] args) {

        //condicionais: if, else-if, else, ternario

        Boolean temCarro = false;

        if (temCarro) {
            System.out.println("Tem carro!");
        } else {
            System.out.println("Não tem carro!");
        }

        Integer idade = 10;

        if (idade < 16) {
            System.out.println("Não pode fazer nada :(");
        } else if (idade < 18) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Pode votar e dirigir!");
        }

        //ternario
        String mensagem = idade >=18 ? "Maior de idade" : "Menor de idade";
        System.out.println(mensagem);

        // && e || mantém
        // >,<,>=, <=
    }
}
