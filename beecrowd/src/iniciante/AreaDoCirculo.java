package iniciante;

import java.util.Scanner;

/**
 * A fórmula para calcular a área de uma circunferência é: area = (pi) . raio2.
 * Considerando para este problema que (pi) = 3.14159:
 * - Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando 
 *   por (pi).
 */
public class AreaDoCirculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double raio;
		double area;
		Scanner input;
		
		input = new Scanner(System.in);
		raio = input.nextDouble();
		area = calculaCircunferencia(raio);
		
		input.close();
		System.out.println(String.format("A=%.4f", area));

	}

	private static double calculaCircunferencia(double raio) {
		// TODO Auto-generated method stub
		return (raio * raio) * 3.14159;
	}

}
