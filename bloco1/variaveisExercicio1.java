package bloco1;

import java.util.Scanner;

public class variaveisExercicio1 
{

	public static void main (String args[])
	{
	
				/*
				 1 ano -- 365 dias
				 1 m�s -- 30 dias
				 1 dia -- 1 dia
				 */
				
				 int anos ,meses,dias,totalDias;
				 
				 Scanner leia = new Scanner(System.in);
				 
				 //Leia a idade de uma pessoa expressa em:
				 
				 //anos
				 System.out.println("Coloque com os anos que voc� j� viveu?");
				 anos= leia.nextInt();
				 
				 //meses
				 System.out.println("\nColoque quantos meses voc� j� viveu?");
				 meses= leia.nextInt();
				 
				 //anos
				 System.out.println("\nColoque quantos dias voc� j� viveu?");
				 dias= leia.nextInt();
				 
				 //mostre-a expressa apenas em dias.
				 totalDias = anos*365 + meses*30 + dias;

				 System.out.println("\nVoc� j� venceu "+totalDias+" dias. Parab�ns!");
			}

}
