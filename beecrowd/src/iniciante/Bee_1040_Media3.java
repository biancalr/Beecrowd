package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * @author bianc
 *
 */
public class Bee_1040_Media3 {

	public static void main(String[] args) {
		double N1, N2, N3, N4, media, recuperacao, mediaRecuperacao;
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");

		N1 = input.nextDouble();
		N2 = input.nextDouble();
		N3 = input.nextDouble();
		N4 = input.nextDouble();

		media = calculaMediaValores(N1, N2, N3, N4);
		System.out.println("Media: " + df.format(media));

		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		} else if (media >= 5 && media < 7) {
			System.out.println("Aluno em exame.");
			recuperacao = input.nextDouble();
			System.out.println("Nota do exame: " + df.format(recuperacao));
			mediaRecuperacao = calculaMediavalores(media, recuperacao);
			if (mediaRecuperacao >= 5) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.println("Media final: " + df.format(mediaRecuperacao));
		} else {
			System.out.println("Aluno reprovado.");
		}

	}

	private static double calculaMediavalores(double nota1, double nota2) {
		return (nota1 + nota2) / 2;
	}

	private static double calculaMediaValores(double nota1, double nota2, double nota3, double nota4) {
		nota1 = nota1 * 2;
		nota2 = nota2 * 3;
		nota3 = nota3 * 4;
		nota4 = nota4 * 1;
		return (nota1 + nota2 + nota3 + nota4) / 10;
	}

}
