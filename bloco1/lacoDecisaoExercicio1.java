/*
Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior. 
*/
package bloco1;

import java.util.Scanner;

public class lacoDecisaoExercicio1 
{
	public static void main(String args[])
	{
		Scanner leia= new Scanner(System.in);
		
		int a,b,c;
		
		//Fa�a um programa que receba tr�s n�meros inteiros
		System.out.println("Insira tr�s n�mero inteiros.\n\nPrimeiro: ");
		a= leia.nextInt();
		System.out.println("Segundo: ");
		b= leia.nextInt();
		System.out.println("Terceiro: ");
		c= leia.nextInt();
		
		//diga qual deles � o maior:
		
		//caso seja a
		if(a>b && a>c)
		{
			System.out.printf("\nO maior n�mero digitado foi o Primeiro: %d",a);
		}
		//caso seja b
		else if (b>a && b>c)
		{
			System.out.printf("\nO maior n�mero digitado foi o Segundo: %d",b);
		}
		else 
		{
			System.out.printf("\nO maior n�mero digitado foi o Terceiro: %d",c);
		}
	}
}
