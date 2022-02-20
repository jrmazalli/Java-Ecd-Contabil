package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI075;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI075 {
	
	public static StringBuilder gerar(RegistroI075 registroI075, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI075.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI075.getCod_hist()));
		sb.append("|").append(Util.preencheRegistro(registroI075.getDescr_hist()));
		sb.append("|").append('\n');

		return sb;
	}

}
