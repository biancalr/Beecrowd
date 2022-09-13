package iniciante;

import java.util.Scanner;

/**
 * Faça um programa que leia três valores e apresente o maior dos três
 * valores lidos seguido da mensagem “eh o maior”. 
 * Utilize a fórmula:
 * 
 * MaiorAB = (a + b + abs(a-b)) / 2
 * 
 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros 
 * (a e b). Um segundo passo, portanto é necessário para chegar no 
 * resultado esperado.
 * 
 * @author bibil
 *
 */
public class OMaior {

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

	/** calcula o Maior Entre Dois Números
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	private static int calculaMaiorEntreDoisNumeros(int a, int b) {
		return (a + b + Math.abs(a-b)) / 2;
	}
	
	

}
