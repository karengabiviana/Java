/*
Um sistema de equações lineares do tipo:
ax+by=c
dx+ey=f
pode ser resolvido segundo mostrado abaixo :
x=ce-bf/ae-bd    y=af-cd/ae-bd 
Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os
valores de x e y.
*/

package bloco1;

import java.util.Scanner;

public class variaveisExercicio7 
{

	public static void main(String args[])
	{
		Scanner leia = new Scanner(System.in);
		
		float a,b,c,d,e,f,x,y,x1,x2,y1,y2;
		
		//Enunciado
		System.out.println("Informe os valores, dado a equação no seguinte formato: \nAX+BY=C \nDX+EY=F\n");
		
		//Definindo o valor de cada variante
		System.out.println("Valor de A:");
		a= leia.nextFloat();
		
		System.out.println("Valor de B:");
		b= leia.nextFloat();
		
		System.out.println("Valor de C:");
		c= leia.nextFloat();
		
		System.out.println("Valor de D:");
		d= leia.nextFloat();
		
		System.out.println("Valor de E:");
		e= leia.nextFloat();
		
		System.out.println("Valor de F:");
		f= leia.nextFloat();
		
		//quebrando a conta -> x=ce-bf/ae-bd  -> x= x1/x2  
		x1=(c*e)-(b*f);
		x2=(a*e)-(b*d);
		
		//quebrando a conta -> y=af-cd/ae-bd -> y= y1/y2
		y1=(a*f)-(c*d);
		y2=(a*e)-(b*d);
		
		//finalizando a conta
		x=x1/x2;
		y=y1/y2;
		
		//resultado
		System.out.println("\nO resultado de X= "+x+" e de Y= "+y);
	}
	
}
