package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI200;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI200 {

	public static StringBuilder gerar(RegistroI200 registroI200, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI200.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI200.getNum_lcto()));
		sb.append("|").append(Util.preencheRegistro(registroI200.getDt_lcto()));
		sb.append("|").append(Util.preencheRegistro(registroI200.getVl_lcto()));
		sb.append("|").append(Util.preencheRegistro(registroI200.getInd_lcto()));
		sb.append("|").append(Util.preencheRegistro(registroI200.getDt_lcto_ext()));
		sb.append("|").append('\n');

		return sb;
	}
}
