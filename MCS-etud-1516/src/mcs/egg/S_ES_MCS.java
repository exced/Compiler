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
<<<<<<< HEAD
      case LEX_MCS.token_parf : // 40841
=======
<<<<<<< HEAD
      case LEX_MCS.token_parf : // 141
        regle76 () ;
      break ;
      case LEX_MCS.token_entier : // 188
        regle77 () ;
      break ;
      case LEX_MCS.token_chaine : // 190
        regle77 () ;
      break ;
      case LEX_MCS.token_caractere : // 189
        regle77 () ;
      break ;
      case LEX_MCS.token_plus : // 180
        regle77 () ;
      break ;
      case LEX_MCS.token_moins : // 181
        regle77 () ;
      break ;
      case LEX_MCS.token_non : // 187
        regle77 () ;
      break ;
      case LEX_MCS.token_null : // 173
        regle77 () ;
      break ;
      case LEX_MCS.token_paro : // 140
        regle77 () ;
      break ;
      case LEX_MCS.token_malloc : // 137
        regle77 () ;
      break ;
      case LEX_MCS.token_mult : // 183
        regle77 () ;
      break ;
      case LEX_MCS.token_ident : // 191
        regle77 () ;
      break ;
      case LEX_MCS.token_true : // 165
        regle77 () ;
      break ;
      case LEX_MCS.token_false : // 166
=======
      case LEX_MCS.token_parf : // 7610
>>>>>>> bdbaa92301b44fdaf132c4487868997d8ebc4083
        regle76 () ;
      break ;
      case LEX_MCS.token_entier : // 40888
        regle77 () ;
      break ;
      case LEX_MCS.token_chaine : // 40890
        regle77 () ;
      break ;
      case LEX_MCS.token_caractere : // 40889
        regle77 () ;
      break ;
      case LEX_MCS.token_plus : // 40880
        regle77 () ;
      break ;
      case LEX_MCS.token_moins : // 40881
        regle77 () ;
      break ;
      case LEX_MCS.token_non : // 40887
        regle77 () ;
      break ;
      case LEX_MCS.token_null : // 40873
        regle77 () ;
      break ;
      case LEX_MCS.token_paro : // 40840
        regle77 () ;
      break ;
      case LEX_MCS.token_malloc : // 40837
        regle77 () ;
      break ;
      case LEX_MCS.token_mult : // 40883
        regle77 () ;
      break ;
      case LEX_MCS.token_ident : // 40891
        regle77 () ;
      break ;
      case LEX_MCS.token_true : // 40865
        regle77 () ;
      break ;
<<<<<<< HEAD
      case LEX_MCS.token_false : // 40866
=======
      case LEX_MCS.token_false : // 7635
>>>>>>> 477cdfe2a07ecea959ec9e3d3c2138087d7362de
>>>>>>> bdbaa92301b44fdaf132c4487868997d8ebc4083
        regle77 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
