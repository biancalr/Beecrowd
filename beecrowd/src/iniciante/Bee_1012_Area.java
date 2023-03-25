package iniciante;

import java.util.Scanner;

/**
 * Escreva um programa que leia tr�s valores com ponto flutuante de 
 * dupla precis�o: A, B e C. 
 * Em seguida, calcule e mostre:
 *	
 *  a) a �rea do tri�ngulo ret�ngulo que tem A por base e C por altura.
 *	b) a �rea do c�rculo de raio C. (pi = 3.14159)
 *	c) a �rea do trap�zio que tem A e B por bases e C por altura.
 *	d) a �rea do quadrado que tem lado B.
 *	e) a �rea do ret�ngulo que tem lados A e B.
 * 
 * @author bibil
 *
 */
public class Bee_1012_Area {

	public static void main(String[] args) {
		
		double A = 0.0, B = 0.0, C = 0.0;
		final double PI = 3.14159;
		Scanner input = new Scanner(System.in);
		
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();
		input.close();
				
		System.out.println(String.format("TRIANGULO: %.3f", calculaAreaDoTriangulo(A, C)));
		System.out.println(String.format("CIRCULO: %.3f", calculaAreaDoCirculo(C, PI)));
		System.out.println(String.format("TRAPEZIO: %.3f", calculaAreaDoTrapezio(A, B, C)));
		System.out.println(String.format("QUADRADO: %.3f", calculaAreaDoQuadrado(B)));
		System.out.println(String.format("RETANGULO: %.3f", calculaAreaDoRetangulo(A, B)));
		

	}
	
	/** calcula Bee_1012_Area Do Tri�ngulo -> (base * altura) / 2
	 * 
	 * @param base
	 * @param altura
	 * @return Bee_1012_Area Do Tri�ngulo
	 */
	private static double calculaAreaDoTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}
	
	/** calcula Bee_1012_Area Do C�rculo -> PI * raio^2
	 * 
	 * @param raio
	 * @param PI
	 * @return Bee_1012_Area Do C�rculo
	 */
	private static double calculaAreaDoCirculo(double raio, double PI) {
		return PI * Math.pow(raio, 2);
	}
	
	/** calcula Bee_1012_Area Do Trap�zio -> ((baseMaior + baseMenor) * altura) / 2
	 * 
	 * @param baseMaior
	 * @param baseMenor
	 * @param altura
	 * @return Bee_1012_Area Do Trap�zio
	 */
	private static double calculaAreaDoTrapezio(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior + baseMenor) * altura) / 2;
	}
	
	/** calcula Bee_1012_Area Do Quadrado -> lado^2
	 * 
	 * @param lado
	 * @return Bee_1012_Area Do Quadrado
	 */
	private static double calculaAreaDoQuadrado(double lado) {
		return Math.pow(lado, 2);
	}
	
	/** calcula Bee_1012_Area Do Ret�ngulo -> base * altura
	 * 
	 * @param base
	 * @param altura
	 * @return Bee_1012_Area Do Ret�ngulo
	 */
	private static double calculaAreaDoRetangulo(double base, double altura) {
		return base * altura;
	}


}
