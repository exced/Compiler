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
public class S_ACCES_MCS {
LEX_MCS scanner;
  S_ACCES_MCS() {
    }
  S_ACCES_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  LEX_MCS att_scanner;
  String att_acces;
  private void regle88() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_public);
if  (att_eval)      action_acces_88();
  }
  private void regle89() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_private);
if  (att_eval)      action_acces_89();
  }
  private void regle90() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_acces_90();
  }
private void action_acces_90() throws Exception {
try {
// instructions
this.att_acces="private";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#acces","ACCES -> #acces ;"});
}
  }
private void action_acces_89() throws Exception {
try {
// instructions
this.att_acces="private";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#acces","ACCES -> private #acces ;"});
}
  }
private void action_acces_88() throws Exception {
try {
// instructions
this.att_acces="public";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#acces","ACCES -> public #acces ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_public : // 841
        regle88 () ;
      break ;
      case LEX_MCS.token_private : // 842
        regle89 () ;
      break ;
      case LEX_MCS.token_class : // 840
        regle90 () ;
      break ;
      case LEX_MCS.token_void : // 830
        regle90 () ;
      break ;
      case LEX_MCS.token_int : // 832
        regle90 () ;
      break ;
      case LEX_MCS.token_char : // 833
        regle90 () ;
      break ;
      case LEX_MCS.token_identc : // 872
        regle90 () ;
      break ;
      case LEX_MCS.token_struct : // 834
        regle90 () ;
      break ;
      case LEX_MCS.token_bool : // 844
        regle90 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
