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
public class S_ES_MCS {
LEX_MCS scanner;
  S_ES_MCS() {
    }
  S_ES_MCS(LEX_MCS scanner, boolean eval) {
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
  TDS glob_79_tds;
  private void regle79() throws Exception {

    //declaration
    S_E_MCS x_4 = new S_E_MCS(scanner,att_eval) ;
    S_ESX_MCS x_6 = new S_ESX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_79(x_4, x_6);
if  (att_eval)      action_idc_79(x_4, x_6);
if  (att_eval)      action_hcond_79(x_4, x_6);
    x_4.analyser() ;
if  (att_eval)      action_tds_79(x_4, x_6);
    x_6.analyser() ;
if  (att_eval)      action_stds_79(x_4, x_6);
  }
  private void regle78() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_tds_78();
  }
private void action_tds_78() throws Exception {
try {
// instructions
this.att_stds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","ES -> #tds ;"});
}
  }
private void action_stds_79(S_E_MCS x_4, S_ESX_MCS x_6) throws Exception {
try {
// instructions
this.att_stds=x_6.att_stds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#stds","ES -> #idc #hcond E #tds ESX #stds ;"});
}
  }
private void action_idc_79(S_E_MCS x_4, S_ESX_MCS x_6) throws Exception {
try {
// instructions
x_4.att_identClasse="";
x_4.att_identSuper="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#idc","ES -> #idc #hcond E #tds ESX #stds ;"});
}
  }
private void action_auto_inh_79(S_E_MCS x_4, S_ESX_MCS x_6) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ES -> #idc #hcond E #tds ESX #stds ;"});
}
  }
private void action_tds_79(S_E_MCS x_4, S_ESX_MCS x_6) throws Exception {
try {
// instructions
glob_79_tds=this.att_tds;
glob_79_tds.inserer(x_4.att_code,  new INFOTYPE(x_4.att_type));
x_6.att_tds=glob_79_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","ES -> #idc #hcond E #tds ESX #stds ;"});
}
  }
private void action_hcond_79(S_E_MCS x_4, S_ESX_MCS x_6) throws Exception {
try {
// instructions
x_4.att_estConditionnelle=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hcond","ES -> #idc #hcond E #tds ESX #stds ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_parf : // 32164
        regle78 () ;
      break ;
      case LEX_MCS.token_entier : // 32211
        regle79 () ;
      break ;
      case LEX_MCS.token_chaine : // 32213
        regle79 () ;
      break ;
      case LEX_MCS.token_caractere : // 32212
        regle79 () ;
      break ;
      case LEX_MCS.token_plus : // 32203
        regle79 () ;
      break ;
      case LEX_MCS.token_moins : // 32204
        regle79 () ;
      break ;
      case LEX_MCS.token_non : // 32210
        regle79 () ;
      break ;
      case LEX_MCS.token_null : // 32196
        regle79 () ;
      break ;
      case LEX_MCS.token_paro : // 32163
        regle79 () ;
      break ;
      case LEX_MCS.token_malloc : // 32158
        regle79 () ;
      break ;
      case LEX_MCS.token_mult : // 32206
        regle79 () ;
      break ;
      case LEX_MCS.token_ident : // 32214
        regle79 () ;
      break ;
      case LEX_MCS.token_true : // 32188
        regle79 () ;
      break ;
      case LEX_MCS.token_false : // 32189
        regle79 () ;
      break ;
      case LEX_MCS.token_this : // 32190
        regle79 () ;
      break ;
      case LEX_MCS.token_base : // 32193
        regle79 () ;
      break ;
      case LEX_MCS.token_null2 : // 32192
        regle79 () ;
      break ;
      case LEX_MCS.token_new : // 32191
        regle79 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
