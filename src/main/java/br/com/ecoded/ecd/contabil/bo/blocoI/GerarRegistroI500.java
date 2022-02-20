package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI500;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI500 {

	public static StringBuilder gerar(RegistroI500 registroI500, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI500.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI500.getTam_fonte()));
		sb.append("|").append('\n');

		return sb;
	}

}
