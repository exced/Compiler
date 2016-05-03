package mcs.egg;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
public class S_STYPE_MCS {
LEX_MCS scanner;
  S_STYPE_MCS() {
    }
  S_STYPE_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  LEX_MCS att_scanner;
  private void regle16() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_void);
  }
  private void regle17() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_int);
  }
  private void regle18() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_char);
  }
  private void regle19() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_identc);
  }
  private void regle20() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_CHAMPS_MCS x_4 = new S_CHAMPS_MCS(scanner,att_eval) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_struct);
    x_3.analyser(LEX_MCS.token_aco);
    x_4.analyser() ;
    x_5.analyser(LEX_MCS.token_acf);
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_void : // 134
        regle16 () ;
      break ;
      case LEX_MCS.token_int : // 136
        regle17 () ;
      break ;
      case LEX_MCS.token_char : // 137
        regle18 () ;
      break ;
      case LEX_MCS.token_identc : // 161
        regle19 () ;
      break ;
      case LEX_MCS.token_struct : // 138
        regle20 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
