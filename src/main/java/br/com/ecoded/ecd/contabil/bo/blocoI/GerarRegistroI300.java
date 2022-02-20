package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI300;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI300 {

	public static StringBuilder gerar(RegistroI300 registroI300, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI300.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI300.getDt_bcte()));
		sb.append("|").append('\n');

		return sb;
	}
}
