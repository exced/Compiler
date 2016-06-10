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
  DTYPE att_htype;
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
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
      case LEX_MCS.token_acf : // 1287
        regle25 () ;
      break ;
      case LEX_MCS.token_void : // 1294
        regle26 () ;
      break ;
      case LEX_MCS.token_int : // 1296
        regle26 () ;
      break ;
      case LEX_MCS.token_char : // 1297
        regle26 () ;
      break ;
      case LEX_MCS.token_identc : // 1336
        regle26 () ;
      break ;
      case LEX_MCS.token_struct : // 1298
        regle26 () ;
      break ;
      case LEX_MCS.token_bool : // 1308
        regle26 () ;
      break ;
      case LEX_MCS.token_entier : // 1332
        regle26 () ;
      break ;
      case LEX_MCS.token_chaine : // 1334
        regle26 () ;
      break ;
      case LEX_MCS.token_caractere : // 1333
        regle26 () ;
      break ;
      case LEX_MCS.token_plus : // 1324
        regle26 () ;
      break ;
      case LEX_MCS.token_moins : // 1325
        regle26 () ;
      break ;
      case LEX_MCS.token_non : // 1331
        regle26 () ;
      break ;
      case LEX_MCS.token_null : // 1317
        regle26 () ;
      break ;
      case LEX_MCS.token_paro : // 1284
        regle26 () ;
      break ;
      case LEX_MCS.token_malloc : // 1281
        regle26 () ;
      break ;
      case LEX_MCS.token_mult : // 1327
        regle26 () ;
      break ;
      case LEX_MCS.token_ident : // 1335
        regle26 () ;
      break ;
      case LEX_MCS.token_true : // 1309
        regle26 () ;
      break ;
      case LEX_MCS.token_false : // 1310
        regle26 () ;
      break ;
      case LEX_MCS.token_aco : // 1286
        regle26 () ;
      break ;
      case LEX_MCS.token_si : // 1292
        regle26 () ;
      break ;
      case LEX_MCS.token_retour : // 1315
        regle26 () ;
      break ;
      case LEX_MCS.token_asm : // 1295
        regle26 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
