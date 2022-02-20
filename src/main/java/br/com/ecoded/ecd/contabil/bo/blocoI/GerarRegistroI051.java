package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI051;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI051 {
	
	public static StringBuilder gerar(RegistroI051 registroI051, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI051.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI051.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroI051.getCod_cta_ref()));
		sb.append("|").append('\n');

		return sb;
	}

}
