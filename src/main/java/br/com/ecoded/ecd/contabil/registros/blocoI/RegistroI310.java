package br.com.ecoded.ecd.contabil.registros.blocoI;

public class RegistroI310 {

	private final String reg = "I310";
	private String cod_cta;
	private String cod_ccus;
	private String val_debd;
	private String val_credd;
	private String val_deb_mf;
	private String val_cred_mf;

	public String getCod_cta() {
		return cod_cta;
	}

	public void setCod_cta(String cod_cta) {
		this.cod_cta = cod_cta;
	}

	public String getCod_ccus() {
		return cod_ccus;
	}

	public void setCod_ccus(String cod_ccus) {
		this.cod_ccus = cod_ccus;
	}

	public String getVal_debd() {
		return val_debd;
	}

	public void setVal_debd(String val_debd) {
		this.val_debd = val_debd;
	}

	public String getVal_credd() {
		return val_credd;
	}

	public void setVal_credd(String val_credd) {
		this.val_credd = val_credd;
	}

	public String getVal_deb_mf() {
		return val_deb_mf;
	}

	public void setVal_deb_mf(String val_deb_mf) {
		this.val_deb_mf = val_deb_mf;
	}

	public String getVal_cred_mf() {
		return val_cred_mf;
	}

	public void setVal_cred_mf(String val_cred_mf) {
		this.val_cred_mf = val_cred_mf;
	}

	public String getReg() {
		return reg;
	}

}
