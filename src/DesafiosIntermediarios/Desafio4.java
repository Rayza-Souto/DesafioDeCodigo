package DesafiosIntermediarios;

//Entrada
//A entrada serão os ingredientes que compõem o lanche.

//Saída
//A saída deverá ser o lanche montado com as palavras que definem os ingredientes.

import java.util.*;

public class Desafio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String ingredientes = leitor.next();
        String listaIngredientes[] = new String[3];
        
        // TODO: Crie a condição necessária para formatar e printar o texto da maneira pedida na saída

        listaIngredientes = ingredientes.split(";");
        for(int index = 0; index < listaIngredientes.length; index++) {
           System.out.println(listaIngredientes[index] + "\n");
        }

    }
}
