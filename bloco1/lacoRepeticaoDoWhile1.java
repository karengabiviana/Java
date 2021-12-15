/*
Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
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
			//Crie um programa que leia um número do teclado
			System.out.println("Insira um número: ");
			numero= leia.nextInt();
			//Somando os números digitados. 
			somaNumeros+=numero;
		}
		//até que encontre um número igual a zero
		while (numero!=0); 
		//Mostrando a soma dos números digitados apenas no fim
		//depois que foi digitado 0
		System.out.printf("\nA soma dos números digitados é %d \n",somaNumeros);
		
	}
	
}
