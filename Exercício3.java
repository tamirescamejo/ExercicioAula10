import java.util.Scanner;

import javax.xml.transform.Source;

public class Exercício3 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Nome do vendedor: ");
        String nome = leitor.nextLine();

        System.out.println("Sálario do vendedor: ");
        Double salario = leitor.nextDouble();

        System.out.println("Total de vendas efetuadas pelo vendedor: ");
        Double vendas = leitor.nextDouble();

        salariototal (salario, vendas, nome);

    }

    public static void salariototal(double salario, double vendas, String nome){
        double comissao = vendas*15/100; 
        double salarioTotal = comissao + salario; 

        System.out.println("Nome do vendedor: "+ nome); 
        System.out.println("Salário Fixo: R$ "+ salario);
        System.out.println("Salário Final: R$ "+ salarioTotal);
}

    }

/*Escrever um programa que leia o nome de um vendedor, o seu
salário fixo e o total de vendas efetuadas por ele no mês (em
dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre
suas vendas efetuadas, informar o seu nome, o salário fixo e salário
no final do mês*/