package br.com.ecoded.ecd.contabil.bo.blocoJ;

import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ210;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroJ210 {

	public static StringBuilder gerar(RegistroJ210 registroJ210, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroJ210.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ210.getInd_tip()));
		sb.append("|").append(Util.preencheRegistro(registroJ210.getCod_agl()));
		sb.append("|").append(Util.preencheRegistro(registroJ210.getDescr_cod_agl()));
		sb.append("|").append(Util.preencheRegistro(registroJ210.getVl_cta_ini()));
		sb.append("|").append(Util.preencheRegistro(registroJ210.getInd_dc_cta_ini()));
		sb.append("|").append(Util.preencheRegistro(registroJ210.getVl_cta_fin()));
		sb.append("|").append(Util.preencheRegistro(registroJ210.getInd_dc_cta_fin()));
		sb.append("|").append(Util.preencheRegistro(registroJ210.getNotas_exp_ref()));
		sb.append("|").append('\n');

		return sb;
	}
}
