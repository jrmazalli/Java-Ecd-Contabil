package br.com.ecoded.ecd.contabil.bo.blocoK;

import br.com.ecoded.ecd.contabil.registros.blocoK.RegistroK310;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroK310 {
	
	public static StringBuilder gerar(RegistroK310 registroK310, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroK310.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK310.getEmp_cod_parte()));
		sb.append("|").append(Util.preencheRegistro(registroK310.getValor()));
		sb.append("|").append(Util.preencheRegistro(registroK310.getInd_valor()));
		sb.append("|").append('\n');

		return sb;
	}


}
