package iniciante;

import java.util.Scanner;

/**
 * A f�rmula para calcular a �rea de uma circunfer�ncia �: area = (pi) . raio2.
 * Considerando para este problema que (pi) = 3.14159:
 * - Efetue o c�lculo da �rea, elevando o valor de raio ao quadrado e multiplicando 
 *   por (pi).
 */
public class Bee_1002_AreaDoCirculo {

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
