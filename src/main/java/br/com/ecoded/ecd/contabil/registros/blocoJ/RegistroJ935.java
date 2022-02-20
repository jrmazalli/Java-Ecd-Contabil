package br.com.ecoded.ecd.contabil.registros.blocoJ;

public class RegistroJ935 {

	private final String reg = "J935";
	private String ni_cpf_cnpj;
	private String nome_auditor_firma;
	private String cod_cvm_auditor;

	public String getNi_cpf_cnpj() {
		return ni_cpf_cnpj;
	}

	public void setNi_cpf_cnpj(String ni_cpf_cnpj) {
		this.ni_cpf_cnpj = ni_cpf_cnpj;
	}

	public String getNome_auditor_firma() {
		return nome_auditor_firma;
	}

	public void setNome_auditor_firma(String nome_auditor_firma) {
		this.nome_auditor_firma = nome_auditor_firma;
	}

	public String getCod_cvm_auditor() {
		return cod_cvm_auditor;
	}

	public void setCod_cvm_auditor(String cod_cvm_auditor) {
		this.cod_cvm_auditor = cod_cvm_auditor;
	}

	public String getReg() {
		return reg;
	}

}
