package Collections;

import java.util.ArrayList;

public class TesteEstoqueLoja 
{
	public static void main(String[] args)
	{
		EstoqueLoja loja= new EstoqueLoja(new ArrayList<Produto>());
		
		loja.armazenarProduto("Garrafa", 2, 5.5f);
		loja.armazenarProduto("Celular", 25, 700.0f);
		loja.armazenarProduto("Miranha", 3, 30.0f);
		loja.apresentarLista();
		
		loja.atualizarProduto("Garrafa", 10, 6.75f);
		System.out.println("\n");
		loja.apresentarLista();
		
		loja.removerProduto("Celular");
		System.out.println("\n");
		loja.apresentarLista();
		
		loja.atualizarProduto("Guarda Chuva", 1, 12.75f);
		System.out.println("\n");
		loja.apresentarLista();
		
		loja.removerProduto("Guarda Chuva");
		System.out.println("\n");
		loja.apresentarLista();
	}
	
}
