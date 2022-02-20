package br.com.ecoded.ecd.contabil.bo.blocoK;

import br.com.ecoded.ecd.contabil.registros.blocoK.RegistroK115;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroK115 {

	public static StringBuilder gerar(RegistroK115 registroK115, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroK115.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK115.getEmp_cod_part()));
		sb.append("|").append(Util.preencheRegistro(registroK115.getCond_part()));
		sb.append("|").append(Util.preencheRegistro(registroK115.getPer_evt()));
		sb.append("|").append('\n');

		return sb;
	}
}
