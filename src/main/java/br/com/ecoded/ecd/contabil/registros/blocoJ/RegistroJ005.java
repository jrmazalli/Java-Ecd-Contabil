package br.com.ecoded.ecd.contabil.registros.blocoJ;

import java.util.ArrayList;
import java.util.List;

public class RegistroJ005 {

	private final String reg = "J005";
	private String dt_ini;
	private String dt_fin;
	private String id_dem;
	private String cab_dem;
	private List<RegistroJ100> registroJ100;
	private List<RegistroJ150> registroJ150;

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

	public String getId_dem() {
		return id_dem;
	}

	public void setId_dem(String id_dem) {
		this.id_dem = id_dem;
	}

	public String getCab_dem() {
		return cab_dem;
	}

	public void setCab_dem(String cab_dem) {
		this.cab_dem = cab_dem;
	}

	public String getReg() {
		return reg;
	}

	public List<RegistroJ100> getRegistroJ100() {
		if (registroJ100 == null) {
			registroJ100 = new ArrayList<RegistroJ100>();
		}
		return this.registroJ100;
	}

	public void setRegistroJ100(List<RegistroJ100> registroJ100) {
		this.registroJ100 = registroJ100;
	}

	public List<RegistroJ150> getRegistroJ150() {
		if (registroJ150 == null) {
			registroJ150 = new ArrayList<RegistroJ150>();
		}
		return this.registroJ150;
	}

	public void setRegistroJ150(List<RegistroJ150> registroJ150) {
		this.registroJ150 = registroJ150;
	}

}
