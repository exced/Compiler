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
public class S_HERITAGE_MCS {
LEX_MCS scanner;
  S_HERITAGE_MCS() {
    }
  S_HERITAGE_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  INFOCLASSE att_sinfoclasse;
  TDS att_tds;
  boolean att_eval;
  LEX_MCS att_scanner;
  String att_sident;
  private void regle92() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_IDC_MCS x_5 = new S_IDC_MCS(scanner,att_eval) ;
    //appel
    x_2.analyser(LEX_MCS.token_dpts);
    x_3.analyser(LEX_MCS.token_identc);
if  (att_eval)      action_ident_92(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_sident_92(x_3, x_5);
  }
  private void regle91() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_sident_91();
  }
private void action_ident_92(T_MCS x_3, S_IDC_MCS x_5) throws Exception {
try {
// instructions
x_5.att_ident=x_3.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#ident","HERITAGE -> dpts identc #ident IDC #sident ;"});
}
  }
private void action_sident_91() throws Exception {
try {
// instructions
this.att_sident="";
this.att_sinfoclasse=null;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#sident","HERITAGE -> #sident ;"});
}
  }
private void action_sident_92(T_MCS x_3, S_IDC_MCS x_5) throws Exception {
try {
// locales
INFO loc_i;
INFOCLASSE loc_ic;
// instructions
this.att_sident=x_5.att_sident;
loc_i=this.att_tds.chercherClasse(x_5.att_sident);
if (loc_i==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_classe_undefined, MCSMessages.classe_undefined,new Object[]{""+x_3.att_txt, ""+this.att_tds});

}
else {
loc_ic=loc_i;
this.att_sinfoclasse=loc_ic;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#sident","HERITAGE -> dpts identc #ident IDC #sident ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
<<<<<<< HEAD
      case LEX_MCS.token_aco : // 142
        regle91 () ;
      break ;
      case LEX_MCS.token_dpts : // 163
=======
      case LEX_MCS.token_aco : // 7611
        regle91 () ;
      break ;
      case LEX_MCS.token_dpts : // 7632
>>>>>>> 477cdfe2a07ecea959ec9e3d3c2138087d7362de
        regle92 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
