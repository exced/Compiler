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
public class S_AFFX_MCS {
LEX_MCS scanner;
  S_AFFX_MCS() {
    }
  S_AFFX_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  DTYPE att_htype;
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  boolean att_hest_decl;
  LEX_MCS att_scanner;
  boolean att_code_est_adresse;
  DTYPE att_type;
  boolean att_hcode_est_adresse;
  String att_hcode;
  private void regle36() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_type_36();
if  (att_eval)      action_gen_36();
  }
  private void regle35() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_A_MCS x_3 = new S_A_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_35(x_3);
    x_2.analyser(LEX_MCS.token_affect);
    x_3.analyser() ;
if  (att_eval)      action_type_35(x_3);
if  (att_eval)      action_gen_35(x_3);
  }
private void action_type_35(S_A_MCS x_3) throws Exception {
try {
// instructions
this.att_code_est_adresse=false;
if (!(this.att_htype.compareTo(x_3.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_affect_notCompatible, MCSMessages.affect_notCompatible,new Object[]{""+this.att_htype.getNom(), ""+x_3.att_type.getNom()});

}
else {
this.att_type=x_3.att_type;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","AFFX -> affect A #type #gen ;"});
}
  }
private void action_gen_35(S_A_MCS x_3) throws Exception {
try {
// locales
String loc_code;
// instructions
if (this.att_hest_decl){
loc_code=x_3.att_code;
}
else {
if (this.att_hcode_est_adresse){
loc_code=x_3.att_code+this.att_machine.genWriteIndirectMem(this.att_htype.getTaille());
}
else {
loc_code=x_3.att_code+this.att_machine.genWriteMem(this.att_machine.getCurrentDep(), this.att_htype.getTaille());
}
}
this.att_code=loc_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","AFFX -> affect A #type #gen ;"});
}
  }
private void action_auto_inh_35(S_A_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","AFFX -> affect A #type #gen ;"});
}
  }
private void action_gen_36() throws Exception {
try {
// instructions
if (this.att_hest_decl){
this.att_code=this.att_hcode+this.att_machine.genVar(this.att_htype.getTaille());
}
else {
this.att_code=this.att_hcode;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","AFFX -> #type #gen ;"});
}
  }
private void action_type_36() throws Exception {
try {
// instructions
this.att_code_est_adresse=this.att_hcode_est_adresse;
this.att_type=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","AFFX -> #type #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_affect : // 10275
        regle35 () ;
      break ;
      case LEX_MCS.token_pv : // 10274
        regle36 () ;
      break ;
      case LEX_MCS.token_virg : // 10272
        regle36 () ;
      break ;
      case LEX_MCS.token_parf : // 10269
        regle36 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
