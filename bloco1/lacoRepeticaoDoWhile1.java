/*
Crie um programa que leia um n�mero do teclado at� que encontre um
n�mero igual a zero. No final, mostre a soma dos n�meros
digitados. 
*/

package bloco1;

import java.util.Scanner;

public class lacoRepeticaoDoWhile1 
{
	public static void main(String args[])
	{
		Scanner leia= new Scanner(System.in);
		
		int numero, somaNumeros=0;
		
		do
		{
			//Crie um programa que leia um n�mero do teclado
			System.out.println("Insira um n�mero: ");
			numero= leia.nextInt();
			//Somando os n�meros digitados. 
			somaNumeros+=numero;
		}
		//at� que encontre um n�mero igual a zero
		while (numero!=0); 
		//Mostrando a soma dos n�meros digitados apenas no fim
		//depois que foi digitado 0
		System.out.printf("\nA soma dos n�meros digitados � %d \n",somaNumeros);
		
	}
	
}
