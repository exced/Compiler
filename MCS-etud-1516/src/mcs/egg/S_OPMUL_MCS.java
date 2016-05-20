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
public class S_OPMUL_MCS {
LEX_MCS scanner;
  S_OPMUL_MCS() {
    }
  S_OPMUL_MCS(LEX_MCS scanner, boolean eval) {
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
  private void regle56() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_div);
if  (att_eval)      action_type_56();
  }
  private void regle57() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_mod);
if  (att_eval)      action_type_57();
  }
  private void regle58() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_et);
if  (att_eval)      action_type_58();
  }
  private void regle55() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_mult);
if  (att_eval)      action_type_55();
  }
private void action_type_56() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPMULDIV", 1);
this.att_code=this.att_machine.genOp("IDiv");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPMUL -> div #type ;"});
}
  }
private void action_type_57() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPMULMOD", 1);
this.att_code=this.att_machine.genOp("IMod");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPMUL -> mod #type ;"});
}
  }
private void action_type_55() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPMULMULT", 1);
this.att_code=this.att_machine.genOp("IMul");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPMUL -> mult #type ;"});
}
  }
private void action_type_58() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPMULET", 1);
this.att_code=this.att_machine.genOp("BAnd");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPMUL -> et #type ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 12868
        regle55 () ;
      break ;
      case LEX_MCS.token_div : // 12869
        regle56 () ;
      break ;
      case LEX_MCS.token_mod : // 12870
        regle57 () ;
      break ;
      case LEX_MCS.token_et : // 12871
        regle58 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
