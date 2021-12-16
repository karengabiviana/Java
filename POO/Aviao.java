/*
 * Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

package bloco1POO;

public class Aviao 
{
	private String modelo;
	private int capacidadeLugar;
	private int ano;
	private String origemFabr;
	
	public Aviao(String modelo, int capacidadeLugar,int ano, String origemFabr)
	{
		this.modelo= modelo;
		this.capacidadeLugar= capacidadeLugar;
		this.ano = ano;
		this.origemFabr = origemFabr;
	}
	public void mostrarInfos()
	{
		System.out.println("O Avião é do modelo "+modelo+
				".\nTem capacidade de transportar "+capacidadeLugar+" pessoas.\n"+
				"E foi fabricado em "+origemFabr+ " no ano de "+ano);
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getCapacidadeLugar() {
		return capacidadeLugar;
	}
	public void setCapacidadeLugar(int capacidadeLugar) {
		this.capacidadeLugar = capacidadeLugar;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getOrigemFabr() {
		return origemFabr;
	}
	public void setOrigemFabr(String origemFabr) {
		this.origemFabr = origemFabr;
	}
	
}
