/*
O custo ao consumidor de um carro novo � a soma do custo de f�brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f�brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao
consumidor.
*/
package bloco1;

import java.util.Scanner;

public class variaveisExercicio8 
{
	public static void main(String args[])
	{
		Scanner leia = new Scanner(System.in);
		
		double valorFabrica,valorCliente;
		
		//leia o custo de f�brica de um carro
		System.out.println("Qual o valor de f�brica do carro?");
		valorFabrica= leia.nextFloat();

		//considerando % do distribuidor=28% e impostos=45%
		valorCliente = valorFabrica + (valorFabrica*0.73);

		//escreva o custo ao consumidor:		
		System.out.printf("\nO valor final para clientes � de R$%.2f",valorCliente);
	}

	
	
}
