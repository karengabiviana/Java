/*
Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 	*10-14 infantil
 	*15-17 juvenil
 	*18-25 adulto
 */
package bloco1;

import java.util.Scanner;


public class lacoDecisaoExercicio3 

{
	
	public static void main(String args[])
	
	{
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		//Faça um programa que receba a idade de uma pessoa
		System.out.println("Qual a sua idade?");
		idade= leia.nextInt();
		
		/*mostre na saída em qual categoria ela se encontra:
		
			*10-14 infantil
		 	*15-17 juvenil
		 	*18-25 adulto
	 	
	 	*/
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Sua categoria é Infantil");
		}
		
		else if(idade>=15 && idade<=17)
		{
			System.out.println("Sua categoria é Juvenil");
		}
		
		else if(idade>=18 && idade<=25)
		{
			System.out.println("Sua categoria é Adulto");
		}
		
		else
		{
			System.out.println("Essa idade não se encaixa em nehuma categoria");
		}
		
	}
	
}
