/*
 * Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */

package bloco1;

import java.util.Scanner;

public class lacoDecisaoExercicio4 
{

	public static void main(String args[])
	{
		
		Scanner leia = new Scanner(System.in);
		
		double x;
		
		//Faça um programa em que permita a entrada de um número qualquer
		System.out.println("Insira um número: ");
		x= leia.nextFloat();
		
		//exiba se este número é par ou ímpar
		if((x%2==0))
			
			{
				//Se for par exiba também a raiz quadrada do mesmo
				System.out.println("\n"+x+" é um número par e a sua raiz quadrada é "+Math.sqrt(x));
			}
		
		else
			
			{
			 	//se for ímpar exiba o número elevado ao quadrado.
				System.out.println("\n"+x+" é um número ímpar e elevado ao quadrado é "+Math.pow(x,2));
				
			
			}
		
		}
	
	
}
