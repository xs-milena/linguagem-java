package school.sptech;

public class exercicio1 {
    public static void main(String[] args) {

        Integer totalFilhos_0_a_3= 2;
        Integer totalFilhos_4_a_16= 2;
        Integer totalFilhos_17_e_18 = 2;

        Integer totalFilhos = totalFilhos_0_a_3 + totalFilhos_4_a_16 + totalFilhos_17_e_18;

        Double bolsa1 = Double.valueOf(totalFilhos_0_a_3) * 25.12;
        Double bolsa2 = Double.valueOf(totalFilhos_4_a_16) * 15.88;
        Double bolsa3 = Double.valueOf(totalFilhos_17_e_18) * 12.44;
        Double totalBolsas = bolsa1 + bolsa2 + bolsa3;

        String mensagem = String.format("Você tem um total de %d filhos e vai receber R$:%.2f de bolsa", totalFilhos, totalBolsas);
        System.out.println(mensagem);
    }
}
