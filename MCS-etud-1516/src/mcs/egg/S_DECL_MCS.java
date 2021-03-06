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
public class S_DECL_MCS {
LEX_MCS scanner;
  S_DECL_MCS() {
    }
  S_DECL_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  String att_identSuper;
  DTYPE att_htype;
  TDS att_tds;
  boolean att_eval;
  String att_code;
  INFO att_sinfo;
  IMachine att_machine;
  String att_ident;
  LEX_MCS att_scanner;
  String att_identClasse;
  String att_hacces;
  DTYPE glob_5_type;
  INFOVAR glob_5_iv;
  INFO glob_5_i;
  private void regle6() throws Exception {

    //declaration
    S_FONCTION_MCS x_3 = new S_FONCTION_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_6(x_3);
if  (att_eval)      action_ident_6(x_3);
    x_3.analyser() ;
if  (att_eval)      action_gen_6(x_3);
if  (att_eval)      action_sinfo_6(x_3);
  }
  private void regle5() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_pv);
if  (att_eval)      action_tds_5();
if  (att_eval)      action_gen_5();
  }
private void action_ident_6(S_FONCTION_MCS x_3) throws Exception {
try {
// instructions
x_3.att_ident=this.att_ident;
x_3.att_htype=this.att_htype;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#ident","DECL -> #ident FONCTION #gen #sinfo ;"});
}
  }
private void action_auto_inh_6(S_FONCTION_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_identSuper=this.att_identSuper;
x_3.att_identClasse=this.att_identClasse;
x_3.att_tds=this.att_tds;
x_3.att_hacces=this.att_hacces;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","DECL -> #ident FONCTION #gen #sinfo ;"});
}
  }
private void action_tds_5() throws Exception {
try {
// instructions
glob_5_i=this.att_tds.chercherGlobalement(this.att_ident);
if (glob_5_i!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_var_declared, MCSMessages.var_declared,new Object[]{""+this.att_ident});

}
else {
glob_5_type=this.att_htype;
glob_5_iv= new INFOVAR(glob_5_type, this.att_machine.getCurrentDep());
glob_5_iv.setAcces(this.att_hacces);
this.att_tds.inserer(this.att_ident, glob_5_iv);
this.att_machine.addCurrentDep(glob_5_type.getTaille());
this.att_sinfo=glob_5_iv;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","DECL -> pv #tds #gen ;"});
}
  }
private void action_gen_6(S_FONCTION_MCS x_3) throws Exception {
try {
// instructions
this.att_code=x_3.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","DECL -> #ident FONCTION #gen #sinfo ;"});
}
  }
private void action_gen_5() throws Exception {
try {
// instructions
if (glob_5_type instanceof POINTEUR ){
this.att_code=this.att_machine.genMalloc(((POINTEUR)glob_5_type).getTaille());
}
else if (glob_5_type instanceof STRUCT ){
this.att_code=this.att_machine.genMalloc(((STRUCT)glob_5_type).getTaille());
}
else {
this.att_code=this.att_machine.genVar(glob_5_type.getTaille());

}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","DECL -> pv #tds #gen ;"});
}
  }
private void action_sinfo_6(S_FONCTION_MCS x_3) throws Exception {
try {
// instructions
this.att_sinfo=x_3.att_sinfo;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#sinfo","DECL -> #ident FONCTION #gen #sinfo ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_pv : // 57283
        regle5 () ;
      break ;
      case LEX_MCS.token_paro : // 57277
        regle6 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
