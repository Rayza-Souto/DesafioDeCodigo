package DesafiosIntermediarios;

//Entrada
//A entrada será a velocidade que o veículo está e quantas multas ele já recebeu. Se ele estiver acima da velocidade, deve ser somado mais uma multa.

//Saida
//A saída deverá ser quantas multas o motorista já tem e se ele irá receber pontuação na carteira de habilitação.


import java.util.*; 
    
public class Desafio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();

        // TODO: Crie a condição necessária para verificar se os carros estão acima da velocidade
        // TODO2: Crie a condição para verificar se os motoristas receberão ou não pontos na carteira de habilitação

        if(velocidade>80){
          multas++;
          if(multas>=3) System.out.println(multas +" multas. Levou pontos na carteira");

          else System.out.println(multas +" multas. Nao levou pontos na carteira");
          
        }else System.out.println(multas +" multas. Nao levou pontos na carteira"); 
  
    }

}