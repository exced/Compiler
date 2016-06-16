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
public class S_HERITAGE_MCS {
LEX_MCS scanner;
  S_HERITAGE_MCS() {
    }
  S_HERITAGE_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  LEX_MCS att_scanner;
  String att_sident;
  boolean att_aHeritage;
  private void regle93() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_sident_93();
  }
  private void regle94() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_IDC_MCS x_5 = new S_IDC_MCS(scanner,att_eval) ;
    //appel
    x_2.analyser(LEX_MCS.token_dpts);
    x_3.analyser(LEX_MCS.token_identc);
if  (att_eval)      action_ident_94(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_sident_94(x_3, x_5);
  }
private void action_ident_94(T_MCS x_3, S_IDC_MCS x_5) throws Exception {
try {
// instructions
x_5.att_ident=x_3.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#ident","HERITAGE -> dpts identc #ident IDC #sident ;"});
}
  }
private void action_sident_93() throws Exception {
try {
// instructions
this.att_aHeritage=false;
this.att_sident="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#sident","HERITAGE -> #sident ;"});
}
  }
private void action_sident_94(T_MCS x_3, S_IDC_MCS x_5) throws Exception {
try {
// instructions
this.att_aHeritage=true;
this.att_sident=x_5.att_sident;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#sident","HERITAGE -> dpts identc #ident IDC #sident ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_aco : // 852
        regle93 () ;
      break ;
      case LEX_MCS.token_dpts : // 873
        regle94 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
