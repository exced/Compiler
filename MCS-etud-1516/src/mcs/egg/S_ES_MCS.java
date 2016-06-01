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
  TDS glob_77_tds;
  private void regle76() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_tds_76();
  }
  private void regle77() throws Exception {

    //declaration
    S_E_MCS x_2 = new S_E_MCS(scanner,att_eval) ;
    S_ESX_MCS x_4 = new S_ESX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_77(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_tds_77(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_stds_77(x_2, x_4);
  }
private void action_tds_76() throws Exception {
try {
// instructions
this.att_stds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","ES -> #tds ;"});
}
  }
private void action_auto_inh_77(S_E_MCS x_2, S_ESX_MCS x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ES -> E #tds ESX #stds ;"});
}
  }
private void action_tds_77(S_E_MCS x_2, S_ESX_MCS x_4) throws Exception {
try {
// instructions
glob_77_tds=this.att_tds;
glob_77_tds.inserer(x_2.att_code,  new INFOTYPE(x_2.att_type));
x_4.att_tds=glob_77_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","ES -> E #tds ESX #stds ;"});
}
  }
private void action_stds_77(S_E_MCS x_2, S_ESX_MCS x_4) throws Exception {
try {
// instructions
this.att_stds=x_4.att_stds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#stds","ES -> E #tds ESX #stds ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_parf : // 23032
        regle76 () ;
      break ;
      case LEX_MCS.token_entier : // 23079
        regle77 () ;
      break ;
      case LEX_MCS.token_chaine : // 23081
        regle77 () ;
      break ;
      case LEX_MCS.token_caractere : // 23080
        regle77 () ;
      break ;
      case LEX_MCS.token_plus : // 23071
        regle77 () ;
      break ;
      case LEX_MCS.token_moins : // 23072
        regle77 () ;
      break ;
      case LEX_MCS.token_non : // 23078
        regle77 () ;
      break ;
      case LEX_MCS.token_null : // 23064
        regle77 () ;
      break ;
      case LEX_MCS.token_paro : // 23031
        regle77 () ;
      break ;
      case LEX_MCS.token_mult : // 23074
        regle77 () ;
      break ;
      case LEX_MCS.token_ident : // 23082
        regle77 () ;
      break ;
      case LEX_MCS.token_malloc : // 23028
        regle77 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
