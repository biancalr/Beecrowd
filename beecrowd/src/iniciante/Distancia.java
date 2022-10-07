package iniciante;

import java.util.Scanner;

/**
 * Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90 Km/h.
 * Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a cada 2 minutos.
 * Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.
 * 
 * @author bibil
 *
 */
public class Distancia {

	public static void main(String[] args) {
		
		int distancia = 0, tempo = 0;
		
		Scanner input = new Scanner(System.in);
		distancia = input.nextInt();
		input.close();
		
		tempo = calculaTempoParaChegarNaDistancia(distancia);
		
		System.out.println(String.format("%s minutos", tempo));

	}

	/**
	 * Usa a distância (em Km) e calcula quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.
	 * Tempo corresponde ao dobro da distância
	 * 
	 * @param distancia
	 * @return
	 */
	private static int calculaTempoParaChegarNaDistancia(int distancia) {
		return 2 * distancia;
	}

}
