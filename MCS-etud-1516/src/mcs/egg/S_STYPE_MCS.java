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
public class S_STYPE_MCS {
LEX_MCS scanner;
  S_STYPE_MCS() {
    }
  S_STYPE_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  LEX_MCS att_scanner;
  DTYPE att_type;
  LCHAMPS glob_20_lc;
  private void regle19() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_identc);
if  (att_eval)      action_type_19(x_2);
  }
  private void regle18() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_char);
if  (att_eval)      action_type_18();
  }
  private void regle17() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_int);
if  (att_eval)      action_type_17();
  }
  private void regle16() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_void);
if  (att_eval)      action_type_16();
  }
  private void regle20() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_CHAMPS_MCS x_5 = new S_CHAMPS_MCS(scanner,att_eval) ;
    T_MCS x_6 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_20(x_5);
    x_2.analyser(LEX_MCS.token_struct);
    x_3.analyser(LEX_MCS.token_aco);
if  (att_eval)      action_ch_20(x_5);
    x_5.analyser() ;
    x_6.analyser(LEX_MCS.token_acf);
if  (att_eval)      action_type_20(x_5);
  }
private void action_auto_inh_20(S_CHAMPS_MCS x_5) throws Exception {
try {
// instructions
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","STYPE -> struct aco #ch CHAMPS acf #type ;"});
}
  }
private void action_type_20(S_CHAMPS_MCS x_5) throws Exception {
try {
// instructions
this.att_type= new STRUCT(glob_20_lc);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","STYPE -> struct aco #ch CHAMPS acf #type ;"});
}
  }
private void action_type_18() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("char", 1);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","STYPE -> char #type ;"});
}
  }
private void action_type_19(T_MCS x_2) throws Exception {
try {
// locales
INFO loc_i;
// instructions
loc_i=this.att_tds.chercherGlobalement(x_2.att_txt);
if (loc_i==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_type_undefined, MCSMessages.type_undefined,new Object[]{""+x_2.att_txt});

}
else {
if (loc_i instanceof INFOTYPE ){
this.att_type=((INFOTYPE)loc_i).getType();
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_not_infotype, MCSMessages.not_infotype,new Object[]{""+x_2.att_txt});


}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","STYPE -> identc #type ;"});
}
  }
private void action_ch_20(S_CHAMPS_MCS x_5) throws Exception {
try {
// instructions
glob_20_lc= new LCHAMPS();
x_5.att_champs=glob_20_lc;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#ch","STYPE -> struct aco #ch CHAMPS acf #type ;"});
}
  }
private void action_type_16() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("void", 0);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","STYPE -> void #type ;"});
}
  }
private void action_type_17() throws Exception {
try {
// instructions
this.att_type= new DTYPEImpl("int", 1);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","STYPE -> int #type ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_void : // 639
        regle16 () ;
      break ;
      case LEX_MCS.token_int : // 641
        regle17 () ;
      break ;
      case LEX_MCS.token_char : // 642
        regle18 () ;
      break ;
      case LEX_MCS.token_identc : // 666
        regle19 () ;
      break ;
      case LEX_MCS.token_struct : // 643
        regle20 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
