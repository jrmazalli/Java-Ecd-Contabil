package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI001;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI001 {

	public static StringBuilder gerar(RegistroI001 registroI001, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI001.getInd_dad()));
		sb.append("|").append('\n');

		return sb;
	}
}
