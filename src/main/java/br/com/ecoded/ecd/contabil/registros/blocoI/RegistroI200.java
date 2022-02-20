package br.com.ecoded.ecd.contabil.registros.blocoI;

import java.util.ArrayList;
import java.util.List;

public class RegistroI200 {

	private final String reg = "I200";
	private String num_lcto;
	private String dt_lcto;
	private String vl_lcto;
	private String ind_lcto;
	private String dt_lcto_ext;
	private String vl_lcto_mf;
	private List<RegistroI250> registroI250;

	public String getNum_lcto() {
		return num_lcto;
	}

	public void setNum_lcto(String num_lcto) {
		this.num_lcto = num_lcto;
	}

	public String getDt_lcto() {
		return dt_lcto;
	}

	public void setDt_lcto(String dt_lcto) {
		this.dt_lcto = dt_lcto;
	}

	public String getVl_lcto() {
		return vl_lcto;
	}

	public void setVl_lcto(String vl_lcto) {
		this.vl_lcto = vl_lcto;
	}

	public String getInd_lcto() {
		return ind_lcto;
	}

	public void setInd_lcto(String ind_lcto) {
		this.ind_lcto = ind_lcto;
	}

	public String getDt_lcto_ext() {
		return dt_lcto_ext;
	}

	public void setDt_lcto_ext(String dt_lcto_ext) {
		this.dt_lcto_ext = dt_lcto_ext;
	}

	public String getVl_lcto_mf() {
		return vl_lcto_mf;
	}

	public void setVl_lcto_mf(String vl_lcto_mf) {
		this.vl_lcto_mf = vl_lcto_mf;
	}

	public String getReg() {
		return reg;
	}

	public List<RegistroI250> getRegistroI250() {
		if (registroI250 == null) {
			registroI250 = new ArrayList<RegistroI250>();
		}
		return this.registroI250;
	}

	public void setRegistroI250(List<RegistroI250> registroI250) {
		this.registroI250 = registroI250;
	}

}
