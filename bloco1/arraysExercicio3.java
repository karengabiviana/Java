/*
 Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */

package bloco1.arraysExercicio;

import java.util.Scanner;

public class arraysExercicio3 
{
	public static void main(String []args)
	{
		Scanner leia = new Scanner(System.in);
		
		//Leia uma matriz 3 x 3
		int [][]matriz = new int[3][3];
		//informar os valores 
		int linha, coluna,maiorQ10=0;
		for (linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.printf("Insira o n� da %d� linha e da %d� coluna: ",linha+1,coluna+1);
				matriz[linha][coluna]= leia.nextInt();
				
				//verificar se o n� inserido � >10
				if(matriz[linha][coluna]>10)
				{
					//se o n� inserido for >10 somar +1 na vari�vel para sabermos quantos foram
					maiorQ10+=1;
				}
			}
		}
		
		//mostra a quantidade de n� >10 na matriz:
		System.out.printf("\nA matriz possui %d valores maiores que 10.",maiorQ10);
	}
}
