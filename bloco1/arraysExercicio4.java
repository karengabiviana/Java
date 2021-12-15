/*
 Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. 
Na terceira op��o o valor da constante deve ser lido 
e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.
 */

package bloco1;

import java.util.Scanner;

public class arraysExercicio4 
{
	public static void main(String[] args)
	{
		Scanner leia = new Scanner(System.in);
		
		//Fa�a um programa que leia duas matrizes 2 x 2 com valores reais.
		float [][]matrizUm = new float[2][2];
		float [][]matrizDois= new float[2][2];
		float [][]matrizRes= new float[2][2];
		int linha, coluna, escolha,constante;
		
		System.out.println("Primeira Matriz");
		for (linha=0;linha<2;linha++)
		{
			for (coluna=0;coluna<2;coluna++)
				{
					System.out.printf("Insira o valor da posi��o %d�linha e %d�coluna:",linha+1,coluna+1);
					matrizUm[linha][coluna]= leia.nextInt();			
				}
		}
		
		System.out.println("Segunda Matriz");
		for (linha=0;linha<2;linha++)
		{
			for (coluna=0;coluna<2;coluna++)
				{
					System.out.printf("Insira o valor da posi��o %d�linha e %d�coluna:",linha+1,coluna+1);
					matrizDois[linha][coluna]= leia.nextInt();
				}
		}
		
		//Ofere�a ao usu�rio um menu de op��es:
			do
			{
				System.out.println("\nEscolha entre as op��es:"
						+ "\n(1) somar as duas matrizes"
						+ "\n(2) subtrair a primeira matriz da segunda"
						+ "\n(3) adicionar uma constante as duas matrizes"
						+ "\n(4) imprimir as matrizes"
						+ "\n(0) para sair");
				System.out.println("\nFa�a sua escolha: ");
				escolha= leia.nextInt();
				
				//Fa�a as op��es
				switch(escolha)
				{
					case 1://(1) somar as duas matrizes
					{	
						System.out.println("\t\tResultado da soma das matrizes �:");
						for(linha=0;linha<2;linha++)
						{
							for(coluna=0;coluna<2;coluna++)
							{
								matrizRes[linha][coluna]=matrizUm[linha][coluna]+matrizDois[linha][coluna];
								System.out.println(matrizRes[linha][coluna]);
							}
						}		
					}break;
					case 2://(2) subtrair a primeira matriz da segunda
					{
						System.out.println("\t\tResultado da subtra��o das matrizes �:");
						for(linha=0;linha<2;linha++)
						{
							for(coluna=0;coluna<2;coluna++)
							{
								matrizRes[linha][coluna]=matrizDois[linha][coluna]-matrizUm[linha][coluna];
								System.out.println(matrizRes[linha][coluna]);
							}
						}
					}break;
					case 3://(3) adicionar uma constante as duas matrizes
					{
						System.out.println("Informe uma constante: ");
						constante= leia.nextInt();
						System.out.println("Primeira Matriz:");
						for (linha=0;linha<2;linha++)
						{
							for (coluna=0;coluna<2;coluna++)
								{
								matrizUm[linha][coluna]*=constante;
								System.out.println(matrizUm[linha][coluna]);			
								}
						}
						
						
						System.out.println("Segunda Matriz:");
						for (linha=0;linha<2;linha++)
						{
							for (coluna=0;coluna<2;coluna++)
								{
								matrizDois[linha][coluna]*=constante;
								System.out.println(matrizDois[linha][coluna]);			
								}
						}
					}break;
					case 4://(4) imprimir as matrizes
					{
						System.out.println("Primeira Matriz:");
						for (linha=0;linha<2;linha++)
						{
							for (coluna=0;coluna<2;coluna++)
								{
									System.out.println(matrizUm[linha][coluna]);			
								}
						}
						
						
						System.out.println("Segunda Matriz:");
						for (linha=0;linha<2;linha++)
						{
							for (coluna=0;coluna<2;coluna++)
								{
									System.out.println(matrizDois[linha][coluna]);			
								}
						}
					}break;
					case 0:
					{
						System.out.println("Saindo do Programa...");
					}break;
					default:
					{
						System.out.println("\t*****Aten��o*****\n\tOp��o inv�lida!!!\n\n\n1Vamos come�ar de novo:");
					}break;
			}
		}while(escolha!=0);
	}
}

