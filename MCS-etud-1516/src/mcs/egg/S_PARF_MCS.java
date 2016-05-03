package mcs.egg;
import mcs.gc.IMachine;
public class S_PARF_MCS {
LEX_MCS scanner;
  S_PARF_MCS() {
    }
  S_PARF_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle12() throws Exception {

    //declaration
    S_TYPE_MCS x_2 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_ident);
  }
  public void analyser () throws Exception {
    regle12 () ;
  }
  }
