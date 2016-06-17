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
public class S_AX_MCS {
LEX_MCS scanner;
  S_AX_MCS() {
    }
  S_AX_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  String att_code;
  String att_hmode;
  boolean att_code_est_adresse;
  DTYPE att_type;
  boolean att_estTestRel;
  DTYPE att_htype;
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  boolean att_estConditionnelle;
  String att_identClasse;
  boolean att_hcode_est_adresse;
  private void regle41() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_type_41();
if  (att_eval)      action_gen_41();
  }
  private void regle40() throws Exception {

    //declaration
    S_OPREL_MCS x_3 = new S_OPREL_MCS(scanner,att_eval) ;
    S_R_MCS x_4 = new S_R_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_40(x_3, x_4);
if  (att_eval)      action_mode_40(x_3, x_4);
    x_3.analyser() ;
    x_4.analyser() ;
if  (att_eval)      action_type_40(x_3, x_4);
if  (att_eval)      action_gen_40(x_3, x_4);
  }
private void action_auto_inh_40(S_OPREL_MCS x_3, S_R_MCS x_4) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_4.att_hmode=this.att_hmode;
x_4.att_estConditionnelle=this.att_estConditionnelle;
x_4.att_identClasse=this.att_identClasse;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","AX -> #mode OPREL R #type #gen ;"});
}
  }
private void action_type_41() throws Exception {
try {
// instructions
this.att_type=this.att_htype;
this.att_code_est_adresse=this.att_hcode_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","AX -> #type #gen ;"});
}
  }
private void action_type_40(S_OPREL_MCS x_3, S_R_MCS x_4) throws Exception {
try {
// instructions
if (!(this.att_htype.compareOpBin(x_3.att_type, x_4.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_typeError_opBin, MCSMessages.typeError_opBin,new Object[]{""+this.att_htype.getNom(), ""+x_3.att_type.getNom(), ""+x_4.att_type.getNom()});

}
else {
this.att_type= new DTYPEImpl("bool", 1);
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","AX -> #mode OPREL R #type #gen ;"});
}
  }
private void action_mode_40(S_OPREL_MCS x_3, S_R_MCS x_4) throws Exception {
try {
// instructions
if (!(this.att_estConditionnelle)){
if (this.att_machine.stringEquals("gauche", this.att_hmode)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_Expr_not_aff, MCSMessages.Expr_not_aff,new Object[]{""+"OPREL", ""+this.att_hmode});

}

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#mode","AX -> #mode OPREL R #type #gen ;"});
}
  }
private void action_gen_41() throws Exception {
try {
// instructions
this.att_code="";
this.att_estTestRel=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","AX -> #type #gen ;"});
}
  }
private void action_gen_40(S_OPREL_MCS x_3, S_R_MCS x_4) throws Exception {
try {
// instructions
this.att_code=x_4.att_code+x_3.att_code;
this.att_code_est_adresse=false;
this.att_estTestRel=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","AX -> #mode OPREL R #type #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_inf : // 39292
        regle40 () ;
      break ;
      case LEX_MCS.token_sup : // 39294
        regle40 () ;
      break ;
      case LEX_MCS.token_infeg : // 39293
        regle40 () ;
      break ;
      case LEX_MCS.token_supeg : // 39295
        regle40 () ;
      break ;
      case LEX_MCS.token_eg : // 39296
        regle40 () ;
      break ;
      case LEX_MCS.token_neg : // 39297
        regle40 () ;
      break ;
      case LEX_MCS.token_affect : // 39265
        regle41 () ;
      break ;
      case LEX_MCS.token_virg : // 39262
        regle41 () ;
      break ;
      case LEX_MCS.token_parf : // 39259
        regle41 () ;
      break ;
      case LEX_MCS.token_pv : // 39264
        regle41 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
