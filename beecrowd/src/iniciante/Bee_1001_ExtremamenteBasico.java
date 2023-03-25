package iniciante;

import java.util.Scanner;

/**
 * Leia 2 valores inteiros e armazene-os nas vari�veis A e B. Efetue a soma de A e B atribuindo o seu resultado na vari�vel X.
 * Imprima X conforme exemplo apresentado abaixo. N�o apresente mensagem alguma al�m daquilo que est� sendo especificado e 
 * n�o esque�a de imprimir o fim de linha ap�s o resultado, caso contr�rio, voc� receber� "Presentation Error".
 */
public class Bee_1001_ExtremamenteBasico {

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
