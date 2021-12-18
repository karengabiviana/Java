package Heranca;

public class Cachorro extends Animal 
{
	
	public Cachorro(String nome, int idade)
	{
		super(nome, idade);
	}
	
	public void correr() {
		System.out.println("Zooooom");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("Au Au");
	}
	
	public void mostrarInfos()
	{
		System.out.println("\n\t\tDados do Cachorro:\nNome:"+getNome()+"\nIdade:"+getIdade());
	}
	
}
