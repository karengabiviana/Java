package Heranca;

public class Cavalo extends Animal
{
	
	public Cavalo(String nome,int idade)
	{
		super(nome,idade);
	}

	public void correr() 
	{
		System.out.println("pocoto pocoto");
	}
	
	@Override
	public void emitirSom() 
	{
		System.out.println("uirrriiii");
	}
	
	public void mostrarInfos()
	{
		System.out.println("\n\t\tDados do Cavalo:\nNome:"+getNome()+"\nIdade:"+getIdade());
	}
}
