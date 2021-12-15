/*
 Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
 */

package bloco1;

public class arraysExercício1 
{
	public static void main(String []args)
	{	
		//Faça um programa que possua um vetor denominado A que armazene 6 números inteiros.
		int [] a = new int[6];
		
		//Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
		a[0]=1; a[1]=0; a[2]=5; a[3]=-2; a[4]=-5; a[5]=7;
		
		/*
		 Armazene em uma variável inteira (simples) 
		 a soma entre os valores das posições A[0], A[1] e A[5] 
		 do vetor e mostre na tela esta soma.
		 */
		int soma=a[0]+a[1]+a[5];
		System.out.println("A soma entre a 1ª,2ª e a 6ªposição do vetor é "+soma);
		
		//Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
		a[4]=100;
		
		//mostre na tela cada valor do vetor A, um em cada linha.
		System.out.printf("\nA matriz é\n(%d)\n(%d)\n(%d)\n(%d)\n(%d)\n(%d)",a[0],a[1],a[2],a[3],a[4],a[5]);
	}
}
