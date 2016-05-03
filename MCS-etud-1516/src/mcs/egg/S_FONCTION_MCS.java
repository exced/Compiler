package mcs.egg;
import mcs.gc.IMachine;
import mg.egg.eggc.runtime.libjava.messages.CoreMessages;
import mg.egg.eggc.runtime.libjava.messages.ICoreMessages;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
public class S_FONCTION_MCS {
LEX_MCS scanner;
  S_FONCTION_MCS() {
    }
  S_FONCTION_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle7() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_PARFS_MCS x_3 = new S_PARFS_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_BLOC_MCS x_5 = new S_BLOC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_7(x_3, x_5);
    x_2.analyser(LEX_MCS.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_parf);
    x_5.analyser() ;
  }
private void action_auto_inh_7(S_PARFS_MCS x_3, S_BLOC_MCS x_5) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FONCTION -> paro PARFS parf BLOC ;"});
}
  }
  public void analyser () throws Exception {
    regle7 () ;
  }
  }
