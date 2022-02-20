package br.com.ecoded.ecd.contabil.bo.blocoJ;

import br.com.ecoded.ecd.contabil.registros.EcdContabil;
import br.com.ecoded.ecd.contabil.registros.blocoJ.BlocoJ;
import br.com.ecoded.ecd.contabil.registros.blocoJ.BlocoJEnum;
import br.com.ecoded.ecd.contabil.registros.blocoJ.RegistroJ990;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarBlocoJ {

	private static StringBuilder sb = null;

	public static StringBuilder gerar(EcdContabil ecdcontabil, StringBuilder sbr) {
		BlocoJ blocoJ = ecdcontabil.getBlocoJ();
		sb = sbr;

		// REGISTROJ001
		if (!Util.isEmpty(blocoJ.getRegistroJ001())) {
			GerarRegistroJ001.gerar(blocoJ.getRegistroJ001(), sb);
			ecdcontabil.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ001);
		}

		// REGISTROJ005
		if (!Util.isEmpty(blocoJ.getRegistroJ005())) {
			GerarRegistroJ005.gerar(blocoJ.getRegistroJ005(), sb);
			ecdcontabil.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ005);

			// REGISTROJ100
			if (!Util.isEmpty(blocoJ.getRegistroJ005().getRegistroJ100())) {
				blocoJ.getRegistroJ005().getRegistroJ100().forEach(registroJ100 -> {
					GerarRegistroJ100.gerar(registroJ100, sb);
					ecdcontabil.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ100);
				});
			}

			// REGISTROJ150
			if (!Util.isEmpty(blocoJ.getRegistroJ005().getRegistroJ150())) {
				blocoJ.getRegistroJ005().getRegistroJ150().forEach(registroJ150 -> {
					GerarRegistroJ150.gerar(registroJ150, sb);
					ecdcontabil.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ150);
				});
			}

		}

		// REGISTROI210
		if (!Util.isEmpty(blocoJ.getRegistroJ210())) {
			blocoJ.getRegistroJ210().forEach(registroJ210 -> {
				GerarRegistroJ210.gerar(registroJ210, sb);
				ecdcontabil.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ210);

				// REGISTROI215
				if (!Util.isEmpty(registroJ210.getRegistroJ215())) {
					registroJ210.getRegistroJ215().forEach(registroJ215 -> {
						GerarRegistroJ215.gerar(registroJ215, sb);
						ecdcontabil.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ215);
					});
				}

			});
		}

		// REGISTROI800
		if (!Util.isEmpty(blocoJ.getRegistroJ800())) {
			blocoJ.getRegistroJ800().forEach(registroJ800 -> {
				GerarRegistroJ800.gerar(registroJ800, sb);
				ecdcontabil.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ800);
			});
		}

		// REGISTROI801
		if (!Util.isEmpty(blocoJ.getRegistroJ801())) {
			blocoJ.getRegistroJ801().forEach(registroJ801 -> {
				GerarRegistroJ801.gerar(registroJ801, sb);
				ecdcontabil.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ801);
			});
		}

		// REGISTROI210
		if (!Util.isEmpty(blocoJ.getRegistroJ210())) {
			blocoJ.getRegistroJ210().forEach(registroJ210 -> {
				GerarRegistroJ210.gerar(registroJ210, sb);
				ecdcontabil.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ210);

				// REGISTROI215
				if (!Util.isEmpty(registroJ210.getRegistroJ215())) {
					registroJ210.getRegistroJ215().forEach(registroJ215 -> {
						GerarRegistroJ215.gerar(registroJ215, sb);
						ecdcontabil.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ215);
					});
				}

			});
		}

		// REGISTROJ005

		// REGISTROJ100
//			if (!Util.isEmpty(blocoJ.getRegistroJ005().getRegistroJ100())) {
//				blocoJ.getRegistroJ005().getRegistroJ100().forEach(registroJ100 -> {
//					GerarRegistroJ100.gerar(registroJ100, sb);
//					ecdcontabil.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ100);
//				});
//			}

		// REGISTROJ900
		if (!Util.isEmpty(blocoJ.getRegistroJ900())) {
			GerarRegistroJ900.gerar(blocoJ.getRegistroJ900(), sb);
			ecdcontabil.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ900);

			// REGISTROJ930
			if (!Util.isEmpty(blocoJ.getRegistroJ900().getRegistroJ930())) {
				blocoJ.getRegistroJ900().getRegistroJ930().forEach(registroJ930 -> {
					GerarRegistroJ930.gerar(registroJ930, sb);
					ecdcontabil.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ930);
				});
			}

			// REGISTROJ932
			if (!Util.isEmpty(blocoJ.getRegistroJ900().getRegistroJ932())) {
				blocoJ.getRegistroJ900().getRegistroJ932().forEach(registroJ932 -> {
					GerarRegistroJ932.gerar(registroJ932, sb);
					ecdcontabil.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ932);
				});
			}

			// REGISTROJ935
			if (!Util.isEmpty(blocoJ.getRegistroJ900().getRegistroJ935())) {
				blocoJ.getRegistroJ900().getRegistroJ935().forEach(registroJ935 -> {
					GerarRegistroJ935.gerar(registroJ935, sb);
					ecdcontabil.getContadoresBlocoJ().incrementar(BlocoJEnum.RegistroJ935);
				});
			}

		}

		// REGISTROJ990
		if (ecdcontabil.getContadoresBlocoJ().getContRegistroJ990() > 0) {
			RegistroJ990 registroJ990 = new RegistroJ990();
			registroJ990.setQtd_lin_j(String.valueOf(ecdcontabil.getContadoresBlocoJ().getContRegistroJ990() + 1));

			blocoJ.setRegistroJ990(registroJ990);
			GerarRegistroJ990.gerar(blocoJ.getRegistroJ990(), sb);
		}

		return sb;
	}
}
