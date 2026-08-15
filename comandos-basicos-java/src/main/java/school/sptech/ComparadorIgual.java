package school.sptech;

public class ComparadorIgual {
    public static void main(String[] args) {

        /*
      String textoA = null
      String textoB = null

      se colocar null dá esse erro: Exception in thread "main" java.lang.NullPointerException
        */

      String textoA = new String("teste");
      String textoB = new String("teste");

        // Para comparar tipos WRAPPER usamos .equals
        // Para comparar tipos primitivos usamos  ==
        // Para commparar nulo, sempre usamos ==, o mesmo com Wrapper!

        // esse .equals compara o conteúdo
      if(textoA.equals(textoB)) {
          System.out.println("Iguais");
      } else {
          System.out.println("Diferentes");
      }

// ---------------------------------------------------------------------------------------------------------------- //

        String textoC = null;
        String textoD = null;

        // Para comparar tipos WRAPPER usamos .equals
        // Para comparar tipos primitivos usamos  ==
        // Para commparar nulo, sempre usamos ==, o mesmo com Wrapper!

        //verifica se o textoC é nullo e se nn for, ele vai comparar o texto C com o textoD
        if(textoC != null && textoC.equals(textoD)) {
            System.out.println("Iguais");
        } else {
            System.out.println("Diferentes");
        }

        String nome = "Lucas";
        String nome2 = "lucas";

        if(nome.equalsIgnoreCase(nome2)) {
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }
    }
}
