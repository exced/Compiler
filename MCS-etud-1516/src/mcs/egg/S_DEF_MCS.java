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
  TDS att_tds;
  boolean att_eval;
  String att_code;
  INFO att_sinfo;
  IMachine att_machine;
  LEX_MCS att_scanner;
  String att_sident;
  TDS glob_96_tdsParam;
  DTYPE glob_96_t;
  INFOFONC glob_96_infofonc;
  private void regle96() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_PARFS_MCS x_5 = new S_PARFS_MCS(scanner,att_eval) ;
    T_MCS x_7 = new T_MCS(scanner ) ;
    S_BASE_MCS x_8 = new S_BASE_MCS(scanner,att_eval) ;
    S_BLOC_MCS x_9 = new S_BLOC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_96(x_2, x_5, x_8, x_9);
    x_2.analyser(LEX_MCS.token_identc);
    x_3.analyser(LEX_MCS.token_paro);
if  (att_eval)      action_tds_96(x_2, x_5, x_8, x_9);
    x_5.analyser() ;
if  (att_eval)      action_stds_96(x_2, x_5, x_8, x_9);
    x_7.analyser(LEX_MCS.token_parf);
    x_8.analyser() ;
    x_9.analyser() ;
if  (att_eval)      action_gen_96(x_2, x_5, x_8, x_9);
  }
  private void regle95() throws Exception {

    //declaration
    S_TYPE_MCS x_2 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_DECL_MCS x_6 = new S_DECL_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_95(x_2, x_3, x_6);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_sident_95(x_2, x_3, x_6);
if  (att_eval)      action_decl_95(x_2, x_3, x_6);
    x_6.analyser() ;
if  (att_eval)      action_sinfo_95(x_2, x_3, x_6);
if  (att_eval)      action_gen_95(x_2, x_3, x_6);
  }
private void action_auto_inh_95(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_6) throws Exception {
try {
// instructions
x_6.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_6.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","DEF -> TYPE ident #sident #decl DECL #sinfo #gen ;"});
}
  }
private void action_tds_96(T_MCS x_2, S_PARFS_MCS x_5, S_BASE_MCS x_8, S_BLOC_MCS x_9) throws Exception {
try {
// instructions
x_5.att_tds= new TDS(this.att_tds);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","DEF -> identc paro #tds PARFS #stds parf BASE BLOC #gen ;"});
}
  }
private void action_sinfo_95(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_6) throws Exception {
try {
// instructions
this.att_sinfo=x_6.att_sinfo;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#sinfo","DEF -> TYPE ident #sident #decl DECL #sinfo #gen ;"});
}
  }
private void action_auto_inh_96(T_MCS x_2, S_PARFS_MCS x_5, S_BASE_MCS x_8, S_BLOC_MCS x_9) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_8.att_machine=this.att_machine;
x_9.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","DEF -> identc paro #tds PARFS #stds parf BASE BLOC #gen ;"});
}
  }
private void action_sident_95(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_6) throws Exception {
try {
// instructions
this.att_sident=x_3.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#sident","DEF -> TYPE ident #sident #decl DECL #sinfo #gen ;"});
}
  }
private void action_stds_96(T_MCS x_2, S_PARFS_MCS x_5, S_BASE_MCS x_8, S_BLOC_MCS x_9) throws Exception {
try {
// instructions
x_9.att_hbloc_est_fonction=true;
glob_96_tdsParam=x_5.att_stds;
x_9.att_tds= new TDS(glob_96_tdsParam);
glob_96_t= new DTYPEImpl("constructeur", 0);
glob_96_infofonc= new INFOFONC(glob_96_t, glob_96_tdsParam);
this.att_sident=x_2.att_txt;
this.att_sinfo=glob_96_infofonc;
x_9.att_htype=glob_96_t;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#stds","DEF -> identc paro #tds PARFS #stds parf BASE BLOC #gen ;"});
}
  }
private void action_gen_96(T_MCS x_2, S_PARFS_MCS x_5, S_BASE_MCS x_8, S_BLOC_MCS x_9) throws Exception {
try {
// instructions
this.att_tds.inserer(x_2.att_txt, glob_96_infofonc);
this.att_code=this.att_machine.genFonction(x_2.att_txt, glob_96_tdsParam.getTailleParams(), 0, x_9.att_code);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","DEF -> identc paro #tds PARFS #stds parf BASE BLOC #gen ;"});
}
  }
private void action_gen_95(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_6) throws Exception {
try {
// instructions
this.att_code=x_6.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","DEF -> TYPE ident #sident #decl DECL #sinfo #gen ;"});
}
  }
private void action_decl_95(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_6) throws Exception {
try {
// instructions
x_6.att_ident=x_3.att_txt;
x_6.att_htype=x_2.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#decl","DEF -> TYPE ident #sident #decl DECL #sinfo #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_void : // 5487
        regle95 () ;
      break ;
      case LEX_MCS.token_int : // 5489
        regle95 () ;
      break ;
      case LEX_MCS.token_char : // 5490
        regle95 () ;
      break ;
      case LEX_MCS.token_identc : // 5529
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MCS.token_mult : // 5520
            regle95 () ;
          break ;
          case LEX_MCS.token_ident : // 5528
            regle95 () ;
          break ;
          case LEX_MCS.token_paro : // 5477
            regle96 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MCS.token_identc);
        }
      break ;
      case LEX_MCS.token_struct : // 5491
        regle95 () ;
      break ;
      case LEX_MCS.token_bool : // 5501
        regle95 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
