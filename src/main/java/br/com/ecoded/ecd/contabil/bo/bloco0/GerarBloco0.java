package br.com.ecoded.ecd.contabil.bo.bloco0;

import br.com.ecoded.ecd.contabil.registros.EcdContabil;
import br.com.ecoded.ecd.contabil.registros.bloco0.Bloco0;
import br.com.ecoded.ecd.contabil.registros.bloco0.Bloco0Enum;
import br.com.ecoded.ecd.contabil.registros.bloco0.Registro0990;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarBloco0 {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcdContabil ecdContabil, StringBuilder sbr) {

		Bloco0 bloco0 = ecdContabil.getBloco0();

		sb = sbr;

		// REGISTRO0000
		if (!Util.isEmpty(bloco0.getRegistro0000())) {
			GerarRegistro0000.gerar(bloco0.getRegistro0000(), sb);
			ecdContabil.getContadoresBloco0().incrementar(Bloco0Enum.Registro0000);
		}

		// REGISTRO0001
		if (!Util.isEmpty(bloco0.getRegistro0001())) {
			GerarRegistro0001.gerar(bloco0.getRegistro0001(), sb);
			ecdContabil.getContadoresBloco0().incrementar(Bloco0Enum.Registro0001);
		}

		// REGISTRO0007
		if (!Util.isEmpty(bloco0.getRegistro0007())) {
			bloco0.getRegistro0007().forEach(registro0007 -> {
				GerarRegistro0007.gerar(registro0007, sb);
				ecdContabil.getContadoresBloco0().incrementar(Bloco0Enum.Registro0007);
			});
		}

		// REGISTRO0020
		if (!Util.isEmpty(bloco0.getRegistro0020())) {
			bloco0.getRegistro0020().forEach(registro0020 -> {
				GerarRegistro0020.gerar(registro0020, sb);
				ecdContabil.getContadoresBloco0().incrementar(Bloco0Enum.Registro0020);
			});
		}

		// REGISTRO0035
		if (!Util.isEmpty(bloco0.getRegistro0035())) {
			bloco0.getRegistro0035().forEach(registro0035 -> {
				GerarRegistro0035.gerar(registro0035, sb);
				ecdContabil.getContadoresBloco0().incrementar(Bloco0Enum.Registro0035);
			});
		}

		// REGISTRO0150
		if (!Util.isEmpty(bloco0.getRegistro0150())) {
			bloco0.getRegistro0150().forEach(registro0150 -> {
				GerarRegistro0150.gerar(registro0150, sb);
				ecdContabil.getContadoresBloco0().incrementar(Bloco0Enum.Registro0150);
			});
		}

		// REGISTRO0180
		if (!Util.isEmpty(bloco0.getRegistro0180())) {
			bloco0.getRegistro0180().forEach(registro0180 -> {
				GerarRegistro0180.gerar(registro0180, sb);
				ecdContabil.getContadoresBloco0().incrementar(Bloco0Enum.Registro0180);
			});
		}

		// REGISTRO0990
		if (ecdContabil.getContadoresBloco0().getContRegistro0990() > 0) {
			Registro0990 registro0990 = new Registro0990();
			registro0990.setQtd_lin_0(String.valueOf(ecdContabil.getContadoresBloco0().getContRegistro0990() + 1));

			bloco0.setRegistro0990(registro0990);
			GerarRegistro0990.gerar(bloco0.getRegistro0990(), sb);
		}

		return sb;
	}
}
