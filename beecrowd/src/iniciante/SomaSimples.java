package iniciante;

import java.util.Scanner;

/**
 * Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas
 * e atribua à variável SOMA. A seguir escrever o valor desta variável.
 * @author bibil
 *
 */
public class SomaSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int SOMA = 0, A = 0, B = 0;
		Scanner input = null;
		
		input = new Scanner(System.in);
		A = input.nextInt();
		B = input.nextInt();
		
		input.close();
		SOMA = somaDeDoisNumeros(A, B);
		
		System.out.println("SOMA = " + SOMA);
	}

	private static int somaDeDoisNumeros(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
