package br.com.ecoded.ecd.contabil.registros.blocoK;

import java.util.ArrayList;
import java.util.List;

public class RegistroK300 {

	private final String reg = "K300";
	private String cod_cta;
	private String val_ag;
	private String ind_val_ag;
	private String val_el;
	private String ind_val_el;
	private String val_cs;
	private String ind_val_cs;
	private List<RegistroK310> registroK310;
	private List<RegistroK315> registroK315;

	public String getCod_cta() {
		return cod_cta;
	}

	public void setCod_cta(String cod_cta) {
		this.cod_cta = cod_cta;
	}

	public String getVal_ag() {
		return val_ag;
	}

	public void setVal_ag(String val_ag) {
		this.val_ag = val_ag;
	}

	public String getInd_val_ag() {
		return ind_val_ag;
	}

	public void setInd_val_ag(String ind_val_ag) {
		this.ind_val_ag = ind_val_ag;
	}

	public String getVal_el() {
		return val_el;
	}

	public void setVl_el(String val_el) {
		this.val_el = val_el;
	}

	public String getInd_val_el() {
		return ind_val_el;
	}

	public void setInd_val_el(String ind_val_el) {
		this.ind_val_el = ind_val_el;
	}

	public String getVal_cs() {
		return val_cs;
	}

	public void setVal_cs(String val_cs) {
		this.val_cs = val_cs;
	}

	public String getInd_val_cs() {
		return ind_val_cs;
	}

	public void setInd_val_cs(String ind_val_cs) {
		this.ind_val_cs = ind_val_cs;
	}

	public String getReg() {
		return reg;
	}

	public List<RegistroK310> getRegistroK310() {
		if (registroK310 == null) {
			registroK310 = new ArrayList<RegistroK310>();
		}
		return this.registroK310;
	}

	public List<RegistroK315> getRegistroK315() {
		if (registroK315 == null) {
			registroK315 = new ArrayList<RegistroK315>();
		}
		return this.registroK315;
	}

	public void setVal_el(String val_el) {
		this.val_el = val_el;
	}

}
