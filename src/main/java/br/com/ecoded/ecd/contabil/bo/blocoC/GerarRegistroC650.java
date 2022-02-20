package br.com.ecoded.ecd.contabil.bo.blocoC;

import br.com.ecoded.ecd.contabil.registros.blocoC.RegistroC650;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroC650 {

	public static StringBuilder gerar(RegistroC650 registroC650, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC650.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC650.getCod_agl()));
		sb.append("|").append(Util.preencheRegistro(registroC650.getNivel_agl()));
		sb.append("|").append(Util.preencheRegistro(registroC650.getDescr_cod_agl()));
		sb.append("|").append(Util.preencheRegistro(registroC650.getVl_cta_fin()));
		sb.append("|").append(Util.preencheRegistro(registroC650.getInd_dc_cta_fin()));

		sb.append("|").append('\n');

		return sb;
	}
}
