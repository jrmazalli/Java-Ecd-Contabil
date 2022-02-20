package br.com.ecoded.ecd.contabil.bo;

import br.com.ecoded.ecd.contabil.bo.bloco0.GerarBloco0;
import br.com.ecoded.ecd.contabil.bo.bloco0.GerarContadoresBloco0;
import br.com.ecoded.ecd.contabil.bo.bloco9.GerarBloco9;
import br.com.ecoded.ecd.contabil.bo.blocoC.GerarBlocoC;
import br.com.ecoded.ecd.contabil.bo.blocoC.GerarContadoresBlocoC;
import br.com.ecoded.ecd.contabil.bo.blocoI.GerarBlocoI;
import br.com.ecoded.ecd.contabil.bo.blocoI.GerarContadoresBlocoI;
import br.com.ecoded.ecd.contabil.bo.blocoJ.GerarBlocoJ;
import br.com.ecoded.ecd.contabil.bo.blocoJ.GerarContadoresBlocoJ;
import br.com.ecoded.ecd.contabil.bo.blocoK.GerarBlocoK;
import br.com.ecoded.ecd.contabil.registros.EcdContabil;
import br.com.ecoded.ecd.contabil.registros.bloco9.Registro9001;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarEcdContabil {

	public static StringBuilder gerar(EcdContabil ecdContabil, StringBuilder sb) {

		// BLOCO0
		if (!Util.isEmpty(ecdContabil.getBloco0())) {
			GerarBloco0.gerar(ecdContabil, sb);
			GerarContadoresBloco0.gerar(ecdContabil);
		}

		// BLOCOC
		if (!Util.isEmpty(ecdContabil.getBlocoC())) {
			GerarBlocoC.gerar(ecdContabil, sb);
			GerarContadoresBlocoC.gerar(ecdContabil);
		}

		// BLOCOI
		if (!Util.isEmpty(ecdContabil.getBlocoI())) {
			GerarBlocoI.gerar(ecdContabil, sb);
			GerarContadoresBlocoI.gerar(ecdContabil);
		}

		// BLOCOJ
		if (!Util.isEmpty(ecdContabil.getBlocoJ())) {
			GerarBlocoJ.gerar(ecdContabil, sb);
			GerarContadoresBlocoJ.gerar(ecdContabil);
		}

		// BLOCOK
		if (!Util.isEmpty(ecdContabil.getBlocoK())) {
			GerarBlocoK.gerar(ecdContabil, sb);
			GerarContadoresBlocoJ.gerar(ecdContabil);
		}

		// BLOCO9
		Registro9001 registro9001 = new Registro9001();
		registro9001.setInd_dad("0");
		ecdContabil.getBloco9().setRegistro9001(registro9001);
		GerarBloco9.gerar(ecdContabil.getBloco9(), sb);

		// Nova Linha ao Final do Arquivo:
		sb.append(System.lineSeparator());

		return sb;
	}
}
