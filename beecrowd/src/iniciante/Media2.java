package iniciante;

import java.util.Scanner;

/**
 * Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
 * A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e
 * a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa 
 * decimal.
 * 
 * @author bibil
 *
 */
public class Media2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double media = 0.0, A = 0.0, B = 0.0, C = 0.0;
		Scanner input = null;
		
		input = new Scanner(System.in);
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		input.close();
		
		media = calculaMediaDosNumeros(A, B, C);
		
		System.out.println(String.format("MEDIA = %.1f", media));
	}

	private static double calculaMediaDosNumeros(double a, double b, double c) {
		return (a * 2 + b * 3 + c * 5) / 10;
	}

}
