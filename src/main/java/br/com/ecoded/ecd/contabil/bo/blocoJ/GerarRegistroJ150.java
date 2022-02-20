package br.com.ecoded.ecd.contabil.bo.blocoJ;

import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ150;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroJ150 {

	public static StringBuilder gerar(RegistroJ150 registroJ150, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroJ150.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ150.getNu_ordem()));
		sb.append("|").append(Util.preencheRegistro(registroJ150.getCod_agl()));
		sb.append("|").append(Util.preencheRegistro(registroJ150.getInd_cod_agl()));
		sb.append("|").append(Util.preencheRegistro(registroJ150.getNivel_agl()));
		sb.append("|").append(Util.preencheRegistro(registroJ150.getCod_agl_sup()));
		sb.append("|").append(Util.preencheRegistro(registroJ150.getDescr_cod_agl()));
		sb.append("|").append(Util.preencheRegistro(registroJ150.getVl_cta_ini_()));
		sb.append("|").append(Util.preencheRegistro(registroJ150.getInd_dc_cta_ini()));
		sb.append("|").append(Util.preencheRegistro(registroJ150.getVl_cta_fin()));
		sb.append("|").append(Util.preencheRegistro(registroJ150.getInd_dc_cta_fin()));
		sb.append("|").append(Util.preencheRegistro(registroJ150.getInd_grp_dre()));
		sb.append("|").append(Util.preencheRegistro(registroJ150.getNota_exp_ref()));
		sb.append("|").append('\n');

		return sb;
	}
}
