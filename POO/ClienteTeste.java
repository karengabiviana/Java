/*
 * Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

package bloco1POO;

import java.util.Scanner;

public class ClienteTeste 
{
	public static void main (String[] args)
	{
		Scanner leia = new Scanner(System.in);
		Cliente clienteUm = new Cliente ();
		
		String n,prom,tel,em;
		float nc;
		
		System.out.println("Qual o seu nome?");
		n= leia.nextLine();
		clienteUm.setNome(n);
		
		System.out.println("Qual seus pronomes?");
		prom= leia.nextLine();
		clienteUm.setPronomes(prom);
		
		System.out.println("Qual o seu telefone para contato?");
		tel= leia.nextLine();
		clienteUm.setTelefone(tel);
		
		System.out.println("Qual o seu melhor email?");
		em= leia.next();
		clienteUm.setEmail(em);
		
		System.out.println("Qual o seu número de Cadastro?");
		nc= leia.nextFloat();
		clienteUm.setNumeroCad(nc);
		
		clienteUm.mostrarInfos();
	}
	
}
