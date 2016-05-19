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
public class S_E_MCS {
LEX_MCS scanner;
  S_E_MCS() {
    }
  S_E_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  boolean att_est_affectable;
  LEX_MCS att_scanner;
  boolean att_code_est_adresse;
  DTYPE att_type;
  private void regle34() throws Exception {

    //declaration
    S_A_MCS x_2 = new S_A_MCS(scanner,att_eval) ;
    S_AFFX_MCS x_5 = new S_AFFX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_34(x_2, x_5);
    x_2.analyser() ;
if  (att_eval)      action_aff_34(x_2, x_5);
if  (att_eval)      action_type_34(x_2, x_5);
    x_5.analyser() ;
if  (att_eval)      action_gen_34(x_2, x_5);
  }
private void action_type_34(S_A_MCS x_2, S_AFFX_MCS x_5) throws Exception {
try {
// instructions
this.att_type=x_2.att_type;
x_5.att_htype=x_2.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","E -> A #aff #type AFFX #gen ;"});
}
  }
private void action_auto_inh_34(S_A_MCS x_2, S_AFFX_MCS x_5) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","E -> A #aff #type AFFX #gen ;"});
}
  }
private void action_gen_34(S_A_MCS x_2, S_AFFX_MCS x_5) throws Exception {
try {
// instructions
this.att_code_est_adresse=x_5.att_code_est_adresse;
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","E -> A #aff #type AFFX #gen ;"});
}
  }
private void action_aff_34(S_A_MCS x_2, S_AFFX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_hcode_est_adresse=x_2.att_code_est_adresse;
if (!(x_2.att_est_affectable)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_B_14, MCSMessages.B_14,new Object[]{});

}
else {
this.att_est_affectable=x_2.att_est_affectable;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#aff","E -> A #aff #type AFFX #gen ;"});
}
  }
  public void analyser () throws Exception {
    regle34 () ;
  }
  }
