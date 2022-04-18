package br.com.ecoded.ecd.contabil.registros.blocoI;

public class RegistroI990 {

	private final String reg = "I990";
	private String qtd_lin_i;

	public String getReg() {
		return reg;
	}

	public String getQtd_lin_i() {
		return qtd_lin_i;
	}

	public void setQtd_lin_i(String qtd_lin_i) {
		this.qtd_lin_i = qtd_lin_i;
	}

}
