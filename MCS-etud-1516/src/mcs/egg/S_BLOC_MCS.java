package mcs.egg;
import mcs.gc.IMachine;
import mg.egg.eggc.runtime.libjava.messages.CoreMessages;
import mg.egg.eggc.runtime.libjava.messages.ICoreMessages;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
public class S_BLOC_MCS {
LEX_MCS scanner;
  S_BLOC_MCS() {
    }
  S_BLOC_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle24() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_INSTS_MCS x_3 = new S_INSTS_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_24(x_3);
    x_2.analyser(LEX_MCS.token_aco);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_acf);
  }
private void action_auto_inh_24(S_INSTS_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","BLOC -> aco INSTS acf ;"});
}
  }
  public void analyser () throws Exception {
    regle24 () ;
  }
  }
