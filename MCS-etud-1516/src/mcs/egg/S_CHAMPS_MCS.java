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
public class S_CHAMPS_MCS {
LEX_MCS scanner;
  S_CHAMPS_MCS() {
    }
  S_CHAMPS_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  LCHAMPS att_champs;
  LEX_MCS att_scanner;
  private void regle22() throws Exception {

    //declaration
    S_CHAMP_MCS x_2 = new S_CHAMP_MCS(scanner,att_eval) ;
    S_CHAMPS_MCS x_3 = new S_CHAMPS_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_22(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle21() throws Exception {

    //declaration
    //appel
  }
private void action_auto_inh_22(S_CHAMP_MCS x_2, S_CHAMPS_MCS x_3) throws Exception {
try {
// instructions
x_2.att_tds=this.att_tds;
x_3.att_tds=this.att_tds;
x_2.att_champs=this.att_champs;
x_3.att_champs=this.att_champs;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","CHAMPS -> CHAMP CHAMPS1 ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_acf : // 40695
        regle21 () ;
      break ;
      case LEX_MCS.token_void : // 40702
        regle22 () ;
      break ;
      case LEX_MCS.token_int : // 40704
        regle22 () ;
      break ;
      case LEX_MCS.token_char : // 40705
        regle22 () ;
      break ;
      case LEX_MCS.token_identc : // 40729
        regle22 () ;
      break ;
      case LEX_MCS.token_struct : // 40706
        regle22 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
