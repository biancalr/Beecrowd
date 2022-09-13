package iniciante;

import java.util.Scanner;

/**
 * Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do 
 * produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 * 
 * @author bibil
 *
 */
public class Diferenca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int diferenca = 0, A = 0, B = 0, C = 0, D = 0;
		Scanner input = null;
		
		input = new Scanner(System.in);
		A = input.nextInt();
		B = input.nextInt();
		C = input.nextInt();
		D = input.nextInt();
		input.close();
		
		diferenca = calculaDiferenca(A, B, C, D);
		
		System.out.println("DIFERENCA = " + diferenca);

	}

	private static int calculaDiferenca(int a, int b, int c, int d) {
		// TODO Auto-generated method stub
		return (a * b - c * d);
	}

}
