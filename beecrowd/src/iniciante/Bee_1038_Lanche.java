package iniciante;

import java.util.Scanner;

/**
 * Com base na tabela, escreva um programa que leia o código de um item e a
 * quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
 * 
 * @author bianc
 *
 */
public class Bee_1038_Lanche {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int codigo, quantidade;
		Scanner input = new Scanner(System.in);

		codigo = input.nextInt();
		quantidade = input.nextInt();

		input.close();

		switch (codigo) {
		case 1: {
			System.out.println(String.format("Total: R$ %.2f", (4.0 * quantidade)));
			break;
		}
		case 2: {
			System.out.println(String.format("Total: R$ %.2f", (4.5 * quantidade)));
			break;
		}
		case 3: {
			System.out.println(String.format("Total: R$ %.2f", (5.0 * quantidade)));
			break;
		}
		case 4: {
			System.out.println(String.format("Total: R$ %.2f", (2.0 * quantidade)));
			break;
		}
		case 5: {
			System.out.println(String.format("Total: R$ %.2f", (1.5 * quantidade)));
			break;
		}

		}

	}

}
