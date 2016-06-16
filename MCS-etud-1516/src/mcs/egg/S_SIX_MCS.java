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
public class S_SIX_MCS {
LEX_MCS scanner;
  S_SIX_MCS() {
    }
  S_SIX_MCS(LEX_MCS scanner, boolean eval) {
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
  LEX_MCS att_scanner;
  private void regle33() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_BLOC_MCS x_4 = new S_BLOC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_33(x_4);
    x_2.analyser(LEX_MCS.token_sinon);
if  (att_eval)      action_dep_33(x_4);
    x_4.analyser() ;
if  (att_eval)      action_gen_33(x_4);
  }
  private void regle34() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_34();
  }
private void action_auto_inh_33(S_BLOC_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_htype=this.att_htype;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","SIX -> sinon #dep BLOC #gen ;"});
}
  }
private void action_gen_34() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","SIX -> #gen ;"});
}
  }
private void action_dep_33(S_BLOC_MCS x_4) throws Exception {
try {
// instructions
x_4.att_hbloc_est_fonction=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#dep","SIX -> sinon #dep BLOC #gen ;"});
}
  }
private void action_gen_33(S_BLOC_MCS x_4) throws Exception {
try {
// instructions
this.att_code=x_4.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","SIX -> sinon #dep BLOC #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_sinon : // 859
        regle33 () ;
      break ;
      case LEX_MCS.token_void : // 860
        regle34 () ;
      break ;
      case LEX_MCS.token_int : // 862
        regle34 () ;
      break ;
      case LEX_MCS.token_char : // 863
        regle34 () ;
      break ;
      case LEX_MCS.token_identc : // 902
        regle34 () ;
      break ;
      case LEX_MCS.token_struct : // 864
        regle34 () ;
      break ;
      case LEX_MCS.token_bool : // 874
        regle34 () ;
      break ;
      case LEX_MCS.token_do : // 846
        regle34 () ;
      break ;
      case LEX_MCS.token_entier : // 898
        regle34 () ;
      break ;
      case LEX_MCS.token_chaine : // 900
        regle34 () ;
      break ;
      case LEX_MCS.token_caractere : // 899
        regle34 () ;
      break ;
      case LEX_MCS.token_plus : // 890
        regle34 () ;
      break ;
      case LEX_MCS.token_moins : // 891
        regle34 () ;
      break ;
      case LEX_MCS.token_non : // 897
        regle34 () ;
      break ;
      case LEX_MCS.token_null : // 883
        regle34 () ;
      break ;
      case LEX_MCS.token_paro : // 850
        regle34 () ;
      break ;
      case LEX_MCS.token_malloc : // 845
        regle34 () ;
      break ;
      case LEX_MCS.token_mult : // 893
        regle34 () ;
      break ;
      case LEX_MCS.token_ident : // 901
        regle34 () ;
      break ;
      case LEX_MCS.token_true : // 875
        regle34 () ;
      break ;
      case LEX_MCS.token_false : // 876
        regle34 () ;
      break ;
      case LEX_MCS.token_this : // 877
        regle34 () ;
      break ;
      case LEX_MCS.token_base : // 880
        regle34 () ;
      break ;
      case LEX_MCS.token_null2 : // 879
        regle34 () ;
      break ;
      case LEX_MCS.token_new : // 878
        regle34 () ;
      break ;
      case LEX_MCS.token_aco : // 852
        regle34 () ;
      break ;
      case LEX_MCS.token_si : // 858
        regle34 () ;
      break ;
      case LEX_MCS.token_retour : // 881
        regle34 () ;
      break ;
      case LEX_MCS.token_asm : // 861
        regle34 () ;
      break ;
      case LEX_MCS.token_acf : // 853
        regle34 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
