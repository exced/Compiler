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
public class S_OPUN_MCS {
LEX_MCS scanner;
  S_OPUN_MCS() {
    }
  S_OPUN_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
  DTYPE att_type;
  private void regle64() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_moins);
if  (att_eval)      action_type_64();
  }
  private void regle65() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_non);
if  (att_eval)      action_type_65();
  }
  private void regle63() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_plus);
if  (att_eval)      action_type_63();
  }
private void action_type_65() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPUNNON", 1);
this.att_code=this.att_machine.genOp("BNeg");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPUN -> non #type ;"});
}
  }
private void action_type_63() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPUNPLUS", 1);
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPUN -> plus #type ;"});
}
  }
private void action_type_64() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPUNMOINS", 1);
this.att_code=this.att_machine.genOp("Ineg");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPUN -> moins #type ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_plus : // 60478
        regle63 () ;
      break ;
      case LEX_MCS.token_moins : // 60479
        regle64 () ;
      break ;
      case LEX_MCS.token_non : // 60485
        regle65 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
