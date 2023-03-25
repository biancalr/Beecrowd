package iniciante;

import java.util.Scanner;

/**
 * Leia os quatro valores correspondentes aos eixos x e y de dois pontos quaisquer no plano, 
 * p1(x1,y1) e p2(x2,y2) e calcule a dist�ncia entre eles, mostrando 4 casas decimais ap�s 
 * a v�rgula, segundo a f�rmula.
 * 
 * @author bibil
 *
 */
public class Bee_1015_DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		
		double distancia = 0.0;
		double x1, y1, x2, y2;
		Scanner input = new Scanner(System.in);
		
		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();
		input.close();
		
		distancia = calculaDistanciaEntrePontos(x1, y1, x2, y2);
		
		System.out.println(String.format("%.4f", distancia));

	}

	/**
	 * M�todo para calcular a dist�ncia entre os dois pontos
	 * 
	 * @param x1 do ponto 1
	 * @param y1 do ponto 1
	 * @param x2 do ponto 2
	 * @param y2 do ponto 2
	 * @return
	 */
	private static double calculaDistanciaEntrePontos(double x1, double y1, double x2, double y2) {
		return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
	}

}
