package aula06_Bridges_Adapters;

public class Programa {
	public static void main(String[] args) {
		//regras de neg�cio
		
		
		Mapa mapa = new GoogleMaps();
		mapa.devolveMapa("rua veergueiro");
		
		//...
	}
}
