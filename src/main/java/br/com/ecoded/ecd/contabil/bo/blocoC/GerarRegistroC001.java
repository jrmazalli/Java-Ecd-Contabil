package br.com.ecoded.ecd.contabil.bo.blocoC;

import br.com.ecoded.ecd.contabil.registros.blocoC.RegistroC001;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroC001 {

	public static StringBuilder gerar(RegistroC001 registroC001, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC001.getInd_dad()));
		sb.append("|").append('\n');

		return sb;
	}
}