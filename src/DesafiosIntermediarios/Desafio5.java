package DesafiosIntermediarios;
import java.util.Scanner; 
//Entrada
//A entrada será o tamanho da fila que aguardava para ver o show.

//Saída
//A saída deve ser o número de pessoas que foram colocadas no camarote. (sem as aspas)

public class Desafio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanhoDaFila = leitor.nextInt();
        int pessoasNoCamarote = (int)(Math.round((Double.valueOf(tamanhoDaFila)/ 2)));
        
        // TODO: Crie a condição necessária para verificar quais números, de acordo com o range de entrada, são ímpares.
        
        System.out.println(pessoasNoCamarote+" pessoas no camarote");
    }
}
