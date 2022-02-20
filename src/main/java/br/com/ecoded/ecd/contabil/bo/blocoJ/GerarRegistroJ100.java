package br.com.ecoded.ecd.contabil.bo.blocoJ;

import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ100;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroJ100 {

	public static StringBuilder gerar(RegistroJ100 registroJ100, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroJ100.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ100.getCod_agl()));
		sb.append("|").append(Util.preencheRegistro(registroJ100.getInd_cod_agl()));
		sb.append("|").append(Util.preencheRegistro(registroJ100.getNivel_agl()));
		sb.append("|").append(Util.preencheRegistro(registroJ100.getCod_agl_sup()));
		sb.append("|").append(Util.preencheRegistro(registroJ100.getInd_grp_bal()));
		sb.append("|").append(Util.preencheRegistro(registroJ100.getDesc_cod_agl()));
		sb.append("|").append(Util.preencheRegistro(registroJ100.getVl_cta_ini()));
		sb.append("|").append(Util.preencheRegistro(registroJ100.getInd_dc_cta_ini()));
		sb.append("|").append(Util.preencheRegistro(registroJ100.getVl_cta_fin()));
		sb.append("|").append(Util.preencheRegistro(registroJ100.getInd_dc_cta_fin()));
		sb.append("|").append(Util.preencheRegistro(registroJ100.getNota_exp_ref()));

		sb.append("|").append('\n');

		return sb;
	}
}
