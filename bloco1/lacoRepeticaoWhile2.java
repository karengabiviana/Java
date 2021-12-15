/*
 * Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas
psicol�gicas dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as op��es
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: 
		o n�mero de pessoas calmas;
		o n�mero de mulheres nervosas;
		o n�mero de homens agressivos;
		o n�mero de outros calmos;
		o n�mero de pessoas nervosas com mais de 40 anos;
		o n�mero de pessoas calmas com menos de 18 anos.
 */

package bloco1;

import java.util.Scanner;

public class lacoRepeticaoWhile2 
{
	public static void main(String args[])
	{
		Scanner leia = new Scanner(System.in);
		int x=1,numPesq=0,idade,genero,caracPsic,calma=0,mulheresNerv=0,homensAgr=0,outrosNerv=0,quarentaNerv=0,menoresCalm=0;
		
		
		//um sistema que permita ler os dados de 150 pessoas
		while(x<151)
		{
			//idade
			System.out.println("\nQual o sua idade: ");
			idade= leia.nextInt();
			
			//sexo - 1-Fem; 2-Masc; 3-outros
			System.out.println("\nQual o seu g�nero:\n1-Feminino/ 2-Masculino/ 3-Outros.");
			genero= leia.nextInt();
			
			
			//caracter�sticas psicol�gicas
			System.out.println("\nQual o sua caracter�stica psicol�gica:\n1-calma/ 2-nervosismo/ 3-agressividade.");
			caracPsic= leia.nextInt();
			
				//Contando as quantidades:
			
			//quantidade de respostas
			numPesq+=1;	
			
				//o n�mero de pessoas calmas;
				if(caracPsic==1)
				{
					calma+=1;
				}
				//o n�mero de mulheres nervosas;
				else if(caracPsic==2 && genero==1)
				{
					mulheresNerv+=1;
				}
				//o n�mero de homens agressivos;
				else if(caracPsic==3 && genero==2)
				{
					homensAgr+=1;
				}
				//o n�mero de outros calmos;
				else if(caracPsic==2 && genero==3)
				{
					outrosNerv+=1;
				}
				//o n�mero de pessoas nervosas com mais de 40 anos;
				else if(caracPsic==2 && idade>40)
				{
					quarentaNerv+=1;
				}
				//o n�mero de pessoas calmas com menos de 18 anos.
				else if(caracPsic==1 && idade<18)
				{
					menoresCalm+=1;
				}
				
		x+=1;
		}
		//mostrando resultados
		System.out.printf("\nEssa pesquisa colheu %d respostas, veja os resultados:\n", numPesq);	
		System.out.printf("\nPessoas Calmas = %d", calma);
		System.out.printf("\nMulheres Nervosas = %d", mulheresNerv);
		System.out.printf("\nHomens Agressivos = %d", homensAgr);
		System.out.printf("\nPessoas Nervoses que responderam 'Outros' em g�nero = %d", outrosNerv);
		System.out.printf("\nPessoas com mais de 40 anos nervosas = %d", quarentaNerv);
		System.out.printf("\nPessoas menores de 18 anos calmas = %d", menoresCalm);
		
	}
}
