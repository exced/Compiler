package mcs.egg;
import mcs.compiler.*;
import mcs.tds.*;
import mcs.type.*;
import mcs.gc.*;
import java.util.*;
import mg.egg.eggc.runtime.libjava.lex.*;
import mg.egg.eggc.runtime.libjava.*;
import mg.egg.eggc.runtime.libjava.messages.*;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import java.util.Vector;
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
  TDS att_tds;
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  TDS glob_9_tds;
  private void regle8() throws Exception {

    //declaration
    //appel
  }
  private void regle9() throws Exception {

    //declaration
    S_PARF_MCS x_3 = new S_PARF_MCS(scanner,att_eval) ;
    S_PARFSX_MCS x_4 = new S_PARFSX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_9(x_3, x_4);
if  (att_eval)      action_tds_9(x_3, x_4);
    x_3.analyser() ;
    x_4.analyser() ;
  }
private void action_auto_inh_9(S_PARF_MCS x_3, S_PARFSX_MCS x_4) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","PARFS -> #tds PARF PARFSX ;"});
}
  }
private void action_tds_9(S_PARF_MCS x_3, S_PARFSX_MCS x_4) throws Exception {
try {
// instructions
glob_9_tds= new TDS(this.att_tds);
x_3.att_tds=glob_9_tds;
x_4.att_tds=glob_9_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","PARFS -> #tds PARF PARFSX ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_parf : // 12174
        regle8 () ;
      break ;
      case LEX_MCS.token_void : // 12183
        regle9 () ;
      break ;
      case LEX_MCS.token_int : // 12185
        regle9 () ;
      break ;
      case LEX_MCS.token_char : // 12186
        regle9 () ;
      break ;
      case LEX_MCS.token_identc : // 12210
        regle9 () ;
      break ;
      case LEX_MCS.token_struct : // 12187
        regle9 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
