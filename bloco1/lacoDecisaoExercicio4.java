/*
 * Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
�mpar exiba o n�mero elevado ao quadrado.
 */

package bloco1;

import java.util.Scanner;

public class lacoDecisaoExercicio4 
{

	public static void main(String args[])
	{
		
		Scanner leia = new Scanner(System.in);
		
		double x;
		
		//Fa�a um programa em que permita a entrada de um n�mero qualquer
		System.out.println("Insira um n�mero: ");
		x= leia.nextFloat();
		
		//exiba se este n�mero � par ou �mpar
		if((x%2==0))
			
			{
				//Se for par exiba tamb�m a raiz quadrada do mesmo
				System.out.println("\n"+x+" � um n�mero par e a sua raiz quadrada � "+Math.sqrt(x));
			}
		
		else
			
			{
			 	//se for �mpar exiba o n�mero elevado ao quadrado.
				System.out.println("\n"+x+" � um n�mero �mpar e elevado ao quadrado � "+Math.pow(x,2));
				
			
			}
		
		}
	
	
}
