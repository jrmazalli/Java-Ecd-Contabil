package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI020;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI020 {
	
	public static StringBuilder gerar(RegistroI020 registroI020, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI020.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI020.getReg_cod()));
		sb.append("|").append(Util.preencheRegistro(registroI020.getNum_ad()));
		sb.append("|").append(Util.preencheRegistro(registroI020.getCampo()));
		sb.append("|").append(Util.preencheRegistro(registroI020.getDescricao()));
		sb.append("|").append(Util.preencheRegistro(registroI020.getTipo()));
		sb.append("|").append('\n');

		return sb;
	}

}
