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
  IMachine att_machine;
  String att_ident;
  LEX_MCS att_scanner;
  String att_sident;
  private void regle87() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_ident_87();
  }
  private void regle88() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_IDC_MCS x_5 = new S_IDC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_88(x_3, x_5);
    x_2.analyser(LEX_MCS.token_pt);
    x_3.analyser(LEX_MCS.token_identc);
if  (att_eval)      action_hident_88(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_sident_88(x_3, x_5);
  }
private void action_hident_88(T_MCS x_3, S_IDC_MCS x_5) throws Exception {
try {
// instructions
x_5.att_ident=this.att_ident+"."+x_3.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hident","IDC -> pt identc #hident IDC1 #sident ;"});
}
  }
private void action_auto_inh_88(T_MCS x_3, S_IDC_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","IDC -> pt identc #hident IDC1 #sident ;"});
}
  }
private void action_sident_88(T_MCS x_3, S_IDC_MCS x_5) throws Exception {
try {
// instructions
this.att_sident=x_5.att_sident;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#sident","IDC -> pt identc #hident IDC1 #sident ;"});
}
  }
private void action_ident_87() throws Exception {
try {
// instructions
this.att_sident=this.att_ident;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#ident","IDC -> #ident ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_pv : // 32169
        regle87 () ;
      break ;
      case LEX_MCS.token_paro : // 32163
        regle87 () ;
      break ;
      case LEX_MCS.token_aco : // 32165
        regle87 () ;
      break ;
      case LEX_MCS.token_pt : // 32168
        regle88 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
