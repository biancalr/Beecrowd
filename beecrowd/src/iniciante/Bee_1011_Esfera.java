package iniciante;

import java.util.Scanner;

/**
 * Fa�a um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu
 * raio (R). A f�rmula para calcular o volume �: (4/3) * pi * R3. Considere (atribua) para pi 
 * o valor 3.14159.
 * 
 * Dica: Ao utilizar a f�rmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens 
 * (dentre elas o C++), assumem que o resultado da divis�o entre dois inteiros � outro inteiro.
 * 
 * @author bibil
 *
 */
public class Bee_1011_Esfera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double volume = 0.0, raio = 0.0;
		final double PI = 3.14159; 
		Scanner input = null;
		
		input = new Scanner(System.in);
		raio = input.nextDouble();
		input.close();
		
		volume = calculaVolumeEsfera(raio, PI);
		
		System.out.println(String.format("VOLUME = %.3f", volume));
	}

	/**
	 * A f�rmula para calcular o volume �: (4/3) * pi * R3
	 * @param raio
	 * @param PI
	 * @return volume
	 */
	private static double calculaVolumeEsfera(double raio, double PI) {
		// TODO Auto-generated method stub
		return (4.0 / 3) * PI * (raio * raio * raio);
	}

}
