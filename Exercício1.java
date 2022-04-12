import java.util.Scanner;

public class Exercício1 {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = leitor.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = leitor.nextInt();

        calculoDoisNumeros(num1, num2);
    }

    public static void calculoDoisNumeros(int num1, int num2){
        int soma = num1+num2;
        int menos = num1-num2;
        int multi = num1*num1;
        int divi = num1/num2;

        System.out.println(num1+" + "+num2+" = "+soma);
        System.out.println(num1+" - "+num2+" = "+menos);
        System.out.println(num1+" x "+num2+" = "+multi);
        System.out.println(num1+" / "+num2+" = "+divi);
 
    }
    
}

/*Escreva um programa que receba dois números e ao final mostre a
soma, subtração, multiplicação e a divisão dos números lidos*/