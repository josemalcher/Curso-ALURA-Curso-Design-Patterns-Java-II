package aula06_Bridges_Adapters;

import java.util.Calendar;

public class RelogiodoSistema implements Relogio {

	@Override
	public Calendar hoje() {
		return Calendar.getInstance();
	}

}
