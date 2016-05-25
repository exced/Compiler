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
this.att_machine.addRegisterDep(this.att_machine.getLB(), this.att_machine.getCurrentDep());
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
      case LEX_MCS.token_sinon : // 26675
        regle31 () ;
      break ;
      case LEX_MCS.token_void : // 26676
        regle32 () ;
      break ;
      case LEX_MCS.token_int : // 26678
        regle32 () ;
      break ;
      case LEX_MCS.token_char : // 26679
        regle32 () ;
      break ;
      case LEX_MCS.token_identc : // 26718
        regle32 () ;
      break ;
      case LEX_MCS.token_struct : // 26680
        regle32 () ;
      break ;
      case LEX_MCS.token_entier : // 26714
        regle32 () ;
      break ;
      case LEX_MCS.token_chaine : // 26716
        regle32 () ;
      break ;
      case LEX_MCS.token_caractere : // 26715
        regle32 () ;
      break ;
      case LEX_MCS.token_plus : // 26706
        regle32 () ;
      break ;
      case LEX_MCS.token_moins : // 26707
        regle32 () ;
      break ;
      case LEX_MCS.token_non : // 26713
        regle32 () ;
      break ;
      case LEX_MCS.token_null : // 26699
        regle32 () ;
      break ;
      case LEX_MCS.token_paro : // 26666
        regle32 () ;
      break ;
      case LEX_MCS.token_mult : // 26709
        regle32 () ;
      break ;
      case LEX_MCS.token_ident : // 26717
        regle32 () ;
      break ;
      case LEX_MCS.token_aco : // 26668
        regle32 () ;
      break ;
      case LEX_MCS.token_si : // 26674
        regle32 () ;
      break ;
      case LEX_MCS.token_retour : // 26697
        regle32 () ;
      break ;
      case LEX_MCS.token_asm : // 26677
        regle32 () ;
      break ;
      case LEX_MCS.token_acf : // 26669
        regle32 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
