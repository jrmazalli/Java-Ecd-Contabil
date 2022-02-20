package br.com.ecoded.ecd.contabil.bo.blocoK;

import br.com.ecoded.ecd.contabil.registros.EcdContabil;
import br.com.ecoded.ecd.contabil.registros.bloco9.Bloco9;
import br.com.ecoded.ecd.contabil.registros.bloco9.Registro9900;
import br.com.ecoded.ecd.contabil.registros.blocoK.BlocoK;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarContadoresBlocoK {

    public static EcdContabil gerar(EcdContabil ecdContabil) {

        BlocoK blocoK = ecdContabil.getBlocoK();
        Bloco9 bloco9 = ecdContabil.getBloco9();

        int cont;
        cont = ecdContabil.getContadoresBlocoK().getContRegistroK001();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("K001", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoK().getContRegistroK030();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("K030", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoK().getContRegistroK100();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("K100", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoK().getContRegistroK110();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("K110", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoK().getContRegistroK115();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("K115", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoK().getContRegistroK200();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("K200", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoK().getContRegistroK210();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("K210", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoK().getContRegistroK300();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("K300", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoK().getContRegistroK310();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("K310", cont));
        }
        
        cont = ecdContabil.getContadoresBlocoK().getContRegistroK315();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("K315", cont));
        }

        // Qnt Registros RegistroK990
        if (!Util.isEmpty(blocoK.getRegistroK990())) {
            bloco9.getRegistro9900().add(New9900("K990", 1));
        }

        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
                + Integer.valueOf(blocoK.getRegistroK990().getQtd_lin_k());
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
