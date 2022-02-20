package br.com.ecoded.ecd.contabil.bo.bloco0;

import br.com.ecoded.ecd.contabil.registros.bloco0.Registro0035;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistro0035 {

	public static StringBuilder gerar(Registro0035 registro0035, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro0035.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0035.getCod_scp()));
		sb.append("|").append(Util.preencheRegistro(registro0035.getNome_scp()));
		sb.append("|").append('\n');
		return sb;
	}
}
