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
public class S_INSTS_MCS {
LEX_MCS scanner;
  S_INSTS_MCS() {
    }
  S_INSTS_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_identSuper;
  DTYPE att_htype;
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
  String att_identClasse;
  private void regle26() throws Exception {

    //declaration
    S_INST_MCS x_2 = new S_INST_MCS(scanner,att_eval) ;
    S_INSTS_MCS x_3 = new S_INSTS_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_26(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_gen_26(x_2, x_3);
  }
  private void regle25() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_25();
  }
private void action_gen_26(S_INST_MCS x_2, S_INSTS_MCS x_3) throws Exception {
try {
// instructions
this.att_code=x_2.att_code+x_3.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INSTS -> INST INSTS1 #gen ;"});
}
  }
private void action_gen_25() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INSTS -> #gen ;"});
}
  }
private void action_auto_inh_26(S_INST_MCS x_2, S_INSTS_MCS x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
x_2.att_identSuper=this.att_identSuper;
x_3.att_identSuper=this.att_identSuper;
x_2.att_identClasse=this.att_identClasse;
x_3.att_identClasse=this.att_identClasse;
x_2.att_htype=this.att_htype;
x_3.att_htype=this.att_htype;
x_2.att_tds=this.att_tds;
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INSTS -> INST INSTS1 #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_acf : // 57280
        regle25 () ;
      break ;
      case LEX_MCS.token_void : // 57287
        regle26 () ;
      break ;
      case LEX_MCS.token_int : // 57289
        regle26 () ;
      break ;
      case LEX_MCS.token_char : // 57290
        regle26 () ;
      break ;
      case LEX_MCS.token_identc : // 57329
        regle26 () ;
      break ;
      case LEX_MCS.token_struct : // 57291
        regle26 () ;
      break ;
      case LEX_MCS.token_bool : // 57301
        regle26 () ;
      break ;
      case LEX_MCS.token_do : // 57273
        regle26 () ;
      break ;
      case LEX_MCS.token_entier : // 57325
        regle26 () ;
      break ;
      case LEX_MCS.token_chaine : // 57327
        regle26 () ;
      break ;
      case LEX_MCS.token_caractere : // 57326
        regle26 () ;
      break ;
      case LEX_MCS.token_plus : // 57317
        regle26 () ;
      break ;
      case LEX_MCS.token_moins : // 57318
        regle26 () ;
      break ;
      case LEX_MCS.token_non : // 57324
        regle26 () ;
      break ;
      case LEX_MCS.token_null : // 57310
        regle26 () ;
      break ;
      case LEX_MCS.token_paro : // 57277
        regle26 () ;
      break ;
      case LEX_MCS.token_malloc : // 57272
        regle26 () ;
      break ;
      case LEX_MCS.token_mult : // 57320
        regle26 () ;
      break ;
      case LEX_MCS.token_ident : // 57328
        regle26 () ;
      break ;
      case LEX_MCS.token_true : // 57302
        regle26 () ;
      break ;
      case LEX_MCS.token_false : // 57303
        regle26 () ;
      break ;
      case LEX_MCS.token_this : // 57304
        regle26 () ;
      break ;
      case LEX_MCS.token_base : // 57307
        regle26 () ;
      break ;
      case LEX_MCS.token_null2 : // 57306
        regle26 () ;
      break ;
      case LEX_MCS.token_new : // 57305
        regle26 () ;
      break ;
      case LEX_MCS.token_aco : // 57279
        regle26 () ;
      break ;
      case LEX_MCS.token_si : // 57285
        regle26 () ;
      break ;
      case LEX_MCS.token_retour : // 57308
        regle26 () ;
      break ;
      case LEX_MCS.token_asm : // 57288
        regle26 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
