package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI155;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroI155 {
	
	public static StringBuilder gerar(RegistroI155 registroI155, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroI155.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroI155.getCod_cta()));
		sb.append("|").append(Util.preencheRegistro(registroI155.getCod_ccus()));
		sb.append("|").append(Util.preencheRegistro(registroI155.getVl_sld_ini()));
		sb.append("|").append(Util.preencheRegistro(registroI155.getInd_dc_ini()));
		sb.append("|").append(Util.preencheRegistro(registroI155.getVl_deb()));
		sb.append("|").append(Util.preencheRegistro(registroI155.getVl_cred()));
		sb.append("|").append(Util.preencheRegistro(registroI155.getVl_sld_fin()));
		sb.append("|").append(Util.preencheRegistro(registroI155.getInd_dc_fin()));
		sb.append("|").append(Util.preencheRegistro(registroI155.getVl_sld_ini_mf()));
		sb.append("|").append(Util.preencheRegistro(registroI155.getVl_deb_mf()));
		sb.append("|").append(Util.preencheRegistro(registroI155.getVl_cred_mf()));
		sb.append("|").append(Util.preencheRegistro(registroI155.getVl_sld_fin_mf()));
		sb.append("|").append(Util.preencheRegistro(registroI155.getInd_dc_fin_mf()));
		sb.append("|").append('\n');

		return sb;
	}

}
