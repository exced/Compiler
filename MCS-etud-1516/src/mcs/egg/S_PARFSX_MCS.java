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
public class S_PARFSX_MCS {
LEX_MCS scanner;
  S_PARFSX_MCS() {
    }
  S_PARFSX_MCS(LEX_MCS scanner, boolean eval) {
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
  private void regle10() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_stds_10();
  }
  private void regle11() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_PARF_MCS x_3 = new S_PARF_MCS(scanner,att_eval) ;
    S_PARFSX_MCS x_5 = new S_PARFSX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_11(x_3, x_5);
    x_2.analyser(LEX_MCS.token_virg);
    x_3.analyser() ;
if  (att_eval)      action_tds_11(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_stds_11(x_3, x_5);
  }
private void action_auto_inh_11(S_PARF_MCS x_3, S_PARFSX_MCS x_5) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","PARFSX -> virg PARF #tds PARFSX1 #stds ;"});
}
  }
private void action_tds_11(S_PARF_MCS x_3, S_PARFSX_MCS x_5) throws Exception {
try {
// locales
TDS loc_tds;
// instructions
loc_tds=this.att_tds;
this.att_machine.addCurrentDep(-(x_3.att_type.getTaille()));
loc_tds.inserer(x_3.att_sident,  new INFOVAR(x_3.att_type, this.att_machine.getCurrentDep()));
x_5.att_tds=loc_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","PARFSX -> virg PARF #tds PARFSX1 #stds ;"});
}
  }
private void action_stds_11(S_PARF_MCS x_3, S_PARFSX_MCS x_5) throws Exception {
try {
// instructions
this.att_stds=x_5.att_stds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#stds","PARFSX -> virg PARF #tds PARFSX1 #stds ;"});
}
  }
private void action_stds_10() throws Exception {
try {
// instructions
this.att_stds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#stds","PARFSX -> #stds ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_parf : // 24345
        regle10 () ;
      break ;
      case LEX_MCS.token_virg : // 24348
        regle11 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
