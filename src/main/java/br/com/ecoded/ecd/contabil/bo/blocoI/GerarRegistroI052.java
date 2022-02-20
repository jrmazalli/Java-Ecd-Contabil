package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI052;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI052 {
	
	public static StringBuilder gerar(RegistroI052 registroI052, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI052.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI052.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroI052.getCod_agl()));
		sb.append("|").append('\n');

		return sb;
	}

}
