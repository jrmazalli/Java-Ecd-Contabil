package br.com.ecoded.ecd.contabil.registros.blocoC;

public class RegistroC650 {

	private final String reg = "C650";
	private String cod_agl;
	private String nivel_agl;
	private String descr_cod_agl;
	private String vl_cta_fin;
	private String ind_dc_cta_fin;

	public String getCod_agl() {
		return cod_agl;
	}

	public void setCod_agl(String cod_agl) {
		this.cod_agl = cod_agl;
	}

	public String getNivel_agl() {
		return nivel_agl;
	}

	public void setNivel_agl(String nivel_agl) {
		this.nivel_agl = nivel_agl;
	}

	public String getDescr_cod_agl() {
		return descr_cod_agl;
	}

	public void setDescr_cod_agl(String descr_cod_agl) {
		this.descr_cod_agl = descr_cod_agl;
	}

	public String getVl_cta_fin() {
		return vl_cta_fin;
	}

	public void setVl_cta_fin(String vl_cta_fin) {
		this.vl_cta_fin = vl_cta_fin;
	}

	public String getInd_dc_cta_fin() {
		return ind_dc_cta_fin;
	}

	public void setInd_dc_cta_fin(String ind_dc_cta_fin) {
		this.ind_dc_cta_fin = ind_dc_cta_fin;
	}

	public String getReg() {
		return reg;
	}

}
