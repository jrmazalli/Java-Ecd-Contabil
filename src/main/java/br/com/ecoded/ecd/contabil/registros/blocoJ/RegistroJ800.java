package br.com.ecoded.ecd.contabil.registros.blocoJ;

public class RegistroJ800 {

	private final String reg = "J800";
	private String tipo_doc;
	private String desc_rtf;
	private String hash_rtf;
	private String arq_rtf;
	private String ind_fim_rtf;

	public String getTipo_doc() {
		return tipo_doc;
	}

	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}

	public String getDesc_rtf() {
		return desc_rtf;
	}

	public void setDesc_rtf(String desc_rtf) {
		this.desc_rtf = desc_rtf;
	}

	public String getHash_rtf() {
		return hash_rtf;
	}

	public void setHash_rtf(String hash_rtf) {
		this.hash_rtf = hash_rtf;
	}

	public String getArq_rtf() {
		return arq_rtf;
	}

	public void setArq_rtf(String arq_rtf) {
		this.arq_rtf = arq_rtf;
	}

	public String getInd_fim_rtf() {
		return ind_fim_rtf;
	}

	public void setInd_fim_rtf(String ind_fim_rtf) {
		this.ind_fim_rtf = ind_fim_rtf;
	}

	public String getReg() {
		return reg;
	}

}
