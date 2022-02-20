package br.com.ecoded.ecd.contabil.registros.blocoJ;

import java.util.ArrayList;
import java.util.List;

public class RegistroJ900 {

	private final String reg = "J900";
	private String dnrc_encer;
	private String num_ord;
	private String nat_livro;
	private String nome;
	private String qtd_lin;
	private String dt_ini_escr;
	private String dt_fin_escr;
	private List<RegistroJ930> registroJ930;
	private List<RegistroJ932> registroJ932;
	private List<RegistroJ935> registroJ935;

	public String getDnrc_encer() {
		return dnrc_encer;
	}

	public void setDnrc_encer(String dnrc_encer) {
		this.dnrc_encer = dnrc_encer;
	}

	public String getNum_ord() {
		return num_ord;
	}

	public void setNum_ord(String num_ord) {
		this.num_ord = num_ord;
	}

	public String getNat_livro() {
		return nat_livro;
	}

	public void setNat_livro(String nat_livro) {
		this.nat_livro = nat_livro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQtd_lin() {
		return qtd_lin;
	}

	public void setQtd_lin(String qtd_lin) {
		this.qtd_lin = qtd_lin;
	}

	public String getDt_ini_escr() {
		return dt_ini_escr;
	}

	public void setDt_ini_escr(String dt_ini_escr) {
		this.dt_ini_escr = dt_ini_escr;
	}

	public String getDt_fin_escr() {
		return dt_fin_escr;
	}

	public void setDt_fin_escr(String dt_fin_escr) {
		this.dt_fin_escr = dt_fin_escr;
	}

	public String getReg() {
		return reg;
	}

	public List<RegistroJ930> getRegistroJ930() {
		if (registroJ930 == null) {
			registroJ930 = new ArrayList<RegistroJ930>();
		}
		return this.registroJ930;
	}

	public List<RegistroJ932> getRegistroJ932() {
		if (registroJ932 == null) {
			registroJ932 = new ArrayList<RegistroJ932>();
		}
		return this.registroJ932;
	}

	public List<RegistroJ935> getRegistroJ935() {
		if (registroJ935 == null) {
			registroJ935 = new ArrayList<RegistroJ935>();
		}
		return this.registroJ935;
	}

}
