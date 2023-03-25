package iniciante;

import java.util.Locale;
import java.util.Scanner;

/**
 * Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monet�rio. 
 * A seguir, calcule o menor n�mero de notas e moedas poss�veis no qual o valor pode ser decomposto. 
 * 
 * As notas consideradas s�o de {@value 100, 50, 20, 10, 5, 2}. 
 * As moedas poss�veis s�o de {@value 1, 0.50, 0.25, 0.10, 0.05 e 0.01} . 
 * 
 * A seguir mostre a rela��o de notas necess�rias.
 * 
 * @author bibil
 *
 */
public class Bee_1021_NotasMoedas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double valorTotal = 0.0;
		int quantidade = 0;
		Scanner input = new Scanner(System.in);
		
		valorTotal = input.nextDouble();

		System.out.println("NOTAS:");
		
		quantidade = (int) (valorTotal / 100);
		System.out.println(quantidade + " nota(s) de R$ 100.00");
		valorTotal %= 100;
		
		quantidade = (int) (valorTotal / 50);
		System.out.println(quantidade + " nota(s) de R$ 50.00" );
		valorTotal %= 50;
		
		quantidade = (int) (valorTotal / 20);
		System.out.println( quantidade + " nota(s) de R$ 20.00");
		valorTotal %= 20;
		
		quantidade = (int) (valorTotal / 10);
		System.out.println(quantidade + " nota(s) de R$ 10.00");
		valorTotal %= 10;
		
		quantidade = (int) (valorTotal / 5);
		System.out.println(quantidade + " nota(s) de R$ 5.00");
		valorTotal %= 5;
		
		quantidade = (int) (valorTotal / 2);
		System.out.println(quantidade + " nota(s) de R$ 2.00");
		valorTotal %= 2;
		
		valorTotal *= 100;
		
		System.out.println("MOEDAS:");
		
		quantidade = (int) (valorTotal / 100);
		System.out.println(quantidade + " moeda(s) de R$ 1.00");
		valorTotal %= 100.0;
		
		quantidade = (int) (valorTotal / 50);
		System.out.println(quantidade + " moeda(s) de R$ 0.50");
		valorTotal %= 50.0;
		
		quantidade = (int) (valorTotal / 25);
		System.out.println(quantidade + " moeda(s) de R$ 0.25");
		valorTotal %= 25.0;
		
		quantidade = (int) (valorTotal / 10);
		System.out.println(quantidade + " moeda(s) de R$ 0.10");
		valorTotal %= 10.0;
		
		quantidade = (int) (valorTotal / 5);
		System.out.println(quantidade + " moeda(s) de R$ 0.05");
		valorTotal %= 5.0;
		
		quantidade = (int) (valorTotal / 1);
		System.out.println(quantidade + " moeda(s) de R$ 0.01");
		valorTotal %= 1.0;
		
		input.close();

	}

}
