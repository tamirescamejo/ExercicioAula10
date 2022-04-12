import java.util.Scanner;

public class Exercício5 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um temperatura em ºC: ");
        double temperatura1 = leitor.nextDouble();

        conversaoTemperatura(temperatura1);
    }

    public static void conversaoTemperatura(double temperatura1){

        double temperatura2 = ((9 * temperatura1) + 160) / 5;

        System.out.println("A temperatura em F é: " +temperatura2);

    }
    
}

/*Ler uma temperatura em graus Celsius e apresentá-la convertida em
graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F
a temperatura em Fahrenheit e C a temperatura em Celsius.*/