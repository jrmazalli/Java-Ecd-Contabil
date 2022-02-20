package br.com.ecoded.ecd.contabil.registros.blocoJ;

import java.util.ArrayList;
import java.util.List;

public class RegistroJ210 {

	private final String reg = "J210";
	private String ind_tip;
	private String cod_agl;
	private String descr_cod_agl;
	private String vl_cta_ini;
	private String ind_dc_cta_ini;
	private String vl_cta_fin;
	private String ind_dc_cta_fin;
	private String notas_exp_ref;
	private List<RegistroJ215> registroJ215;

	public String getInd_tip() {
		return ind_tip;
	}

	public void setInd_tip(String ind_tip) {
		this.ind_tip = ind_tip;
	}

	public String getCod_agl() {
		return cod_agl;
	}

	public void setCod_agl(String cod_agl) {
		this.cod_agl = cod_agl;
	}

	public String getDescr_cod_agl() {
		return descr_cod_agl;
	}

	public void setDescr_cod_agl(String descr_cod_agl) {
		this.descr_cod_agl = descr_cod_agl;
	}

	public String getVl_cta_ini() {
		return vl_cta_ini;
	}

	public void setVl_cta_ini(String vl_cta_ini) {
		this.vl_cta_ini = vl_cta_ini;
	}

	public String getInd_dc_cta_ini() {
		return ind_dc_cta_ini;
	}

	public void setInd_dc_cta_ini(String ind_dc_cta_ini) {
		this.ind_dc_cta_ini = ind_dc_cta_ini;
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

	public String getNotas_exp_ref() {
		return notas_exp_ref;
	}

	public void setNotas_exp_ref(String notas_exp_ref) {
		this.notas_exp_ref = notas_exp_ref;
	}

	public String getReg() {
		return reg;
	}

	public List<RegistroJ215> getRegistroJ215() {
		if (registroJ215 == null) {
			registroJ215 = new ArrayList<RegistroJ215>();
		}
		return this.registroJ215;
	}

	public void setRegistroJ215(List<RegistroJ215> registroJ215) {
		this.registroJ215 = registroJ215;
	}

}
