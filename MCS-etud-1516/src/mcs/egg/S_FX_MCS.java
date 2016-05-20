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
public class S_FX_MCS {
LEX_MCS scanner;
  S_FX_MCS() {
    }
  S_FX_MCS(LEX_MCS scanner, boolean eval) {
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
  boolean att_est_affectable;
  LEX_MCS att_scanner;
  DTYPE att_type;
  TDS glob_74_tdsParam;
  private void regle72() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_FX_MCS x_5 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_72(x_3, x_5);
    x_2.analyser(LEX_MCS.token_pt);
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_a_72(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_aff_72(x_3, x_5);
if  (att_eval)      action_gen_72(x_3, x_5);
  }
  private void regle71() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_aff_71();
if  (att_eval)      action_gen_71();
  }
  private void regle74() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_ES_MCS x_4 = new S_ES_MCS(scanner,att_eval) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    S_FX_MCS x_6 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_74(x_4, x_6);
    x_2.analyser(LEX_MCS.token_paro);
if  (att_eval)      action_tds_74(x_4, x_6);
    x_4.analyser() ;
    x_5.analyser(LEX_MCS.token_parf);
    x_6.analyser() ;
if  (att_eval)      action_aff_74(x_4, x_6);
if  (att_eval)      action_type_74(x_4, x_6);
if  (att_eval)      action_gen_74(x_4, x_6);
  }
  private void regle73() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_FX_MCS x_4 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_73(x_3, x_4);
    x_2.analyser(LEX_MCS.token_arrow);
    x_3.analyser(LEX_MCS.token_ident);
    x_4.analyser() ;
if  (att_eval)      action_aff_73(x_3, x_4);
if  (att_eval)      action_type_73(x_3, x_4);
if  (att_eval)      action_gen_73(x_3, x_4);
  }
private void action_type_74(S_ES_MCS x_4, S_FX_MCS x_6) throws Exception {
try {
// instructions
this.att_type=x_6.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> paro #tds ES parf FX1 #aff #type #gen ;"});
}
  }
private void action_type_73(T_MCS x_3, S_FX_MCS x_4) throws Exception {
try {
// instructions
this.att_type=x_4.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> arrow ident FX1 #aff #type #gen ;"});
}
  }
private void action_aff_74(S_ES_MCS x_4, S_FX_MCS x_6) throws Exception {
try {
// instructions
this.att_est_affectable=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#aff","FX -> paro #tds ES parf FX1 #aff #type #gen ;"});
}
  }
private void action_aff_73(T_MCS x_3, S_FX_MCS x_4) throws Exception {
try {
// instructions
this.att_est_affectable=x_4.att_est_affectable;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#aff","FX -> arrow ident FX1 #aff #type #gen ;"});
}
  }
private void action_gen_74(S_ES_MCS x_4, S_FX_MCS x_6) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genCall();
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> paro #tds ES parf FX1 #aff #type #gen ;"});
}
  }
private void action_aff_72(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
this.att_est_affectable=x_5.att_est_affectable;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#aff","FX -> pt ident #a FX1 #aff #gen ;"});
}
  }
private void action_aff_71() throws Exception {
try {
// instructions
this.att_est_affectable=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#aff","FX -> #aff #gen ;"});
}
  }
private void action_gen_71() throws Exception {
try {
// instructions
this.att_type=this.att_htype;
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> #aff #gen ;"});
}
  }
private void action_gen_73(T_MCS x_3, S_FX_MCS x_4) throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> arrow ident FX1 #aff #type #gen ;"});
}
  }
private void action_gen_72(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
this.att_type=x_5.att_type;
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> pt ident #a FX1 #aff #gen ;"});
}
  }
private void action_auto_inh_73(T_MCS x_3, S_FX_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_htype=this.att_htype;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> arrow ident FX1 #aff #type #gen ;"});
}
  }
private void action_tds_74(S_ES_MCS x_4, S_FX_MCS x_6) throws Exception {
try {
// instructions
glob_74_tdsParam= new TDS(this.att_tds);
x_4.att_tds=glob_74_tdsParam;
x_6.att_tds= new TDS(glob_74_tdsParam);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","FX -> paro #tds ES parf FX1 #aff #type #gen ;"});
}
  }
private void action_auto_inh_74(S_ES_MCS x_4, S_FX_MCS x_6) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
x_6.att_htype=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> paro #tds ES parf FX1 #aff #type #gen ;"});
}
  }
private void action_a_72(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// locales
STRUCT loc_s;
CHAMP loc_c;
LCHAMPS loc_lc;
// instructions
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","FX -> pt ident #a FX1 #aff #gen ;"});
}
  }
private void action_auto_inh_72(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_5.att_htype=this.att_htype;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> pt ident #a FX1 #aff #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 12868
        regle71 () ;
      break ;
      case LEX_MCS.token_div : // 12869
        regle71 () ;
      break ;
      case LEX_MCS.token_mod : // 12870
        regle71 () ;
      break ;
      case LEX_MCS.token_et : // 12871
        regle71 () ;
      break ;
      case LEX_MCS.token_plus : // 12865
        regle71 () ;
      break ;
      case LEX_MCS.token_moins : // 12866
        regle71 () ;
      break ;
      case LEX_MCS.token_ou : // 12867
        regle71 () ;
      break ;
      case LEX_MCS.token_inf : // 12859
        regle71 () ;
      break ;
      case LEX_MCS.token_sup : // 12861
        regle71 () ;
      break ;
      case LEX_MCS.token_infeg : // 12860
        regle71 () ;
      break ;
      case LEX_MCS.token_supeg : // 12862
        regle71 () ;
      break ;
      case LEX_MCS.token_eg : // 12863
        regle71 () ;
      break ;
      case LEX_MCS.token_neg : // 12864
        regle71 () ;
      break ;
      case LEX_MCS.token_affect : // 12847
        regle71 () ;
      break ;
      case LEX_MCS.token_virg : // 12844
        regle71 () ;
      break ;
      case LEX_MCS.token_pv : // 12846
        regle71 () ;
      break ;
      case LEX_MCS.token_parf : // 12841
        regle71 () ;
      break ;
      case LEX_MCS.token_pt : // 12845
        regle72 () ;
      break ;
      case LEX_MCS.token_arrow : // 12857
        regle73 () ;
      break ;
      case LEX_MCS.token_paro : // 12840
        regle74 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
