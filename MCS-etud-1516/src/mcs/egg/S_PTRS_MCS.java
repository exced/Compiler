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
public class S_PTRS_MCS {
LEX_MCS scanner;
  S_PTRS_MCS() {
    }
  S_PTRS_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  DTYPE att_htype;
  boolean att_eval;
  LEX_MCS att_scanner;
  DTYPE att_type;
  private void regle15() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_PTRS_MCS x_4 = new S_PTRS_MCS(scanner,att_eval) ;
    //appel
    x_2.analyser(LEX_MCS.token_mult);
if  (att_eval)      action_htype_15(x_4);
    x_4.analyser() ;
if  (att_eval)      action_type_15(x_4);
  }
  private void regle14() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_type_14();
  }
private void action_htype_15(S_PTRS_MCS x_4) throws Exception {
try {
// instructions
x_4.att_htype= new POINTEUR(this.att_htype);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","PTRS -> mult #htype PTRS1 #type ;"});
}
  }
private void action_type_14() throws Exception {
try {
// instructions
this.att_type=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","PTRS -> #type ;"});
}
  }
private void action_type_15(S_PTRS_MCS x_4) throws Exception {
try {
// instructions
this.att_type=x_4.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","PTRS -> mult #htype PTRS1 #type ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_identc : // 17939
        regle14 () ;
      break ;
      case LEX_MCS.token_ident : // 17938
        regle14 () ;
      break ;
      case LEX_MCS.token_parf : // 17888
        regle14 () ;
      break ;
      case LEX_MCS.token_mult : // 17930
        regle15 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
