package br.com.ecoded.ecd.contabil.bo.blocoJ;

import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ215;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroJ215 {

	public static StringBuilder gerar(RegistroJ215 registroJ215, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroJ215.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ215.getCod_hist_fat()));
		sb.append("|").append(Util.preencheRegistro(registroJ215.getDesc_fat()));
		sb.append("|").append(Util.preencheRegistro(registroJ215.getVl_fat_cont()));
		sb.append("|").append(Util.preencheRegistro(registroJ215.getInd_dc_fat()));
		sb.append("|").append('\n');

		return sb;
	}
}
