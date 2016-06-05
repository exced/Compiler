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
public class S_OPREL_MCS {
LEX_MCS scanner;
  S_OPREL_MCS() {
    }
  S_OPREL_MCS(LEX_MCS scanner, boolean eval) {
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
  private void regle40() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_inf);
if  (att_eval)      action_type_40();
  }
  private void regle41() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_sup);
if  (att_eval)      action_type_41();
  }
  private void regle42() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_infeg);
if  (att_eval)      action_type_42();
  }
  private void regle43() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_supeg);
if  (att_eval)      action_type_43();
  }
  private void regle44() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_eg);
if  (att_eval)      action_type_44();
  }
  private void regle45() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_neg);
if  (att_eval)      action_type_45();
  }
private void action_type_45() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPRELNEG", 1);
this.att_code=this.att_machine.genOp("INeq");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> neg #type ;"});
}
  }
private void action_type_43() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPRELSUPEG", 1);
this.att_code=this.att_machine.genOp("IGeq");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> supeg #type ;"});
}
  }
private void action_type_44() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPRELEG", 1);
this.att_code=this.att_machine.genOp("IEq");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> eg #type ;"});
}
  }
private void action_type_41() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPRELSUP", 1);
this.att_code=this.att_machine.genOp("IGtr");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> sup #type ;"});
}
  }
private void action_type_42() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPRELINFEG", 1);
this.att_code=this.att_machine.genOp("ILeq");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> infeg #type ;"});
}
  }
private void action_type_40() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("OPRELINF", 1);
this.att_code=this.att_machine.genOp("ILss");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","OPREL -> inf #type ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_inf : // 14674
        regle40 () ;
      break ;
      case LEX_MCS.token_sup : // 14676
        regle41 () ;
      break ;
      case LEX_MCS.token_infeg : // 14675
        regle42 () ;
      break ;
      case LEX_MCS.token_supeg : // 14677
        regle43 () ;
      break ;
      case LEX_MCS.token_eg : // 14678
        regle44 () ;
      break ;
      case LEX_MCS.token_neg : // 14679
        regle45 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
