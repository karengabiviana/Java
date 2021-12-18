package Heranca;

public class Preguica extends Animal
{
	
	public Preguica (String nome,int idade)
	{
		super(nome,idade);
	}

	public void subirArvore() 
	{
		System.out.println("A preguiça sobe em árvores!");
	}

	public void emitirSom() {
		System.out.println("zzzzzzzzzz");
	}
	
	public void mostrarInfos()
	{
		System.out.println("\n\t\tDados da Preguiça:\nNome:"+getNome()+"\nIdade:"+getIdade());
	}
}
