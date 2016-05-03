package mcs.egg;
public class S_TYPE_MCS {
LEX_MCS scanner;
  S_TYPE_MCS() {
    }
  S_TYPE_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  LEX_MCS att_scanner;
  private void regle13() throws Exception {

    //declaration
    S_STYPE_MCS x_2 = new S_STYPE_MCS(scanner,att_eval) ;
    S_PTRS_MCS x_3 = new S_PTRS_MCS(scanner,att_eval) ;
    //appel
    x_2.analyser() ;
    x_3.analyser() ;
  }
  public void analyser () throws Exception {
    regle13 () ;
  }
  }
