package br.com.ecoded.ecd.contabil.bo.blocoC;

import br.com.ecoded.ecd.contabil.registros.blocoC.RegistroC155;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarRegistroC155 {

	public static StringBuilder gerar(RegistroC155 registroC155, StringBuilder sb) {

		sb.append("|").append(Util.preencheRegistro(registroC155.getReg()));
		sb.append("|").append(Util.preencheRegistro(registroC155.getCod_cta_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC155.getCod_ccus_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC155.getVl_sld_ini_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC155.getInd_dc_ini_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC155.getVl_deb_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC155.getVl_cred_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC155.getVl_sld_fin_rec()));
		sb.append("|").append(Util.preencheRegistro(registroC155.getInd_dc_fin_rec()));
		sb.append("|").append('\n');

		return sb;
	}
}
