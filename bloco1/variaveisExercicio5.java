/*
Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.
*/

package bloco1;

import java.util.Scanner;

public class variaveisExercicio5 
{
	public static void main(String args[])
	{
		Scanner leia = new Scanner(System.in);
		
		float nota1,nota2,nota3,resultado;
		
		//leia 3 notas de um aluno
		System.out.println("Primeira Nota:");
		nota1= leia.nextFloat();
		System.out.println("Segunda Nota:");
		nota2= leia.nextFloat();
		System.out.println("Terceira Nota:");
		nota3= leia.nextFloat();
		
		//calcule a média final deste aluno
		//a média é ponderada e peso das notas é: 2,3 e 5, respectivamente.
		System.out.printf("\nA média é : %2.2f",((nota1*2)+(nota2*3)+(nota3*5))/10);
		
	}

	
}
