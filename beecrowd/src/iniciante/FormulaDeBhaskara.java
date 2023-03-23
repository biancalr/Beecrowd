package iniciante;

import java.util.Scanner;

/**
 * Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de
 * Bhaskara. Se não for possível calcular as raízes, mostre a mensagem
 * correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de
 * numero negativo.
 * 
 * @author bianc
 *
 */
public class FormulaDeBhaskara {

	public static void main(String[] args) {
		double A, B, C, X1, X2, delta;
		Scanner input = new Scanner(System.in);

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		input.close();

		if (A == 0 | calculaValorDelta(B, A, C) < 0) {
			System.out.println("Impossivel calcular");
		} else {
			delta = calculaValorDelta(B, A, C);
			X1 = (((-B) + Math.sqrt(delta)) / (2 * A));
			X2 = (((-B) - Math.sqrt(delta)) / (2 * A));
			System.out.println(String.format("R1 = %.5f", X1));
	        System.out.println(String.format("R2 = %.5f", X2));
		}

	}

	private static double calculaValorDelta(double b, double a, double c) {
		return (b * b) - (4 * a * c);
	}

}
