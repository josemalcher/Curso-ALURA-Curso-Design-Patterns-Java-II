package aula06_Bridges_Adapters;

public class Programa {
	public static void main(String[] args) {
		//regras de negócio
		
		
		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("rua veergueiro");
		
		//...
	}
}
