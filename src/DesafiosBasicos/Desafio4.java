package DesafiosBasicos;
//Cada 1 real irá render 2 doces aleatórios.

//Entrada
//A entrada será a quantidade de dinheiro que cada cliente, um por vez, possui.

//Saída
//A saída deverá ser a quantidade de doces que cada cliente conseguiu obter.



import java.util.Scanner; 
    
public class Desafio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = leitor.nextInt();
        
        // TODO: Crie a condição necessária para que cada cliente saiba quantos doces vai obter de acordo com a entrada

        System.out.println("O cliente obteve " + (doce*2) + " doces");
    }
}
