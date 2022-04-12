import java.util.Scanner;

public class Exercício4 {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Nome do aluno: ");
        String nomeAluno = leitor.nextLine();
        
        System.out.println("Nota da primeira prova: ");
        double p1 = leitor.nextDouble();
        
        System.out.println("Nota da segunda prova: ");
        double p2 = leitor.nextDouble();

        System.out.println("Nota da terceira prova: ");
        double p3 = leitor.nextDouble();

        mediaFinal (nomeAluno,p1, p2, p3);

    }

    public static void mediaFinal(String nomeAluno, double p1, double p2, double p3){

        double mediaFinal = (p1 + p2 + p3) / 3;

        System.out.println("Nome do aluno: "+nomeAluno);
        System.out.println("Média: "+mediaFinal);
        
}
}

/*Escrever um programa que leia o nome de um aluno e as notas das
três provas que ele obteve no semestre. No final informar o nome do
aluno e a sua média (aritmética)
Obs: use vetores para a resolução do exercício*/
