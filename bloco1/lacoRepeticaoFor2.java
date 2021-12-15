/*
 Ler 10 números e imprimir quantos são pares e quantos são ímpares.
 */
package bloco1;

import java.util.Scanner;

public class lacoRepeticaoFor2 
{
	public static void main(String args[])
	{
		Scanner leia = new Scanner(System.in);
		
		int x,num,par=0,impar=0;
				
		for (x=1;x<=10;x++)
		{
			System.out.println("Insira "+x+"º número: ");
			num= leia.nextInt();

			if(num%2==0)
			{
				par+=1;
				
				
			}
			
			else 
			{
				impar+=1;
				
			}
		
		}
		System.out.printf("Em 10 números inseridos %d foram par e %d ímpar.", par, impar);
	}
	
}
