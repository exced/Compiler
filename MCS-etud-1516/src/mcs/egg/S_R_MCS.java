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
public class S_R_MCS {
LEX_MCS scanner;
  S_R_MCS() {
    }
  S_R_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_identSuper;
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  String att_hmode;
  LEX_MCS att_scanner;
  boolean att_estConditionnelle;
  String att_identClasse;
  int att_sdep;
  boolean att_code_est_adresse;
  DTYPE att_type;
  private void regle48() throws Exception {

    //declaration
    S_T_MCS x_2 = new S_T_MCS(scanner,att_eval) ;
    S_RX_MCS x_4 = new S_RX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_48(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_type_48(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_gen_48(x_2, x_4);
  }
private void action_gen_48(S_T_MCS x_2, S_RX_MCS x_4) throws Exception {
try {
// instructions
this.att_code=x_2.att_code+x_4.att_code;
this.att_code_est_adresse=x_4.att_code_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","R -> T #type RX #gen ;"});
}
  }
private void action_auto_inh_48(S_T_MCS x_2, S_RX_MCS x_4) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_2.att_hmode=this.att_hmode;
x_4.att_hmode=this.att_hmode;
x_2.att_estConditionnelle=this.att_estConditionnelle;
x_4.att_estConditionnelle=this.att_estConditionnelle;
x_2.att_identSuper=this.att_identSuper;
x_4.att_identSuper=this.att_identSuper;
x_2.att_identClasse=this.att_identClasse;
x_4.att_identClasse=this.att_identClasse;
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","R -> T #type RX #gen ;"});
}
  }
private void action_type_48(S_T_MCS x_2, S_RX_MCS x_4) throws Exception {
try {
// instructions
this.att_sdep=x_2.att_sdep;
x_4.att_htype=x_2.att_type;
this.att_type=x_2.att_type;
x_4.att_hcode_est_adresse=x_2.att_code_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","R -> T #type RX #gen ;"});
}
  }
  public void analyser () throws Exception {
    regle48 () ;
  }
  }
