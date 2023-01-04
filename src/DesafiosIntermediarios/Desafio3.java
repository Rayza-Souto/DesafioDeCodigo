package DesafiosIntermediarios;

import java.util.*;
//Entrada
//A entrada será a classificação do imóvel, o valor do aluguel dele e se ele está disponível no momento.

//Saída
//A saída deverá ser as informações da entrada, porém de uma forma mais amigável. (sem as aspas)

public class Desafio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String frase = leitor.next();
        String array[] = new String[3];
        
        // TODO: Crie a condição necessária para remover as barras da String e apresentar de forma mais amigável
        if(Objects.nonNull(frase)){
            array = frase.split("/");
            System.out.println("Imovel: " + array[0] + " R$" + array[1] + " " + array[2]);
        }
    }
}
