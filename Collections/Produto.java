/*
 Crie uma um programa para trabalhar com estoque de uma loja,
 o programa deverá trabalhar com Collection do tipo List do Java 
 para manipular os dados desse estoque, o programa deverá atender 
 as seguintes funcionalidades:

		Armazenar dados da List
		Remover dados da list;
		Atualizar dados da list.
		Apresentar todos os dados da list.
 */

package Collections;

public class Produto 
{
	private String nome;
	private float preco;
	private int quantidade;
	
	public Produto(String nome, float preco, int quantidade)
	{
		this.nome=nome;
		this.preco=preco;
		this.quantidade= quantidade;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	
	
}

