package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI100;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI100 {

	public static StringBuilder gerar(RegistroI100 registroI100, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI100.getDt_alt()));
		sb.append("|").append(Util.preencheRegistro(registroI100.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroI100.getCcus()));
		sb.append("|").append('\n');

		return sb;
	}
}
