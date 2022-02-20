package br.com.ecoded.ecd.contabil.registros.blocoI;

import java.util.ArrayList;
import java.util.List;

public class RegistroI012 {

	private final String reg = "I012";
	private String num_ord;
	private String nat_livr;
	private String tipo;
	private String cod_hash_aux;
	private List<RegistroI015> registroI015;

	public String getNum_ord() {
		return num_ord;
	}

	public void setNum_ord(String num_ord) {
		this.num_ord = num_ord;
	}

	public String getNat_livr() {
		return nat_livr;
	}

	public void setNat_livr(String nat_livr) {
		this.nat_livr = nat_livr;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCod_hash_aux() {
		return cod_hash_aux;
	}

	public void setCod_hash_aux(String cod_hash_aux) {
		this.cod_hash_aux = cod_hash_aux;
	}

	public String getReg() {
		return reg;
	}

	public List<RegistroI015> getRegistroI015() {
		if (registroI015 == null) {
			registroI015 = new ArrayList<RegistroI015>();
		}
		return this.registroI015;
	}

	public void setRegistroI015(List<RegistroI015> registroI015) {
		this.registroI015 = registroI015;
	}

}
