package Heranca;

public class Cachorro extends Animal 
{
	private String correr;
	
	public Cachorro(String nome,int idade, String som, String correr)
	{
		super(nome,idade,som);
		this.correr=correr;
	}

	public String getCorrer() {
		return correr;
	}

	public void setCorrer(String correr) {
		this.correr = correr;
	}
	
	public void mostrarInfos()
	{
		System.out.println("\t\tDados do Cachorro:\nNome:"+getNome()+"\nIdade:"+getIdade()+"\nSom:"+getSom()+"\n"+getCorrer());
	}
	
}
