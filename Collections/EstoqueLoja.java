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

//Collection do tipo List
import java.util.List;


public class EstoqueLoja 
{
	private List<Produto> listaProdutos;
	
	public EstoqueLoja(List<Produto> listaProdutos)
	{
		this.listaProdutos= listaProdutos;
		
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}
	
	//Armazenar dados da List
	public void armazenarProduto(String nome, int quantidade, float preco)
	{
		Produto produto= new Produto(nome,preco,quantidade);
		listaProdutos.add(produto);
	}
	//Remover dados da list;
	public Produto removerProduto(String nome)
	{
		int i;
		
		for(i=0;i<listaProdutos.size();i++)
		{
			
			if(listaProdutos.get(i).getNome()==nome)
			{
				break;
			}
		}
		
		if(listaProdutos.size()<=i)
		{
			return null;
		}
		
		return listaProdutos.remove(i);	
	}
	
	//Atualizar dados da list.
	public Produto atualizarProduto(String nome,int quantidade, float preco)
	{
		int i;
		
		for(i=0;i<listaProdutos.size();i++)
		{
			
			if(listaProdutos.get(i).getNome()==nome)
			{
				Produto produto= listaProdutos.get(i);
				produto.setQuantidade(quantidade);
				produto.setPreco(preco);
				return produto;
			}
		}
		
		return null;

	
	}
	//Apresentar todos os dados da list.
	public void apresentarLista()
	{
		for(Produto produto:listaProdutos)
		{
			System.out.println("Nome: "+produto.getNome()+"\tPreço: "+produto.getPreco()+"\tQuantidade: "+produto.getQuantidade()+"\n");
		}
	}
	
	
}
