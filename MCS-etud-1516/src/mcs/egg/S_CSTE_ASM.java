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
public class S_CSTE_ASM {
LEX_ASM scanner;
  S_CSTE_ASM() {
    }
  S_CSTE_ASM(LEX_ASM scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_code_asm;
  boolean att_eval;
  TDS att_tds_asm;
  LEX_ASM att_scanner;
  private void regle11() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_nb);
if  (att_eval)      action_gen_11(x_2);
  }
  private void regle13() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_car);
if  (att_eval)      action_gen_13(x_2);
  }
  private void regle12() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_chaine);
if  (att_eval)      action_gen_12(x_2);
  }
private void action_gen_13(T_ASM x_2) throws Exception {
try {
// instructions
this.att_code_asm=x_2.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","CSTE -> car #gen ;"});
}
  }
private void action_gen_12(T_ASM x_2) throws Exception {
try {
// instructions
this.att_code_asm=x_2.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","CSTE -> chaine #gen ;"});
}
  }
private void action_gen_11(T_ASM x_2) throws Exception {
try {
// instructions
this.att_code_asm=x_2.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","CSTE -> nb #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_ASM.token_nb : // 2345
        regle11 () ;
      break ;
      case LEX_ASM.token_chaine : // 2343
        regle12 () ;
      break ;
      case LEX_ASM.token_car : // 2344
        regle13 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IASMMessages.id_ASM_unexpected_token,ASMMessages.ASM_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
