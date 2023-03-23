package iniciante;

import java.util.Scanner;

/**
 * Leia 4 valores inteiros A, B, C e D. 
 * A seguir, se B for maior do que C e se D 
 * for maior do que A, e a soma de C com D 
 * for maior que a soma de A e B e se C e D,
 * ambos, forem positivos e se a variável A 
 * for par escrever a mensagem "Valores 
 * aceitos", senão escrever "Valores nao 
 * aceitos".
 * 
 * @author bianc
 *
 */
public class TesteSelecao_1 {

	public static void main(String[] args) {
		int A, B, C, D;
		boolean valido = true;
		Scanner scanner = new Scanner(System.in);
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
		D = scanner.nextInt();
		
		scanner.close();
		
		valido = comparaMaiorValorEnte(B, C)
				&& comparaMaiorValorEnte(D, A)
				&& comparaMaiorValorEnte(C+D, A+B)
				&& valorEhPar(A);
		
		
		if (valido) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}

	}

	private static boolean comparaMaiorValorEnte(int num1, int num2) {
		return num1 > num2;
	}

	private static boolean valorEhPar(int a) {
		return (a/2) * 2 == a;
	}

}
