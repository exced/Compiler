package mcs.egg;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
public class S_OPMUL_MCS {
LEX_MCS scanner;
  S_OPMUL_MCS() {
    }
  S_OPMUL_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  LEX_MCS att_scanner;
  private void regle56() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_div);
  }
  private void regle57() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_mod);
  }
  private void regle58() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_et);
  }
  private void regle55() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_mult);
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 152
        regle55 () ;
      break ;
      case LEX_MCS.token_div : // 153
        regle56 () ;
      break ;
      case LEX_MCS.token_mod : // 154
        regle57 () ;
      break ;
      case LEX_MCS.token_et : // 155
        regle58 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
