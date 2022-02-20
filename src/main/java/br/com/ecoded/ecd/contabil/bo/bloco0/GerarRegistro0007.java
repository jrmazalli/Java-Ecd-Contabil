package br.com.ecoded.ecd.contabil.bo.bloco0;

import br.com.ecoded.ecd.contabil.registros.bloco0.Registro0007;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistro0007 {
	
	public static StringBuilder gerar(Registro0007 registro0007, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro0007.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0007.getCod_ent_ref()));
		sb.append("|").append(Util.preencheRegistro(registro0007.getCod_inscr()));
		sb.append("|").append('\n');
		return sb;
	}

}
