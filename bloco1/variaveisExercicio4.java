package bloco1;

import java.util.Scanner;

public class variaveisExercicio4 
{
	public static void main(String args[])
	{
		
		Scanner leia = new Scanner(System.in);
		
		/*
		 	Sistema que leia três números inteiros e positivos (A, B, C) e 
		 	calcule a seguinte expressão: D=R+S/2   R=(A+B)²  onde  S=(B+C)²
		 	
		 */
		
		int a,b,c;
		double D,R,S;
		
		//Sistema que leia três números inteiros e positivos: a, b, c
		System.out.println("Registre um número inteiro e positivo para A: ");
		a = leia.nextInt();
		
		System.out.println("Resgistre um número inteiro e positivo para B: ");
		b= leia.nextInt();
		
		System.out.println("Registre um número inteiro e positivo para C: ");
		c= leia.nextInt();
		
		//R=(A+B)²
		R= Math.sqrt(a+b);
		
		//S=(B+C)²
		S= Math.sqrt(b+c);
		
		//D=R+S/2
		D=(R+S)/2;
	
		
		System.out.println("Resultado é "+D);
	
	}

}
