package br.com.ecoded.ecd.contabil.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

public class RegistroC150 {

	private final String reg = "C150";
	private String dt_ini;
	private String dt_fin;
	private List<RegistroC155> registroC155;

	public String getReg() {
		return reg;
	}

	public String getDt_ini() {
		return dt_ini;
	}

	public void setDt_ini(String dt_ini) {
		this.dt_ini = dt_ini;
	}

	public String getDt_fin() {
		return dt_fin;
	}

	public void setDt_fin(String dt_fin) {
		this.dt_fin = dt_fin;
	}

	public List<RegistroC155> getRegistroC155() {
		if (registroC155 == null) {
			registroC155 = new ArrayList<RegistroC155>();
		}
		return registroC155;
	}

}
