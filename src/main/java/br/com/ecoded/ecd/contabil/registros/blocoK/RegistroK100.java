package br.com.ecoded.ecd.contabil.registros.blocoK;

import java.util.ArrayList;
import java.util.List;

public class RegistroK100 {

	private final String reg = "K100";
	private String cod_pais;
	private String emp_cod;
	private String cnpj;
	private String nome;
	private String per_part;
	private String evento;
	private String per_cons;
	private String data_ini_emp;
	private String data_fin_emp;
	private List<RegistroK110> registroK110;
	private List<RegistroK115> registroK115;

	public String getCod_pais() {
		return cod_pais;
	}

	public void setCod_pais(String cod_pais) {
		this.cod_pais = cod_pais;
	}

	public String getEmp_cod() {
		return emp_cod;
	}

	public void setEmp_cod(String emp_cod) {
		this.emp_cod = emp_cod;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPer_part() {
		return per_part;
	}

	public void setPer_part(String per_part) {
		this.per_part = per_part;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public String getPer_cons() {
		return per_cons;
	}

	public void setPer_cons(String per_cons) {
		this.per_cons = per_cons;
	}

	public String getData_ini_emp() {
		return data_ini_emp;
	}

	public void setData_ini_emp(String data_ini_emp) {
		this.data_ini_emp = data_ini_emp;
	}

	public String getData_fin_emp() {
		return data_fin_emp;
	}

	public void setData_fin_emp(String data_fin_emp) {
		this.data_fin_emp = data_fin_emp;
	}

	public String getReg() {
		return reg;
	}

	public List<RegistroK110> getRegistroK110() {
		if (registroK110 == null) {
			registroK110 = new ArrayList<RegistroK110>();
		}
		return this.registroK110;
	}

	public List<RegistroK115> getRegistroK115() {
		if (registroK115 == null) {
			registroK115 = new ArrayList<RegistroK115>();
		}
		return this.registroK115;
	}

}
