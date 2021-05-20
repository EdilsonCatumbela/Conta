package VectMatColecoes;
import java.util.Scanner;

public class Vetor {
  public static void main(String[] args) {
    
    int[] numeros;
	numeros = new int[10];
	int i;
	Scanner entra = new Scanner(System.in);
    
	for(i=0;i<10;i++){
		System.out.print("Digite o "+(i+1)+"o. valor do vetor: ");
		numeros[i] = entra.nextInt();		
	}
	System.out.println("\n\nConteudo do vetor: ");
	for(i=0;i<10;i++){
		System.out.println("Valor "+ (i+1)+ " do vetor: "+ numeros[i]);		
	}	
	entra.close();
	}
}
