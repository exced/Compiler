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
public class S_A_MCS {
LEX_MCS scanner;
  S_A_MCS() {
    }
  S_A_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
  int att_sdep;
  boolean att_code_est_adresse;
  DTYPE att_type;
  private void regle37() throws Exception {

    //declaration
    S_R_MCS x_2 = new S_R_MCS(scanner,att_eval) ;
    S_AX_MCS x_4 = new S_AX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_37(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_type_37(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_gen_37(x_2, x_4);
  }
private void action_gen_37(S_R_MCS x_2, S_AX_MCS x_4) throws Exception {
try {
// instructions
this.att_type=x_4.att_type;
this.att_code=x_2.att_code+x_4.att_code;
this.att_code_est_adresse=x_4.att_code_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","A -> R #type AX #gen ;"});
}
  }
private void action_auto_inh_37(S_R_MCS x_2, S_AX_MCS x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","A -> R #type AX #gen ;"});
}
  }
private void action_type_37(S_R_MCS x_2, S_AX_MCS x_4) throws Exception {
try {
// instructions
this.att_sdep=x_2.att_sdep;
x_4.att_htype=x_2.att_type;
x_4.att_hcode_est_adresse=x_2.att_code_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","A -> R #type AX #gen ;"});
}
  }
  public void analyser () throws Exception {
    regle37 () ;
  }
  }
