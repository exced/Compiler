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
  private void regle31() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_BLOC_MCS x_4 = new S_BLOC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_31(x_4);
    x_2.analyser(LEX_MCS.token_sinon);
if  (att_eval)      action_dep_31(x_4);
    x_4.analyser() ;
if  (att_eval)      action_gen_31(x_4);
  }
  private void regle32() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_32();
  }
private void action_auto_inh_31(S_BLOC_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_htype=this.att_htype;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","SIX -> sinon #dep BLOC #gen ;"});
}
  }
private void action_dep_31(S_BLOC_MCS x_4) throws Exception {
try {
// instructions
x_4.att_hbloc_est_fonction=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#dep","SIX -> sinon #dep BLOC #gen ;"});
}
  }
private void action_gen_31(S_BLOC_MCS x_4) throws Exception {
try {
// instructions
this.att_code=x_4.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","SIX -> sinon #dep BLOC #gen ;"});
}
  }
private void action_gen_32() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","SIX -> #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_sinon : // 28395
        regle31 () ;
      break ;
      case LEX_MCS.token_void : // 28396
        regle32 () ;
      break ;
      case LEX_MCS.token_int : // 28398
        regle32 () ;
      break ;
      case LEX_MCS.token_char : // 28399
        regle32 () ;
      break ;
      case LEX_MCS.token_identc : // 28438
        regle32 () ;
      break ;
      case LEX_MCS.token_struct : // 28400
        regle32 () ;
      break ;
      case LEX_MCS.token_bool : // 28410
        regle32 () ;
      break ;
      case LEX_MCS.token_entier : // 28434
        regle32 () ;
      break ;
      case LEX_MCS.token_chaine : // 28436
        regle32 () ;
      break ;
      case LEX_MCS.token_caractere : // 28435
        regle32 () ;
      break ;
      case LEX_MCS.token_plus : // 28426
        regle32 () ;
      break ;
      case LEX_MCS.token_moins : // 28427
        regle32 () ;
      break ;
      case LEX_MCS.token_non : // 28433
        regle32 () ;
      break ;
      case LEX_MCS.token_null : // 28419
        regle32 () ;
      break ;
      case LEX_MCS.token_paro : // 28386
        regle32 () ;
      break ;
      case LEX_MCS.token_malloc : // 28383
        regle32 () ;
      break ;
      case LEX_MCS.token_mult : // 28429
        regle32 () ;
      break ;
      case LEX_MCS.token_ident : // 28437
        regle32 () ;
      break ;
      case LEX_MCS.token_true : // 28411
        regle32 () ;
      break ;
      case LEX_MCS.token_false : // 28412
        regle32 () ;
      break ;
      case LEX_MCS.token_this : // 28413
        regle32 () ;
      break ;
      case LEX_MCS.token_null2 : // 28415
        regle32 () ;
      break ;
      case LEX_MCS.token_new : // 28414
        regle32 () ;
      break ;
      case LEX_MCS.token_aco : // 28388
        regle32 () ;
      break ;
      case LEX_MCS.token_si : // 28394
        regle32 () ;
      break ;
      case LEX_MCS.token_retour : // 28417
        regle32 () ;
      break ;
      case LEX_MCS.token_asm : // 28397
        regle32 () ;
      break ;
      case LEX_MCS.token_acf : // 28389
        regle32 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
