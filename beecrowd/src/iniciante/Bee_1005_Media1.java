package iniciante;

import java.util.Scanner;

/**
 * Leia 2 valores de ponto flutuante de dupla precis�o A e B, que correspondem a 2 notas de um 
 * aluno. A seguir, calcule a m�dia do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem 
 * peso 7.5 (A soma dos pesos portanto � 11). Assuma que cada nota pode ir de 0 at� 10.0, 
 * sempre com uma casa decimal.
 * 
 * @author bibil
 *
 */
public class Bee_1005_Media1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota1 = 0, nota2 = 0, media = 0;
		Scanner input = null;
		
		input = new Scanner(System.in);		
		nota1 = input.nextDouble();
		nota2 = input.nextDouble();
		
		input.close();
		
		media = calculaMediaDeNotas(nota1, nota2);
		
		System.out.println(String.format("MEDIA = %.5f", media));

	}

	private static double calculaMediaDeNotas(double nota1, double nota2) {
		// TODO Auto-generated method stub
		nota1 = nota1 * 3.5;
		nota2 = nota2 * 7.5;
		return ((nota1 + nota2) / 11);
	}

}
