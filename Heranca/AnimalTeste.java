package bloco1.POO.Heranca;

public class AnimalTeste 
{
	public static void main(String[] args) 
	{
		Cachorro tchotchorro= new Cachorro("Duda",8,"Au Au","O cachorro corre!");
		Cavalo pocoto= new Cavalo("Bexter",5,"iiirrrr�","O cavalo corre!");
		Preguica preguicinha=  new Preguica("Rapidez",12,"zzzzzzz...","A pregui�a sobe em �rvores!");
	
		tchotchorro.mostrarInfos();
		pocoto.mostrarInfos();
		preguicinha.mostrarInfos();
	}
		
}
