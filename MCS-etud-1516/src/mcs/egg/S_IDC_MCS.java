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
public class S_IDC_MCS {
LEX_MCS scanner;
  S_IDC_MCS() {
    }
  S_IDC_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  String att_ident;
  LEX_MCS att_scanner;
  String att_sident;
  private void regle85() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_ident_85();
  }
  private void regle86() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_IDC_MCS x_5 = new S_IDC_MCS(scanner,att_eval) ;
    //appel
    x_2.analyser(LEX_MCS.token_pt);
    x_3.analyser(LEX_MCS.token_identc);
if  (att_eval)      action_hident_86(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_sident_86(x_3, x_5);
  }
private void action_hident_86(T_MCS x_3, S_IDC_MCS x_5) throws Exception {
try {
// instructions
x_5.att_ident=this.att_ident+"."+x_3.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hident","IDC -> pt identc #hident IDC1 #sident ;"});
}
  }
private void action_ident_85() throws Exception {
try {
// instructions
this.att_sident=this.att_ident;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#ident","IDC -> #ident ;"});
}
  }
private void action_sident_86(T_MCS x_3, S_IDC_MCS x_5) throws Exception {
try {
// instructions
this.att_sident=x_5.att_sident;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#sident","IDC -> pt identc #hident IDC1 #sident ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_pv : // 5483
        regle85 () ;
      break ;
      case LEX_MCS.token_aco : // 5479
        regle85 () ;
      break ;
      case LEX_MCS.token_pt : // 5482
        regle86 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
