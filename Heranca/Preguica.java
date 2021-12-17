package Heranca;

public class Preguica extends Animal
{
	private String subirArvore;
	
	public Preguica (String nome,int idade,String som,String subirArvore)
	{
		super(nome,idade,som);
		this.subirArvore= subirArvore;
	}

	public String getSubirArvore() {
		return subirArvore;
	}

	public void setSubirArvore(String subirArvore) {
		this.subirArvore = subirArvore;
	}
	
	public void mostrarInfos()
	{
		System.out.println("\t\tDados da Preguiça:\nNome:"+getNome()+"\nIdade:"+getIdade()+"\nSom:"+getSom()+"\n"+getSubirArvore());
	}
}
