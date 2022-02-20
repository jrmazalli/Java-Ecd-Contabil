package br.com.ecoded.ecd.contabil.bo.bloco0;

import br.com.ecoded.ecd.contabil.registros.bloco0.Registro0020;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistro0020 {
	
	public static StringBuilder gerar(Registro0020 registro0020, StringBuilder sb) {
		sb.append("|").append(Util.preencheRegistro(registro0020.getReg()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getInd_dec()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getCnpj()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getUf()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getIe()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getCod_mun()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getIm()));
		sb.append("|").append(Util.preencheRegistro(registro0020.getNire()));
		sb.append("|").append('\n');
		return sb;
	}

}
