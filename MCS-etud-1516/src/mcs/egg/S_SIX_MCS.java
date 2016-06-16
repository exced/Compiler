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
      case LEX_MCS.token_sinon : // 8162
        regle33 () ;
      break ;
      case LEX_MCS.token_void : // 8163
        regle34 () ;
      break ;
      case LEX_MCS.token_int : // 8165
        regle34 () ;
      break ;
      case LEX_MCS.token_char : // 8166
        regle34 () ;
      break ;
      case LEX_MCS.token_identc : // 8205
        regle34 () ;
      break ;
      case LEX_MCS.token_struct : // 8167
        regle34 () ;
      break ;
      case LEX_MCS.token_bool : // 8177
        regle34 () ;
      break ;
      case LEX_MCS.token_do : // 8149
        regle34 () ;
      break ;
      case LEX_MCS.token_entier : // 8201
        regle34 () ;
      break ;
      case LEX_MCS.token_chaine : // 8203
        regle34 () ;
      break ;
      case LEX_MCS.token_caractere : // 8202
        regle34 () ;
      break ;
      case LEX_MCS.token_plus : // 8193
        regle34 () ;
      break ;
      case LEX_MCS.token_moins : // 8194
        regle34 () ;
      break ;
      case LEX_MCS.token_non : // 8200
        regle34 () ;
      break ;
      case LEX_MCS.token_null : // 8186
        regle34 () ;
      break ;
      case LEX_MCS.token_paro : // 8153
        regle34 () ;
      break ;
      case LEX_MCS.token_malloc : // 8148
        regle34 () ;
      break ;
      case LEX_MCS.token_mult : // 8196
        regle34 () ;
      break ;
      case LEX_MCS.token_ident : // 8204
        regle34 () ;
      break ;
      case LEX_MCS.token_true : // 8178
        regle34 () ;
      break ;
      case LEX_MCS.token_false : // 8179
        regle34 () ;
      break ;
      case LEX_MCS.token_this : // 8180
        regle34 () ;
      break ;
      case LEX_MCS.token_base : // 8183
        regle34 () ;
      break ;
      case LEX_MCS.token_null2 : // 8182
        regle34 () ;
      break ;
      case LEX_MCS.token_new : // 8181
        regle34 () ;
      break ;
      case LEX_MCS.token_aco : // 8155
        regle34 () ;
      break ;
      case LEX_MCS.token_si : // 8161
        regle34 () ;
      break ;
      case LEX_MCS.token_retour : // 8184
        regle34 () ;
      break ;
      case LEX_MCS.token_asm : // 8164
        regle34 () ;
      break ;
      case LEX_MCS.token_acf : // 8156
        regle34 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
