package iniciante;

import java.util.Scanner;

/**
 * Fa�a um programa que leia tr�s valores e apresente o maior dos tr�s
 * valores lidos seguido da mensagem �eh o maior�. 
 * Utilize a f�rmula:
 * 
 * MaiorAB = (a + b + abs(a-b)) / 2
 * 
 * Obs.: a f�rmula apenas calcula o maior entre os dois primeiros 
 * (a e b). Um segundo passo, portanto � necess�rio para chegar no 
 * resultado esperado.
 * 
 * @author bibil
 *
 */
public class Bee_1013_OMaior {

	public static void main(String[] args) {
		
		int a = 0, b = 0, c = 0;
		int maior = 0;
		Scanner input = new Scanner(System.in);
		
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		input.close();
		
		maior = calculaMaiorEntreDoisNumeros(a, b);
		maior = calculaMaiorEntreDoisNumeros(maior, c);
		
		System.out.println(maior + " eh o maior");

	}

	/** calcula o Maior Entre Dois N�meros
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int calculaMaiorEntreDoisNumeros(int a, int b) {
		return (a + b + Math.abs(a-b)) / 2;
	}
	
	

}
