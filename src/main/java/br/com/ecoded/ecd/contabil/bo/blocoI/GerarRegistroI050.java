package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI050;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI050 {
	
	public static StringBuilder gerar(RegistroI050 registroI050, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI050.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI050.getDt_alt()));
		sb.append("|").append(Util.preencheRegistro(registroI050.getCod_nat()));
		sb.append("|").append(Util.preencheRegistro(registroI050.getInd_cta()));
		sb.append("|").append(Util.preencheRegistro(registroI050.getNivel()));
		sb.append("|").append(Util.preencheRegistro(registroI050.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroI050.getCod_cta_sup()));
		sb.append("|").append(Util.preencheRegistro(registroI050.getCta()));
		sb.append("|").append('\n');

		return sb;
	}

}
