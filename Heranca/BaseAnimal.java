package Heranca;

public class BaseAnimal 
{
	protected String nome;
	protected int idade;
	protected String som;
	protected String caracteristica;
	protected String nomeClasse;
	
	BaseAnimal(String nome,int idade,String som,String caracteristica, String nomeClasse)
	{
		this.nome= nome;
		this.idade= idade;
		this.som= som;
		this.caracteristica= caracteristica;
		this.nomeClasse= nomeClasse;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSom() {
		return som;
	}

	public void setSom(String som) {
		this.som = som;
	}

	public String getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}

	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}
	
	
}
