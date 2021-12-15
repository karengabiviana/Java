/*
Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
*/

package bloco1;

import java.util.Scanner;

public class lacoRepetiçaoWhile1 
{

	public static void main(String args[])
	{
		Scanner leia= new Scanner(System.in);
		
		//Solicitar a idade de várias pessoas e imprimir: 
		int idade, total21=0,total50=0;
		
		System.out.println("Insira sua idade: ");
		idade= leia.nextInt();
		
		while (idade>=1)
		{
			
			if(idade<21)
			{
				total21+=1;
			}
			
			else if(idade>50)
			{
				total50+=1;
			}
			System.out.printf("\nO número menores de 21 anos é %d",total21);
			System.out.printf("\nO número de maiores de 50 anos é %d\n",total50);
			
			System.out.println("\nInsira sua idade: ");
			idade= leia.nextInt();
			
			
			
		}
		
		
		
	}
}
