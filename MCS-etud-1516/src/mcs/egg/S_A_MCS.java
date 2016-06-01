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
public class S_A_MCS {
LEX_MCS scanner;
  S_A_MCS() {
    }
  S_A_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
  boolean att_code_est_adresse;
  DTYPE att_type;
  private void regle37() throws Exception {

    //declaration
    S_R_MCS x_2 = new S_R_MCS(scanner,att_eval) ;
    S_AX_MCS x_4 = new S_AX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_37(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_type_37(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_gen_37(x_2, x_4);
  }
  private void regle38() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_E_MCS x_4 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_38(x_4);
    x_2.analyser(LEX_MCS.token_malloc);
    x_3.analyser(LEX_MCS.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_gen_38(x_4);
  }
private void action_gen_38(S_E_MCS x_4) throws Exception {
try {
// instructions
if (!(x_4.att_type.compareTo( new DTYPEImpl("int", 1)))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_malloc_need_int, MCSMessages.malloc_need_int,new Object[]{""+x_4.att_type.getNom()});

}
else {
this.att_type= new DTYPEImpl("void", 0);
this.att_code_est_adresse=false;
this.att_code=x_4.att_code+this.att_machine.genOp("MAlloc");
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","A -> malloc paro E parf #gen ;"});
}
  }
private void action_gen_37(S_R_MCS x_2, S_AX_MCS x_4) throws Exception {
try {
// instructions
this.att_code=x_2.att_code+x_4.att_code;
this.att_code_est_adresse=x_4.att_code_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","A -> R #type AX #gen ;"});
}
  }
private void action_auto_inh_37(S_R_MCS x_2, S_AX_MCS x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","A -> R #type AX #gen ;"});
}
  }
private void action_auto_inh_38(S_E_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","A -> malloc paro E parf #gen ;"});
}
  }
private void action_type_37(S_R_MCS x_2, S_AX_MCS x_4) throws Exception {
try {
// instructions
x_4.att_htype=x_2.att_type;
this.att_type=x_2.att_type;
x_4.att_hcode=x_2.att_code;
x_4.att_hcode_est_adresse=x_2.att_code_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","A -> R #type AX #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_entier : // 23079
        regle37 () ;
      break ;
      case LEX_MCS.token_chaine : // 23081
        regle37 () ;
      break ;
      case LEX_MCS.token_caractere : // 23080
        regle37 () ;
      break ;
      case LEX_MCS.token_plus : // 23071
        regle37 () ;
      break ;
      case LEX_MCS.token_moins : // 23072
        regle37 () ;
      break ;
      case LEX_MCS.token_non : // 23078
        regle37 () ;
      break ;
      case LEX_MCS.token_null : // 23064
        regle37 () ;
      break ;
      case LEX_MCS.token_paro : // 23031
        regle37 () ;
      break ;
      case LEX_MCS.token_mult : // 23074
        regle37 () ;
      break ;
      case LEX_MCS.token_ident : // 23082
        regle37 () ;
      break ;
      case LEX_MCS.token_malloc : // 23028
        regle38 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
