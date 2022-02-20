package br.com.ecoded.ecd.contabil.registros.blocoI;

public class RegistroI510 {

	private final String reg = "I510";
	private String nm_campo;
	private String desc_campo;
	private String tipo_campo;
	private String tam_campo;
	private String dec_campo;
	private String col_campo;

	public String getNm_campo() {
		return nm_campo;
	}

	public void setNm_campo(String nm_campo) {
		this.nm_campo = nm_campo;
	}

	public String getDesc_campo() {
		return desc_campo;
	}

	public void setDesc_campo(String desc_campo) {
		this.desc_campo = desc_campo;
	}

	public String getTipo_campo() {
		return tipo_campo;
	}

	public void setTipo_campo(String tipo_campo) {
		this.tipo_campo = tipo_campo;
	}

	public String getTam_campo() {
		return tam_campo;
	}

	public void setTam_campo(String tam_campo) {
		this.tam_campo = tam_campo;
	}

	public String getDec_campo() {
		return dec_campo;
	}

	public void setDec_campo(String dec_campo) {
		this.dec_campo = dec_campo;
	}

	public String getCol_campo() {
		return col_campo;
	}

	public void setCol_campo(String col_campo) {
		this.col_campo = col_campo;
	}

	public String getReg() {
		return reg;
	}

}
