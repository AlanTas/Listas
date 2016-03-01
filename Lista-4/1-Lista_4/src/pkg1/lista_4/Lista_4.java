package pkg1.lista_4;
import java.util.Arrays;
import java.util.Scanner;

public class Lista_4 {

   
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int vetor[] = new int[12];
        System.out.println("Crie um novo vetor:");
        System.out.println("-------------------------");
        for (int i = 0; i < 12; i++)
        {
            System.out.println("Insira o item " + (i+1) + " do vetor");
            vetor[i] = scan.nextInt();  
            System.out.println("-------------------------");
        }
        
        System.out.println("O vetor é: ");
        System.out.println(Arrays.toString(vetor));
        System.out.println("-------------------------");
        
        System.out.println("Entre com as duas posições que deseja somar ([1 ~ 12]) : ");
        System.out.println("-------------------------");
        System.out.print("Primeira posição: ");
        int um = scan.nextInt();
        System.out.println("-------------------------");
        System.out.print("Segunda posição: ");
        int dois = scan.nextInt();
        System.out.println("-------------------------");
        System.out.println("O resultado da soma é: " + (vetor[(um - 1)] + vetor[(dois - 1)]));
        
        
      
    }
    
}
