package aula06_Bridges_Adapters;

import java.io.InputStream;
import java.net.URL;

public class GoogleMaps implements Mapa{

	
	public String devolveMapa(String rua) {
		try {
			String googlemaps = "http://maps.google.com.br/maps?q=rua+vergueiro";
			URL url = new URL(googlemaps);
			InputStream openStream = url.openStream();
			return "mapa";
		} catch (Exception e) {
			throw new RuntimeException();
		}
		
	}

}
