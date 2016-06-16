package mcs.egg;
import mcs.compiler.*;
import mcs.tds.*;
import mcs.type.*;
import mcs.gc.*;
import java.util.*;
import mg.egg.eggc.runtime.libjava.lex.*;
import mg.egg.eggc.runtime.libjava.*;
import mg.egg.eggc.runtime.libjava.messages.*;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import java.util.Vector;
public class S_TX_MCS {
LEX_MCS scanner;
  S_TX_MCS() {
    }
  S_TX_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  DTYPE att_htype;
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  String att_hmode;
  LEX_MCS att_scanner;
  boolean att_estConditionnelle;
  String att_identClasse;
  boolean att_code_est_adresse;
  DTYPE att_type;
  boolean att_hcode_est_adresse;
  private void regle56() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_type_56();
  }
  private void regle55() throws Exception {

    //declaration
    S_OPMUL_MCS x_3 = new S_OPMUL_MCS(scanner,att_eval) ;
    S_F_MCS x_4 = new S_F_MCS(scanner,att_eval) ;
    S_TX_MCS x_5 = new S_TX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_55(x_3, x_4, x_5);
if  (att_eval)      action_mode_55(x_3, x_4, x_5);
    x_3.analyser() ;
    x_4.analyser() ;
    x_5.analyser() ;
if  (att_eval)      action_type_55(x_3, x_4, x_5);
if  (att_eval)      action_gen_55(x_3, x_4, x_5);
  }
private void action_type_56() throws Exception {
try {
// instructions
this.att_type=this.att_htype;
this.att_code="";
this.att_code_est_adresse=this.att_hcode_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","TX -> #type ;"});
}
  }
private void action_type_55(S_OPMUL_MCS x_3, S_F_MCS x_4, S_TX_MCS x_5) throws Exception {
try {
// instructions
if (!(this.att_htype.compareOpBin(x_3.att_type, x_4.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_typeError_opBin, MCSMessages.typeError_opBin,new Object[]{""+this.att_htype.getNom(), ""+x_3.att_type, ""+x_4.att_type});

}
else if (!(this.att_htype.compareOpBin(x_3.att_type, x_5.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_typeError_opBin, MCSMessages.typeError_opBin,new Object[]{""+this.att_htype.getNom(), ""+x_3.att_type, ""+x_5.att_type});

}
else {
this.att_type=x_4.att_type;
}
this.att_code_est_adresse=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","TX -> #mode OPMUL F TX1 #type #gen ;"});
}
  }
private void action_auto_inh_55(S_OPMUL_MCS x_3, S_F_MCS x_4, S_TX_MCS x_5) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_4.att_hmode=this.att_hmode;
x_5.att_hmode=this.att_hmode;
x_4.att_estConditionnelle=this.att_estConditionnelle;
x_5.att_estConditionnelle=this.att_estConditionnelle;
x_4.att_identClasse=this.att_identClasse;
x_5.att_identClasse=this.att_identClasse;
x_5.att_htype=this.att_htype;
x_4.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
x_4.att_hcode_est_adresse=this.att_hcode_est_adresse;
x_5.att_hcode_est_adresse=this.att_hcode_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","TX -> #mode OPMUL F TX1 #type #gen ;"});
}
  }
private void action_gen_55(S_OPMUL_MCS x_3, S_F_MCS x_4, S_TX_MCS x_5) throws Exception {
try {
// instructions
this.att_code=x_4.att_code+x_5.att_code+x_3.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","TX -> #mode OPMUL F TX1 #type #gen ;"});
}
  }
private void action_mode_55(S_OPMUL_MCS x_3, S_F_MCS x_4, S_TX_MCS x_5) throws Exception {
try {
// instructions
if (!(this.att_estConditionnelle)){
if (this.att_machine.stringEquals("gauche", this.att_hmode)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_Expr_not_aff, MCSMessages.Expr_not_aff,new Object[]{""+"OPMUL", ""+this.att_hmode});

}

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#mode","TX -> #mode OPMUL F TX1 #type #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 54061
        regle55 () ;
      break ;
      case LEX_MCS.token_div : // 54062
        regle55 () ;
      break ;
      case LEX_MCS.token_mod : // 54063
        regle55 () ;
      break ;
      case LEX_MCS.token_et : // 54064
        regle55 () ;
      break ;
      case LEX_MCS.token_plus : // 54058
        regle56 () ;
      break ;
      case LEX_MCS.token_moins : // 54059
        regle56 () ;
      break ;
      case LEX_MCS.token_ou : // 54060
        regle56 () ;
      break ;
      case LEX_MCS.token_inf : // 54052
        regle56 () ;
      break ;
      case LEX_MCS.token_sup : // 54054
        regle56 () ;
      break ;
      case LEX_MCS.token_infeg : // 54053
        regle56 () ;
      break ;
      case LEX_MCS.token_supeg : // 54055
        regle56 () ;
      break ;
      case LEX_MCS.token_eg : // 54056
        regle56 () ;
      break ;
      case LEX_MCS.token_neg : // 54057
        regle56 () ;
      break ;
      case LEX_MCS.token_affect : // 54025
        regle56 () ;
      break ;
      case LEX_MCS.token_virg : // 54022
        regle56 () ;
      break ;
      case LEX_MCS.token_parf : // 54019
        regle56 () ;
      break ;
      case LEX_MCS.token_pv : // 54024
        regle56 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
