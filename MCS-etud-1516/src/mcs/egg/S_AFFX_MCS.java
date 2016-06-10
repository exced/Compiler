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
  INFOVAR att_hiv;
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
    S_A_MCS x_4 = new S_A_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_35(x_4);
    x_2.analyser(LEX_MCS.token_affect);
if  (att_eval)      action_hdecl_35(x_4);
    x_4.analyser() ;
if  (att_eval)      action_type_35(x_4);
if  (att_eval)      action_gen_35(x_4);
  }
private void action_type_35(S_A_MCS x_4) throws Exception {
try {
// instructions
this.att_code_est_adresse=false;
if (!(this.att_htype.compareTo(x_4.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_affect_notCompatible, MCSMessages.affect_notCompatible,new Object[]{""+this.att_htype.getNom(), ""+x_4.att_type.getNom()});

}
else {
this.att_type=x_4.att_type;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","AFFX -> affect #hdecl A #type #gen ;"});
}
  }
private void action_gen_35(S_A_MCS x_4) throws Exception {
try {
// locales
String loc_code;
String loc_codeWrite;
// instructions
if (this.att_hcode_est_adresse){
loc_code=x_4.att_code+this.att_machine.genReadIndirectMem(this.att_htype.getTaille());
}
else {
loc_code=x_4.att_code;
}
if (this.att_hest_decl){
this.att_code=loc_code;
}
else {
if (this.att_hcode_est_adresse){
loc_codeWrite=this.att_machine.genWriteIndirectMem(this.att_htype.getTaille());
}
else {
loc_codeWrite=this.att_machine.genWriteMem(this.att_hiv.getDep(), this.att_htype.getTaille());
}
this.att_code=loc_code+this.att_hcode+loc_codeWrite;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","AFFX -> affect #hdecl A #type #gen ;"});
}
  }
private void action_auto_inh_35(S_A_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","AFFX -> affect #hdecl A #type #gen ;"});
}
  }
private void action_hdecl_35(S_A_MCS x_4) throws Exception {
try {
// instructions
x_4.att_hest_decl=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hdecl","AFFX -> affect #hdecl A #type #gen ;"});
}
  }
private void action_gen_36() throws Exception {
try {
// instructions
if (this.att_hest_decl){
this.att_code=this.att_machine.genVar(this.att_htype.getTaille());
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
      case LEX_MCS.token_affect : // 40847
        regle35 () ;
      break ;
      case LEX_MCS.token_pv : // 40846
        regle36 () ;
      break ;
      case LEX_MCS.token_virg : // 40844
        regle36 () ;
      break ;
      case LEX_MCS.token_parf : // 40841
        regle36 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
