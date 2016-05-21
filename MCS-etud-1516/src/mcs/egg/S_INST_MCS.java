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
public class S_INST_MCS {
LEX_MCS scanner;
  S_INST_MCS() {
    }
  S_INST_MCS(LEX_MCS scanner, boolean eval) {
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
  private void regle30() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_E_MCS x_4 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_6 = new T_MCS(scanner ) ;
    S_BLOC_MCS x_7 = new S_BLOC_MCS(scanner,att_eval) ;
    S_SIX_MCS x_8 = new S_SIX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_30(x_4, x_7, x_8);
    x_2.analyser(LEX_MCS.token_si);
    x_3.analyser(LEX_MCS.token_paro);
    x_4.analyser() ;
if  (att_eval)      action_type_30(x_4, x_7, x_8);
    x_6.analyser(LEX_MCS.token_parf);
    x_7.analyser() ;
    x_8.analyser() ;
if  (att_eval)      action_gen_30(x_4, x_7, x_8);
  }
  private void regle33() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_E_MCS x_3 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_33(x_3);
    x_2.analyser(LEX_MCS.token_retour);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_pv);
if  (att_eval)      action_type_33(x_3);
if  (att_eval)      action_gen_33(x_3);
  }
  private void regle27() throws Exception {

    //declaration
    S_TYPE_MCS x_2 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_AFFX_MCS x_5 = new S_AFFX_MCS(scanner,att_eval) ;
    T_MCS x_6 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_27(x_2, x_3, x_5);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_htype_27(x_2, x_3, x_5);
    x_5.analyser() ;
    x_6.analyser(LEX_MCS.token_pv);
if  (att_eval)      action_tds_27(x_2, x_3, x_5);
if  (att_eval)      action_type_27(x_2, x_3, x_5);
if  (att_eval)      action_gen_27(x_2, x_3, x_5);
  }
  private void regle80() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    ASM x_4 = new ASM(scanner.getReporter(), scanner.contexte);
    //appel
    x_2.analyser(LEX_MCS.token_asm);
if  (att_eval)      action_tds_80(x_4);
    x_4.scanner.setSource(scanner) ;
    x_4.set_eval(true) ;
    x_4.compile() ;
      scanner.setSource(x_4.scanner) ;
if  (att_eval)      action_gen_80(x_4);
  }
  private void regle29() throws Exception {

    //declaration
    S_BLOC_MCS x_2 = new S_BLOC_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_29(x_2);
    x_2.analyser() ;
if  (att_eval)      action_code_29(x_2);
  }
  private void regle28() throws Exception {

    //declaration
    S_E_MCS x_2 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_28(x_2);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_pv);
if  (att_eval)      action_gen_28(x_2);
  }
private void action_gen_80(ASM x_4) throws Exception {
try {
// instructions
this.att_code=x_4.att_code_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INST -> asm #tds ASM #gen ;"});
}
  }
private void action_htype_27(S_TYPE_MCS x_2, T_MCS x_3, S_AFFX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_htype=x_2.att_type;
x_5.att_hcode_est_adresse=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","INST -> TYPE ident #htype AFFX pv #tds #type #gen ;"});
}
  }
private void action_type_33(S_E_MCS x_3) throws Exception {
try {
// instructions
if (!(this.att_htype.compareTo(x_3.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_returnType_notCompatible, MCSMessages.returnType_notCompatible,new Object[]{""+this.att_htype, ""+x_3.att_type});

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","INST -> retour E pv #type #gen ;"});
}
  }
private void action_type_30(S_E_MCS x_4, S_BLOC_MCS x_7, S_SIX_MCS x_8) throws Exception {
try {
// instructions
if (!(x_4.att_type.compareTo( new DTYPEImpl("int", 1)))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_not_int, MCSMessages.not_int,new Object[]{""+x_4.att_type});

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","INST -> si paro E #type parf BLOC SIX #gen ;"});
}
  }
private void action_tds_27(S_TYPE_MCS x_2, T_MCS x_3, S_AFFX_MCS x_5) throws Exception {
try {
// locales
INFO loc_i;
Emplacement loc_e;
// instructions
loc_i=this.att_tds.chercherGlobalement(x_3.att_txt);
if (loc_i!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_var_declared, MCSMessages.var_declared,new Object[]{""+x_3.att_txt});

}
else {
loc_e= new Emplacement(this.att_machine.getCurrentDep(), this.att_machine.getSB());
this.att_machine.addCurrentDep(x_2.att_type.getTaille());
loc_i= new INFOVAR(x_2.att_type, loc_e);
this.att_tds.inserer(x_3.att_txt, loc_i);
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","INST -> TYPE ident #htype AFFX pv #tds #type #gen ;"});
}
  }
private void action_auto_inh_27(S_TYPE_MCS x_2, T_MCS x_3, S_AFFX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> TYPE ident #htype AFFX pv #tds #type #gen ;"});
}
  }
private void action_gen_30(S_E_MCS x_4, S_BLOC_MCS x_7, S_SIX_MCS x_8) throws Exception {
try {
// instructions
this.att_code=this.att_machine.genIf(x_4.att_code, x_7.att_code, x_8.att_code);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INST -> si paro E #type parf BLOC SIX #gen ;"});
}
  }
private void action_auto_inh_28(S_E_MCS x_2) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> E pv #gen ;"});
}
  }
private void action_gen_33(S_E_MCS x_3) throws Exception {
try {
// instructions
this.att_code=x_3.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INST -> retour E pv #type #gen ;"});
}
  }
private void action_auto_inh_29(S_BLOC_MCS x_2) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_2.att_htype=this.att_htype;
x_2.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> BLOC #code ;"});
}
  }
private void action_type_27(S_TYPE_MCS x_2, T_MCS x_3, S_AFFX_MCS x_5) throws Exception {
try {
// instructions
if (!(x_2.att_type.compareTo(x_5.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_11, MCSMessages.B_11,new Object[]{""+x_2.att_type, ""+x_5.att_type});

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","INST -> TYPE ident #htype AFFX pv #tds #type #gen ;"});
}
  }
private void action_gen_28(S_E_MCS x_2) throws Exception {
try {
// instructions
this.att_code=x_2.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INST -> E pv #gen ;"});
}
  }
private void action_gen_27(S_TYPE_MCS x_2, T_MCS x_3, S_AFFX_MCS x_5) throws Exception {
try {
// instructions
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INST -> TYPE ident #htype AFFX pv #tds #type #gen ;"});
}
  }
private void action_auto_inh_30(S_E_MCS x_4, S_BLOC_MCS x_7, S_SIX_MCS x_8) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
x_8.att_machine=this.att_machine;
x_7.att_htype=this.att_htype;
x_8.att_htype=this.att_htype;
x_4.att_tds=this.att_tds;
x_7.att_tds=this.att_tds;
x_8.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> si paro E #type parf BLOC SIX #gen ;"});
}
  }
private void action_auto_inh_33(S_E_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INST -> retour E pv #type #gen ;"});
}
  }
private void action_code_29(S_BLOC_MCS x_2) throws Exception {
try {
// instructions
this.att_code=x_2.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#code","INST -> BLOC #code ;"});
}
  }
private void action_tds_80(ASM x_4) throws Exception {
try {
// instructions
x_4.att_tds_asm=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","INST -> asm #tds ASM #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_void : // 1897
        regle27 () ;
      break ;
      case LEX_MCS.token_int : // 1899
        regle27 () ;
      break ;
      case LEX_MCS.token_char : // 1900
        regle27 () ;
      break ;
      case LEX_MCS.token_identc : // 1924
        regle27 () ;
      break ;
      case LEX_MCS.token_struct : // 1901
        regle27 () ;
      break ;
      case LEX_MCS.token_entier : // 1920
        regle28 () ;
      break ;
      case LEX_MCS.token_chaine : // 1922
        regle28 () ;
      break ;
      case LEX_MCS.token_caractere : // 1921
        regle28 () ;
      break ;
      case LEX_MCS.token_plus : // 1912
        regle28 () ;
      break ;
      case LEX_MCS.token_moins : // 1913
        regle28 () ;
      break ;
      case LEX_MCS.token_non : // 1919
        regle28 () ;
      break ;
      case LEX_MCS.token_null : // 1905
        regle28 () ;
      break ;
      case LEX_MCS.token_paro : // 1887
        regle28 () ;
      break ;
      case LEX_MCS.token_mult : // 1915
        regle28 () ;
      break ;
      case LEX_MCS.token_ident : // 1923
        regle28 () ;
      break ;
      case LEX_MCS.token_aco : // 1889
        regle29 () ;
      break ;
      case LEX_MCS.token_si : // 1895
        regle30 () ;
      break ;
      case LEX_MCS.token_retour : // 1903
        regle33 () ;
      break ;
      case LEX_MCS.token_asm : // 1898
        regle80 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
