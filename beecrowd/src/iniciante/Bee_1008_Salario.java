package iniciante;

import java.util.Scanner;

/**
 * Escreva um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, 
 * o valor que recebe por hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero 
 * e o sal�rio do funcion�rio, com duas casas decimais.
 * 
 * @author bibil
 *
 */
public class Bee_1008_Salario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 0, horasTrabalhadas = 0;
		double salario = 0.0, valorHoraTrabalho = 0.0;
		Scanner input = null;
		
		input = new Scanner(System.in);
		numero = input.nextInt();
		horasTrabalhadas = input.nextInt();
		valorHoraTrabalho = input.nextDouble();
		
		input.close();
		salario = calculaSalario(horasTrabalhadas, valorHoraTrabalho);
		
		
		System.out.println("NUMBER = " + numero);
		System.out.println(String.format("SALARY = U$ %.2f", salario));

	}

	private static double calculaSalario(int horasTrabalhadas, double valorHoraTrabalho) {
		// TODO Auto-generated method stub
		return horasTrabalhadas * valorHoraTrabalho;
	}

}
