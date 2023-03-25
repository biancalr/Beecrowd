package iniciante;

import java.util.Scanner;

/**
 * Fa�a um programa que leia o nome de um vendedor, o seu sal�rio fixo e o total de vendas 
 * efetuadas por ele no m�s (em dinheiro). Sabendo que este vendedor ganha 15% de comiss�o 
 * sobre suas vendas efetuadas, informar o total a receber no final do m�s, com duas casas 
 * decimais.
 * 
 * @author bibil
 *
 */
public class Bee_1009_SalarioComBonus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nomeVendedor;
		double salarioFixo = 0.00, montanteTotalVendas = 0.00, salarioFinal = 0.00;
		Scanner input = null;
		
		input = new Scanner(System.in);
		nomeVendedor = input.next();
		salarioFixo = input.nextDouble();
		montanteTotalVendas = input.nextDouble();
		
		input.close();
		salarioFinal = calculaSalarioComBonus(montanteTotalVendas, salarioFixo);
		
		System.out.println(String.format("TOTAL = R$ %.2f", salarioFinal));
	}

	private static double calculaSalarioComBonus(double montanteTotalVendas, double salarioFixo) {
		// TODO Auto-generated method stub
		double percentual = montanteTotalVendas * 0.15;
		return  percentual + salarioFixo;
	}

}
