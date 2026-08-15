package school.sptech;

import javax.print.DocFlavor;

public class exercicio3 {
    public static void main(String[] args) {

        Double valorArroz = 30.50;
        Double qntArroz = 4.0;
        Double valorPago = 200.0;

        Double total = valorArroz * qntArroz;
        Double troco =  valorPago - total;

        String mensagem = String.format("Seu troco será de R$ %.2f", troco);
        System.out.println(mensagem);
    }
}
