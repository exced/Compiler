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
public class S_DEFS_MCS {
LEX_MCS scanner;
  S_DEFS_MCS() {
    }
  S_DEFS_MCS(LEX_MCS scanner, boolean eval) {
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
  TDS att_stds;
  LEX_MCS att_scanner;
  String att_identClasse;
  private void regle95() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_95();
  }
  private void regle96() throws Exception {

    //declaration
    S_ACCES_MCS x_2 = new S_ACCES_MCS(scanner,att_eval) ;
    S_DEF_MCS x_4 = new S_DEF_MCS(scanner,att_eval) ;
    S_DEFS_MCS x_5 = new S_DEFS_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_96(x_2, x_4, x_5);
    x_2.analyser() ;
if  (att_eval)      action_hacces_96(x_2, x_4, x_5);
    x_4.analyser() ;
    x_5.analyser() ;
if  (att_eval)      action_gen_96(x_2, x_4, x_5);
  }
private void action_auto_inh_96(S_ACCES_MCS x_2, S_DEF_MCS x_4, S_DEFS_MCS x_5) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_4.att_identSuper=this.att_identSuper;
x_5.att_identSuper=this.att_identSuper;
x_4.att_identClasse=this.att_identClasse;
x_5.att_identClasse=this.att_identClasse;
x_4.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","DEFS -> ACCES #hacces DEF DEFS1 #gen ;"});
}
  }
private void action_hacces_96(S_ACCES_MCS x_2, S_DEF_MCS x_4, S_DEFS_MCS x_5) throws Exception {
try {
// instructions
x_4.att_hacces=x_2.att_acces;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hacces","DEFS -> ACCES #hacces DEF DEFS1 #gen ;"});
}
  }
private void action_gen_96(S_ACCES_MCS x_2, S_DEF_MCS x_4, S_DEFS_MCS x_5) throws Exception {
try {
// instructions
this.att_code=x_4.att_code+x_5.att_code;
this.att_stds=x_5.att_stds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","DEFS -> ACCES #hacces DEF DEFS1 #gen ;"});
}
  }
private void action_gen_95() throws Exception {
try {
// instructions
this.att_stds=this.att_tds;
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","DEFS -> #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_acf : // 39261
        regle95 () ;
      break ;
      case LEX_MCS.token_public : // 39279
        regle96 () ;
      break ;
      case LEX_MCS.token_private : // 39280
        regle96 () ;
      break ;
      case LEX_MCS.token_void : // 39268
        regle96 () ;
      break ;
      case LEX_MCS.token_int : // 39270
        regle96 () ;
      break ;
      case LEX_MCS.token_char : // 39271
        regle96 () ;
      break ;
      case LEX_MCS.token_identc : // 39310
        regle96 () ;
      break ;
      case LEX_MCS.token_struct : // 39272
        regle96 () ;
      break ;
      case LEX_MCS.token_bool : // 39282
        regle96 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
