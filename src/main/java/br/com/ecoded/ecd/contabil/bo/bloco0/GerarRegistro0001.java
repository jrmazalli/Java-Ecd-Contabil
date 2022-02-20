package br.com.ecoded.ecd.contabil.bo.bloco0;

import br.com.ecoded.ecd.contabil.registros.bloco0.Registro0001;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistro0001 {

	public static StringBuilder gerar(Registro0001 registro0001, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro0001.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0001.getInd_dad()));
		sb.append("|").append('\n');
		return sb;
	}
}
