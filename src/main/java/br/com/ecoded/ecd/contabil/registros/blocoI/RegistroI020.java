package br.com.ecoded.ecd.contabil.registros.blocoI;

public class RegistroI020 {

	private final String reg = "I020";
	private String reg_cod;
	private String num_ad;
	private String campo;
	private String descricao;
	private String tipo;

	public String getReg_cod() {
		return reg_cod;
	}

	public void setReg_cod(String reg_cod) {
		this.reg_cod = reg_cod;
	}

	public String getNum_ad() {
		return num_ad;
	}

	public void setNum_ad(String num_ad) {
		this.num_ad = num_ad;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getReg() {
		return reg;
	}

}
