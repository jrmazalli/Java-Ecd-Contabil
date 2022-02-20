package br.com.ecoded.ecd.contabil.registros.blocoI;

import java.util.ArrayList;
import java.util.List;

public class RegistroI150 {

	private final String reg = "I150";
	private String dt_ini;
	private String dt_fin;
	private List<RegistroI155> registroI155;
	private List<RegistroI157> registroI157;

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

	public String getReg() {
		return reg;
	}

	public List<RegistroI155> getRegistroI155() {
		if (registroI155 == null) {
			registroI155 = new ArrayList<RegistroI155>();
		}
		return this.registroI155;
	}

	public void setRegistroI155(List<RegistroI155> registroI155) {
		this.registroI155 = registroI155;
	}

	public List<RegistroI157> getRegistroI157() {
		if (registroI157 == null) {
			registroI157 = new ArrayList<RegistroI157>();
		}
		return this.registroI157;
	}

	public void setRegistroI157(List<RegistroI157> registroI157) {
		this.registroI157 = registroI157;
	}

}
