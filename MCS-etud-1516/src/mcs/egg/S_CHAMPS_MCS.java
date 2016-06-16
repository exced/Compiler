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
public class S_CHAMPS_MCS {
LEX_MCS scanner;
  S_CHAMPS_MCS() {
    }
  S_CHAMPS_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  boolean att_eval;
  LCHAMPS att_hchamps;
  LCHAMPS att_champs;
  LEX_MCS att_scanner;
  private void regle22() throws Exception {

    //declaration
    S_CHAMP_MCS x_2 = new S_CHAMP_MCS(scanner,att_eval) ;
    S_CHAMPS_MCS x_4 = new S_CHAMPS_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_22(x_2, x_4);
    x_2.analyser() ;
if  (att_eval)      action_hch_22(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_ch_22(x_2, x_4);
  }
  private void regle21() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_ch_21();
  }
private void action_auto_inh_22(S_CHAMP_MCS x_2, S_CHAMPS_MCS x_4) throws Exception {
try {
// instructions
x_2.att_tds=this.att_tds;
x_4.att_tds=this.att_tds;
x_2.att_hchamps=this.att_hchamps;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","CHAMPS -> CHAMP #hch CHAMPS1 #ch ;"});
}
  }
private void action_hch_22(S_CHAMP_MCS x_2, S_CHAMPS_MCS x_4) throws Exception {
try {
// locales
CHAMP loc_c;
// instructions
loc_c=this.att_hchamps.chercherChamp(x_2.att_sident);
if (loc_c!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_champ_declared, MCSMessages.champ_declared,new Object[]{""+x_2.att_sident, ""+this.att_hchamps});

}
else {
x_2.att_hchamps.inserer( new CHAMP(x_2.att_sident,  new INFOVAR(x_2.att_type, this.att_hchamps.getCurrentDep()), this.att_hchamps.getCurrentDep()));
}
x_4.att_hchamps=this.att_hchamps;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hch","CHAMPS -> CHAMP #hch CHAMPS1 #ch ;"});
}
  }
private void action_ch_22(S_CHAMP_MCS x_2, S_CHAMPS_MCS x_4) throws Exception {
try {
// instructions
this.att_champs=x_4.att_champs;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#ch","CHAMPS -> CHAMP #hch CHAMPS1 #ch ;"});
}
  }
private void action_ch_21() throws Exception {
try {
// instructions
this.att_champs=this.att_hchamps;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#ch","CHAMPS -> #ch ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_acf : // 23767
        regle21 () ;
      break ;
      case LEX_MCS.token_void : // 23774
        regle22 () ;
      break ;
      case LEX_MCS.token_int : // 23776
        regle22 () ;
      break ;
      case LEX_MCS.token_char : // 23777
        regle22 () ;
      break ;
      case LEX_MCS.token_identc : // 23816
        regle22 () ;
      break ;
      case LEX_MCS.token_struct : // 23778
        regle22 () ;
      break ;
      case LEX_MCS.token_bool : // 23788
        regle22 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
