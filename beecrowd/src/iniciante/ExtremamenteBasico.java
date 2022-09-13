package iniciante;

import java.util.Scanner;

/**
 * Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X.
 * Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e 
 * não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 */
public class ExtremamenteBasico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int X, A, B;
		Scanner input;
		
		X = 0;
		input = new Scanner(System.in);
		A = input.nextInt();
		B = input.nextInt();
		input.close();
		
		X = soma(A, B);
		System.out.println("X = " + X);
		
	}

	private static int soma(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
