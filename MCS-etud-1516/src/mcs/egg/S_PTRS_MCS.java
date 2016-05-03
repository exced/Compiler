package mcs.egg;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
public class S_PTRS_MCS {
LEX_MCS scanner;
  S_PTRS_MCS() {
    }
  S_PTRS_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  LEX_MCS att_scanner;
  private void regle14() throws Exception {

    //declaration
    //appel
  }
  private void regle15() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_PTRS_MCS x_3 = new S_PTRS_MCS(scanner,att_eval) ;
    //appel
    x_2.analyser(LEX_MCS.token_mult);
    x_3.analyser() ;
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_identc : // 161
        regle14 () ;
      break ;
      case LEX_MCS.token_ident : // 160
        regle14 () ;
      break ;
      case LEX_MCS.token_parf : // 125
        regle14 () ;
      break ;
      case LEX_MCS.token_mult : // 152
        regle15 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
