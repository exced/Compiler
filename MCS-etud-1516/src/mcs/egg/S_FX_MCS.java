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
public class S_FX_MCS {
LEX_MCS scanner;
  S_FX_MCS() {
    }
  S_FX_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  TDS att_tds;
  String att_code;
  String att_ident;
  String att_hmode;
  boolean att_this;
  int att_sdep;
  DTYPE att_type;
  String att_identSuper;
  DTYPE att_htype;
  boolean att_eval;
  IMachine att_machine;
  int att_hdep;
  LEX_MCS att_scanner;
  String att_identClasse;
  String att_hcode;
  boolean att_base;
  private void regle76() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_FX_MCS x_5 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_76(x_3, x_5);
    x_2.analyser(LEX_MCS.token_arrow);
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_htype_76(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_type_76(x_3, x_5);
if  (att_eval)      action_gen_76(x_3, x_5);
  }
  private void regle75() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_FX_MCS x_5 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_75(x_3, x_5);
    x_2.analyser(LEX_MCS.token_pt);
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_a_75(x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_gen_75(x_3, x_5);
  }
  private void regle77() throws Exception {

    //declaration
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_ES_MCS x_4 = new S_ES_MCS(scanner,att_eval) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    S_FX_MCS x_7 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_77(x_4, x_7);
if  (att_eval)      action_tds_77(x_4, x_7);
    x_3.analyser(LEX_MCS.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_htds_77(x_4, x_7);
    x_7.analyser() ;
if  (att_eval)      action_type_77(x_4, x_7);
if  (att_eval)      action_gen_77(x_4, x_7);
  }
  private void regle74() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_74();
  }
private void action_type_76(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
this.att_type=x_5.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> arrow ident #htype FX1 #type #gen ;"});
}
  }
private void action_type_77(S_ES_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
this.att_type=x_7.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","FX -> #tds paro ES parf #htds FX1 #type #gen ;"});
}
  }
private void action_gen_75(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
this.att_type=x_5.att_type;
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> pt ident #a FX1 #gen ;"});
}
  }
private void action_gen_74() throws Exception {
try {
// instructions
this.att_sdep=this.att_hdep;
this.att_type=this.att_htype;
this.att_code=this.att_hcode;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> #gen ;"});
}
  }
private void action_gen_77(S_ES_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// locales
INFO loc_i;
DTYPE loc_t;
INFOFONC loc_infofonc;
TDS loc_tdsParam;
TDS loc_tdsBloc;
TDS loc_tdsClasse;
// instructions
this.att_sdep=this.att_hdep;
if (this.att_this){
loc_tdsBloc=this.att_tds.getParente();
loc_tdsClasse=loc_tdsBloc.getParente();
loc_i=loc_tdsClasse.chercherLocalementFonc(this.att_ident, x_4.att_stds);
}
else {
loc_i=this.att_tds.chercherGlobalementFonc(this.att_ident, x_4.att_stds);
}
loc_t=loc_i.getType();
if (loc_i==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_var_not_found, MCSMessages.var_not_found,new Object[]{""+this.att_ident, ""+this.att_tds});

}

if (loc_i instanceof INFOFONC ){
loc_infofonc=((INFOFONC)loc_i);
loc_tdsParam=loc_infofonc.getParams();
this.att_code=this.att_machine.genArgs(x_4.att_stds)+this.att_machine.genCall(loc_infofonc.getEtq()+this.att_ident);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_not_infofonc, MCSMessages.not_infofonc,new Object[]{""+loc_i});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> #tds paro ES parf #htds FX1 #type #gen ;"});
}
  }
private void action_gen_76(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","FX -> arrow ident #htype FX1 #type #gen ;"});
}
  }
private void action_a_75(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// locales
DTYPE loc_t;
POINTEUR loc_p;
STRUCT loc_s;
CHAMP loc_c;
LCHAMPS loc_lc;
DTYPE loc_ct;
String loc_code;
INFO loc_i;
INFOVAR loc_iv;
INFOFONC loc_inf;
TDS loc_tdsBloc;
TDS loc_tdsClasse;
INFO loc_ic;
INFOCLASSE loc_icc;
DTYPE loc_tt;
// instructions
loc_code="";
loc_i=null;
loc_tdsClasse=null;
if (this.att_this){
loc_tdsBloc=this.att_tds.getParente();
loc_tdsClasse=loc_tdsBloc.getParente();
}

if (this.att_base){
loc_ic=this.att_machine.chercherClasse(this.att_identSuper);
if (loc_ic==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_classe_not_found, MCSMessages.classe_not_found,new Object[]{""+this.att_identSuper, ""+this.att_machine.getClasses(), ""+this.att_machine.getNamespaces()});

}
else {
if (loc_ic instanceof INFOCLASSE ){
loc_icc=((INFOCLASSE)loc_ic);
loc_tdsClasse=loc_icc.getContenu();
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_not_infoclasse, MCSMessages.not_infoclasse,new Object[]{""+loc_ic});


}
}
}

if (this.att_this||this.att_base){
loc_tt= new POINTEUR( new STRUCT(loc_tdsClasse.toChamps()));
}
else {
loc_tt=this.att_htype;
}
if (loc_tt instanceof POINTEUR ){
loc_p=((POINTEUR)loc_tt);
loc_t=loc_p.getType();
if (loc_t instanceof STRUCT ){
loc_s=((STRUCT)loc_t);
loc_lc=loc_s.getChamps();
loc_c=loc_lc.chercherChamp(x_3.att_txt);
loc_ct=loc_c.getType();
this.att_sdep=loc_c.getDep();
if (loc_c==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_champ_not_found, MCSMessages.champ_not_found,new Object[]{""+loc_lc, ""+x_3.att_txt});

}
else {
x_5.att_htype= new POINTEUR(loc_c.getType());
loc_code=this.att_hcode+this.att_machine.genAdrField(loc_c.getDep());
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_type_not_struct, MCSMessages.type_not_struct,new Object[]{""+((POINTEUR)loc_tt).getNom(), ""+x_3.att_txt});


}
}
else if (loc_tt instanceof STRUCT ){
loc_s=((STRUCT)loc_tt);
loc_lc=loc_s.getChamps();
loc_c=loc_lc.chercherChamp(x_3.att_txt);
loc_ct=loc_c.getType();
if (loc_c==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_champ_not_found, MCSMessages.champ_not_found,new Object[]{""+loc_lc, ""+x_3.att_txt});

}
else {
x_5.att_htype=loc_c.getType();
this.att_sdep=loc_c.getDep()+this.att_hdep;
loc_code=this.att_machine.genReadMem(loc_c.getDep()+this.att_hdep, loc_ct.getTaille());
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_type_not_struct, MCSMessages.type_not_struct,new Object[]{""+loc_tt.getNom(), ""+x_3.att_txt});


}
x_5.att_hcode=loc_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#a","FX -> pt ident #a FX1 #gen ;"});
}
  }
private void action_auto_inh_75(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_5.att_hmode=this.att_hmode;
x_5.att_ident=this.att_ident;
x_5.att_identSuper=this.att_identSuper;
x_5.att_identClasse=this.att_identClasse;
x_5.att_hdep=this.att_hdep;
x_5.att_tds=this.att_tds;
x_5.att_this=this.att_this;
x_5.att_base=this.att_base;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> pt ident #a FX1 #gen ;"});
}
  }
private void action_auto_inh_76(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_5.att_hmode=this.att_hmode;
x_5.att_ident=this.att_ident;
x_5.att_identSuper=this.att_identSuper;
x_5.att_identClasse=this.att_identClasse;
x_5.att_hdep=this.att_hdep;
x_5.att_tds=this.att_tds;
x_5.att_this=this.att_this;
x_5.att_base=this.att_base;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> arrow ident #htype FX1 #type #gen ;"});
}
  }
private void action_auto_inh_77(S_ES_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
x_7.att_hmode=this.att_hmode;
x_7.att_ident=this.att_ident;
x_7.att_identSuper=this.att_identSuper;
x_7.att_identClasse=this.att_identClasse;
x_7.att_htype=this.att_htype;
x_7.att_hdep=this.att_hdep;
x_7.att_hcode=this.att_hcode;
x_7.att_this=this.att_this;
x_7.att_base=this.att_base;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","FX -> #tds paro ES parf #htds FX1 #type #gen ;"});
}
  }
private void action_tds_77(S_ES_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
x_4.att_tds= new TDS(null);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","FX -> #tds paro ES parf #htds FX1 #type #gen ;"});
}
  }
private void action_htds_77(S_ES_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
x_7.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htds","FX -> #tds paro ES parf #htds FX1 #type #gen ;"});
}
  }
private void action_htype_76(T_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// locales
DTYPE loc_t;
POINTEUR loc_p;
STRUCT loc_s;
CHAMP loc_c;
LCHAMPS loc_lc;
// instructions
if (this.att_htype instanceof POINTEUR ){
loc_p=((POINTEUR)this.att_htype);
loc_t=loc_p.getType();
if (loc_t instanceof STRUCT ){
loc_s=((STRUCT)loc_t);
loc_lc=loc_s.getChamps();
loc_c=loc_lc.chercherChamp(x_3.att_txt);
if (loc_c==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_champ_not_found, MCSMessages.champ_not_found,new Object[]{""+loc_lc, ""+x_3.att_txt});

}
else {
x_5.att_htype=loc_c.getType();
this.att_sdep=loc_c.getDep()+this.att_hdep;
x_5.att_hcode=this.att_hcode+this.att_machine.genAdrField(loc_c.getDep());
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_type_not_struct, MCSMessages.type_not_struct,new Object[]{""+((POINTEUR)this.att_htype).getNom(), ""+x_3.att_txt});


}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_access_not_pointeur, MCSMessages.access_not_pointeur,new Object[]{""+x_3.att_txt});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","FX -> arrow ident #htype FX1 #type #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_mult : // 57320
        regle74 () ;
      break ;
      case LEX_MCS.token_div : // 57321
        regle74 () ;
      break ;
      case LEX_MCS.token_mod : // 57322
        regle74 () ;
      break ;
      case LEX_MCS.token_et : // 57323
        regle74 () ;
      break ;
      case LEX_MCS.token_plus : // 57317
        regle74 () ;
      break ;
      case LEX_MCS.token_moins : // 57318
        regle74 () ;
      break ;
      case LEX_MCS.token_ou : // 57319
        regle74 () ;
      break ;
      case LEX_MCS.token_inf : // 57311
        regle74 () ;
      break ;
      case LEX_MCS.token_sup : // 57313
        regle74 () ;
      break ;
      case LEX_MCS.token_infeg : // 57312
        regle74 () ;
      break ;
      case LEX_MCS.token_supeg : // 57314
        regle74 () ;
      break ;
      case LEX_MCS.token_eg : // 57315
        regle74 () ;
      break ;
      case LEX_MCS.token_neg : // 57316
        regle74 () ;
      break ;
      case LEX_MCS.token_affect : // 57284
        regle74 () ;
      break ;
      case LEX_MCS.token_virg : // 57281
        regle74 () ;
      break ;
      case LEX_MCS.token_parf : // 57278
        regle74 () ;
      break ;
      case LEX_MCS.token_pv : // 57283
        regle74 () ;
      break ;
      case LEX_MCS.token_pt : // 57282
        regle75 () ;
      break ;
      case LEX_MCS.token_arrow : // 57309
        regle76 () ;
      break ;
      case LEX_MCS.token_paro : // 57277
        regle77 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
