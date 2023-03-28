package ad_hoc;

import java.util.Scanner;

public class Bee_1026_CarregaOuNao {

	public static void main(String[] args) {
		long valor1, valor2;
		Scanner input = new Scanner(System.in);
		
		while (input.hasNext()) {
			valor1 = input.nextLong();
			valor2 = input.nextLong();
			
			System.out.println(valor1 ^ valor2);
		}
		
	}

}
