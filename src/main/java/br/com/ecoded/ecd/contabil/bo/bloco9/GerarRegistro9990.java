package br.com.ecoded.ecd.contabil.bo.bloco9;

import br.com.ecoded.ecd.contabil.registros.bloco9.Registro9990;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistro9990 {

	public static StringBuilder gerar(Registro9990 registro9990, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registro9990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro9990.getQtd_lin_9()));
		sb.append("|").append('\n');

		return sb;
	}
}
