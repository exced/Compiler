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
public class S_F_MCS {
LEX_MCS scanner;
  S_F_MCS() {
    }
  S_F_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
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
  boolean att_hcode_est_adresse;
  INFOFONC glob_73_infofonc;
  DTYPE glob_73_t;
  INFOVAR glob_73_iv;
  private void regle61() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_entier);
if  (att_eval)      action_gen_61(x_2);
  }
  private void regle72() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_F_MCS x_4 = new S_F_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_72(x_4);
    x_2.analyser(LEX_MCS.token_mult);
if  (att_eval)      action_ptr_72(x_4);
    x_4.analyser() ;
if  (att_eval)      action_type_72(x_4);
if  (att_eval)      action_addr_72(x_4);
  }
  private void regle71() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_E_MCS x_5 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_6 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_71(x_5);
    x_2.analyser(LEX_MCS.token_malloc);
    x_3.analyser(LEX_MCS.token_paro);
if  (att_eval)      action_hcond_71(x_5);
    x_5.analyser() ;
    x_6.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_gen_71(x_5);
  }
  private void regle63() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_caractere);
if  (att_eval)      action_gen_63(x_2);
  }
  private void regle62() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_chaine);
if  (att_eval)      action_gen_62(x_2);
  }
  private void regle73() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_FX_MCS x_4 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_73(x_2, x_4);
    x_2.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_htype_73(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_gen_73(x_2, x_4);
  }
  private void regle64() throws Exception {

    //declaration
    S_OPUN_MCS x_3 = new S_OPUN_MCS(scanner,att_eval) ;
    S_F_MCS x_4 = new S_F_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_64(x_3, x_4);
if  (att_eval)      action_mode_64(x_3, x_4);
    x_3.analyser() ;
    x_4.analyser() ;
if  (att_eval)      action_type_64(x_3, x_4);
if  (att_eval)      action_gen_64(x_3, x_4);
  }
  private void regle69() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_E_MCS x_4 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    S_FX_MCS x_7 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_69(x_4, x_7);
    x_2.analyser(LEX_MCS.token_paro);
if  (att_eval)      action_hcond_69(x_4, x_7);
    x_4.analyser() ;
    x_5.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_addr_69(x_4, x_7);
    x_7.analyser() ;
if  (att_eval)      action_type_69(x_4, x_7);
if  (att_eval)      action_gen_69(x_4, x_7);
  }
  private void regle68() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_null);
if  (att_eval)      action_type_68();
  }
  private void regle104() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_true);
if  (att_eval)      action_gen_104();
  }
  private void regle105() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_false);
if  (att_eval)      action_gen_105();
  }
  private void regle106() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_FX_MCS x_4 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_106(x_4);
    x_2.analyser(LEX_MCS.token_this);
if  (att_eval)      action_this_106(x_4);
    x_4.analyser() ;
if  (att_eval)      action_type_106(x_4);
  }
  private void regle107() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_FX_MCS x_4 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_107(x_4);
    x_2.analyser(LEX_MCS.token_base);
if  (att_eval)      action_base_107(x_4);
    x_4.analyser() ;
if  (att_eval)      action_gen_107(x_4);
  }
  private void regle108() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_null2);
if  (att_eval)      action_gen_108();
  }
  private void regle109() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_IDC_MCS x_5 = new S_IDC_MCS(scanner,att_eval) ;
    T_MCS x_6 = new T_MCS(scanner ) ;
    S_ES_MCS x_7 = new S_ES_MCS(scanner,att_eval) ;
    T_MCS x_8 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_109(x_3, x_5, x_7);
    x_2.analyser(LEX_MCS.token_new);
    x_3.analyser(LEX_MCS.token_identc);
if  (att_eval)      action_ident_109(x_3, x_5, x_7);
    x_5.analyser() ;
    x_6.analyser(LEX_MCS.token_paro);
    x_7.analyser() ;
    x_8.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_gen_109(x_3, x_5, x_7);
  }
  private void regle70() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_TYPE_MCS x_3 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_F_MCS x_5 = new S_F_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_70(x_3, x_5);
    x_2.analyser(LEX_MCS.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_parf);
    x_5.analyser() ;
if  (att_eval)      action_type_70(x_3, x_5);
if  (att_eval)      action_gen_70(x_3, x_5);
  }
private void action_type_68() throws Exception {
try {
// instructions
this.att_sdep=-(1);
this.att_type= new DTYPEImpl("PNULL", 1);
this.att_code_est_adresse=false;
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> null #type ;"});
}
  }
private void action_type_64(S_OPUN_MCS x_3, S_F_MCS x_4) throws Exception {
try {
// instructions
this.att_sdep=-(1);
if (!(x_4.att_type.compareOpUn(x_3.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_typeError_opUn, MCSMessages.typeError_opUn,new Object[]{""+x_4.att_type.getNom(), ""+x_3.att_type.getNom()});

}
else {
this.att_type=x_4.att_type;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> #mode OPUN F1 #type #gen ;"});
}
  }
private void action_hcond_71(S_E_MCS x_5) throws Exception {
try {
// instructions
x_5.att_estConditionnelle=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hcond","F -> malloc paro #hcond E parf #gen ;"});
}
  }
private void action_addr_69(S_E_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
this.att_sdep=x_4.att_sdep;
x_7.att_hdep=x_4.att_sdep;
x_7.att_ident="";
x_7.att_base=false;
x_7.att_this=false;
this.att_code_est_adresse=x_4.att_code_est_adresse;
x_7.att_htype=x_4.att_type;
x_7.att_hcode=x_4.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#addr","F -> paro #hcond E parf #addr FX #type #gen ;"});
}
  }
private void action_type_106(S_FX_MCS x_4) throws Exception {
try {
// instructions
this.att_type=x_4.att_type;
this.att_sdep=x_4.att_sdep;
this.att_code=x_4.att_code;
this.att_code_est_adresse=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> this #this FX #type ;"});
}
  }
private void action_gen_64(S_OPUN_MCS x_3, S_F_MCS x_4) throws Exception {
try {
// instructions
this.att_code_est_adresse=false;
this.att_code=x_4.att_code+x_3.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> #mode OPUN F1 #type #gen ;"});
}
  }
private void action_gen_63(T_MCS x_2) throws Exception {
try {
// instructions
this.att_sdep=-(1);
this.att_type= new DTYPEImpl("char", 1);
this.att_code_est_adresse=false;
this.att_code=this.att_machine.genCst(x_2.att_txt);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> caractere #gen ;"});
}
  }
private void action_ident_109(T_MCS x_3, S_IDC_MCS x_5, S_ES_MCS x_7) throws Exception {
try {
// instructions
x_5.att_ident=x_3.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#ident","F -> new identc #ident IDC paro ES parf #gen ;"});
}
  }
private void action_gen_62(T_MCS x_2) throws Exception {
try {
// instructions
this.att_sdep=-(1);
this.att_type= new DTYPEImpl("chaine", 3);
this.att_code_est_adresse=false;
this.att_code=this.att_machine.genCst(x_2.att_txt);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> chaine #gen ;"});
}
  }
private void action_type_69(S_E_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
if (!(x_4.att_type.compareTo(x_7.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_castError, MCSMessages.castError,new Object[]{""+x_4.att_type.getNom(), ""+x_7.att_type.getNom()});

}
else {
this.att_type=x_4.att_type;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> paro #hcond E parf #addr FX #type #gen ;"});
}
  }
private void action_gen_61(T_MCS x_2) throws Exception {
try {
// instructions
this.att_sdep=-(1);
this.att_type= new DTYPEImpl("int", 1);
this.att_code_est_adresse=false;
this.att_code=this.att_machine.genCst(x_2.att_txt);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> entier #gen ;"});
}
  }
private void action_auto_inh_64(S_OPUN_MCS x_3, S_F_MCS x_4) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_4.att_machine=this.att_machine;
x_4.att_hmode=this.att_hmode;
x_4.att_estConditionnelle=this.att_estConditionnelle;
x_4.att_identClasse=this.att_identClasse;
x_4.att_tds=this.att_tds;
x_4.att_hcode_est_adresse=this.att_hcode_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> #mode OPUN F1 #type #gen ;"});
}
  }
private void action_auto_inh_69(S_E_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_7.att_machine=this.att_machine;
x_7.att_hmode=this.att_hmode;
x_4.att_identClasse=this.att_identClasse;
x_7.att_identClasse=this.att_identClasse;
x_4.att_tds=this.att_tds;
x_7.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> paro #hcond E parf #addr FX #type #gen ;"});
}
  }
private void action_gen_69(S_E_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
this.att_code=x_7.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> paro #hcond E parf #addr FX #type #gen ;"});
}
  }
private void action_type_70(S_TYPE_MCS x_3, S_F_MCS x_5) throws Exception {
try {
// instructions
if (x_5.att_type.compareTo( new DTYPEImpl("void", 0))){
this.att_type=x_3.att_type;
}
else {
if (!(x_5.att_type.isCastableAs(x_3.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_not_castable_as, MCSMessages.not_castable_as,new Object[]{""+x_5.att_type.getNom(), ""+x_3.att_type.getNom()});

}
else {
this.att_type=x_3.att_type;
this.att_sdep=x_5.att_sdep;
}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> paro TYPE parf F1 #type #gen ;"});
}
  }
private void action_base_107(S_FX_MCS x_4) throws Exception {
try {
// instructions
x_4.att_ident="";
x_4.att_hdep=0;
x_4.att_htype=null;
x_4.att_hcode="";
x_4.att_this=false;
x_4.att_base=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#base","F -> base #base FX #gen ;"});
}
  }
private void action_type_72(S_F_MCS x_4) throws Exception {
try {
// locales
POINTEUR loc_p;
// instructions
this.att_sdep=x_4.att_sdep;
if (x_4.att_type instanceof POINTEUR ){
loc_p=((POINTEUR)x_4.att_type);
this.att_type=loc_p.getType();
this.att_code_est_adresse=true;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_not_pointeur, MCSMessages.not_pointeur,new Object[]{""+x_4.att_type.getNom()});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> mult #ptr F1 #type #addr ;"});
}
  }
private void action_auto_inh_106(S_FX_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_hmode=this.att_hmode;
x_4.att_identClasse=this.att_identClasse;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> this #this FX #type ;"});
}
  }
private void action_this_106(S_FX_MCS x_4) throws Exception {
try {
// instructions
x_4.att_ident="";
x_4.att_hdep=0;
x_4.att_htype=null;
x_4.att_hcode="";
x_4.att_this=true;
x_4.att_base=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#this","F -> this #this FX #type ;"});
}
  }
private void action_gen_71(S_E_MCS x_5) throws Exception {
try {
// instructions
this.att_sdep=x_5.att_sdep;
if (!(x_5.att_type.compareTo( new DTYPEImpl("int", 1)))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_malloc_need_int, MCSMessages.malloc_need_int,new Object[]{""+x_5.att_type.getNom()});

}
else {
this.att_type= new DTYPEImpl("void", 0);
this.att_code_est_adresse=false;
this.att_code=x_5.att_code+this.att_machine.genOp("MAlloc");
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> malloc paro #hcond E parf #gen ;"});
}
  }
private void action_gen_70(S_TYPE_MCS x_3, S_F_MCS x_5) throws Exception {
try {
// instructions
this.att_code=x_5.att_code;
this.att_code_est_adresse=x_5.att_code_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> paro TYPE parf F1 #type #gen ;"});
}
  }
private void action_auto_inh_107(S_FX_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_hmode=this.att_hmode;
x_4.att_identClasse=this.att_identClasse;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> base #base FX #gen ;"});
}
  }
private void action_gen_73(T_MCS x_2, S_FX_MCS x_4) throws Exception {
try {
// instructions
this.att_sdep=x_4.att_sdep;
this.att_type=x_4.att_type;
this.att_code=x_4.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> ident #htype FX #gen ;"});
}
  }
private void action_auto_inh_109(T_MCS x_3, S_IDC_MCS x_5, S_ES_MCS x_7) throws Exception {
try {
// instructions
x_7.att_machine=this.att_machine;
x_7.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> new identc #ident IDC paro ES parf #gen ;"});
}
  }
private void action_auto_inh_73(T_MCS x_2, S_FX_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_hmode=this.att_hmode;
x_4.att_identClasse=this.att_identClasse;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> ident #htype FX #gen ;"});
}
  }
private void action_hcond_69(S_E_MCS x_4, S_FX_MCS x_7) throws Exception {
try {
// instructions
x_4.att_estConditionnelle=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#hcond","F -> paro #hcond E parf #addr FX #type #gen ;"});
}
  }
private void action_gen_105() throws Exception {
try {
// instructions
this.att_sdep=1;
this.att_type= new DTYPEImpl("bool", 1);
this.att_code_est_adresse=false;
this.att_code=this.att_machine.genCst("0");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> false #gen ;"});
}
  }
private void action_gen_104() throws Exception {
try {
// instructions
this.att_sdep=1;
this.att_type= new DTYPEImpl("bool", 1);
this.att_code_est_adresse=false;
this.att_code=this.att_machine.genCst("1");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> true #gen ;"});
}
  }
private void action_htype_73(T_MCS x_2, S_FX_MCS x_4) throws Exception {
try {
// locales
INFO loc_i;
INFO loc_i2;
String loc_code;
// instructions
loc_code="";
x_4.att_base=false;
x_4.att_this=false;
x_4.att_ident=x_2.att_txt;
loc_i=this.att_tds.chercherGlobalement(x_2.att_txt);
if (loc_i==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_var_not_found, MCSMessages.var_not_found,new Object[]{""+x_2.att_txt, ""+this.att_tds});

}
else {
if (loc_i instanceof INFOVAR ){
glob_73_iv=((INFOVAR)loc_i);
glob_73_t=glob_73_iv.getType();
x_4.att_hdep=glob_73_iv.getDep();
x_4.att_htype=glob_73_t;
this.att_code_est_adresse=false;
if (glob_73_iv.matchMode(this.att_hmode)){
if (this.att_hcode_est_adresse){
loc_code=this.att_machine.genAdr(glob_73_iv.getDep())+this.att_machine.genReadIndirectMem(glob_73_t.getTaille());
}
else {
loc_code=this.att_machine.genReadMem(glob_73_iv.getDep(), glob_73_iv.getTaille());
}
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_mode_mismatch, MCSMessages.mode_mismatch,new Object[]{""+x_2.att_txt, ""+glob_73_iv.getMode(), ""+this.att_hmode});

}
x_4.att_hcode=loc_code;
}
else if (loc_i instanceof INFOFONC ){
glob_73_infofonc=((INFOFONC)loc_i);
glob_73_t=glob_73_infofonc.getType();
x_4.att_htype=glob_73_t;
x_4.att_hcode="";
this.att_code_est_adresse=false;
loc_code="";
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_type_unknown, MCSMessages.type_unknown,new Object[]{""+x_2.att_txt, ""+loc_i.getType()});


}
x_4.att_htype=glob_73_t;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","F -> ident #htype FX #gen ;"});
}
  }
private void action_ptr_72(S_F_MCS x_4) throws Exception {
try {
// instructions
x_4.att_hcode_est_adresse=true;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#ptr","F -> mult #ptr F1 #type #addr ;"});
}
  }
private void action_mode_64(S_OPUN_MCS x_3, S_F_MCS x_4) throws Exception {
try {
// instructions
if (!(this.att_estConditionnelle)){
if (this.att_machine.stringEquals("gauche", this.att_hmode)){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_Expr_not_aff, MCSMessages.Expr_not_aff,new Object[]{""+"OPUN", ""+this.att_hmode});

}

}

}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#mode","F -> #mode OPUN F1 #type #gen ;"});
}
  }
private void action_gen_107(S_FX_MCS x_4) throws Exception {
try {
// instructions
this.att_type=x_4.att_type;
this.att_sdep=x_4.att_sdep;
this.att_code=x_4.att_code;
this.att_code_est_adresse=false;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> base #base FX #gen ;"});
}
  }
private void action_auto_inh_70(S_TYPE_MCS x_3, S_F_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_5.att_hmode=this.att_hmode;
x_5.att_estConditionnelle=this.att_estConditionnelle;
x_5.att_identClasse=this.att_identClasse;
x_3.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
x_5.att_hcode_est_adresse=this.att_hcode_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> paro TYPE parf F1 #type #gen ;"});
}
  }
private void action_auto_inh_71(S_E_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_5.att_identClasse=this.att_identClasse;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> malloc paro #hcond E parf #gen ;"});
}
  }
private void action_addr_72(S_F_MCS x_4) throws Exception {
try {
// instructions
this.att_code=x_4.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#addr","F -> mult #ptr F1 #type #addr ;"});
}
  }
private void action_gen_109(T_MCS x_3, S_IDC_MCS x_5, S_ES_MCS x_7) throws Exception {
try {
// locales
INFO loc_i;
INFOCLASSE loc_ic;
String loc_code;
LCHAMPS loc_lch;
// instructions
loc_code="";
this.att_code_est_adresse=false;
this.att_sdep=0;
loc_i=this.att_tds.chercherClasse(x_5.att_sident);
if (loc_i==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_classe_undefined, MCSMessages.classe_undefined,new Object[]{""+x_5.att_sident, ""+this.att_tds});

}
else {
if (loc_i instanceof INFOCLASSE ){
loc_ic=((INFOCLASSE)loc_i);
loc_lch=loc_ic.getChampsClasse();
this.att_type=loc_ic.getType();
this.att_code_est_adresse=true;
this.att_sdep=this.att_machine.getCurrentDep();
loc_code=this.att_machine.genMalloc(loc_lch.getCurrentDep());
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_not_infoclasse, MCSMessages.not_infoclasse,new Object[]{""+x_5.att_sident});


}
}
this.att_code=loc_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> new identc #ident IDC paro ES parf #gen ;"});
}
  }
private void action_auto_inh_72(S_F_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_hmode=this.att_hmode;
x_4.att_estConditionnelle=this.att_estConditionnelle;
x_4.att_identClasse=this.att_identClasse;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> mult #ptr F1 #type #addr ;"});
}
  }
private void action_gen_108() throws Exception {
try {
// instructions
this.att_sdep=-(1);
this.att_type= new DTYPEImpl("PNULL", 1);
this.att_code_est_adresse=false;
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> null2 #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_entier : // 23812
        regle61 () ;
      break ;
      case LEX_MCS.token_chaine : // 23814
        regle62 () ;
      break ;
      case LEX_MCS.token_caractere : // 23813
        regle63 () ;
      break ;
      case LEX_MCS.token_plus : // 23804
        regle64 () ;
      break ;
      case LEX_MCS.token_moins : // 23805
        regle64 () ;
      break ;
      case LEX_MCS.token_non : // 23811
        regle64 () ;
      break ;
      case LEX_MCS.token_null : // 23797
        regle68 () ;
      break ;
      case LEX_MCS.token_paro : // 23764
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MCS.token_entier : // 23812
            regle69 () ;
          break ;
          case LEX_MCS.token_chaine : // 23814
            regle69 () ;
          break ;
          case LEX_MCS.token_caractere : // 23813
            regle69 () ;
          break ;
          case LEX_MCS.token_plus : // 23804
            regle69 () ;
          break ;
          case LEX_MCS.token_moins : // 23805
            regle69 () ;
          break ;
          case LEX_MCS.token_non : // 23811
            regle69 () ;
          break ;
          case LEX_MCS.token_null : // 23797
            regle69 () ;
          break ;
          case LEX_MCS.token_paro : // 23764
            regle69 () ;
          break ;
          case LEX_MCS.token_malloc : // 23759
            regle69 () ;
          break ;
          case LEX_MCS.token_mult : // 23807
            regle69 () ;
          break ;
          case LEX_MCS.token_ident : // 23815
            regle69 () ;
          break ;
          case LEX_MCS.token_true : // 23789
            regle69 () ;
          break ;
          case LEX_MCS.token_false : // 23790
            regle69 () ;
          break ;
          case LEX_MCS.token_this : // 23791
            regle69 () ;
          break ;
          case LEX_MCS.token_base : // 23794
            regle69 () ;
          break ;
          case LEX_MCS.token_null2 : // 23793
            regle69 () ;
          break ;
          case LEX_MCS.token_new : // 23792
            regle69 () ;
          break ;
          case LEX_MCS.token_void : // 23774
            regle70 () ;
          break ;
          case LEX_MCS.token_int : // 23776
            regle70 () ;
          break ;
          case LEX_MCS.token_char : // 23777
            regle70 () ;
          break ;
          case LEX_MCS.token_identc : // 23816
            regle70 () ;
          break ;
          case LEX_MCS.token_struct : // 23778
            regle70 () ;
          break ;
          case LEX_MCS.token_bool : // 23788
            regle70 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MCS.token_paro);
        }
      break ;
      case LEX_MCS.token_malloc : // 23759
        regle71 () ;
      break ;
      case LEX_MCS.token_mult : // 23807
        regle72 () ;
      break ;
      case LEX_MCS.token_ident : // 23815
        regle73 () ;
      break ;
      case LEX_MCS.token_true : // 23789
        regle104 () ;
      break ;
      case LEX_MCS.token_false : // 23790
        regle105 () ;
      break ;
      case LEX_MCS.token_this : // 23791
        regle106 () ;
      break ;
      case LEX_MCS.token_base : // 23794
        regle107 () ;
      break ;
      case LEX_MCS.token_null2 : // 23793
        regle108 () ;
      break ;
      case LEX_MCS.token_new : // 23792
        regle109 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
