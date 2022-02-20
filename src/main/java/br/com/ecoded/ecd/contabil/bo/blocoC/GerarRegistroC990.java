package br.com.ecoded.ecd.contabil.bo.blocoC;

import br.com.ecoded.ecd.contabil.registros.blocoC.RegistroC990;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroC990 {

	public static StringBuilder gerar(RegistroC990 registroC990, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC990.getQtd_lin_0()));
		sb.append("|").append('\n');

		return sb;
	}
}
