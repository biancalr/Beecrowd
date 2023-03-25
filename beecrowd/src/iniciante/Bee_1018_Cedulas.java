package iniciante;

import java.util.Scanner;

/**
 * Leia um valor inteiro. A seguir, calcule o menor n�mero de notas poss�veis
 * (c�dulas) no qual o valor pode ser decomposto. As notas consideradas s�o de
 * 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a rela��o de notas
 * necess�rias
 * 
 * @author bibil
 *
 */
public class Bee_1018_Cedulas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valorTotal = 0;
		int quantidadeNotas = 0;
		int[] notas = { 100, 50, 20, 10, 5, 2, 1 };
		Scanner input = new Scanner(System.in);

		valorTotal = input.nextInt();
		input.close();

		System.out.println(String.format("%s", valorTotal));

		for (int i = 0; i < notas.length; i++) {
			quantidadeNotas = valorTotal / notas[i];
			System.out.println(String.format("%s nota(s) de R$ %s,00", quantidadeNotas, notas[i]));
			valorTotal = valorTotal - (quantidadeNotas * notas[i]);
		}

	}

}
