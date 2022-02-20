package br.com.ecoded.ecd.contabil.bo.blocoC;

import br.com.ecoded.ecd.contabil.registros.blocoC.RegistroC600;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroC600 {

	public static StringBuilder gerar(RegistroC600 registroC600, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC600.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC600.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroC600.getDt_fin()));
		sb.append("|").append(Util.preencheRegistro(registroC600.getId_dem()));
		sb.append("|").append(Util.preencheRegistro(registroC600.getCab_dem()));
		sb.append("|").append('\n');

		return sb;
	}
}
