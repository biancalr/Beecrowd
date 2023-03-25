package iniciante;

import java.util.Scanner;

/**
 * Joaozinho quer calcular e mostrar a quantidade de litros de combust�vel gastos em uma viagem, ao utilizar um autom�vel que faz 12 KM/L. 
 * Para isso, ele gostaria que voc� o auxiliasse atrav�s de um simples programa. 
 * Para efetuar o c�lculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade m�dia durante a mesma (em km/h). 
 * Assim, pode-se obter dist�ncia percorrida e, em seguida, calcular quantos litros seriam necess�rios. 
 * Mostre o valor com 3 casas decimais ap�s o ponto.
 * 
 * @author bibil
 *
 */
public class Bee_1017_GastoDeCombustivel {

	public static void main(String[] args) {
		
		double combustivelNecessario = 0.0;
		int tempoDeViagem, velocidadeMedia;
		Scanner input = new Scanner(System.in);
		
		tempoDeViagem = input.nextInt();
		velocidadeMedia = input.nextInt();
		input.close();
		
		combustivelNecessario = calculoDoCombustivelDaViagem(tempoDeViagem, velocidadeMedia);
		
		System.out.println(String.format("%.3f", combustivelNecessario));

	}

	/**
	 * C�lculo do Combust�vel da Viagem
	 * 
	 * @param tempoDeViagem
	 * @param velocidadeMedia
	 * @return
	 */
	private static double calculoDoCombustivelDaViagem(int tempoDeViagem, int velocidadeMedia) {
		double distanciaPercorrida = tempoDeViagem * velocidadeMedia;
		return distanciaPercorrida / 12;
	}

}
