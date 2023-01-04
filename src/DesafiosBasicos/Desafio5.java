package DesafiosBasicos;
//Entrada
//A entrada vai ser a velocidade do motorista.

//Saída
//A saída será uma mensagem no console dizendo se o motorista foi multado ou não.

import java.util.Scanner; 
    
public class Desafio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = leitor.nextInt();
        
        // TODO: Crie a condição necessária para verificar se o motorista, de acordo com a entrada, foi multado ou não.

        if (velocidadeAtual <=60){
            System.out.println("Nao foi multado");
        }
        else {
            System.out.println("Foi multado");
        }
    }
}