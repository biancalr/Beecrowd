package iniciante;

import java.util.Scanner;

/**
 * Escreva um programa que leia três valores com ponto flutuante de 
 * dupla precisão: A, B e C. 
 * Em seguida, calcule e mostre:
 *	
 *  a) a área do triângulo retângulo que tem A por base e C por altura.
 *	b) a área do círculo de raio C. (pi = 3.14159)
 *	c) a área do trapézio que tem A e B por bases e C por altura.
 *	d) a área do quadrado que tem lado B.
 *	e) a área do retângulo que tem lados A e B.
 * 
 * @author bibil
 *
 */
public class Area {

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
	
	/** calcula Area Do Triângulo -> (base * altura) / 2
	 * 
	 * @param base
	 * @param altura
	 * @return Area Do Triângulo
	 */
	private static double calculaAreaDoTriangulo(double base, double altura) {
		return (base * altura) / 2;
	}
	
	/** calcula Area Do Círculo -> PI * raio^2
	 * 
	 * @param raio
	 * @param PI
	 * @return Area Do Círculo
	 */
	private static double calculaAreaDoCirculo(double raio, double PI) {
		return PI * Math.pow(raio, 2);
	}
	
	/** calcula Area Do Trapézio -> ((baseMaior + baseMenor) * altura) / 2
	 * 
	 * @param baseMaior
	 * @param baseMenor
	 * @param altura
	 * @return Area Do Trapézio
	 */
	private static double calculaAreaDoTrapezio(double baseMaior, double baseMenor, double altura) {
		return ((baseMaior + baseMenor) * altura) / 2;
	}
	
	/** calcula Area Do Quadrado -> lado^2
	 * 
	 * @param lado
	 * @return Area Do Quadrado
	 */
	private static double calculaAreaDoQuadrado(double lado) {
		return Math.pow(lado, 2);
	}
	
	/** calcula Area Do Retângulo -> base * altura
	 * 
	 * @param base
	 * @param altura
	 * @return Area Do Retângulo
	 */
	private static double calculaAreaDoRetangulo(double base, double altura) {
		return base * altura;
	}


}
