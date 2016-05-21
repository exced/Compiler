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
public class S_FONCTION_MCS {
LEX_MCS scanner;
  S_FONCTION_MCS() {
    }
  S_FONCTION_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  DTYPE att_htype;
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  String att_ident;
  LEX_MCS att_scanner;
  INFOFONC glob_7_i;
  TDS glob_7_tdsParam;
  private void regle7() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_PARFS_MCS x_4 = new S_PARFS_MCS(scanner,att_eval) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    S_BLOC_MCS x_6 = new S_BLOC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_7(x_4, x_6);
    x_2.analyser(LEX_MCS.token_paro);
if  (att_eval)      action_init_7(x_4, x_6);
    x_4.analyser() ;
    x_5.analyser(LEX_MCS.token_parf);
    x_6.analyser() ;
if  (att_eval)      action_gen_7(x_4, x_6);
  }
private void action_gen_7(S_PARFS_MCS x_4, S_BLOC_MCS x_6) throws Exception {
try {
// locales
DTYPE loc_typeRetour;
// instructions
glob_7_i= new INFOFONC(this.att_htype, glob_7_tdsParam);
this.att_tds.inserer(this.att_ident, glob_7_i);
loc_typeRetour=glob_7_tdsParam.getTypeRetour();
this.att_code=this.att_machine.genFonction(this.att_ident, glob_7_tdsParam.getTailleParams(), loc_typeRetour.getTaille(), x_6.att_code);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FONCTION -> paro #init PARFS parf BLOC #gen ;"});
}
  }
private void action_init_7(S_PARFS_MCS x_4, S_BLOC_MCS x_6) throws Exception {
try {
// instructions
glob_7_tdsParam= new TDS(this.att_tds);
glob_7_tdsParam.setTypeRetour(this.att_htype);
x_4.att_tds=glob_7_tdsParam;
x_6.att_tds= new TDS(glob_7_tdsParam);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#init","FONCTION -> paro #init PARFS parf BLOC #gen ;"});
}
  }
private void action_auto_inh_7(S_PARFS_MCS x_4, S_BLOC_MCS x_6) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
x_6.att_htype=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FONCTION -> paro #init PARFS parf BLOC #gen ;"});
}
  }
  public void analyser () throws Exception {
    regle7 () ;
  }
  }
