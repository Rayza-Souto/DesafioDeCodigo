package DesafiosIntermediarios;

//Entrada
//A entrada será uma String com o nome da música e seu formato.

//Saída
//A saída deve ser se o arquivo será salvo ou não.


import java.util.Scanner; 
    
public class Desafio1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arquivoDoPc = leitor.next();
        
        // TODO: Crie a condição necessária para verificar o formato do arquivo de entrada

        if (arquivoDoPc.contains(".mp3")){
            System.out.println("Salvar");
        }
        else{
            System.out.println("Deletar");
        }

    }
}