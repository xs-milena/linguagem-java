package school.sptech;

public class Interpolacao {

    public static void main(String[] args) {
        // let mensagem = "Meu nome é ${nome}"

        String nome = "Lucas";
        Integer idade = 22;
        Double altura = 1.80;

        String mensagem = ("Meu nome é: %s e tenho %d anos. " +
                "Minha altura é %.2f Teste 25%%").formatted(nome, idade, altura);
        //%2f == duas casas decimais. É o toFIxed
        // 25%% passa para porcentagem
        System.out.println(mensagem);

        String mensagem2 = String.format("Meu nome é: %s e tenho %d anos. " +
                "Minha altura é %.2f Teste 25%%", nome, idade, altura);
        System.out.println(mensagem2);

        String texto = """
                Meu nome é %s
                Tenho %.2f de altura
                        Testando espaço
                            #JavaMelhorQueJS   
                """.formatted(nome, altura);
        System.out.println(texto);

        // souf -> print formatado
        System.out.printf("Meu nome é: %s", nome);
    }
}
