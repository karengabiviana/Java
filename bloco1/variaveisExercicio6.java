/*
Construa um programa em c que, tendo como dados de entrada dois pontos
quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
d= raiz quadrada de (x2-x1)² + (y1-y2)²
que efetua tal cálculo é: 
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
		
		//escreva a distância entre eles
		//Fórmula: d= raiz quadrada de (x2-x1)² + (y1-y2)²
		d= Math.sqrt(Math.pow(x2-x1, 2.0)+Math.pow(y2-y1,2.0));

		System.out.printf("\nDistância é de %2.2f",d);
	
		
	}
	
}
