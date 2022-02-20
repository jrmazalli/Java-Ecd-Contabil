package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.EcdContabil;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI010;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI010 {

	public static StringBuilder gerar(EcdContabil ecdContabil, RegistroI010 registroI010, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI010.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI010.getInd_esc()));
		sb.append("|").append(Util.preencheRegistro(Util.getCodVersao(ecdContabil)));
		sb.append("|").append('\n');

		return sb;
	}
}
