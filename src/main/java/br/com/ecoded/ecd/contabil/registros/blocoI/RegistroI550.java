package br.com.ecoded.ecd.contabil.registros.blocoI;

import java.util.ArrayList;
import java.util.List;

public class RegistroI550 {

	private final String reg = "I550";
	private String rz_cont;
	private List<RegistroI555> registroI555;

	public String getRz_cont() {
		return rz_cont;
	}

	public void setRz_cont(String rz_cont) {
		this.rz_cont = rz_cont;
	}

	public String getReg() {
		return reg;
	}

	public List<RegistroI555> getRegistroI555() {
		if (registroI555 == null) {
			registroI555 = new ArrayList<RegistroI555>();
		}
		return this.registroI555;
	}

	public void setRegistroI555(List<RegistroI555> registroI555) {
		this.registroI555 = registroI555;
	}

}
