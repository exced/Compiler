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
public class S_DEF_MCS {
LEX_MCS scanner;
  S_DEF_MCS() {
    }
  S_DEF_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_identSuper;
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
  String att_identClasse;
  String att_hacces;
  TDS glob_98_tdsParam;
  INFOFONC glob_98_infofonc;
  DTYPE glob_98_t;
  private void regle98() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_PARFS_MCS x_5 = new S_PARFS_MCS(scanner,att_eval) ;
    T_MCS x_7 = new T_MCS(scanner ) ;
    S_BASE_MCS x_9 = new S_BASE_MCS(scanner,att_eval) ;
    S_BLOC_MCS x_10 = new S_BLOC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_98(x_2, x_5, x_9, x_10);
    x_2.analyser(LEX_MCS.token_identc);
    x_3.analyser(LEX_MCS.token_paro);
if  (att_eval)      action_tds_98(x_2, x_5, x_9, x_10);
    x_5.analyser() ;
if  (att_eval)      action_stds_98(x_2, x_5, x_9, x_10);
    x_7.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_htds_98(x_2, x_5, x_9, x_10);
    x_9.analyser() ;
    x_10.analyser() ;
if  (att_eval)      action_gen_98(x_2, x_5, x_9, x_10);
  }
  private void regle97() throws Exception {

    //declaration
    S_TYPE_MCS x_2 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_DECL_MCS x_5 = new S_DECL_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_97(x_2, x_3, x_5);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_decl_97(x_2, x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_gen_97(x_2, x_3, x_5);
  }
private void action_auto_inh_97(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_5) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_5.att_identSuper=this.att_identSuper;
x_5.att_identClasse=this.att_identClasse;
x_2.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
x_5.att_hacces=this.att_hacces;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","DEF -> TYPE ident #decl DECL #gen ;"});
}
  }
private void action_tds_98(T_MCS x_2, S_PARFS_MCS x_5, S_BASE_MCS x_9, S_BLOC_MCS x_10) throws Exception {
try {
// instructions
x_5.att_tds= new TDS(this.att_tds);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","DEF -> identc paro #tds PARFS #stds parf #htds BASE BLOC #gen ;"});
}
  }
private void action_htds_98(T_MCS x_2, S_PARFS_MCS x_5, S_BASE_MCS x_9, S_BLOC_MCS x_10) throws Exception {
try {
// instructions
x_9.att_tds=x_5.att_stds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htds","DEF -> identc paro #tds PARFS #stds parf #htds BASE BLOC #gen ;"});
}
  }
private void action_auto_inh_98(T_MCS x_2, S_PARFS_MCS x_5, S_BASE_MCS x_9, S_BLOC_MCS x_10) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_9.att_machine=this.att_machine;
x_10.att_machine=this.att_machine;
x_9.att_identSuper=this.att_identSuper;
x_10.att_identSuper=this.att_identSuper;
x_10.att_identClasse=this.att_identClasse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","DEF -> identc paro #tds PARFS #stds parf #htds BASE BLOC #gen ;"});
}
  }
private void action_gen_97(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_5) throws Exception {
try {
// instructions
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","DEF -> TYPE ident #decl DECL #gen ;"});
}
  }
private void action_stds_98(T_MCS x_2, S_PARFS_MCS x_5, S_BASE_MCS x_9, S_BLOC_MCS x_10) throws Exception {
try {
// instructions
x_10.att_hbloc_est_fonction=true;
glob_98_tdsParam=x_5.att_stds;
x_10.att_tds= new TDS(glob_98_tdsParam);
this.att_machine.resetCurrentDep();
this.att_machine.addCurrentDep(3);
glob_98_t= new DTYPEImpl("constructeur", 0);
glob_98_infofonc= new INFOFONC(glob_98_t, glob_98_tdsParam);
glob_98_infofonc.setAcces(this.att_hacces);
this.att_tds.inserer(x_2.att_txt, glob_98_infofonc);
x_10.att_htype=glob_98_t;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#stds","DEF -> identc paro #tds PARFS #stds parf #htds BASE BLOC #gen ;"});
}
  }
private void action_gen_98(T_MCS x_2, S_PARFS_MCS x_5, S_BASE_MCS x_9, S_BLOC_MCS x_10) throws Exception {
try {
// instructions
this.att_code=x_9.att_code+this.att_machine.genFonction(x_2.att_txt, glob_98_tdsParam.getTailleParams(), 0, x_10.att_code);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","DEF -> identc paro #tds PARFS #stds parf #htds BASE BLOC #gen ;"});
}
  }
private void action_decl_97(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_5) throws Exception {
try {
// instructions
x_5.att_ident=x_3.att_txt;
x_5.att_htype=x_2.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#decl","DEF -> TYPE ident #decl DECL #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_void : // 32173
        regle97 () ;
      break ;
      case LEX_MCS.token_int : // 32175
        regle97 () ;
      break ;
      case LEX_MCS.token_char : // 32176
        regle97 () ;
      break ;
      case LEX_MCS.token_identc : // 32215
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MCS.token_mult : // 32206
            regle97 () ;
          break ;
          case LEX_MCS.token_ident : // 32214
            regle97 () ;
          break ;
          case LEX_MCS.token_paro : // 32163
            regle98 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MCS.token_identc);
        }
      break ;
      case LEX_MCS.token_struct : // 32177
        regle97 () ;
      break ;
      case LEX_MCS.token_bool : // 32187
        regle97 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
