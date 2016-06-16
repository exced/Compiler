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
  INFO att_sinfo;
  IMachine att_machine;
  String att_ident;
  LEX_MCS att_scanner;
  String att_identClasse;
  String att_hacces;
  INFOFONC glob_7_i;
  TDS glob_7_tdsParam;
  private void regle7() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_PARFS_MCS x_4 = new S_PARFS_MCS(scanner,att_eval) ;
    T_MCS x_6 = new T_MCS(scanner ) ;
    S_BLOC_MCS x_7 = new S_BLOC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_7(x_4, x_7);
    x_2.analyser(LEX_MCS.token_paro);
if  (att_eval)      action_tds_7(x_4, x_7);
    x_4.analyser() ;
if  (att_eval)      action_stds_7(x_4, x_7);
    x_6.analyser(LEX_MCS.token_parf);
    x_7.analyser() ;
if  (att_eval)      action_gen_7(x_4, x_7);
  }
private void action_gen_7(S_PARFS_MCS x_4, S_BLOC_MCS x_7) throws Exception {
try {
// locales
DTYPE loc_typeRetour;
INFO loc_ir;
INFOFONC loc_inf;
TDS loc_tdsPF;
// instructions
glob_7_i= new INFOFONC(this.att_htype, glob_7_tdsParam);
glob_7_i.setAcces(this.att_hacces);
loc_ir=this.att_tds.chercherGlobalement(this.att_ident);
if ((loc_ir==null)){
this.att_tds.inserer(this.att_ident, glob_7_i);
}
else {
if (loc_ir instanceof INFOFONC ){
loc_inf=((INFOFONC)loc_ir);
loc_tdsPF=((INFOFONC)loc_ir).getParams();
if ((loc_tdsPF.compareTypeTo(x_4.att_stds))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_fonction_deja_existante, MCSMessages.fonction_deja_existante,new Object[]{""+this.att_ident, ""+loc_tdsPF});

}
else {
this.att_tds.inserer(this.att_ident, glob_7_i);
}
}
else {
this.att_tds.inserer(this.att_ident, glob_7_i);

}
}
this.att_sinfo=glob_7_i;
loc_typeRetour=glob_7_i.getType();
this.att_code=this.att_machine.genFonction(this.att_ident, glob_7_tdsParam.getTailleParams(), loc_typeRetour.getTaille(), x_7.att_code);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FONCTION -> paro #tds PARFS #stds parf BLOC #gen ;"});
}
  }
private void action_auto_inh_7(S_PARFS_MCS x_4, S_BLOC_MCS x_7) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
x_7.att_identClasse=this.att_identClasse;
x_7.att_htype=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FONCTION -> paro #tds PARFS #stds parf BLOC #gen ;"});
}
  }
private void action_stds_7(S_PARFS_MCS x_4, S_BLOC_MCS x_7) throws Exception {
try {
// instructions
x_7.att_hbloc_est_fonction=true;
glob_7_tdsParam=x_4.att_stds;
x_7.att_tds= new TDS(glob_7_tdsParam);
this.att_machine.resetCurrentDep();
this.att_machine.addCurrentDep(3);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#stds","FONCTION -> paro #tds PARFS #stds parf BLOC #gen ;"});
}
  }
private void action_tds_7(S_PARFS_MCS x_4, S_BLOC_MCS x_7) throws Exception {
try {
// instructions
x_4.att_tds= new TDS(this.att_tds);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","FONCTION -> paro #tds PARFS #stds parf BLOC #gen ;"});
}
  }
  public void analyser () throws Exception {
    regle7 () ;
  }
  }
