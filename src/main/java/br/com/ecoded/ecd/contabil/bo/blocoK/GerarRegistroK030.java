package br.com.ecoded.ecd.contabil.bo.blocoK;

import br.com.ecoded.ecd.contabil.registros.blocoK.RegistroK030;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroK030 {

	public static StringBuilder gerar(RegistroK030 registroK030, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroK030.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK030.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroK030.getDt_fin()));
		sb.append("|").append('\n');

		return sb;
	}
}
