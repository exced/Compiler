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
public class S_INST_ASM {
LEX_ASM scanner;
  S_INST_ASM() {
    }
  S_INST_ASM(LEX_ASM scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_code_asm;
  boolean att_eval;
  TDS att_tds_asm;
  LEX_ASM att_scanner;
  private void regle23() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    S_CINST_ASM x_3 = new S_CINST_ASM(scanner,att_eval) ;
    //appel
    x_2.analyser(LEX_ASM.token_jump);
    x_3.analyser() ;
if  (att_eval)      action_gen_23(x_3);
  }
  private void regle22() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    T_ASM x_3 = new T_ASM(scanner ) ;
    T_ASM x_4 = new T_ASM(scanner ) ;
    T_ASM x_5 = new T_ASM(scanner ) ;
    T_ASM x_6 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_pop);
    x_3.analyser(LEX_ASM.token_paro);
    x_4.analyser(LEX_ASM.token_nb);
    x_5.analyser(LEX_ASM.token_parf);
    x_6.analyser(LEX_ASM.token_nb);
if  (att_eval)      action_gen_22(x_4, x_6);
  }
  private void regle5() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_nl);
if  (att_eval)      action_gen_5();
  }
  private void regle10() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    S_CSTE_ASM x_3 = new S_CSTE_ASM(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_10(x_3);
    x_2.analyser(LEX_ASM.token_loadl);
    x_3.analyser() ;
if  (att_eval)      action_gen_10(x_3);
  }
  private void regle21() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    T_ASM x_3 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_push);
    x_3.analyser(LEX_ASM.token_nb);
if  (att_eval)      action_gen_21(x_3);
  }
  private void regle20() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_ident);
if  (att_eval)      action_gen_20(x_2);
  }
  private void regle16() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    T_ASM x_3 = new T_ASM(scanner ) ;
    T_ASM x_4 = new T_ASM(scanner ) ;
    T_ASM x_5 = new T_ASM(scanner ) ;
    S_CINST_ASM x_6 = new S_CINST_ASM(scanner,att_eval) ;
    //appel
    x_2.analyser(LEX_ASM.token_call);
    x_3.analyser(LEX_ASM.token_paro);
    x_4.analyser(LEX_ASM.token_ident);
    x_5.analyser(LEX_ASM.token_parf);
    x_6.analyser() ;
if  (att_eval)      action_gen_16(x_4, x_6);
  }
  private void regle15() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    T_ASM x_3 = new T_ASM(scanner ) ;
    T_ASM x_4 = new T_ASM(scanner ) ;
    T_ASM x_5 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_storei);
    x_3.analyser(LEX_ASM.token_paro);
    x_4.analyser(LEX_ASM.token_nb);
    x_5.analyser(LEX_ASM.token_parf);
if  (att_eval)      action_gen_15(x_4);
  }
  private void regle26() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_halt);
if  (att_eval)      action_gen_26();
  }
  private void regle14() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    S_ADR_ASM x_3 = new S_ADR_ASM(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_14(x_3);
    x_2.analyser(LEX_ASM.token_store);
    x_3.analyser() ;
if  (att_eval)      action_gen_14(x_3);
  }
  private void regle25() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    T_ASM x_3 = new T_ASM(scanner ) ;
    T_ASM x_4 = new T_ASM(scanner ) ;
    T_ASM x_5 = new T_ASM(scanner ) ;
    S_CINST_ASM x_6 = new S_CINST_ASM(scanner,att_eval) ;
    //appel
    x_2.analyser(LEX_ASM.token_jumpif);
    x_3.analyser(LEX_ASM.token_paro);
    x_4.analyser(LEX_ASM.token_nb);
    x_5.analyser(LEX_ASM.token_parf);
    x_6.analyser() ;
if  (att_eval)      action_gen_25(x_4, x_6);
  }
  private void regle24() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_jumpi);
if  (att_eval)      action_gen_24();
  }
  private void regle19() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    T_ASM x_3 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_subr);
    x_3.analyser(LEX_ASM.token_ident);
if  (att_eval)      action_gen_19(x_3);
  }
  private void regle18() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    T_ASM x_3 = new T_ASM(scanner ) ;
    T_ASM x_4 = new T_ASM(scanner ) ;
    T_ASM x_5 = new T_ASM(scanner ) ;
    T_ASM x_6 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_return);
    x_3.analyser(LEX_ASM.token_paro);
    x_4.analyser(LEX_ASM.token_nb);
    x_5.analyser(LEX_ASM.token_parf);
    x_6.analyser(LEX_ASM.token_nb);
if  (att_eval)      action_gen_18(x_4, x_6);
  }
  private void regle17() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_calli);
if  (att_eval)      action_gen_17();
  }
  private void regle7() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    S_ADR_ASM x_3 = new S_ADR_ASM(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_7(x_3);
    x_2.analyser(LEX_ASM.token_load);
    x_3.analyser() ;
if  (att_eval)      action_gen_7(x_3);
  }
  private void regle6() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    T_ASM x_3 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_info);
    x_3.analyser(LEX_ASM.token_nl);
if  (att_eval)      action_gen_6(x_2);
  }
  private void regle9() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    T_ASM x_3 = new T_ASM(scanner ) ;
    T_ASM x_4 = new T_ASM(scanner ) ;
    T_ASM x_5 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_loadi);
    x_3.analyser(LEX_ASM.token_paro);
    x_4.analyser(LEX_ASM.token_nb);
    x_5.analyser(LEX_ASM.token_parf);
if  (att_eval)      action_gen_9(x_4);
  }
  private void regle8() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    S_CINST_ASM x_3 = new S_CINST_ASM(scanner,att_eval) ;
    //appel
    x_2.analyser(LEX_ASM.token_loada);
    x_3.analyser() ;
if  (att_eval)      action_gen_8(x_3);
  }
private void action_auto_inh_7(S_ADR_ASM x_3) throws Exception {
try {
// instructions
x_3.att_tds_asm=this.att_tds_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#auto_inh","INST -> load ADR #gen ;"});
}
  }
private void action_gen_20(T_ASM x_2) throws Exception {
try {
// instructions
this.att_code_asm=x_2.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> ident #gen ;"});
}
  }
private void action_gen_22(T_ASM x_4, T_ASM x_6) throws Exception {
try {
// instructions
this.att_code_asm="\tPOP ("+x_4.att_txt+") "+x_6.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> pop paro nb parf nb1 #gen ;"});
}
  }
private void action_gen_10(S_CSTE_ASM x_3) throws Exception {
try {
// instructions
this.att_code_asm="\tLOADL "+x_3.att_code_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> loadl CSTE #gen ;"});
}
  }
private void action_gen_21(T_ASM x_3) throws Exception {
try {
// instructions
this.att_code_asm="\tPUSH "+x_3.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> push nb #gen ;"});
}
  }
private void action_gen_17() throws Exception {
try {
// instructions
this.att_code_asm="\tCALLI";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> calli #gen ;"});
}
  }
private void action_gen_9(T_ASM x_4) throws Exception {
try {
// instructions
this.att_code_asm="\tLOADI ("+x_4.att_txt+")";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> loadi paro nb parf #gen ;"});
}
  }
private void action_gen_16(T_ASM x_4, S_CINST_ASM x_6) throws Exception {
try {
// instructions
this.att_code_asm="\tCALL ("+x_4.att_txt+") "+x_6.att_code_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> call paro ident parf CINST #gen ;"});
}
  }
private void action_gen_8(S_CINST_ASM x_3) throws Exception {
try {
// instructions
this.att_code_asm="\tLOADA "+x_3.att_code_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> loada CINST #gen ;"});
}
  }
private void action_gen_19(T_ASM x_3) throws Exception {
try {
// instructions
this.att_code_asm="\tSUBR "+x_3.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> subr ident #gen ;"});
}
  }
private void action_gen_7(S_ADR_ASM x_3) throws Exception {
try {
// instructions
this.att_code_asm="\tLOAD "+x_3.att_code_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> load ADR #gen ;"});
}
  }
private void action_auto_inh_10(S_CSTE_ASM x_3) throws Exception {
try {
// instructions
x_3.att_tds_asm=this.att_tds_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#auto_inh","INST -> loadl CSTE #gen ;"});
}
  }
private void action_gen_18(T_ASM x_4, T_ASM x_6) throws Exception {
try {
// instructions
this.att_code_asm="\tRETURN ("+x_4.att_txt+") "+x_6.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> return paro nb parf nb1 #gen ;"});
}
  }
private void action_gen_24() throws Exception {
try {
// instructions
this.att_code_asm="\tJUMPI";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> jumpi #gen ;"});
}
  }
private void action_gen_23(S_CINST_ASM x_3) throws Exception {
try {
// instructions
this.att_code_asm="\tJUMP "+x_3.att_code_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> jump CINST #gen ;"});
}
  }
private void action_gen_15(T_ASM x_4) throws Exception {
try {
// instructions
this.att_code_asm="\tSTOREI ("+x_4.att_txt+")";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> storei paro nb parf #gen ;"});
}
  }
private void action_gen_26() throws Exception {
try {
// instructions
this.att_code_asm="\tHALT";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> halt #gen ;"});
}
  }
private void action_auto_inh_14(S_ADR_ASM x_3) throws Exception {
try {
// instructions
x_3.att_tds_asm=this.att_tds_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#auto_inh","INST -> store ADR #gen ;"});
}
  }
private void action_gen_14(S_ADR_ASM x_3) throws Exception {
try {
// instructions
this.att_code_asm="\tSTORE "+x_3.att_code_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> store ADR #gen ;"});
}
  }
private void action_gen_25(T_ASM x_4, S_CINST_ASM x_6) throws Exception {
try {
// instructions
this.att_code_asm="\tJUMPIF ("+x_4.att_txt+") "+x_6.att_code_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> jumpif paro nb parf CINST #gen ;"});
}
  }
private void action_gen_6(T_ASM x_2) throws Exception {
try {
// instructions
this.att_code_asm="\t"+x_2.att_txt+"\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> info nl #gen ;"});
}
  }
private void action_gen_5() throws Exception {
try {
// instructions
this.att_code_asm="\n";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","INST -> nl #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_ASM.token_nl : // 1819
        regle5 () ;
      break ;
      case LEX_ASM.token_info : // 1825
        regle6 () ;
      break ;
      case LEX_ASM.token_load : // 1803
        regle7 () ;
      break ;
      case LEX_ASM.token_loada : // 1804
        regle8 () ;
      break ;
      case LEX_ASM.token_loadi : // 1805
        regle9 () ;
      break ;
      case LEX_ASM.token_loadl : // 1806
        regle10 () ;
      break ;
      case LEX_ASM.token_store : // 1807
        regle14 () ;
      break ;
      case LEX_ASM.token_storei : // 1808
        regle15 () ;
      break ;
      case LEX_ASM.token_call : // 1809
        regle16 () ;
      break ;
      case LEX_ASM.token_calli : // 1810
        regle17 () ;
      break ;
      case LEX_ASM.token_return : // 1811
        regle18 () ;
      break ;
      case LEX_ASM.token_subr : // 1812
        regle19 () ;
      break ;
      case LEX_ASM.token_ident : // 1824
        regle20 () ;
      break ;
      case LEX_ASM.token_push : // 1813
        regle21 () ;
      break ;
      case LEX_ASM.token_pop : // 1814
        regle22 () ;
      break ;
      case LEX_ASM.token_jump : // 1815
        regle23 () ;
      break ;
      case LEX_ASM.token_jumpi : // 1816
        regle24 () ;
      break ;
      case LEX_ASM.token_jumpif : // 1817
        regle25 () ;
      break ;
      case LEX_ASM.token_halt : // 1818
        regle26 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IASMMessages.id_ASM_unexpected_token,ASMMessages.ASM_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
