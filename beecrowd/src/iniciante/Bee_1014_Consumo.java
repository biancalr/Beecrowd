package iniciante;

import java.io.IOException;
import java.util.Scanner;

/**
 * Calcule o consumo m�dio de um autom�vel sendo fornecidos a dist�ncia 
 * total percorrida (em Km) e o total de combust�vel gasto (em litros).
 * 
 * @author bibil
 *
 */
public class Bee_1014_Consumo {

	public static void main(String[] args) throws IOException {
		
		int X;
		double valorDeConsumo, Y = 0.0;
		Scanner input = new Scanner(System.in);
		
		X = input.nextInt();
		Y = input.nextDouble();
		
		valorDeConsumo = calculaConsumoMedioDeCombustivel(X, Y);
		
		System.out.println(String.format("%.3f km/l", valorDeConsumo));

	}

	/**
	 * 
	 * @param distanciaPercorrida
	 * @param combustivelGasto
	 * @return
	 */
	private static double calculaConsumoMedioDeCombustivel(int distanciaPercorrida, double combustivelGasto) {
		// TODO Auto-generated method stub
		return distanciaPercorrida / combustivelGasto;
	}

}
