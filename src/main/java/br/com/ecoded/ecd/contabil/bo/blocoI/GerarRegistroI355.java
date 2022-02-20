package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI355;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI355 {

	public static StringBuilder gerar(RegistroI355 registroI355, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI355.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI355.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroI355.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroI355.getVal_cta()));
		sb.append("|").append(Util.preencheRegistro(registroI355.getInd_dc()));
		sb.append("|").append(Util.preencheRegistro(registroI355.getVal_cta_mf()));
		sb.append("|").append(Util.preencheRegistro(registroI355.getInd_dc_mf()));
		sb.append("|").append('\n');

		return sb;
	}

}
