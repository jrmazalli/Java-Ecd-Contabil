package br.com.ecoded.ecd.contabil.bo.bloco0;

import br.com.ecoded.ecd.contabil.registros.bloco0.Registro0180;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistro0180 {

	public static StringBuilder gerar(Registro0180 registro0180, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro0180.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0180.getCod_rel()));
		sb.append("|").append(Util.preencheRegistro(registro0180.getDt_ini_rel()));
		sb.append("|").append(Util.preencheRegistro(registro0180.getDt_fin_rel()));
		sb.append("|").append('\n');
		return sb;
	}
}
