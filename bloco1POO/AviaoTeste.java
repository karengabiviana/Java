/*
 * Crie uma classe avi�o e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto avi�o, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */

package bloco1POO;

public class AviaoTeste 
{
	public static void main(String[] args)
	{
		Aviao aviaoUm= new Aviao("Boing 123",200,1993,"Estados Unidos da Am�rica");
		aviaoUm.mostrarInfos();
	}
}
