package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI310;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI310 {

	public static StringBuilder gerar(RegistroI310 registroI310, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI310.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI310.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroI310.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroI310.getVal_debd()));
		sb.append("|").append(Util.preencheRegistro(registroI310.getVal_credd()));
		sb.append("|").append(Util.preencheRegistro(registroI310.getVal_deb_mf()));
		sb.append("|").append(Util.preencheRegistro(registroI310.getVal_cred_mf()));
		sb.append("|").append('\n');

		return sb;
	}

}
