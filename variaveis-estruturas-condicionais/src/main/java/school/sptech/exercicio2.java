package school.sptech;

public class exercicio2 {
    public static void main(String[] args) {

        String nome = "Milena";
        Integer minutos_aquecendo = 10;
        Integer minutos_aerobico = 30;
        Integer minutos_musculacao = 30;
        Integer totalMinutos = minutos_aerobico + minutos_aquecendo + minutos_musculacao;

        Integer calorias_aquecimento = minutos_aquecendo * 12;
        Integer calorias_aerobico = minutos_aerobico * 20;
        Integer calorias_musculacao = minutos_musculacao * 25;
        Integer totalCalorias = calorias_aerobico + calorias_aquecimento + calorias_musculacao;

        String mensagem = String.format("Olá %s, vocẽ fez um total de %d minutos de exercícios e perdeu cerca de %d calorias", nome, totalMinutos, totalCalorias);
        System.out.println(mensagem);
    }
}
