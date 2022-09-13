package iniciante;

import java.util.Scanner;

/**
 * Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua 
 * esta operação à variável PROD. A seguir mostre a variável PROD com mensagem correspondente.   
 * @author bibil
 *
 */
public class ProdutoSimples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int PROD = 0, num1 = 0, num2 = 0;
		Scanner input = null;
		
		input = new Scanner(System.in);
		num1 = input.nextInt();
		num2 = input.nextInt();
		input.close();
		
		PROD = produtoDeDoisNumeros(num1, num2);
		
		System.out.println("PROD = " + PROD);

	}

	private static int produtoDeDoisNumeros(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

}
