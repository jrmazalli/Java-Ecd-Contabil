package br.com.ecoded.ecd.contabil.bo.blocoK;

import br.com.ecoded.ecd.contabil.registros.blocoK.RegistroK200;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroK200 {

	public static StringBuilder gerar(RegistroK200 registroK200, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroK200.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK200.getCod_nat()));
		sb.append("|").append(Util.preencheRegistro(registroK200.getInd_cta()));
		sb.append("|").append(Util.preencheRegistro(registroK200.getNivel()));
		sb.append("|").append(Util.preencheRegistro(registroK200.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroK200.getCod_cta_sup()));
		sb.append("|").append(Util.preencheRegistro(registroK200.getCta()));
		sb.append("|").append('\n');

		return sb;
	}
}
