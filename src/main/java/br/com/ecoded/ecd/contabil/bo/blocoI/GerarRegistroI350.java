package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI350;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI350 {

	public static StringBuilder gerar(RegistroI350 registroI350, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI350.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI350.getDt_res()));
		sb.append("|").append('\n');

		return sb;
	}
}
