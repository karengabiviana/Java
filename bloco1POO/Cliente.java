/*
Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

package bloco1POO;

public class Cliente 
{
	private String nome;
	private String pronomes;
	private String telefone;
	private String email;
	private float numeroCad;
	
	public Cliente () {}
	
	public Cliente (String nome, String pronomes, String telefone, String email, float numeroCad)
	{
		this.nome= nome;
		this.pronomes= pronomes;
		this.telefone= telefone;
		this.email= email;
		this.numeroCad= numeroCad;
	}
	public void mostrarInfos()
	{
		System.out.println("\nCliente: "+nome+" ("+pronomes+")\n"
				+"Telefone: "+telefone+"\n"
				+ "E-mail: "+email+"\n"
				+"Número do Cadastro: "+numeroCad);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPronomes() {
		return pronomes;
	}
	public void setPronomes(String pronomes) {
		this.pronomes = pronomes;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getNumeroCad() {
		return numeroCad;
	}
	public void setNumeroCad(float numeroCad) {
		this.numeroCad = numeroCad;
	}
	
	
}
