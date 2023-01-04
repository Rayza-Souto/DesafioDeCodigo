package DesafiosBasicos;
//Entrada
//A entrada será um número que representará a porcentagem

//Saída
//A saída serão as barras sem espaços entre elas. 

import java.util.*;
import java.io.*;

public class Desafio2 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int tamanho = leitor.nextInt();

        // TODO: Crie a condição necessária para que, de acordo com o tamanho, seja printado no console barras representando o download
        
        String barra ="";
        for (int valor = 0; valor < tamanho; valor++) {
            barra += "/";
        }

        System.out.println(barra);
}

}
