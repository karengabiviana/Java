package bloco1;

import java.util.Scanner;

public class variaveisExercicio3 
{

	public static void main(String args[])
	{
		Scanner leia = new Scanner(System.in);
		
		/*
		 * Leia o tempo de duração de um evento em uma fábrica
		expressa em segundos e mostre-o expresso em horas, minutos e segundos.
		 * 
		 * 
		 1 hora -- 360seg
		 1 minuto -- 60seg
		 1 seg -- 1seg
		 */
		 
		int hora=3600,minuto=60,segundo=1,eventoTempo,resultadoH,resultadoM,resultadoS;


		 //Leia o tempo de duração de um evento em uma fábrica expressa em segundos
		 System.out.println("Quantos segundos durou o evento?\n");
		 eventoTempo= leia.nextInt();
		 
		 //e mostre-o expresso em horas, minutos e segundos.
		 resultadoH= eventoTempo/hora;
		 resultadoM= eventoTempo/minuto;
		 resultadoS= eventoTempo*segundo;

		 System.out.println("\nO eventou durou "+resultadoH+" hora(s) ou "+resultadoM+" minuto(s) ou "+resultadoS+" segundo(s).\n");
	}
}

