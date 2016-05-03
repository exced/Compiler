package mcs.egg;
import mcs.gc.IMachine;
import mg.egg.eggc.runtime.libjava.messages.CoreMessages;
import mg.egg.eggc.runtime.libjava.messages.ICoreMessages;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
public class S_FX_MCS {
LEX_MCS scanner;
  S_FX_MCS() {
    }
  S_FX_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle72() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_FX_MCS x_4 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_72(x_3, x_4);
    x_2.analyser(LEX_MCS.token_pt);
    x_3.analyser(LEX_MCS.token_ident);
    x_4.analyser() ;
  }
  private void regle71() throws Exception {

    //declaration
    //appel
  }
  private void regle74() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_ES_MCS x_3 = new S_ES_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_FX_MCS x_5 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_74(x_3, x_5);
    x_2.analyser(LEX_MCS.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_parf);
    x_5.analyser() ;
  }
  private void regle73() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_FX_MCS x_4 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_73(x_3, x_4);
    x_2.analyser(LEX_MCS.token_arrow);
    x_3.analyser(LEX_MCS.token_ident);
    x_4.analyser() ;
  }
private void action_auto_inh_74(S_ES_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> paro ES parf FX1 ;"});
}
  }
private void action_auto_inh_73(T_MCS x_3, S_FX_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> arrow ident FX1 ;"});
}
  }
private void action_auto_inh_72(T_MCS x_3, S_FX_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> pt ident FX1 ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 152
        regle71 () ;
      break ;
      case LEX_MCS.token_div : // 153
        regle71 () ;
      break ;
      case LEX_MCS.token_mod : // 154
        regle71 () ;
      break ;
      case LEX_MCS.token_et : // 155
        regle71 () ;
      break ;
      case LEX_MCS.token_plus : // 149
        regle71 () ;
      break ;
      case LEX_MCS.token_moins : // 150
        regle71 () ;
      break ;
      case LEX_MCS.token_ou : // 151
        regle71 () ;
      break ;
      case LEX_MCS.token_inf : // 143
        regle71 () ;
      break ;
      case LEX_MCS.token_sup : // 145
        regle71 () ;
      break ;
      case LEX_MCS.token_infeg : // 144
        regle71 () ;
      break ;
      case LEX_MCS.token_supeg : // 146
        regle71 () ;
      break ;
      case LEX_MCS.token_eg : // 147
        regle71 () ;
      break ;
      case LEX_MCS.token_neg : // 148
        regle71 () ;
      break ;
      case LEX_MCS.token_affect : // 131
        regle71 () ;
      break ;
      case LEX_MCS.token_virg : // 128
        regle71 () ;
      break ;
      case LEX_MCS.token_pv : // 130
        regle71 () ;
      break ;
      case LEX_MCS.token_parf : // 125
        regle71 () ;
      break ;
      case LEX_MCS.token_pt : // 129
        regle72 () ;
      break ;
      case LEX_MCS.token_arrow : // 141
        regle73 () ;
      break ;
      case LEX_MCS.token_paro : // 124
        regle74 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
