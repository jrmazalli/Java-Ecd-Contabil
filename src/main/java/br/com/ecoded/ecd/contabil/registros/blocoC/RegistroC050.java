package br.com.ecoded.ecd.contabil.registros.blocoC;

public class RegistroC050 {

	private final String reg = "C050";
	private String dt_alt;
	private String cod_nat;
	private String ind_cta;
	private String nivel;
	private String cod_cta;
	private String cod_cta_sup;
	private String cta;
	private RegistroC051 registroC051;
	private RegistroC052 registroC052;

	public String getReg() {
		return reg;
	}

	public String getDt_alt() {
		return dt_alt;
	}

	public void setDt_alt(String dt_alt) {
		this.dt_alt = dt_alt;
	}

	public String getCod_nat() {
		return cod_nat;
	}

	public void setCod_nat(String cod_nat) {
		this.cod_nat = cod_nat;
	}

	public String getInd_cta() {
		return ind_cta;
	}

	public void setInd_cta(String ind_cta) {
		this.ind_cta = ind_cta;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getCod_cta() {
		return cod_cta;
	}

	public void setCod_cta(String cod_cta) {
		this.cod_cta = cod_cta;
	}

	public String getCod_cta_sup() {
		return cod_cta_sup;
	}

	public void setCod_cta_sup(String cod_cta_sup) {
		this.cod_cta_sup = cod_cta_sup;
	}

	public String getCta() {
		return cta;
	}

	public void setCta(String cta) {
		this.cta = cta;
	}

	public RegistroC051 getRegistroC051() {
		return registroC051;
	}

	public void setRegistroC051(RegistroC051 registroC051) {
		this.registroC051 = registroC051;
	}

	public RegistroC052 getRegistroC052() {
		return registroC052;
	}

	public void setRegistroC052(RegistroC052 registroC052) {
		this.registroC052 = registroC052;
	}

}
