package br.com.ecoded.ecd.contabil.registros.blocoC;

public class RegistroC120 {

	private final String reg = "C120";
	private String cod_doc_imp;
	private String num_doc_imp;
	private String pis_imp;
	private String cofins_imp;
	private String num_acdraw;

	public String getCod_doc_imp() {
		return cod_doc_imp;
	}

	public void setCod_doc_imp(String cod_doc_imp) {
		this.cod_doc_imp = cod_doc_imp;
	}

	public String getNum_doc_imp() {
		return num_doc_imp;
	}

	public void setNum_doc_imp(String num_doc_imp) {
		this.num_doc_imp = num_doc_imp;
	}

	public String getPis_imp() {
		return pis_imp;
	}

	public void setPis_imp(String pis_imp) {
		this.pis_imp = pis_imp;
	}

	public String getCofins_imp() {
		return cofins_imp;
	}

	public void setCofins_imp(String cofins_imp) {
		this.cofins_imp = cofins_imp;
	}

	public String getNum_acdraw() {
		return num_acdraw;
	}

	public void setNum_acdraw(String num_acdraw) {
		this.num_acdraw = num_acdraw;
	}

	public String getReg() {
		return reg;
	}

}
