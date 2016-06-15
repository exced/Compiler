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
public class S_ENTITES_MCS {
LEX_MCS scanner;
  S_ENTITES_MCS() {
    }
  S_ENTITES_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  TDS att_stds;
  LEX_MCS att_scanner;
  private void regle2() throws Exception {

    //declaration
    S_ENTITE_MCS x_3 = new S_ENTITE_MCS(scanner,att_eval) ;
    S_ENTITES_MCS x_4 = new S_ENTITES_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_2(x_3, x_4);
if  (att_eval)      action_init_2(x_3, x_4);
    x_3.analyser() ;
    x_4.analyser() ;
if  (att_eval)      action_gen_2(x_3, x_4);
  }
  private void regle1() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_1();
  }
private void action_auto_inh_2(S_ENTITE_MCS x_3, S_ENTITES_MCS x_4) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITES -> #init ENTITE ENTITES1 #gen ;"});
}
  }
private void action_gen_2(S_ENTITE_MCS x_3, S_ENTITES_MCS x_4) throws Exception {
try {
// instructions
this.att_stds=x_4.att_stds;
this.att_code=x_3.att_code+x_4.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ENTITES -> #init ENTITE ENTITES1 #gen ;"});
}
  }
private void action_gen_1() throws Exception {
try {
// instructions
this.att_stds=this.att_tds;
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ENTITES -> #gen ;"});
}
  }
private void action_init_2(S_ENTITE_MCS x_3, S_ENTITES_MCS x_4) throws Exception {
try {
// instructions
this.att_machine.resetCurrentDep();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#init","ENTITES -> #init ENTITE ENTITES1 #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_acf : // 57416
        regle1 () ;
      break ;
      case LEX_MCS.EOF :
        regle1 () ;
      break ;
      case LEX_MCS.token_typedef : // 57428
        regle2 () ;
      break ;
      case LEX_MCS.token_void : // 57423
        regle2 () ;
      break ;
      case LEX_MCS.token_int : // 57425
        regle2 () ;
      break ;
      case LEX_MCS.token_char : // 57426
        regle2 () ;
      break ;
      case LEX_MCS.token_identc : // 57465
        regle2 () ;
      break ;
      case LEX_MCS.token_struct : // 57427
        regle2 () ;
      break ;
      case LEX_MCS.token_bool : // 57437
        regle2 () ;
      break ;
      case LEX_MCS.token_asm : // 57424
        regle2 () ;
      break ;
      case LEX_MCS.token_namespace : // 57431
        regle2 () ;
      break ;
      case LEX_MCS.token_using : // 57432
        regle2 () ;
      break ;
      case LEX_MCS.token_public : // 57434
        regle2 () ;
      break ;
      case LEX_MCS.token_private : // 57435
        regle2 () ;
      break ;
      case LEX_MCS.token_class : // 57433
        regle2 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
