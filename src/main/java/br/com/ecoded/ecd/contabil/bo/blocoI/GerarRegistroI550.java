package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI550;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI550 {
	
	public static StringBuilder gerar(RegistroI550 registroI550, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI550.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI550.getRz_cont()));
		sb.append("|").append('\n');

		return sb;
	}

}
