package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.EcdContabil;
import br.com.ecoded.ecd.contabil.registros.blocoI.BlocoI;
import br.com.ecoded.ecd.contabil.registros.blocoI.BlocoIEnum;
import br.com.ecoded.ecd.contabil.registros.blocoI.RegistroI990;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarBlocoI {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcdContabil ecdContabil, StringBuilder sbr) {
		BlocoI blocoI = ecdContabil.getBlocoI();
		sb = sbr;

//      REGISTROI001
		if (!Util.isEmpty(blocoI.getRegistroI001())) {
			GerarRegistroI001.gerar(blocoI.getRegistroI001(), sb);
			ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI001);
		}

//      REGISTROI010
		if (!Util.isEmpty(blocoI.getRegistroI010())) {
			GerarRegistroI010.gerar(ecdContabil, blocoI.getRegistroI010(), sb);
			ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI010);
		}

//      REGISTROI030
		if (!Util.isEmpty(blocoI.getRegistroI030())) {
			GerarRegistroI030.gerar(blocoI.getRegistroI030(), sb);
			ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI030);
		}

		// REGISTROI050
		if (!Util.isEmpty(blocoI.getRegistroI050())) {
			blocoI.getRegistroI050().forEach(registroI050 -> {
				GerarRegistroI050.gerar(registroI050, sb);
				ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI050);

				// REGISTROI051
				if (!Util.isEmpty(registroI050.getRegistroI051())) {
					registroI050.getRegistroI051().forEach(registroI051 -> {
						GerarRegistroI051.gerar(registroI051, sb);
						ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI051);
					});
				}

				// REGISTROI052
				if (!Util.isEmpty(registroI050.getRegistroI052())) {
					registroI050.getRegistroI052().forEach(registroI052 -> {
						GerarRegistroI052.gerar(registroI052, sb);
						ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI052);
					});
				}

				// REGISTROI053
				if (!Util.isEmpty(registroI050.getRegistroI053())) {
					registroI050.getRegistroI053().forEach(registroI053 -> {
						GerarRegistroI053.gerar(registroI053, sb);
						ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI053);
					});
				}

			});
		}

//      REGISTROI075
		if (!Util.isEmpty(blocoI.getRegistroI075())) {
			blocoI.getRegistroI075().forEach(registroI075 -> {
				GerarRegistroI075.gerar(registroI075, sb);
				ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI075);
			});
		}

//      REGISTROI100
		if (!Util.isEmpty(blocoI.getRegistroI100())) {
			blocoI.getRegistroI100().forEach(registroI100 -> {
				GerarRegistroI100.gerar(registroI100, sb);
				ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI100);
			});
		}

		// REGISTROI150
		if (!Util.isEmpty(blocoI.getRegistroI150())) {
			blocoI.getRegistroI150().forEach(registroI150 -> {
				GerarRegistroI150.gerar(registroI150, sb);
				ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI150);

				// REGISTROI055
				if (!Util.isEmpty(registroI150.getRegistroI155())) {
					registroI150.getRegistroI155().forEach(registroI155 -> {
						GerarRegistroI155.gerar(registroI155, sb);
						ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI155);
					});
				}

				// REGISTROI057
				if (!Util.isEmpty(registroI150.getRegistroI157())) {
					registroI150.getRegistroI157().forEach(registroI157 -> {
						GerarRegistroI157.gerar(registroI157, sb);
						ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI157);
					});
				}

			});
		}

		// REGISTROI200
		if (!Util.isEmpty(blocoI.getRegistroI200())) {
			blocoI.getRegistroI200().forEach(registroI200 -> {
				GerarRegistroI200.gerar(registroI200, sb);
				ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI200);

				// REGISTROI250
				if (!Util.isEmpty(registroI200.getRegistroI250())) {
					registroI200.getRegistroI250().forEach(registroI250 -> {
						GerarRegistroI250.gerar(registroI250, sb);
						ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI250);
					});
				}

			});
		}

		// REGISTROI300
		if (!Util.isEmpty(blocoI.getRegistroI300())) {
			blocoI.getRegistroI300().forEach(registroI300 -> {
				GerarRegistroI300.gerar(registroI300, sb);
				ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI300);

				// REGISTROI310
				if (!Util.isEmpty(registroI300.getRegistroI310())) {
					registroI300.getRegistroI310().forEach(registroI310 -> {
						GerarRegistroI310.gerar(registroI310, sb);
						ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI310);
					});
				}

			});
		}

//      REGISTROI500
		if (!Util.isEmpty(blocoI.getRegistroI500())) {
			GerarRegistroI500.gerar(blocoI.getRegistroI500(), sb);
			ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI500);
		}

		// REGISTROI550
		if (!Util.isEmpty(blocoI.getRegistroI550())) {
			blocoI.getRegistroI550().forEach(registroI550 -> {
				GerarRegistroI550.gerar(registroI550, sb);
				ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI550);

				// REGISTROI555
				if (!Util.isEmpty(registroI550.getRegistroI555())) {
					registroI550.getRegistroI555().forEach(registroI555 -> {
						GerarRegistroI555.gerar(registroI555, sb);
						ecdContabil.getContadoresBlocoI().incrementar(BlocoIEnum.RegistroI555);
					});
				}

			});
		}

// 		REGISTROI990
		if (ecdContabil.getContadoresBlocoI().getContRegistroI990() > 0) {
			RegistroI990 registroI990 = new RegistroI990();
			registroI990.setQtd_lin_i(String.valueOf(ecdContabil.getContadoresBlocoI().getContRegistroI990() + 1));

			blocoI.setRegistroI990(registroI990);
			GerarRegistroI990.gerar(blocoI.getRegistroI990(), sb);
		}

		return sb;
	}
}
