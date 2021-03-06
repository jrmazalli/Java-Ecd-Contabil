package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI990;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI990 {

	public static StringBuilder gerar(RegistroI990 registroI990, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI990.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI990.getQtd_lin_i()));
		sb.append("|").append('\n');

		return sb;
	}
}
