
import java.util.Scanner;

public class Exercício2 {

    public static void main(String[] args) {

        numeros();

    }

    public static void numeros(){
        Scanner leitor = new Scanner(System.in);
        
        int vetorNum[] = new int[7];

        for(int i = 0; i < 7; i++){
            System.out.println("Escreva o " + (i + 1) + "º número");
            vetorNum[i] = leitor.nextInt();
        }

        int menor = vetorNum[0];
        
        for(int i = 1; i < 7; i++){
            if(vetorNum[i] < menor){
                menor = vetorNum[i];
            }
        }

        System.out.println("O menor número digitado foi: "+menor);

    }
}

/*Faça um programa que receba sete números e imprimir o menor
número (suponha números diferentes) entre eles
Obs: use vetores para a resolução do exercício*/