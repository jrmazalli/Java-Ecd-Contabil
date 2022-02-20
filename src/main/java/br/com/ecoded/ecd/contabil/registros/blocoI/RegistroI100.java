package br.com.ecoded.ecd.contabil.registros.blocoI;

public class RegistroI100 {

	private final String reg = "I100";
	private String dt_alt;
	private String cod_ccus;
	private String ccus;

	public String getDt_alt() {
		return dt_alt;
	}

	public void setDt_alt(String dt_alt) {
		this.dt_alt = dt_alt;
	}

	public String getCod_ccus() {
		return cod_ccus;
	}

	public void setCod_ccus(String cod_ccus) {
		this.cod_ccus = cod_ccus;
	}

	public String getCcus() {
		return ccus;
	}

	public void setCcus(String ccus) {
		this.ccus = ccus;
	}

	public String getReg() {
		return reg;
	}

}
