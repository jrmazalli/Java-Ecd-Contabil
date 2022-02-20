package br.com.ecoded.ecd.contabil.registros.blocoI;

public class RegistroI010 {

	private final String reg = "I010";
	private String ind_esc;
	private String cod_ver_lc;

	public String getInd_esc() {
		return ind_esc;
	}

	public void setInd_esc(String ind_esc) {
		this.ind_esc = ind_esc;
	}

	public String getCod_ver_lc() {
		return cod_ver_lc;
	}

	public void setCod_ver_lc(String cod_ver_lc) {
		this.cod_ver_lc = cod_ver_lc;
	}

	public String getReg() {
		return reg;
	}

}
