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
  TDS att_tds;
  String att_code;
  boolean att_hest_decl;
  boolean att_code_est_adresse;
  DTYPE att_type;
  boolean att_estTestRel;
  String att_identSuper;
  DTYPE att_htype;
  boolean att_eval;
  IMachine att_machine;
  int att_hdep;
  LEX_MCS att_scanner;
  boolean att_estConditionnelle;
  String att_identClasse;
  boolean att_hcode_est_adresse;
  String att_hcode;
  private void regle38() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_type_38();
if  (att_eval)      action_gen_38();
  }
  private void regle37() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_A_MCS x_4 = new S_A_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_37(x_4);
    x_2.analyser(LEX_MCS.token_affect);
if  (att_eval)      action_hmode_37(x_4);
    x_4.analyser() ;
if  (att_eval)      action_type_37(x_4);
if  (att_eval)      action_gen_37(x_4);
  }
private void action_gen_38() throws Exception {
try {
// instructions
if (this.att_hest_decl){
this.att_code=this.att_machine.genVar(this.att_htype.getTaille());
}
else {
this.att_code=this.att_hcode;
}
this.att_estTestRel=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","AFFX -> #type #gen ;"});
}
  }
private void action_hmode_37(S_A_MCS x_4) throws Exception {
try {
// instructions
x_4.att_hmode="droite";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hmode","AFFX -> affect #hmode A #type #gen ;"});
}
  }
private void action_gen_37(S_A_MCS x_4) throws Exception {
try {
// locales
String loc_codeWrite;
// instructions
if (this.att_hcode_est_adresse){
loc_codeWrite=this.att_hcode+this.att_machine.genWriteIndirectMem(this.att_htype.getTaille());
}
else {
loc_codeWrite=this.att_machine.genWriteMem(this.att_hdep, this.att_htype.getTaille());
}
if (this.att_hest_decl){
this.att_code=x_4.att_code;
}
else {
this.att_code=x_4.att_code+loc_codeWrite;
}
this.att_estTestRel=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","AFFX -> affect #hmode A #type #gen ;"});
}
  }
private void action_auto_inh_37(S_A_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_estConditionnelle=this.att_estConditionnelle;
x_4.att_identSuper=this.att_identSuper;
x_4.att_identClasse=this.att_identClasse;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","AFFX -> affect #hmode A #type #gen ;"});
}
  }
private void action_type_38() throws Exception {
try {
// instructions
this.att_code_est_adresse=this.att_hcode_est_adresse;
this.att_type=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","AFFX -> #type #gen ;"});
}
  }
private void action_type_37(S_A_MCS x_4) throws Exception {
try {
// instructions
this.att_code_est_adresse=false;
if (!(this.att_htype.compareTo(x_4.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_affect_notCompatible, MCSMessages.affect_notCompatible,new Object[]{""+this.att_htype.getNom(), ""+x_4.att_type.getNom()});

}
else {
this.att_type=x_4.att_type;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","AFFX -> affect #hmode A #type #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_affect : // 57284
        regle37 () ;
      break ;
      case LEX_MCS.token_pv : // 57283
        regle38 () ;
      break ;
      case LEX_MCS.token_virg : // 57281
        regle38 () ;
      break ;
      case LEX_MCS.token_parf : // 57278
        regle38 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
