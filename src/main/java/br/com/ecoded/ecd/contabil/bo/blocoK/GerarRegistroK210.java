package br.com.ecoded.ecd.contabil.bo.blocoK;

import br.com.ecoded.ecd.contabil.registros.blocoK.RegistroK210;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroK210 {

	public static StringBuilder gerar(RegistroK210 registroK210, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroK210.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK210.getCod_emp()));
		sb.append("|").append(Util.preencheRegistro(registroK210.getCod_cta_emp()));

		sb.append("|").append('\n');

		return sb;
	}
}
