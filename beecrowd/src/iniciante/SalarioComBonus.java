package iniciante;

import java.util.Scanner;

/**
 * Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas 
 * efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão 
 * sobre suas vendas efetuadas, informar o total a receber no final do mês, com duas casas 
 * decimais.
 * 
 * @author bibil
 *
 */
public class SalarioComBonus {

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
