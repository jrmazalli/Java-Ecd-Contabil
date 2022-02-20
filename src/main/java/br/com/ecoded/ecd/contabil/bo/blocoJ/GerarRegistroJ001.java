package br.com.ecoded.ecd.contabil.bo.blocoJ;

import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ001;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroJ001 {

	public static StringBuilder gerar(RegistroJ001 registroJ001, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroJ001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ001.getInd_dad()));
		sb.append("|").append('\n');

		return sb;
	}
}
