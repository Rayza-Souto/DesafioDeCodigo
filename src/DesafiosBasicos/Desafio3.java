package DesafiosBasicos;
//quanto tempo levaria para ler lendo apenas 3 páginas por dia.

//Entrada
//A entrada será o número de páginas de um determinado livro

//Saída
//A saída deverá ser quanto tempo ela vai levar para ler esse livro

import java.util.Scanner; 

public class Desafio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = leitor.nextInt();
        int paginasLidas = 3;
        
        // TODO: Crie a condição necessária para que Getrudes saiba em quanto tempo terminará seus livros

        System.out.println(paginas/paginasLidas + " dias");
    }    
}
