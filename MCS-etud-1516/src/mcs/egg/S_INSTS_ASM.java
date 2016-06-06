package mcs.egg;
import mcs.tds.*;
import mcs.type.*;
import java.util.*;
import mcs.gc.*;
import mg.egg.eggc.runtime.libjava.lex.*;
import mg.egg.eggc.runtime.libjava.*;
import mg.egg.eggc.runtime.libjava.messages.*;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import java.util.Vector;
public class S_INSTS_ASM {
LEX_ASM scanner;
  S_INSTS_ASM() {
    }
  S_INSTS_ASM(LEX_ASM scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_code_asm;
  boolean att_eval;
  TDS att_tds_asm;
  LEX_ASM att_scanner;
  private void regle2() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_2();
  }
  private void regle1() throws Exception {

    //declaration
    S_INST_ASM x_2 = new S_INST_ASM(scanner,att_eval) ;
    S_INSTS_ASM x_3 = new S_INSTS_ASM(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_1(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_gen_1(x_2, x_3);
  }
private void action_gen_2() throws Exception {
try {
// instructions
this.att_code_asm="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INSTS -> #gen ;"});
}
  }
private void action_gen_1(S_INST_ASM x_2, S_INSTS_ASM x_3) throws Exception {
try {
// instructions
this.att_code_asm=x_2.att_code_asm+"\n"+x_3.att_code_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INSTS -> INST INSTS1 #gen ;"});
}
  }
private void action_auto_inh_1(S_INST_ASM x_2, S_INSTS_ASM x_3) throws Exception {
try {
// instructions
x_2.att_tds_asm=this.att_tds_asm;
x_3.att_tds_asm=this.att_tds_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#auto_inh","INSTS -> INST INSTS1 #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_ASM.token_nl : // 262
        regle1 () ;
      break ;
      case LEX_ASM.token_info : // 268
        regle1 () ;
      break ;
      case LEX_ASM.token_load : // 246
        regle1 () ;
      break ;
      case LEX_ASM.token_loada : // 247
        regle1 () ;
      break ;
      case LEX_ASM.token_loadi : // 248
        regle1 () ;
      break ;
      case LEX_ASM.token_loadl : // 249
        regle1 () ;
      break ;
      case LEX_ASM.token_store : // 250
        regle1 () ;
      break ;
      case LEX_ASM.token_storei : // 251
        regle1 () ;
      break ;
      case LEX_ASM.token_call : // 252
        regle1 () ;
      break ;
      case LEX_ASM.token_calli : // 253
        regle1 () ;
      break ;
      case LEX_ASM.token_return : // 254
        regle1 () ;
      break ;
      case LEX_ASM.token_subr : // 255
        regle1 () ;
      break ;
      case LEX_ASM.token_ident : // 267
        regle1 () ;
      break ;
      case LEX_ASM.token_push : // 256
        regle1 () ;
      break ;
      case LEX_ASM.token_pop : // 257
        regle1 () ;
      break ;
      case LEX_ASM.token_jump : // 258
        regle1 () ;
      break ;
      case LEX_ASM.token_jumpi : // 259
        regle1 () ;
      break ;
      case LEX_ASM.token_jumpif : // 260
        regle1 () ;
      break ;
      case LEX_ASM.token_halt : // 261
        regle1 () ;
      break ;
      case LEX_ASM.token_acf : // 245
        regle2 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IASMMessages.id_ASM_unexpected_token,ASMMessages.ASM_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
