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
  String att_identClasse;
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
x_4.att_identClasse=this.att_identClasse;
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
      case LEX_MCS.token_sinon : // 54027
        regle33 () ;
      break ;
      case LEX_MCS.token_void : // 54028
        regle34 () ;
      break ;
      case LEX_MCS.token_int : // 54030
        regle34 () ;
      break ;
      case LEX_MCS.token_char : // 54031
        regle34 () ;
      break ;
      case LEX_MCS.token_identc : // 54070
        regle34 () ;
      break ;
      case LEX_MCS.token_struct : // 54032
        regle34 () ;
      break ;
      case LEX_MCS.token_bool : // 54042
        regle34 () ;
      break ;
      case LEX_MCS.token_do : // 54014
        regle34 () ;
      break ;
      case LEX_MCS.token_entier : // 54066
        regle34 () ;
      break ;
      case LEX_MCS.token_chaine : // 54068
        regle34 () ;
      break ;
      case LEX_MCS.token_caractere : // 54067
        regle34 () ;
      break ;
      case LEX_MCS.token_plus : // 54058
        regle34 () ;
      break ;
      case LEX_MCS.token_moins : // 54059
        regle34 () ;
      break ;
      case LEX_MCS.token_non : // 54065
        regle34 () ;
      break ;
      case LEX_MCS.token_null : // 54051
        regle34 () ;
      break ;
      case LEX_MCS.token_paro : // 54018
        regle34 () ;
      break ;
      case LEX_MCS.token_malloc : // 54013
        regle34 () ;
      break ;
      case LEX_MCS.token_mult : // 54061
        regle34 () ;
      break ;
      case LEX_MCS.token_ident : // 54069
        regle34 () ;
      break ;
      case LEX_MCS.token_true : // 54043
        regle34 () ;
      break ;
      case LEX_MCS.token_false : // 54044
        regle34 () ;
      break ;
      case LEX_MCS.token_this : // 54045
        regle34 () ;
      break ;
      case LEX_MCS.token_base : // 54048
        regle34 () ;
      break ;
      case LEX_MCS.token_null2 : // 54047
        regle34 () ;
      break ;
      case LEX_MCS.token_new : // 54046
        regle34 () ;
      break ;
      case LEX_MCS.token_aco : // 54020
        regle34 () ;
      break ;
      case LEX_MCS.token_si : // 54026
        regle34 () ;
      break ;
      case LEX_MCS.token_retour : // 54049
        regle34 () ;
      break ;
      case LEX_MCS.token_asm : // 54029
        regle34 () ;
      break ;
      case LEX_MCS.token_acf : // 54021
        regle34 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
