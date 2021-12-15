/*
Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a dist�ncia entre eles. A f�rmula
d= raiz quadrada de (x2-x1)� + (y1-y2)�
que efetua tal c�lculo �: 
*/
package bloco1;

import java.util.Scanner;

public class variaveisExercicio6 
{

	public static void main(String args[])
	{
		
		Scanner leia = new Scanner(System.in);
		
		float  x1,y1,x2,y2;
		double d;
		
		//dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2)
		System.out.println("Coordenada x1= ");
		x1= leia.nextFloat();
		System.out.println("Coordenada y1= ");
		y1= leia.nextFloat();
		System.out.println("Coordenada x2= ");
		x2= leia.nextFloat();
		System.out.println("Coordenada y2= ");
		y2= leia.nextFloat();
		
		//escreva a dist�ncia entre eles
		//F�rmula: d= raiz quadrada de (x2-x1)� + (y1-y2)�
		d= Math.sqrt(Math.pow(x2-x1, 2.0)+Math.pow(y2-y1,2.0));

		System.out.printf("\nDist�ncia � de %2.2f",d);
	
		
	}
	
}
