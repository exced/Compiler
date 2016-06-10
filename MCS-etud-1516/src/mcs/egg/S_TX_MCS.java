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
  boolean att_hest_decl;
  LEX_MCS att_scanner;
  boolean att_code_est_adresse;
  DTYPE att_type;
  boolean att_hcode_est_adresse;
  private void regle54() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_type_54();
  }
  private void regle53() throws Exception {

    //declaration
    S_OPMUL_MCS x_2 = new S_OPMUL_MCS(scanner,att_eval) ;
    S_F_MCS x_3 = new S_F_MCS(scanner,att_eval) ;
    S_TX_MCS x_4 = new S_TX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_53(x_2, x_3, x_4);
    x_2.analyser() ;
    x_3.analyser() ;
    x_4.analyser() ;
if  (att_eval)      action_type_53(x_2, x_3, x_4);
if  (att_eval)      action_gen_53(x_2, x_3, x_4);
  }
private void action_auto_inh_53(S_OPMUL_MCS x_2, S_F_MCS x_3, S_TX_MCS x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_4.att_htype=this.att_htype;
x_3.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
x_3.att_hest_decl=this.att_hest_decl;
x_4.att_hest_decl=this.att_hest_decl;
x_3.att_hcode_est_adresse=this.att_hcode_est_adresse;
x_4.att_hcode_est_adresse=this.att_hcode_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","TX -> OPMUL F TX1 #type #gen ;"});
}
  }
private void action_type_54() throws Exception {
try {
// instructions
this.att_type=this.att_htype;
this.att_code="";
this.att_code_est_adresse=this.att_hcode_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","TX -> #type ;"});
}
  }
private void action_type_53(S_OPMUL_MCS x_2, S_F_MCS x_3, S_TX_MCS x_4) throws Exception {
try {
// instructions
if (!(this.att_htype.compareOpBin(x_2.att_type, x_3.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_typeError_opBin, MCSMessages.typeError_opBin,new Object[]{""+this.att_htype.getNom(), ""+x_2.att_type, ""+x_3.att_type});

}
else if (!(this.att_htype.compareOpBin(x_2.att_type, x_4.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_typeError_opBin, MCSMessages.typeError_opBin,new Object[]{""+this.att_htype.getNom(), ""+x_2.att_type, ""+x_4.att_type});

}
else {
this.att_type=x_3.att_type;
}
this.att_code_est_adresse=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","TX -> OPMUL F TX1 #type #gen ;"});
}
  }
private void action_gen_53(S_OPMUL_MCS x_2, S_F_MCS x_3, S_TX_MCS x_4) throws Exception {
try {
// instructions
this.att_code=x_3.att_code+x_4.att_code+x_2.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","TX -> OPMUL F TX1 #type #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 40883
        regle53 () ;
      break ;
      case LEX_MCS.token_div : // 40884
        regle53 () ;
      break ;
      case LEX_MCS.token_mod : // 40885
        regle53 () ;
      break ;
      case LEX_MCS.token_et : // 40886
        regle53 () ;
      break ;
      case LEX_MCS.token_plus : // 40880
        regle54 () ;
      break ;
      case LEX_MCS.token_moins : // 40881
        regle54 () ;
      break ;
      case LEX_MCS.token_ou : // 40882
        regle54 () ;
      break ;
      case LEX_MCS.token_inf : // 40874
        regle54 () ;
      break ;
      case LEX_MCS.token_sup : // 40876
        regle54 () ;
      break ;
      case LEX_MCS.token_infeg : // 40875
        regle54 () ;
      break ;
      case LEX_MCS.token_supeg : // 40877
        regle54 () ;
      break ;
      case LEX_MCS.token_eg : // 40878
        regle54 () ;
      break ;
      case LEX_MCS.token_neg : // 40879
        regle54 () ;
      break ;
      case LEX_MCS.token_affect : // 40847
        regle54 () ;
      break ;
      case LEX_MCS.token_virg : // 40844
        regle54 () ;
      break ;
      case LEX_MCS.token_pv : // 40846
        regle54 () ;
      break ;
      case LEX_MCS.token_parf : // 40841
        regle54 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
