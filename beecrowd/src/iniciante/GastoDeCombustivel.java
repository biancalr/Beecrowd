package iniciante;

import java.util.Scanner;

/**
 * Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L. 
 * Para isso, ele gostaria que você o auxiliasse através de um simples programa. 
 * Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h). 
 * Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários. 
 * Mostre o valor com 3 casas decimais após o ponto.
 * 
 * @author bibil
 *
 */
public class GastoDeCombustivel {

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
	 * Cálculo do Combustível da Viagem
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
