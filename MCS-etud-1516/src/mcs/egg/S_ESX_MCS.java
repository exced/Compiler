package mcs.egg;
import mcs.gc.IMachine;
import mg.egg.eggc.runtime.libjava.messages.CoreMessages;
import mg.egg.eggc.runtime.libjava.messages.ICoreMessages;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
public class S_ESX_MCS {
LEX_MCS scanner;
  S_ESX_MCS() {
    }
  S_ESX_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle77() throws Exception {

    //declaration
    //appel
  }
  private void regle78() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_E_MCS x_3 = new S_E_MCS(scanner,att_eval) ;
    S_ESX_MCS x_4 = new S_ESX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_78(x_3, x_4);
    x_2.analyser(LEX_MCS.token_virg);
    x_3.analyser() ;
    x_4.analyser() ;
  }
private void action_auto_inh_78(S_E_MCS x_3, S_ESX_MCS x_4) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ESX -> virg E ESX1 ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_parf : // 125
        regle77 () ;
      break ;
      case LEX_MCS.token_virg : // 128
        regle78 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
