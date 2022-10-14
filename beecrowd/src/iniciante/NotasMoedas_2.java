package iniciante;

import java.util.Locale;
import java.util.Scanner;

/**
 * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. 
 * A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto. 
 * 
 * As notas consideradas são de {@value 100, 50, 20, 10, 5, 2}. 
 * As moedas possíveis são de {@value 1, 0.50, 0.25, 0.10, 0.05 e 0.01} . 
 * 
 * A seguir mostre a relação de notas necessárias.
 * 
 * @author bibil
 *
 */
public class NotasMoedas_2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int[] notas = {100, 50, 20, 10, 5, 2};
		int[] moedas = {100, 50, 25, 10, 5, 1};
		float[] moedasDecimal = { 1.00f, 0.50f, 0.25f, 0.10f, 0.05f, 0.01f};
		
		double valorTotal = 0.0;
		int quantidade = 0;
		int i = 0;
		Scanner input = new Scanner(System.in);
		
		valorTotal = input.nextDouble();
		input.close();
		
		System.out.println("NOTAS:");
		
		quantidade = (int) valorTotal / 100;
		valorTotal %= 100;
		
		for (i = 0; i < notas.length; i++) {
			quantidade = (int) (valorTotal / notas[i]);
			System.out.printf(String.format("%s nota(s) de R$ %s.00\n", quantidade, notas[i]));
			valorTotal %= notas[i];
			quantidade = 0;
		}
		
		System.out.println("MOEDAS:");
		valorTotal *= 100;
		
		for (i = 0; i < moedasDecimal.length; i++) {
			quantidade = (int) Math.floor((valorTotal / moedas[i]));
			System.out.println(String.format("%s moedas(s) de R$ %.2f", quantidade, moedasDecimal[i]));
			valorTotal %= moedas[i];
			quantidade = 0;
		}
		
		
		

	}

}
