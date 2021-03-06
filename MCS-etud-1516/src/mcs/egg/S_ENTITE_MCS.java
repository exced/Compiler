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
public class S_ENTITE_MCS {
LEX_MCS scanner;
  S_ENTITE_MCS() {
    }
  S_ENTITE_MCS(LEX_MCS scanner, boolean eval) {
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
  INFONAMESPACE att_hinfoNSParent;
  INFO glob_89_i;
  INFOCLASSE glob_89_ic;
  INFOCLASSE glob_89_ihc;
  String glob_89_ident;
  INFONAMESPACE glob_85_ins;
  INFO glob_89_ih;
  private void regle82() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    ASM x_4 = new ASM(scanner.getReporter(), scanner.contexte);
    //appel
    x_2.analyser(LEX_MCS.token_asm);
if  (att_eval)      action_tds_82(x_4);
    x_4.scanner.setSource(scanner) ;
    x_4.set_eval(true) ;
    x_4.compile() ;
      scanner.setSource(x_4.scanner) ;
if  (att_eval)      action_gen_82(x_4);
  }
  private void regle85() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_ENTITES_MCS x_7 = new S_ENTITES_MCS(scanner,att_eval) ;
    T_MCS x_9 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_85(x_3, x_7);
    x_2.analyser(LEX_MCS.token_namespace);
    x_3.analyser(LEX_MCS.token_identc);
    x_4.analyser(LEX_MCS.token_aco);
if  (att_eval)      action_contenu_85(x_3, x_7);
if  (att_eval)      action_namespace_85(x_3, x_7);
    x_7.analyser() ;
if  (att_eval)      action_scontenu_85(x_3, x_7);
    x_9.analyser(LEX_MCS.token_acf);
if  (att_eval)      action_gen_85(x_3, x_7);
  }
  private void regle86() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_IDC_MCS x_5 = new S_IDC_MCS(scanner,att_eval) ;
    T_MCS x_6 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_86(x_3, x_5);
    x_2.analyser(LEX_MCS.token_using);
    x_3.analyser(LEX_MCS.token_identc);
if  (att_eval)      action_ident_86(x_3, x_5);
    x_5.analyser() ;
    x_6.analyser(LEX_MCS.token_pv);
if  (att_eval)      action_acces_86(x_3, x_5);
if  (att_eval)      action_gen_86(x_3, x_5);
  }
  private void regle89() throws Exception {

    //declaration
    S_ACCES_MCS x_2 = new S_ACCES_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_HERITAGE_MCS x_5 = new S_HERITAGE_MCS(scanner,att_eval) ;
    T_MCS x_6 = new T_MCS(scanner ) ;
    S_DEFS_MCS x_8 = new S_DEFS_MCS(scanner,att_eval) ;
    T_MCS x_9 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_89(x_2, x_4, x_5, x_8);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_class);
    x_4.analyser(LEX_MCS.token_identc);
    x_5.analyser() ;
    x_6.analyser(LEX_MCS.token_aco);
if  (att_eval)      action_htds_89(x_2, x_4, x_5, x_8);
    x_8.analyser() ;
    x_9.analyser(LEX_MCS.token_acf);
if  (att_eval)      action_classe_89(x_2, x_4, x_5, x_8);
if  (att_eval)      action_gen_89(x_2, x_4, x_5, x_8);
  }
  private void regle3() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_TYPE_MCS x_3 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_3(x_3, x_4);
    x_2.analyser(LEX_MCS.token_typedef);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_identc);
    x_5.analyser(LEX_MCS.token_pv);
if  (att_eval)      action_tds_3(x_3, x_4);
if  (att_eval)      action_gen_3(x_3, x_4);
  }
  private void regle4() throws Exception {

    //declaration
    S_TYPE_MCS x_2 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_DECL_MCS x_5 = new S_DECL_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_4(x_2, x_3, x_5);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_decl_4(x_2, x_3, x_5);
    x_5.analyser() ;
if  (att_eval)      action_gen_4(x_2, x_3, x_5);
  }
private void action_classe_89(S_ACCES_MCS x_2, T_MCS x_4, S_HERITAGE_MCS x_5, S_DEFS_MCS x_8) throws Exception {
try {
// instructions
glob_89_i=this.att_machine.chercherClasse(x_4.att_txt);
if (glob_89_i!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_classe_defined, MCSMessages.classe_defined,new Object[]{""+x_4.att_txt, ""+this.att_machine.getClasses()});

}
else {
if (!(x_5.att_aHeritage)){
glob_89_ident="Object";
}
else {
glob_89_ident=x_5.att_sident;
}
glob_89_ih=this.att_machine.chercherClasse(glob_89_ident);
if (glob_89_ih==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_classe_not_found, MCSMessages.classe_not_found,new Object[]{""+glob_89_ident, ""+this.att_machine.getClasses(), ""+this.att_machine.getNamespaces()});

}
else {
if (glob_89_ih instanceof INFOCLASSE ){
glob_89_ihc=((INFOCLASSE)glob_89_ih);
if (this.att_hinfoNSParent==null){
glob_89_ic= new INFOCLASSE(x_2.att_acces, x_8.att_stds, glob_89_ihc);
}
else {
glob_89_ic= new INFOCLASSE(x_2.att_acces, x_8.att_stds, glob_89_ihc, this.att_hinfoNSParent);
}
this.att_machine.addClasse(x_4.att_txt, glob_89_ic);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_not_infoclasse, MCSMessages.not_infoclasse,new Object[]{""+glob_89_ih});


}
}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#classe","ENTITE -> ACCES class identc HERITAGE aco #htds DEFS acf #classe #gen ;"});
}
  }
private void action_acces_86(T_MCS x_3, S_IDC_MCS x_5) throws Exception {
try {
// locales
String loc_name;
INFO loc_i;
INFONAMESPACE loc_ins;
// instructions
loc_i=this.att_machine.chercherNamespace(x_5.att_sident);
if (loc_i==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_namespace_unknown, MCSMessages.namespace_unknown,new Object[]{""+x_5.att_sident, ""+this.att_machine.getNamespaces()});

}
else {
if (loc_i instanceof INFONAMESPACE ){
loc_ins=((INFONAMESPACE)loc_i);
this.att_machine.addUsedNS(x_3.att_txt, loc_ins);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_using_notNameSpace, MCSMessages.using_notNameSpace,new Object[]{""+x_3.att_txt});


}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#acces","ENTITE -> using identc #ident IDC pv #acces #gen ;"});
}
  }
private void action_ident_86(T_MCS x_3, S_IDC_MCS x_5) throws Exception {
try {
// instructions
x_5.att_ident=x_3.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#ident","ENTITE -> using identc #ident IDC pv #acces #gen ;"});
}
  }
private void action_tds_3(S_TYPE_MCS x_3, T_MCS x_4) throws Exception {
try {
// locales
INFO loc_i;
// instructions
loc_i=this.att_tds.chercherGlobalement(x_4.att_txt);
if (loc_i!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_type_declared, MCSMessages.type_declared,new Object[]{""+x_4.att_txt, ""+this.att_tds});

}
else {
this.att_tds.inserer(x_4.att_txt,  new INFOTYPE(x_3.att_type));
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","ENTITE -> typedef TYPE identc pv #tds #gen ;"});
}
  }
private void action_auto_inh_4(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_5) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITE -> TYPE ident #decl DECL #gen ;"});
}
  }
private void action_contenu_85(T_MCS x_3, S_ENTITES_MCS x_7) throws Exception {
try {
// instructions
x_7.att_tds= new TDS(this.att_tds);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#contenu","ENTITE -> namespace identc aco #contenu #namespace ENTITES #scontenu acf #gen ;"});
}
  }
private void action_gen_86(T_MCS x_3, S_IDC_MCS x_5) throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ENTITE -> using identc #ident IDC pv #acces #gen ;"});
}
  }
private void action_auto_inh_3(S_TYPE_MCS x_3, T_MCS x_4) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITE -> typedef TYPE identc pv #tds #gen ;"});
}
  }
private void action_gen_85(T_MCS x_3, S_ENTITES_MCS x_7) throws Exception {
try {
// instructions
this.att_code=x_7.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ENTITE -> namespace identc aco #contenu #namespace ENTITES #scontenu acf #gen ;"});
}
  }
private void action_namespace_85(T_MCS x_3, S_ENTITES_MCS x_7) throws Exception {
try {
// locales
INFO loc_i;
// instructions
if (this.att_hinfoNSParent==null){
glob_85_ins= new INFONAMESPACE( new DTYPEImpl("namespace", 0));
}
else {
glob_85_ins= new INFONAMESPACE( new DTYPEImpl("namespace", 0), this.att_hinfoNSParent);
}
x_7.att_hinfoNSParent=glob_85_ins;
loc_i=this.att_machine.chercherNamespace(x_3.att_txt);
if (loc_i!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_namespace_declared, MCSMessages.namespace_declared,new Object[]{""+x_3.att_txt, ""+this.att_machine.getNamespaces()});

}
else {
this.att_machine.addNamespace(x_3.att_txt, glob_85_ins);
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#namespace","ENTITE -> namespace identc aco #contenu #namespace ENTITES #scontenu acf #gen ;"});
}
  }
private void action_gen_82(ASM x_4) throws Exception {
try {
// instructions
this.att_code=x_4.att_code_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ENTITE -> asm #tds ASM #gen ;"});
}
  }
private void action_auto_inh_85(T_MCS x_3, S_ENTITES_MCS x_7) throws Exception {
try {
// instructions
x_7.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITE -> namespace identc aco #contenu #namespace ENTITES #scontenu acf #gen ;"});
}
  }
private void action_auto_inh_86(T_MCS x_3, S_IDC_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITE -> using identc #ident IDC pv #acces #gen ;"});
}
  }
private void action_scontenu_85(T_MCS x_3, S_ENTITES_MCS x_7) throws Exception {
try {
// instructions
glob_85_ins.setContenu(x_7.att_stds);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#scontenu","ENTITE -> namespace identc aco #contenu #namespace ENTITES #scontenu acf #gen ;"});
}
  }
private void action_htds_89(S_ACCES_MCS x_2, T_MCS x_4, S_HERITAGE_MCS x_5, S_DEFS_MCS x_8) throws Exception {
try {
// locales
TDS loc_htds;
// instructions
loc_htds= new TDS(this.att_tds);
x_8.att_identClasse=x_4.att_txt;
x_8.att_identSuper=x_5.att_sident;
x_8.att_tds=loc_htds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htds","ENTITE -> ACCES class identc HERITAGE aco #htds DEFS acf #classe #gen ;"});
}
  }
private void action_auto_inh_89(S_ACCES_MCS x_2, T_MCS x_4, S_HERITAGE_MCS x_5, S_DEFS_MCS x_8) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_8.att_machine=this.att_machine;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITE -> ACCES class identc HERITAGE aco #htds DEFS acf #classe #gen ;"});
}
  }
private void action_gen_89(S_ACCES_MCS x_2, T_MCS x_4, S_HERITAGE_MCS x_5, S_DEFS_MCS x_8) throws Exception {
try {
// instructions
this.att_tds.inserer(x_4.att_txt,  new INFOTYPE( new OBJET(x_4.att_txt, glob_89_ic)));
this.att_code=x_8.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ENTITE -> ACCES class identc HERITAGE aco #htds DEFS acf #classe #gen ;"});
}
  }
private void action_decl_4(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_5) throws Exception {
try {
// instructions
x_5.att_hacces="def";
x_5.att_ident=x_3.att_txt;
x_5.att_htype=x_2.att_type;
x_5.att_identClasse="";
x_5.att_identSuper="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#decl","ENTITE -> TYPE ident #decl DECL #gen ;"});
}
  }
private void action_gen_4(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_5) throws Exception {
try {
// instructions
this.att_code=x_5.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ENTITE -> TYPE ident #decl DECL #gen ;"});
}
  }
private void action_gen_3(S_TYPE_MCS x_3, T_MCS x_4) throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ENTITE -> typedef TYPE identc pv #tds #gen ;"});
}
  }
private void action_tds_82(ASM x_4) throws Exception {
try {
// instructions
x_4.att_tds_asm=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","ENTITE -> asm #tds ASM #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_typedef : // 57292
        regle3 () ;
      break ;
      case LEX_MCS.token_void : // 57287
        regle4 () ;
      break ;
      case LEX_MCS.token_int : // 57289
        regle4 () ;
      break ;
      case LEX_MCS.token_char : // 57290
        regle4 () ;
      break ;
      case LEX_MCS.token_identc : // 57329
        regle4 () ;
      break ;
      case LEX_MCS.token_struct : // 57291
        regle4 () ;
      break ;
      case LEX_MCS.token_bool : // 57301
        regle4 () ;
      break ;
      case LEX_MCS.token_asm : // 57288
        regle82 () ;
      break ;
      case LEX_MCS.token_namespace : // 57295
        regle85 () ;
      break ;
      case LEX_MCS.token_using : // 57296
        regle86 () ;
      break ;
      case LEX_MCS.token_public : // 57298
        regle89 () ;
      break ;
      case LEX_MCS.token_private : // 57299
        regle89 () ;
      break ;
      case LEX_MCS.token_class : // 57297
        regle89 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
