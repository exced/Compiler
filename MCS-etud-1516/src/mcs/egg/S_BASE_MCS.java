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
public class S_BASE_MCS {
LEX_MCS scanner;
  S_BASE_MCS() {
    }
  S_BASE_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  String att_ident;
  LEX_MCS att_scanner;
  private void regle97() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_97();
  }
  private void regle98() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_ES_MCS x_5 = new S_ES_MCS(scanner,att_eval) ;
    T_MCS x_6 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_98(x_5);
    x_2.analyser(LEX_MCS.token_dpts);
    x_3.analyser(LEX_MCS.token_base);
    x_4.analyser(LEX_MCS.token_paro);
    x_5.analyser() ;
    x_6.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_gen_98(x_5);
  }
private void action_auto_inh_98(S_ES_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","BASE -> dpts base paro ES parf #gen ;"});
}
  }
private void action_gen_97() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","BASE -> #gen ;"});
}
  }
private void action_gen_98(S_ES_MCS x_5) throws Exception {
try {
// locales
INFO loc_i;
INFOCLASSE loc_ic;
INFOCLASSE loc_icp;
INFO loc_ip;
INFOFONC loc_ipf;
TDS loc_tdsp;
String loc_code;
TDS loc_tdsParam;
TDS loc_tds;
// instructions
loc_code="";
loc_tds=this.att_tds.getParente();
loc_i=loc_tds.chercherClasse(this.att_ident);
if (loc_i==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_classe_undefined, MCSMessages.classe_undefined,new Object[]{""+this.att_ident, ""+this.att_tds});

}
else {
if (loc_i instanceof INFOCLASSE ){
loc_ic=((INFOCLASSE)loc_i);
loc_icp=loc_ic.getParente();
if (loc_icp==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_parent_undefined, MCSMessages.parent_undefined,new Object[]{""+this.att_ident, ""+loc_ic});

}
else {
loc_tdsp=loc_icp.getContenu();
loc_ip=loc_tdsp.chercherLocalement( new DTYPEImpl("constructeur", 0));
if (loc_ip instanceof INFOFONC ){
loc_ipf=((INFOFONC)loc_ip);
loc_tdsParam=loc_ipf.getParams();
if (!(x_5.att_stds.compareTypeTo(loc_tdsParam))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_call_nomatch, MCSMessages.call_nomatch,new Object[]{""+this.att_ident});

}
else {
loc_code=this.att_machine.genArgs(x_5.att_stds)+this.att_machine.genCall(this.att_ident);
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_wrong_typeFonc, MCSMessages.wrong_typeFonc,new Object[]{""+this.att_ident+"_parent ", ""+loc_ip});


}
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_not_infoclasse, MCSMessages.not_infoclasse,new Object[]{""+this.att_ident});


}
}
this.att_code=loc_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","BASE -> dpts base paro ES parf #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_aco : // 16088
        regle97 () ;
      break ;
      case LEX_MCS.token_dpts : // 16109
        regle98 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
