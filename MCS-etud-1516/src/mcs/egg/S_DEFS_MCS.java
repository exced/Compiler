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
public class S_DEFS_MCS {
LEX_MCS scanner;
  S_DEFS_MCS() {
    }
  S_DEFS_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  CHAMPCLASSE att_champsclasse;
  IMachine att_machine;
  TDS att_stds;
  LEX_MCS att_scanner;
  private void regle93() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_93();
  }
  private void regle94() throws Exception {

    //declaration
    S_ACCES_MCS x_2 = new S_ACCES_MCS(scanner,att_eval) ;
    S_DEF_MCS x_3 = new S_DEF_MCS(scanner,att_eval) ;
    S_DEFS_MCS x_5 = new S_DEFS_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_94(x_2, x_3, x_5);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_def_94(x_2, x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_gen_94(x_2, x_3, x_5);
  }
private void action_def_94(S_ACCES_MCS x_2, S_DEF_MCS x_3, S_DEFS_MCS x_5) throws Exception {
try {
// locales
INFO loc_i;
TDS loc_tds;
// instructions
loc_i=this.att_tds.chercherLocalement(x_3.att_sident);
if (loc_i!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_def_defined, MCSMessages.def_defined,new Object[]{""+x_3.att_sident, ""+this.att_tds});

}
else {
loc_i.setAcces(x_2.att_acces);
loc_tds=this.att_tds;
loc_tds.inserer(x_3.att_sident, loc_i);
x_5.att_tds=loc_tds;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#def","DEFS -> ACCES DEF #def DEFS1 #gen ;"});
}
  }
private void action_gen_93() throws Exception {
try {
// instructions
this.att_stds=this.att_tds;
this.att_champsclasse=null;
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","DEFS -> #gen ;"});
}
  }
private void action_auto_inh_94(S_ACCES_MCS x_2, S_DEF_MCS x_3, S_DEFS_MCS x_5) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","DEFS -> ACCES DEF #def DEFS1 #gen ;"});
}
  }
private void action_gen_94(S_ACCES_MCS x_2, S_DEF_MCS x_3, S_DEFS_MCS x_5) throws Exception {
try {
// instructions
this.att_code=x_3.att_code+x_5.att_code;
this.att_champsclasse=x_5.att_champsclasse;
this.att_stds=x_5.att_stds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","DEFS -> ACCES DEF #def DEFS1 #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
<<<<<<< HEAD
      case LEX_MCS.token_acf : // 143
        regle93 () ;
      break ;
      case LEX_MCS.token_public : // 161
        regle94 () ;
      break ;
      case LEX_MCS.token_private : // 162
        regle94 () ;
      break ;
      case LEX_MCS.token_void : // 150
        regle94 () ;
      break ;
      case LEX_MCS.token_int : // 152
        regle94 () ;
      break ;
      case LEX_MCS.token_char : // 153
        regle94 () ;
      break ;
      case LEX_MCS.token_identc : // 192
        regle94 () ;
      break ;
      case LEX_MCS.token_struct : // 154
        regle94 () ;
      break ;
      case LEX_MCS.token_bool : // 164
=======
      case LEX_MCS.token_acf : // 7612
        regle93 () ;
      break ;
      case LEX_MCS.token_public : // 7630
        regle94 () ;
      break ;
      case LEX_MCS.token_private : // 7631
        regle94 () ;
      break ;
      case LEX_MCS.token_void : // 7619
        regle94 () ;
      break ;
      case LEX_MCS.token_int : // 7621
        regle94 () ;
      break ;
      case LEX_MCS.token_char : // 7622
        regle94 () ;
      break ;
      case LEX_MCS.token_identc : // 7661
        regle94 () ;
      break ;
      case LEX_MCS.token_struct : // 7623
        regle94 () ;
      break ;
      case LEX_MCS.token_bool : // 7633
>>>>>>> 477cdfe2a07ecea959ec9e3d3c2138087d7362de
        regle94 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
