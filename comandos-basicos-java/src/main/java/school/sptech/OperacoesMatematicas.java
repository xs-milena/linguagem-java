package school.sptech;

public class OperacoesMatematicas {

    public static void main(String[] args) {
        // +, -, /, *, %, **

        Double teste = 100_000_000.0; //PODE COLOCAR _ PARA FACILITAR NA VISUALIZAÇÃO
        Double numeroA = 10.0;
        Double numeroB = 5.0; // TEM QUE COLOCAR O DECIMAL

        System.out.println("Adição: " + (numeroA + numeroB));
        System.out.println("Subtração: " + (numeroA - numeroB));
        System.out.println("Divisão: " + (numeroA / numeroB));
        System.out.println("Multiplicação: " + (numeroA * numeroB));
        System.out.println("Resto: " + (numeroA % numeroB));
        // Não temos ** para potenciação no Java
        // primeiro número base, segundo expoente
        System.out.println("Potênciação " + (Math.pow(numeroA,numeroB)));

        // Tomar cuidado com divisão de inteiros
        // Inteiro por inteiro sempre vai dar inteiro
        Integer n1 = 5;
        Integer n2 = 10;

        //
        Double resultado = Double.valueOf(n1) / n2;
        System.out.println("Resultado: " + resultado);

    }
}
