package br.com.ecoded.ecd.contabil.bo.blocoJ;

import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ801;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroJ801 {

	public static StringBuilder gerar(RegistroJ801 registroJ801, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroJ801.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ801.getTipo_doc()));
		sb.append("|").append(Util.preencheRegistro(registroJ801.getDesc_rtf()));
		sb.append("|").append(Util.preencheRegistro(registroJ801.getCod_mot_subs()));
		sb.append("|").append(Util.preencheRegistro(registroJ801.getHash_rtf()));
		sb.append("|").append(Util.preencheRegistro(registroJ801.getArq_rtf()));
		sb.append("|").append(Util.preencheRegistro(registroJ801.getInd_fim_rtf()));
		sb.append("|").append('\n');

		return sb;
	}
}
