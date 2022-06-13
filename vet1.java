package vetandmtz;
import java.util.Scanner;
public class veti {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in); 
		

		int[] A = new int[6]; // Iniciando Array A
		int[] B = new int[6]; // Iniciando Array B

		for (int X = 0; X < 5;) { // Iniciando um Loop For Primário
			X++; // Contador que adiciona 1 ao valor de X
			System.out.println("Digite o " + X + " elemento de A:"); // Imprimindo mensagem
			A[X] = leitor.nextInt(); // Recebendo uma resposta variável A
			System.out.println("Digite o " + X + " elemento de B:"); // Imprimindo mensagem
			B[X] = leitor.nextInt(); // Recebendo uma resposta em uma variavel B

		}

		int C = 0; // Declarando uma variavel C
		for (int X = 1; X <= 5;) { // Iniciando um Loop For secundário
			C = C + A[X] * B[X]; // cálculo para a obtenção do valor C
			X++; // Contador que adiciona 1 ao valor de X
		}
		System.out.println("Valor de C: " + C); // Imprimindo mensagem final

	}

}