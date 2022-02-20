package br.com.ecoded.ecd.contabil.bo.blocoK;

import br.com.ecoded.ecd.contabil.registros.blocoK.RegistroK001;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroK001 {

	public static StringBuilder gerar(RegistroK001 registroK001, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroK001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK001.getInd_dad()));
		sb.append("|").append('\n');

		return sb;
	}
}
