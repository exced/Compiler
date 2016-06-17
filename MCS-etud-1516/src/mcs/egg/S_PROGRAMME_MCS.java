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
public class S_PROGRAMME_MCS {
LEX_MCS scanner;
  S_PROGRAMME_MCS() {
    }
  S_PROGRAMME_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  boolean att_eval;
  LEX_MCS att_scanner;
  MCSSourceFile att_source;
  IMachine glob_0_machine;
  String glob_0_code;
  private void regle0() throws Exception {

    //declaration
    S_ENTITES_MCS x_4 = new S_ENTITES_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_init_0(x_4);
if  (att_eval)      action_tds_0(x_4);
    x_4.analyser() ;
if  (att_eval)      action_gen_0(x_4);
  }
private void action_tds_0(S_ENTITES_MCS x_4) throws Exception {
try {
// locales
TDS loc_contenuObject;
TDS loc_tdsParamEquals;
// instructions
x_4.att_tds= new TDS(null);
loc_contenuObject= new TDS(null);
loc_contenuObject.inserer("clone",  new INFOFONC( new DTYPEImpl("Object", 1),  new TDS(loc_contenuObject)));
loc_tdsParamEquals= new TDS(loc_contenuObject);
loc_tdsParamEquals.inserer("obj",  new INFOVAR( new DTYPEImpl("Object", 1), -(1)));
loc_contenuObject.inserer("equals",  new INFOFONC( new DTYPEImpl("bool", 1), loc_tdsParamEquals));
loc_contenuObject.inserer("toString",  new INFOFONC( new DTYPEImpl("String", 1),  new TDS(loc_contenuObject)));
x_4.att_tds.inserer("Object",  new INFOCLASSE("public", loc_contenuObject));
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","PROGRAMME -> #init #tds ENTITES #gen ;"});
}
  }
private void action_gen_0(S_ENTITES_MCS x_4) throws Exception {
try {
// locales
// instructions
glob_0_code="\n"+x_4.att_code+glob_0_machine.genCall("main")+glob_0_machine.genFin();
glob_0_machine.writeCode(this.att_source.getFileName(), glob_0_code);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","PROGRAMME -> #init #tds ENTITES #gen ;"});
}
  }
private void action_init_0(S_ENTITES_MCS x_4) throws Exception {
try {
// locales
// instructions
glob_0_machine=this.att_source.getMachine();
if (glob_0_machine==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_NO_MACH, MCSMessages.NO_MACH,new Object[]{""+this.att_source.getMachName()});

}
else {
x_4.att_machine=glob_0_machine;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#init","PROGRAMME -> #init #tds ENTITES #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_typedef : // 39273
        regle0 () ;
      break ;
      case LEX_MCS.token_void : // 39268
        regle0 () ;
      break ;
      case LEX_MCS.token_int : // 39270
        regle0 () ;
      break ;
      case LEX_MCS.token_char : // 39271
        regle0 () ;
      break ;
      case LEX_MCS.token_identc : // 39310
        regle0 () ;
      break ;
      case LEX_MCS.token_struct : // 39272
        regle0 () ;
      break ;
      case LEX_MCS.token_bool : // 39282
        regle0 () ;
      break ;
      case LEX_MCS.token_asm : // 39269
        regle0 () ;
      break ;
      case LEX_MCS.token_namespace : // 39276
        regle0 () ;
      break ;
      case LEX_MCS.token_using : // 39277
        regle0 () ;
      break ;
      case LEX_MCS.token_public : // 39279
        regle0 () ;
      break ;
      case LEX_MCS.token_private : // 39280
        regle0 () ;
      break ;
      case LEX_MCS.token_class : // 39278
        regle0 () ;
      break ;
      case LEX_MCS.EOF :
        regle0 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
