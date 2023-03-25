package iniciante;

import java.util.Scanner;

/**
 * Leia um valor inteiro correspondente � idade de uma pessoa em dias e informe-a em anos, meses e dias
 *
 * Obs.: apenas para facilitar o c�lculo, considere todo ano com 365 dias e todo m�s com 30 dias. 
 * Nos casos de teste nunca haver� uma situa��o que permite 12 meses e alguns dias, como 360, 363 ou 364. 
 * Este � apenas um exerc�cio com objetivo de testar racioc�nio matem�tico simples.
 * 
 * @author bibil
 *
 */
public class Bee_1020_IdadeEmDias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * Valor inteiro correspondente � idade de uma pessoa em dias.
		 */
		int idadeEmDias = 0;
		
		/**
		 * Resultado da transforma��o
		 */
		int anos = 0, meses = 0, dias = 0;
		Scanner input = new Scanner(System.in);
		
		idadeEmDias = input.nextInt();
		input.close();
		
		// Calculando os anos dividindo os dias (idade) por 365 (quantidade de dias em um ano).
		anos = idadeEmDias / 365;
		
		// Subtraindo os dias transformados em anos
		idadeEmDias = idadeEmDias - (anos * 365);
		
		// Calculando os meses dividindo os dias restantes por 30 (quantidade de dias em um m�s).
		meses = idadeEmDias / 30;
		
		// Subtraindo os dias transformados em meses e atribuindo o restante a vari�vel dias.
		dias = idadeEmDias - (meses * 30);
		
		System.out.println(String.format("%s ano(s)", anos));
		System.out.println(String.format("%s mes(es)", meses));
		System.out.println(String.format("%s dia(s)", dias));
		
	}

}
