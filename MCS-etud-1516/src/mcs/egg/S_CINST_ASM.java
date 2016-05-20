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
public class S_CINST_ASM {
LEX_ASM scanner;
  S_CINST_ASM() {
    }
  S_CINST_ASM(LEX_ASM scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_code_asm;
  boolean att_eval;
  LEX_ASM att_scanner;
  private void regle28() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_ident);
if  (att_eval)      action_gen_28(x_2);
  }
  private void regle27() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    T_ASM x_3 = new T_ASM(scanner ) ;
    T_ASM x_4 = new T_ASM(scanner ) ;
    T_ASM x_5 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_nb);
    x_3.analyser(LEX_ASM.token_cro);
    x_4.analyser(LEX_ASM.token_ident);
    x_5.analyser(LEX_ASM.token_crf);
if  (att_eval)      action_gen_27(x_2, x_4);
  }
private void action_gen_28(T_ASM x_2) throws Exception {
try {
// instructions
this.att_code_asm=x_2.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","CINST -> ident #gen ;"});
}
  }
private void action_gen_27(T_ASM x_2, T_ASM x_4) throws Exception {
try {
// instructions
this.att_code_asm=x_2.att_txt+'['+x_4.att_txt+']';
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","CINST -> nb cro ident crf #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_ASM.token_nb : // 109
        regle27 () ;
      break ;
      case LEX_ASM.token_ident : // 111
        regle28 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IASMMessages.id_ASM_unexpected_token,ASMMessages.ASM_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
