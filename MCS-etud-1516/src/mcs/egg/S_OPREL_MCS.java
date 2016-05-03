package mcs.egg;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
public class S_OPREL_MCS {
LEX_MCS scanner;
  S_OPREL_MCS() {
    }
  S_OPREL_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  LEX_MCS att_scanner;
  private void regle44() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_eg);
  }
  private void regle45() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_neg);
  }
  private void regle40() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_inf);
  }
  private void regle41() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_sup);
  }
  private void regle42() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_infeg);
  }
  private void regle43() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_supeg);
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_inf : // 143
        regle40 () ;
      break ;
      case LEX_MCS.token_sup : // 145
        regle41 () ;
      break ;
      case LEX_MCS.token_infeg : // 144
        regle42 () ;
      break ;
      case LEX_MCS.token_supeg : // 146
        regle43 () ;
      break ;
      case LEX_MCS.token_eg : // 147
        regle44 () ;
      break ;
      case LEX_MCS.token_neg : // 148
        regle45 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
