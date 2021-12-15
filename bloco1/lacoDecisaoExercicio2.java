/*
*Faça um programa que entre com três números e coloque em ordem crescente.
*/
package bloco1;

import java.util.Scanner;

public class lacoDecisaoExercicio2 
{
	public static void main(String args[])
	{
		Scanner leia= new Scanner(System.in);
		
		int a,b,c;
		
		//Faça um programa que receba três números
		System.out.println("Insira três número inteiros.\n\nPrimeiro: ");
		a= leia.nextInt();
		System.out.println("Segundo: ");
		b= leia.nextInt();
		System.out.println("Terceiro: ");
		c= leia.nextInt();
		
		//coloque em ordem crescente
		/*
		 > - <
		 a b c
		 a c b
		 b a c
		 b c a
		 c a b
		 c b a
		 */
		if(a>b && b>c)
		{
			System.out.printf("\n %d\n %d\n %d",c,b,a);
		}
		
		else if(a>c && c>b)
		{
			System.out.printf("\n %d\n %d\n %d",b,c,a);
		}
		
		else if(b>a && a>c)
		{
			System.out.printf("\n %d\n %d\n %d",c,a,b);
		}
		
		else if(b>c && c>a)
		{
			System.out.printf("\n %d\n %d\n %d",a,c,b);
		}
		
		else if(c>a && a>b)
		{
			System.out.printf("\n %d\n %d\n %d",b,a,c);
		}
		
		else if(c>b && b>a)
		{
			System.out.printf("\n %d\n %d\n %d",a,b,c);
		}
	}
}
