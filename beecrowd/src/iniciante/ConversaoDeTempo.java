package iniciante;

import java.util.Scanner;

/**
 * Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, 
 * e informe-o expresso no formato horas:minutos:segundos.
 * @author bibil
 *
 */
public class ConversaoDeTempo {

	public static void main(String[] args) {
		
		int tempoTotal = 0;
		int hora, minuto, segundo;
		Scanner input = new Scanner(System.in);
		
		tempoTotal = input.nextInt();
		input.close();
		
		// Calculando as horas dividindo o tempo por 3600
		hora = tempoTotal / 3600;
		
		// Subtraindo os segundos transformados em horas 
		tempoTotal = tempoTotal - (hora * 3600);
		
		// Calculando os minutos dividindo o tempo restante por 60
		minuto = tempoTotal / 60;
		
		// Subtraindo os segundos transformados em minutos e atribuindo aos segundos
		segundo = tempoTotal - (minuto * 60);
		
		System.out.println(String.format("%s:%s:%s", hora, minuto, segundo));

	}

}
