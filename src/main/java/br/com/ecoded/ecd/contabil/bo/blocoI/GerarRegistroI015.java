package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI015;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI015 {
	
	public static StringBuilder gerar(RegistroI015 registroI015, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI015.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI015.getCod_cta_res()));
		sb.append("|").append('\n');

		return sb;
	}

}
