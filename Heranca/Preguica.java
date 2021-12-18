package Heranca;

public class Preguica extends Animal
{
	
	public Preguica (String nome,int idade)
	{
		super(nome,idade);
	}

	public void subirArvore() 
	{
		System.out.println("A pregui�a sobe em �rvores!");
	}

	public void emitirSom() {
		System.out.println("zzzzzzzzzz");
	}
	
	public void mostrarInfos()
	{
		System.out.println("\n\t\tDados da Pregui�a:\nNome:"+getNome()+"\nIdade:"+getIdade());
	}
}
