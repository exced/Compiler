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
public class S_ADR_ASM {
LEX_ASM scanner;
  S_ADR_ASM() {
    }
  S_ADR_ASM(LEX_ASM scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_code_asm;
  boolean att_eval;
  TDS att_tds_asm;
  LEX_ASM att_scanner;
  private void regle3() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    T_ASM x_3 = new T_ASM(scanner ) ;
    T_ASM x_4 = new T_ASM(scanner ) ;
    T_ASM x_5 = new T_ASM(scanner ) ;
    T_ASM x_6 = new T_ASM(scanner ) ;
    T_ASM x_7 = new T_ASM(scanner ) ;
    T_ASM x_8 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_paro);
    x_3.analyser(LEX_ASM.token_nb);
    x_4.analyser(LEX_ASM.token_parf);
    x_5.analyser(LEX_ASM.token_nb);
    x_6.analyser(LEX_ASM.token_cro);
    x_7.analyser(LEX_ASM.token_ident);
    x_8.analyser(LEX_ASM.token_crf);
if  (att_eval)      action_gen_3(x_3, x_5, x_7);
  }
  private void regle4() throws Exception {

    //declaration
    T_ASM x_2 = new T_ASM(scanner ) ;
    //appel
    x_2.analyser(LEX_ASM.token_var);
if  (att_eval)      action_gen_4(x_2);
  }
private void action_gen_4(T_ASM x_2) throws Exception {
try {
// locales
INFO loc_i;
INFOVAR loc_v;
Emplacement loc_e;
Register loc_r;
DTYPE loc_t;
// instructions
if (this.att_tds_asm==null){
}
else {
loc_i=this.att_tds_asm.chercherGlobalement(x_2.att_txt.substring(1));
if (loc_i!=null){
if (loc_i instanceof INFOVAR ){
loc_v=((INFOVAR)loc_i);
loc_t=loc_v.getType();
loc_e=loc_v.getEmpl();
loc_r=loc_e.getReg();
this.att_code_asm="("+loc_t.getTaille()+") "+loc_e.getDep()+"["+loc_r.getName()+"]";
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IASMMessages.id_NOT_A_VAR, ASMMessages.NOT_A_VAR,new Object[]{""+x_2.att_txt});


}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IASMMessages.id_UNKNOWN, ASMMessages.UNKNOWN,new Object[]{""+x_2.att_txt});

}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","ADR -> var #gen ;"});
}
  }
private void action_gen_3(T_ASM x_3, T_ASM x_5, T_ASM x_7) throws Exception {
try {
// instructions
this.att_code_asm="("+x_3.att_txt+") "+x_3.att_txt+'['+x_7.att_txt+']';
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "ASM", "#gen","ADR -> paro nb parf nb1 cro ident crf #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_ASM.token_paro : // 145
        regle3 () ;
      break ;
      case LEX_ASM.token_var : // 170
        regle4 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IASMMessages.id_ASM_unexpected_token,ASMMessages.ASM_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
