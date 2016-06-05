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
public class S_ENTITES_MCS {
LEX_MCS scanner;
  S_ENTITES_MCS() {
    }
  S_ENTITES_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  TDS att_stds;
  LEX_MCS att_scanner;
  TDS att_tdsNameSpace;
  private void regle2() throws Exception {

    //declaration
    S_ENTITE_MCS x_2 = new S_ENTITE_MCS(scanner,att_eval) ;
    S_ENTITES_MCS x_3 = new S_ENTITES_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_2(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_gen_2(x_2, x_3);
  }
  private void regle1() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_1();
  }
private void action_auto_inh_2(S_ENTITE_MCS x_2, S_ENTITES_MCS x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_3.att_tds=this.att_tds;
x_2.att_tdsNameSpace=this.att_tdsNameSpace;
x_3.att_tdsNameSpace=this.att_tdsNameSpace;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITES -> ENTITE ENTITES1 #gen ;"});
}
  }
private void action_gen_2(S_ENTITE_MCS x_2, S_ENTITES_MCS x_3) throws Exception {
try {
// instructions
this.att_stds=x_3.att_stds;
this.att_code=x_2.att_code+x_3.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ENTITES -> ENTITE ENTITES1 #gen ;"});
}
  }
private void action_gen_1() throws Exception {
try {
// instructions
this.att_stds=this.att_tds;
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ENTITES -> #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_acf : // 14643
        regle1 () ;
      break ;
      case LEX_MCS.EOF :
        regle1 () ;
      break ;
      case LEX_MCS.token_typedef : // 14655
        regle2 () ;
      break ;
      case LEX_MCS.token_void : // 14650
        regle2 () ;
      break ;
      case LEX_MCS.token_int : // 14652
        regle2 () ;
      break ;
      case LEX_MCS.token_char : // 14653
        regle2 () ;
      break ;
      case LEX_MCS.token_identc : // 14692
        regle2 () ;
      break ;
      case LEX_MCS.token_struct : // 14654
        regle2 () ;
      break ;
      case LEX_MCS.token_bool : // 14664
        regle2 () ;
      break ;
      case LEX_MCS.token_asm : // 14651
        regle2 () ;
      break ;
      case LEX_MCS.token_namespace : // 14658
        regle2 () ;
      break ;
      case LEX_MCS.token_using : // 14659
        regle2 () ;
      break ;
      case LEX_MCS.token_public : // 14661
        regle2 () ;
      break ;
      case LEX_MCS.token_private : // 14662
        regle2 () ;
      break ;
      case LEX_MCS.token_class : // 14660
        regle2 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
