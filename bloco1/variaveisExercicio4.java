package bloco1;

import java.util.Scanner;

public class variaveisExercicio4 
{
	public static void main(String args[])
	{
		
		Scanner leia = new Scanner(System.in);
		
		/*
		 	Sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e 
		 	calcule a seguinte express�o: D=R+S/2   R=(A+B)�  onde  S=(B+C)�
		 	
		 */
		
		int a,b,c;
		double D,R,S;
		
		//Sistema que leia tr�s n�meros inteiros e positivos: a, b, c
		System.out.println("Registre um n�mero inteiro e positivo para A: ");
		a = leia.nextInt();
		
		System.out.println("Resgistre um n�mero inteiro e positivo para B: ");
		b= leia.nextInt();
		
		System.out.println("Registre um n�mero inteiro e positivo para C: ");
		c= leia.nextInt();
		
		//R=(A+B)�
		R= Math.sqrt(a+b);
		
		//S=(B+C)�
		S= Math.sqrt(b+c);
		
		//D=R+S/2
		D=(R+S)/2;
	
		
		System.out.println("Resultado � "+D);
	
	}

}
