package br.com.ecoded.ecd.contabil.bo.blocoK;

import br.com.ecoded.ecd.contabil.registros.blocoK.RegistroK100;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroK100 {

	public static StringBuilder gerar(RegistroK100 registroK100, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroK100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK100.getCod_pais()));
		sb.append("|").append(Util.preencheRegistro(registroK100.getEmp_cod()));
		sb.append("|").append(Util.preencheRegistro(registroK100.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registroK100.getNome()));
		sb.append("|").append(Util.preencheRegistro(registroK100.getPer_part()));
		sb.append("|").append(Util.preencheRegistro(registroK100.getEvento()));
		sb.append("|").append(Util.preencheRegistro(registroK100.getPer_cons()));
		sb.append("|").append(Util.preencheRegistro(registroK100.getData_ini_emp()));
		sb.append("|").append(Util.preencheRegistro(registroK100.getData_fin_emp()));
		sb.append("|").append('\n');

		return sb;
	}
}
