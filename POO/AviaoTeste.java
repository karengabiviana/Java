/*
 * Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */

package bloco1POO;

public class AviaoTeste 
{
	public static void main(String[] args)
	{
		Aviao aviaoUm= new Aviao("Boing 123",200,1993,"Estados Unidos da América");
		aviaoUm.mostrarInfos();
	}
}
