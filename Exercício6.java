import java.util.Scanner;

public class Exercício6
 {

     static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a cotação do Dólar(US$) hoje: ");
        double cotacao = leitor.nextDouble();

        System.out.println("Digite a quantidade de Dolár(US$) que deseja converter: ");
        double qdtDolar = leitor.nextDouble();
    
        conversaoDolar(cotacao, qdtDolar);
    }

    public static void conversaoDolar(double cotacao, double qdtDolar){

        double conversaoReal = qdtDolar * cotacao;

        System.out.println("O valor da quantidade de Dólar convertido para o real é de R$: "+conversaoReal);

    }
 } 

 /*Elaborar um programa que efetue a apresentação do valor da
conversão em real (R$) de um valor lido em dólar (US$). O algoritmo
deverá solicitar o valor da cotação do dólar e também a quantidade
de dólares disponíveis com o usuário.*/
