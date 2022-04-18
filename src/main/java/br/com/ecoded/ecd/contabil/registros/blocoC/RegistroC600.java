package br.com.ecoded.ecd.contabil.registros.blocoC;

import java.util.ArrayList;
import java.util.List;

public class RegistroC600 {

	private final String reg = "C600";
	private String dt_ini;
	private String dt_fin;
	private String id_dem;
	private String cab_dem;
	private List<RegistroC650> registroC650;

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

	public List<RegistroC650> getRegistroC650() {
		if (registroC650 == null) {
			registroC650 = new ArrayList<RegistroC650>();
		}
		return registroC650;
	}


}
