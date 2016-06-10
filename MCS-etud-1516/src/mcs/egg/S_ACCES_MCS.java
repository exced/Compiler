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
public class S_ACCES_MCS {
LEX_MCS scanner;
  S_ACCES_MCS() {
    }
  S_ACCES_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  LEX_MCS att_scanner;
  String att_acces;
  private void regle88() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_public);
if  (att_eval)      action_acces_88();
  }
  private void regle89() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_private);
if  (att_eval)      action_acces_89();
  }
  private void regle90() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_acces_90();
  }
private void action_acces_90() throws Exception {
try {
// instructions
this.att_acces="def";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#acces","ACCES -> #acces ;"});
}
  }
private void action_acces_89() throws Exception {
try {
// instructions
this.att_acces="private";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#acces","ACCES -> private #acces ;"});
}
  }
private void action_acces_88() throws Exception {
try {
// instructions
this.att_acces="public";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#acces","ACCES -> public #acces ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
<<<<<<< HEAD
      case LEX_MCS.token_public : // 40861
=======
<<<<<<< HEAD
      case LEX_MCS.token_public : // 161
        regle88 () ;
      break ;
      case LEX_MCS.token_private : // 162
        regle89 () ;
      break ;
      case LEX_MCS.token_class : // 160
        regle90 () ;
      break ;
      case LEX_MCS.token_void : // 150
        regle90 () ;
      break ;
      case LEX_MCS.token_int : // 152
        regle90 () ;
      break ;
      case LEX_MCS.token_char : // 153
        regle90 () ;
      break ;
      case LEX_MCS.token_identc : // 192
        regle90 () ;
      break ;
      case LEX_MCS.token_struct : // 154
        regle90 () ;
      break ;
      case LEX_MCS.token_bool : // 164
=======
      case LEX_MCS.token_public : // 7630
>>>>>>> bdbaa92301b44fdaf132c4487868997d8ebc4083
        regle88 () ;
      break ;
      case LEX_MCS.token_private : // 40862
        regle89 () ;
      break ;
      case LEX_MCS.token_class : // 40860
        regle90 () ;
      break ;
      case LEX_MCS.token_void : // 40850
        regle90 () ;
      break ;
      case LEX_MCS.token_int : // 40852
        regle90 () ;
      break ;
      case LEX_MCS.token_char : // 40853
        regle90 () ;
      break ;
      case LEX_MCS.token_identc : // 40892
        regle90 () ;
      break ;
      case LEX_MCS.token_struct : // 40854
        regle90 () ;
      break ;
<<<<<<< HEAD
      case LEX_MCS.token_bool : // 40864
=======
      case LEX_MCS.token_bool : // 7633
>>>>>>> 477cdfe2a07ecea959ec9e3d3c2138087d7362de
>>>>>>> bdbaa92301b44fdaf132c4487868997d8ebc4083
        regle90 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
