package br.com.ecoded.ecd.contabil.bo.blocoJ;

import br.com.ecoded.ecd.contabil.registros.EcdContabil;
import br.com.ecoded.ecd.contabil.registros.bloco9.Bloco9;
import br.com.ecoded.ecd.contabil.registros.bloco9.Registro9900;
import br.com.ecoded.ecd.contabil.registros.blocoJ.BlocoJ;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarContadoresBlocoJ {

    public static EcdContabil gerar(EcdContabil ecdContabil) {

        BlocoJ blocoJ = ecdContabil.getBlocoJ();
        Bloco9 bloco9 = ecdContabil.getBloco9();

        int cont;
        cont = ecdContabil.getContadoresBlocoJ().getContRegistroJ001();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("J001", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoJ().getContRegistroJ005();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("J005", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoJ().getContRegistroJ100();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("J100", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoJ().getContRegistroJ150();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("J150", cont));
        }
        
       cont = ecdContabil.getContadoresBlocoJ().getContRegistroJ210();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("J210", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoJ().getContRegistroJ215();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("J215", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoJ().getContRegistroJ800();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("J800", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoJ().getContRegistroJ801();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("J801", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoJ().getContRegistroJ900();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("J900", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoJ().getContRegistroJ930();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("J930", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoJ().getContRegistroJ932();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("J932", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoJ().getContRegistroJ935();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("J935", cont));
        }
        
        // Qnt Registros RegistroK990
        if (!Util.isEmpty(blocoJ.getRegistroJ990())) {
            bloco9.getRegistro9900().add(New9900("J990", 1));
        }

        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
                + Integer.valueOf(blocoJ.getRegistroJ990().getQtd_lin_j());
        bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

        ecdContabil.setBloco9(bloco9);

        return ecdContabil;
    }

    private static Registro9900 New9900(String Reg_blc, int Qtd_reg_blc) {
        Registro9900 vRet = new Registro9900();
        vRet.setReg_blc(Reg_blc);
        vRet.setQtd_reg_blc(String.valueOf(Qtd_reg_blc));
        return vRet;
    }
}
