package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI555;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI555 {

	public static StringBuilder gerar(RegistroI555 registroI555, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI555.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI555.getRz_cont_tot()));
		sb.append("|").append('\n');

		return sb;
	}
}
