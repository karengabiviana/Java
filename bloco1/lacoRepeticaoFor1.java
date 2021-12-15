/*
Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. 
*/

package bloco1;

public class lacoRepeticaoFor1 
{

	public static void main(String args[])
	{	
		int x;
		
		//Informar todos os números de 1000 a 1999
		for(x=1000;x<=1999;x++)
		{
			//divididos por 11 obtemos resto = 5.
			if(x%11==5)
			{
				System.out.printf("\n %d",x);
			}
		}
		
	}
	
}
