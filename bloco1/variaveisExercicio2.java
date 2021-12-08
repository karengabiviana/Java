package bloco1;

import java.util.Scanner;

public class variaveisExercicio2 
{

	public static void main(String args[])
	{
		
		Scanner leia = new Scanner (System.in);
		
		int dias=1,meses=30,anos=365,idadeDia;
		
		//Leia a idade de uma pessoa expressa em dias
		System.out.println("Qual sua idade em dias?");
		idadeDia= leia.nextInt();
		
		//e mostre em anos, meses e dias
		System.out.println("\nVocê tem "+(idadeDia/anos)
		+" anos\nJá viveu "+(idadeDia/meses)
		+" meses\nE você já passou por "+idadeDia+" dias.");
	}
}
