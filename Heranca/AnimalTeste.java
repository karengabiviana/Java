package Heranca;

public class AnimalTeste 
{
	public static void main(String[] args) 
	{
		Cachorro tchotchorro= new Cachorro("Duda",8);
		Cavalo pocoto= new Cavalo("Bexter",5);
		Preguica preguicinha=  new Preguica("Rapidez",12);
	
		tchotchorro.mostrarInfos();
		tchotchorro.emitirSom();
		pocoto.mostrarInfos();
		pocoto.emitirSom();
		preguicinha.mostrarInfos();
		preguicinha.emitirSom();
	}
		
}
