package br.com.ecoded.ecd.contabil.registros.blocoI;

import java.util.ArrayList;
import java.util.List;

public class RegistroI050 {

	private final String reg = "I050";
	private String dt_alt;
	private String cod_nat;
	private String ind_cta;
	private String nivel;
	private String cod_cta;
	private String cod_cta_sup;
	private String cta;
	private List<RegistroI051> registroI051;
	private List<RegistroI052> registroI052;
	private List<RegistroI053> registroI053;

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

	public String getReg() {
		return reg;
	}

	public List<RegistroI051> getRegistroI051() {
		if (registroI051 == null) {
			registroI051 = new ArrayList<RegistroI051>();
		}
		return this.registroI051;
	}

	public List<RegistroI052> getRegistroI052() {
		if (registroI052 == null) {
			registroI052 = new ArrayList<RegistroI052>();
		}
		return this.registroI052;
	}

	public List<RegistroI053> getRegistroI053() {
		if (registroI053 == null) {
			registroI053 = new ArrayList<RegistroI053>();
		}
		return this.registroI053;
	}

}
