package br.com.ecoded.ecd.contabil.registros.blocoI;

import java.util.ArrayList;
import java.util.List;

public class RegistroI350 {

	private final String reg = "I350";
	private String dt_res;
	private List<RegistroI355> registroI355;

	public String getDt_res() {
		return dt_res;
	}

	public void setDt_res(String dt_res) {
		this.dt_res = dt_res;
	}

	public String getReg() {
		return reg;
	}

	public List<RegistroI355> getRegistroI355() {
		if (registroI355 == null) {
			registroI355 = new ArrayList<RegistroI355>();
		}
		return this.registroI355;
	}

	public void setRegistroI355(List<RegistroI355> registroI355) {
		this.registroI355 = registroI355;
	}

}
