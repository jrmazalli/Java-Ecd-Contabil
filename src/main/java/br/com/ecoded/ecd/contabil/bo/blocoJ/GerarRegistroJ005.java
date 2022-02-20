package br.com.ecoded.ecd.contabil.bo.blocoJ;

import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ005;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroJ005 {

	public static StringBuilder gerar(RegistroJ005 registroJ005, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroJ005.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroJ005.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroJ005.getDt_fin()));
		sb.append("|").append(Util.preencheRegistro(registroJ005.getId_dem()));
		sb.append("|").append(Util.preencheRegistro(registroJ005.getCab_dem()));
		sb.append("|").append('\n');

		return sb;
	}
}
