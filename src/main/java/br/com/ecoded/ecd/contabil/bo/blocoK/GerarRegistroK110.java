package br.com.ecoded.ecd.contabil.bo.blocoK;

import br.com.ecoded.ecd.contabil.registros.blocoK.RegistroK110;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroK110 {

	public static StringBuilder gerar(RegistroK110 registroK110, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroK110.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK110.getEvento()));
		sb.append("|").append(Util.preencheRegistro(registroK110.getDt_evento()));
		sb.append("|").append('\n');

		return sb;
	}
}
