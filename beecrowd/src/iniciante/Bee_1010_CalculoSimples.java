package iniciante;

import java.util.Scanner;

/**
 * Neste problema, deve-se ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor 
 * unit�rio de cada pe�a 1, o c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio 
 * de cada pe�a 2. Ap�s, calcule e mostre o valor a ser pago. 
 * 
 * @author bibil
 *
 */
public class Bee_1010_CalculoSimples {

	public static void main(String[] args) {
		
		double valorTotal = 0.0; 
		int codigoPeca1, codigoPeca2;
		int qtdePecas1, qtdePecas2;
		double valorUnitarioPeca1 = 0.0, valorUnitarioPeca2 = 0.0;
		Scanner input = null;
		
		input = new Scanner(System.in);
		//Recebendo valor de 1
		codigoPeca1 = input.nextInt();
		qtdePecas1 = input.nextInt();
		valorUnitarioPeca1 = input.nextDouble();
		//Recebendo valo de 2
		codigoPeca2 = input.nextInt();
		qtdePecas2 = input.nextInt();
		valorUnitarioPeca2 = input.nextDouble();
		
		valorTotal = calculaValorTotal(qtdePecas1, qtdePecas2, valorUnitarioPeca1, valorUnitarioPeca2);
		
		input.close();
		
		System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valorTotal));

	}

	private static double calculaValorTotal(int qtdePecas1, int qtdePecas2, double valorUnitarioPeca1,
			double valorUnitarioPeca2) {
		// TODO Auto-generated method stub
		return (qtdePecas1 * valorUnitarioPeca1) + (qtdePecas2 * valorUnitarioPeca2);
	}

}
