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
public class S_PARF_MCS {
LEX_MCS scanner;
  S_PARF_MCS() {
    }
  S_PARF_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  DTYPE att_type;
  String att_sident;
  private void regle12() throws Exception {

    //declaration
    S_TYPE_MCS x_2 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_12(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_tds_12(x_2, x_3);
  }
private void action_tds_12(S_TYPE_MCS x_2, T_MCS x_3) throws Exception {
try {
// instructions
this.att_type=x_2.att_type;
this.att_sident=x_3.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","PARF -> TYPE ident #tds ;"});
}
  }
private void action_auto_inh_12(S_TYPE_MCS x_2, T_MCS x_3) throws Exception {
try {
// instructions
x_2.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","PARF -> TYPE ident #tds ;"});
}
  }
  public void analyser () throws Exception {
    regle12 () ;
  }
  }
