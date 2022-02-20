package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI150;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI150 {

	public static StringBuilder gerar(RegistroI150 registroI150, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI150.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI150.getDt_ini()));
		sb.append("|").append(Util.preencheRegistro(registroI150.getDt_fin()));

		sb.append("|").append('\n');

		return sb;
	}
}
