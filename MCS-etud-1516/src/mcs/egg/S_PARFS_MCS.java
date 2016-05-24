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
  TDS att_stds;
  LEX_MCS att_scanner;
  TDS glob_9_tds;
  private void regle8() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_tds_8();
  }
  private void regle9() throws Exception {

    //declaration
    S_PARF_MCS x_2 = new S_PARF_MCS(scanner,att_eval) ;
    S_PARFSX_MCS x_4 = new S_PARFSX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_9(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_tds_9(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_stds_9(x_2, x_4);
  }
private void action_auto_inh_9(S_PARF_MCS x_2, S_PARFSX_MCS x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","PARFS -> PARF #tds PARFSX #stds ;"});
}
  }
private void action_stds_9(S_PARF_MCS x_2, S_PARFSX_MCS x_4) throws Exception {
try {
// instructions
this.att_stds=x_4.att_stds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#stds","PARFS -> PARF #tds PARFSX #stds ;"});
}
  }
private void action_tds_9(S_PARF_MCS x_2, S_PARFSX_MCS x_4) throws Exception {
try {
// instructions
glob_9_tds=this.att_tds;
glob_9_tds.inserer(x_2.att_sident,  new INFOVAR(x_2.att_type, this.att_machine.getCurrentDep()));
x_4.att_tds=glob_9_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","PARFS -> PARF #tds PARFSX #stds ;"});
}
  }
private void action_tds_8() throws Exception {
try {
// instructions
this.att_stds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","PARFS -> #tds ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_parf : // 2353
        regle8 () ;
      break ;
      case LEX_MCS.token_void : // 2362
        regle9 () ;
      break ;
      case LEX_MCS.token_int : // 2364
        regle9 () ;
      break ;
      case LEX_MCS.token_char : // 2365
        regle9 () ;
      break ;
      case LEX_MCS.token_identc : // 2404
        regle9 () ;
      break ;
      case LEX_MCS.token_struct : // 2366
        regle9 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
