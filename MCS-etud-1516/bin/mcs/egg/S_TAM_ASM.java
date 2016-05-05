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
public class S_TAM_ASM {
LEX_ASM scanner;
  S_TAM_ASM() {
    }
  S_TAM_ASM(LEX_ASM scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_code_asm;
  boolean att_eval;
  TDS att_tds_asm;
  LEX_ASM att_scanner;
  private void regle0() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    S_INSTS_ASM x_3 = new S_INSTS_ASM(scanner,att_eval) ;
    T_ASM x_4 = new T_ASM(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_0(x_3);
    x_2.analyser(LEX_ASM.token_aco);
    x_3.analyser() ;
    x_4.analyser(LEX_ASM.token_acf);
if  (att_eval)      action_gen_0(x_3);
  }
private void action_auto_inh_0(S_INSTS_ASM x_3) throws Exception {
try {
// instructions
x_3.att_tds_asm=this.att_tds_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#auto_inh","TAM -> aco INSTS acf #gen ;"});
}
  }
private void action_gen_0(S_INSTS_ASM x_3) throws Exception {
try {
// instructions
this.att_code_asm="; inline code_asm\n"+x_3.att_code_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","TAM -> aco INSTS acf #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_ASM.token_aco : // 688
        regle0 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IASMMessages.id_ASM_unexpected_token,ASMMessages.ASM_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
