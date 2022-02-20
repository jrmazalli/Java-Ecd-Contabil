package br.com.ecoded.ecd.contabil.bo.blocoJ;

import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ800;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroJ800 {

	public static StringBuilder gerar(RegistroJ800 registroJ800, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroJ800.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ800.getTipo_doc()));
		sb.append("|").append(Util.preencheRegistro(registroJ800.getDesc_rtf()));
		sb.append("|").append(Util.preencheRegistro(registroJ800.getHash_rtf()));
		sb.append("|").append(Util.preencheRegistro(registroJ800.getArq_rtf()));
		sb.append("|").append(Util.preencheRegistro(registroJ800.getInd_fim_rtf()));
		sb.append("|").append('\n');

		return sb;
	}
}
