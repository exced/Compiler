package mcs.egg;
import mcs.gc.IMachine;
import mg.egg.eggc.runtime.libjava.messages.CoreMessages;
import mg.egg.eggc.runtime.libjava.messages.ICoreMessages;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
public class S_PARFS_MCS {
LEX_MCS scanner;
  S_PARFS_MCS() {
    }
  S_PARFS_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle8() throws Exception {

    //declaration
    //appel
  }
  private void regle9() throws Exception {

    //declaration
    S_PARF_MCS x_2 = new S_PARF_MCS(scanner,att_eval) ;
    S_PARFSX_MCS x_3 = new S_PARFSX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_9(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
private void action_auto_inh_9(S_PARF_MCS x_2, S_PARFSX_MCS x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","PARFS -> PARF PARFSX ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_parf : // 125
        regle8 () ;
      break ;
      case LEX_MCS.token_void : // 134
        regle9 () ;
      break ;
      case LEX_MCS.token_int : // 136
        regle9 () ;
      break ;
      case LEX_MCS.token_char : // 137
        regle9 () ;
      break ;
      case LEX_MCS.token_identc : // 161
        regle9 () ;
      break ;
      case LEX_MCS.token_struct : // 138
        regle9 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
