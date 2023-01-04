package DesafiosBasicos;
//Entrada
//A entrada será o número de meses que o sobrinho polpará o dinheiro.

//Saída
//A saída deve ser o valor que o sobrinho terá ao final dos meses.

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;
// TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos meses da entrada
        System.out.println(mesada*entrada);
    }
}
