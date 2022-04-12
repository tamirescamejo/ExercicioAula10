import java.util.Scanner;

public class Exercício7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Preço de custo do produto: ");
        double precoCusto = leitor.nextDouble();

        System.out.println("Inseira o percentural de venda: ");
        double percentural = leitor.nextDouble();

        valorProduto(precoCusto, percentural);

    }
    public static void valorProduto(double precoCusto, double percentual){

       double valorVenda = (precoCusto + ((percentual*precoCusto)/100));

       System.out.println("O valor de venda do produto é R$ "+valorVenda);
    }
}

/*Faça um programa que receba o preço de custo de um produto e
mostre o valor de venda. Sabe-se que o preço de custo receberá um
acréscimo de acordo com um percentual informado pelo usuário.*/