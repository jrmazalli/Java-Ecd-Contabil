package br.com.ecoded.ecd.contabil.bo.blocoI;

import br.com.ecoded.ecd.contabil.registros.EcdContabil;
import br.com.ecoded.ecd.contabil.registros.bloco9.Bloco9;
import br.com.ecoded.ecd.contabil.registros.bloco9.Registro9900;
import br.com.ecoded.ecd.contabil.registros.blocoI.BlocoI;
import br.com.ecoded.ecd.contabil.util.Util;

public class GerarContadoresBlocoI {

    public static EcdContabil gerar(EcdContabil ecdcontabil) {

        BlocoI blocoI = ecdcontabil.getBlocoI();
        Bloco9 bloco9 = ecdcontabil.getBloco9();

        int cont;
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI001();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I001", cont));
        }
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI010();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I010", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI012();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I012", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI015();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I015", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI020();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I020", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI030();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I030", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI050();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I050", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI051();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I051", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI052();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I052", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI053();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I053", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI075();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I075", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI100();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I100", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI150();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I150", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI155();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I155", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI157();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I157", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI200();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I200", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI250();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I250", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI300();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I300", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI310();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I310", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI350();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I350", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI355();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I355", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI500();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I500", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI510();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I510", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI550();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I550", cont));
        }
        
        cont = ecdcontabil.getContadoresBlocoI().getContRegistroI555();
        if (cont > 0) {
            bloco9.getRegistro9900().add(New9900("I555", cont));
        }

        // Qnt Registros RegistroI990
        if (!Util.isEmpty(blocoI.getRegistroI990())) {
            bloco9.getRegistro9900().add(New9900("I990", 1));
        }

        int somatorio = Integer.valueOf(bloco9.getRegistro9999().getQtd_lin())
                + Integer.valueOf(blocoI.getRegistroI990().getQtd_lin_i());
        bloco9.getRegistro9999().setQtd_lin(String.valueOf(somatorio));

        ecdcontabil.setBloco9(bloco9);

        return ecdcontabil;
    }

    private static Registro9900 New9900(String Reg_blc, int Qtd_reg_blc) {
        Registro9900 vRet = new Registro9900();
        vRet.setReg_blc(Reg_blc);
        vRet.setQtd_reg_blc(String.valueOf(Qtd_reg_blc));
        return vRet;
    }
}
