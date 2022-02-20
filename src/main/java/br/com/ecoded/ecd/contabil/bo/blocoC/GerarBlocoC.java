package br.com.ecoded.ecd.contabil.bo.blocoC;

import br.com.ecoded.ecd.contabil.registros.EcdContabil;
import br.com.ecoded.ecd.contabil.registros.blocoC.BlocoC;
import br.com.ecoded.ecd.contabil.registros.blocoC.BlocoCEnum;
import br.com.ecoded.ecd.contabil.registros.blocoC.RegistroC990;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarBlocoC {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcdContabil ecdContabil, StringBuilder sbr) {
		BlocoC blocoC = ecdContabil.getBlocoC();

		sb = sbr;

		// REGISTROC001
		if (!Util.isEmpty(blocoC.getRegistroC001())) {
			GerarRegistroC001.gerar(blocoC.getRegistroC001(), sb);
			ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC001);
		}

		// REGISTROC040
		if (!Util.isEmpty(blocoC.getRegistroC040())) {
			GerarRegistroC040.gerar(ecdContabil, blocoC.getRegistroC040(), sb);
			ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC040);
		}

		// REGISTROC150
		if (!Util.isEmpty(blocoC.getRegistroC150())) {
			GerarRegistroC150.gerar(blocoC.getRegistroC150(), sb);
			ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC150);
		}

		// REGISTROC155
		if (!Util.isEmpty(blocoC.getRegistroC155())) {
			GerarRegistroC155.gerar(blocoC.getRegistroC155(), sb);
			ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC155);
		}

		// REGISTROC600
		if (!Util.isEmpty(blocoC.getRegistroC600())) {
			GerarRegistroC600.gerar(blocoC.getRegistroC600(), sb);
			ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC600);
		}

		// REGISTROC600
		if (!Util.isEmpty(blocoC.getRegistroC650())) {
			GerarRegistroC650.gerar(blocoC.getRegistroC650(), sb);
			ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC650);
		}

//				// REGISTROC180
//				if (!Util.isEmpty(registroC040.getRegistroC180())) {
//					registroC040.getRegistroC180().forEach(registroC180 -> {
//						GerarRegistroC180.gerar(registroC180, sb);
//						ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC180);
//
//						// REGISTROC181
//						if (!Util.isEmpty(registroC180.getRegistroC181())) {
//							registroC180.getRegistroC181().forEach(registroC181 -> {
//								GerarRegistroC181.gerar(registroC181, sb);
//								ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC181);
//							});
//						}
//
//						// REGISTROC185
//						if (!Util.isEmpty(registroC180.getRegistroC185())) {
//							registroC180.getRegistroC185().forEach(registroC185 -> {
//								GerarRegistroC185.gerar(registroC185, sb);
//								ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC185);
//							});
//						}
//
//						// REGISTROC188
//						if (!Util.isEmpty(registroC180.getRegistroC188())) {
//							registroC180.getRegistroC188().forEach(registroC188 -> {
//								GerarRegistroC188.gerar(registroC188, sb);
//								ecdContabil.getContadoresBlocoC().incrementar(BlocoCEnum.RegistroC188);
//							});
//						}
//					});
//				}
//

		// REGISTROC990
		if (ecdContabil.getContadoresBlocoC().getContRegistroC990() > 0) {
			RegistroC990 registroC990 = new RegistroC990();
			registroC990.setQtd_lin_0(String.valueOf(ecdContabil.getContadoresBlocoC().getContRegistroC990() + 1));

			blocoC.setRegistroC990(registroC990);
			GerarRegistroC990.gerar(blocoC.getRegistroC990(), sb);
		}

		return sb;
	}
}
