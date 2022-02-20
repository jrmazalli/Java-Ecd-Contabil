package br.com.ecoded.ecd.contabil.registros.blocoI;

public class RegistroI053 {

	private final String reg = "I053";
	private String cod_idt;
	private String cod_cnt_corr;
	private String nat_sub_cnt;

	public String getCod_idt() {
		return cod_idt;
	}

	public void setCod_idt(String cod_idt) {
		this.cod_idt = cod_idt;
	}

	public String getCod_cnt_corr() {
		return cod_cnt_corr;
	}

	public void setCod_cnt_corr(String cod_cnt_corr) {
		this.cod_cnt_corr = cod_cnt_corr;
	}

	public String getNat_sub_cnt() {
		return nat_sub_cnt;
	}

	public void setNat_sub_cnt(String nat_sub_cnt) {
		this.nat_sub_cnt = nat_sub_cnt;
	}

	public String getReg() {
		return reg;
	}

}
