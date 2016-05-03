package mcs.egg;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
public class S_CHAMPS_MCS {
LEX_MCS scanner;
  S_CHAMPS_MCS() {
    }
  S_CHAMPS_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  LEX_MCS att_scanner;
  private void regle22() throws Exception {

    //declaration
    S_CHAMP_MCS x_2 = new S_CHAMP_MCS(scanner,att_eval) ;
    S_CHAMPS_MCS x_3 = new S_CHAMPS_MCS(scanner,att_eval) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle21() throws Exception {

    //declaration
    //appel
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_acf : // 127
        regle21 () ;
      break ;
      case LEX_MCS.token_void : // 134
        regle22 () ;
      break ;
      case LEX_MCS.token_int : // 136
        regle22 () ;
      break ;
      case LEX_MCS.token_char : // 137
        regle22 () ;
      break ;
      case LEX_MCS.token_identc : // 161
        regle22 () ;
      break ;
      case LEX_MCS.token_struct : // 138
        regle22 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
