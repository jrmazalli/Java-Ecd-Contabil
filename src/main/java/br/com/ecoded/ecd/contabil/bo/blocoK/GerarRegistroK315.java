package br.com.ecoded.ecd.contabil.bo.blocoK;

import br.com.ecoded.ecd.contabil.registros.blocoK.RegistroK315;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroK315 {
	
	public static StringBuilder gerar(RegistroK315 registroK315, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroK315.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroK315.getEmp_cod_contra()));
		sb.append("|").append(Util.preencheRegistro(registroK315.getCod_contra()));
		sb.append("|").append(Util.preencheRegistro(registroK315.getValor()));
		sb.append("|").append(Util.preencheRegistro(registroK315.getValor()));
		sb.append("|").append(Util.preencheRegistro(registroK315.getInd_valor()));
		sb.append("|").append('\n');

		return sb;
	}

}
