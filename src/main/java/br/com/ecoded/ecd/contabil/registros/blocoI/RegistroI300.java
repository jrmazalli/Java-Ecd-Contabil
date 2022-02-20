package br.com.ecoded.ecd.contabil.registros.blocoI;

import java.util.ArrayList;
import java.util.List;

public class RegistroI300 {

	private final String reg = "I300";
	private String dt_bcte;
	private List<RegistroI310> registroI310;

	public String getDt_bcte() {
		return dt_bcte;
	}

	public void setDt_bcte(String dt_bcte) {
		this.dt_bcte = dt_bcte;
	}

	public String getReg() {
		return reg;
	}

	public List<RegistroI310> getRegistroI310() {
		if (registroI310 == null) {
			registroI310 = new ArrayList<RegistroI310>();
		}
		return this.registroI310;
	}

}
