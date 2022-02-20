package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI157;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI157 {

	public static StringBuilder gerar(RegistroI157 registroI157, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI157.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI157.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroI157.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroI157.getVl_sld_ini()));
		sb.append("|").append(Util.preencheRegistro(registroI157.getInd_dc_ini()));
		sb.append("|").append(Util.preencheRegistro(registroI157.getVl_sld_ini_mf()));
		sb.append("|").append(Util.preencheRegistro(registroI157.getInd_dc_ini_mf()));

		return sb;
	}

}
