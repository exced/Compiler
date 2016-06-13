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
  private void regle83() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_ENTITES_MCS x_6 = new S_ENTITES_MCS(scanner,att_eval) ;
    T_MCS x_7 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_83(x_3, x_6);
    x_2.analyser(LEX_MCS.token_namespace);
    x_3.analyser(LEX_MCS.token_identc);
    x_4.analyser(LEX_MCS.token_aco);
if  (att_eval)      action_htds_83(x_3, x_6);
    x_6.analyser() ;
    x_7.analyser(LEX_MCS.token_acf);
if  (att_eval)      action_namespace_83(x_3, x_6);
if  (att_eval)      action_gen_83(x_3, x_6);
  }
  private void regle84() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_IDC_MCS x_5 = new S_IDC_MCS(scanner,att_eval) ;
    T_MCS x_6 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_using);
    x_3.analyser(LEX_MCS.token_identc);
if  (att_eval)      action_ident_84(x_3, x_5);
    x_5.analyser() ;
    x_6.analyser(LEX_MCS.token_pv);
if  (att_eval)      action_acces_84(x_3, x_5);
if  (att_eval)      action_gen_84(x_3, x_5);
  }
  private void regle87() throws Exception {

    //declaration
    S_ACCES_MCS x_2 = new S_ACCES_MCS(scanner,att_eval) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_HERITAGE_MCS x_5 = new S_HERITAGE_MCS(scanner,att_eval) ;
    T_MCS x_6 = new T_MCS(scanner ) ;
    S_DEFS_MCS x_8 = new S_DEFS_MCS(scanner,att_eval) ;
    T_MCS x_9 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_87(x_2, x_4, x_5, x_8);
    x_2.analyser() ;
    x_3.analyser(LEX_MCS.token_class);
    x_4.analyser(LEX_MCS.token_identc);
    x_5.analyser() ;
    x_6.analyser(LEX_MCS.token_aco);
if  (att_eval)      action_htds_87(x_2, x_4, x_5, x_8);
    x_8.analyser() ;
    x_9.analyser(LEX_MCS.token_acf);
if  (att_eval)      action_classe_87(x_2, x_4, x_5, x_8);
if  (att_eval)      action_gen_87(x_2, x_4, x_5, x_8);
  }
  private void regle80() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    ASM x_4 = new ASM(scanner.getReporter(), scanner.contexte);
    //appel
    x_2.analyser(LEX_MCS.token_asm);
if  (att_eval)      action_tds_80(x_4);
    x_4.scanner.setSource(scanner) ;
    x_4.set_eval(true) ;
    x_4.compile() ;
      scanner.setSource(x_4.scanner) ;
if  (att_eval)      action_gen_80(x_4);
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
private void action_gen_80(ASM x_4) throws Exception {
try {
// instructions
this.att_code=x_4.att_code_asm;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ENTITE -> asm #tds ASM #gen ;"});
}
  }
private void action_classe_87(S_ACCES_MCS x_2, T_MCS x_4, S_HERITAGE_MCS x_5, S_DEFS_MCS x_8) throws Exception {
try {
// locales
INFO loc_i;
INFOCLASSE loc_ic;
// instructions
loc_i=this.att_tds.chercherGlobalement(x_4.att_txt);
if (loc_i!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_classe_defined, MCSMessages.classe_defined,new Object[]{""+x_4.att_txt, ""+this.att_tds});

}
else {
loc_ic= new INFOCLASSE(x_8.att_champsclasse, x_2.att_acces, x_8.att_stds, x_5.att_sinfoclasse);
this.att_tds.inserer(x_4.att_txt, loc_ic);
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#classe","ENTITE -> ACCES class identc HERITAGE aco #htds DEFS acf #classe #gen ;"});
}
  }
private void action_ident_84(T_MCS x_3, S_IDC_MCS x_5) throws Exception {
try {
// instructions
x_5.att_ident=x_3.att_txt;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#ident","ENTITE -> using identc #ident IDC pv #acces #gen ;"});
}
  }
private void action_acces_84(T_MCS x_3, S_IDC_MCS x_5) throws Exception {
try {
// locales
String loc_name;
INFO loc_i;
INFONAMESPACE loc_ins;
// instructions
loc_i=this.att_tds.chercherNamespace(x_5.att_sident);
if (loc_i==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_namespace_unknown, MCSMessages.namespace_unknown,new Object[]{""+x_5.att_sident, ""+this.att_tds});

}
else {
if (loc_i instanceof INFONAMESPACE ){
loc_ins=((INFONAMESPACE)loc_i);
loc_ins.setUsed(true);
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_using_notNameSpace, MCSMessages.using_notNameSpace,new Object[]{""+x_3.att_txt});


}
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#acces","ENTITE -> using identc #ident IDC pv #acces #gen ;"});
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
x_5.att_machine=this.att_machine;
x_2.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITE -> TYPE ident #decl DECL #gen ;"});
}
  }
private void action_auto_inh_3(S_TYPE_MCS x_3, T_MCS x_4) throws Exception {
try {
// instructions
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITE -> typedef TYPE identc pv #tds #gen ;"});
}
  }
private void action_gen_87(S_ACCES_MCS x_2, T_MCS x_4, S_HERITAGE_MCS x_5, S_DEFS_MCS x_8) throws Exception {
try {
// instructions
this.att_code=x_8.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ENTITE -> ACCES class identc HERITAGE aco #htds DEFS acf #classe #gen ;"});
}
  }
private void action_htds_83(T_MCS x_3, S_ENTITES_MCS x_6) throws Exception {
try {
// instructions
x_6.att_tds= new TDS(this.att_tds);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htds","ENTITE -> namespace identc aco #htds ENTITES acf #namespace #gen ;"});
}
  }
private void action_gen_84(T_MCS x_3, S_IDC_MCS x_5) throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ENTITE -> using identc #ident IDC pv #acces #gen ;"});
}
  }
private void action_gen_83(T_MCS x_3, S_ENTITES_MCS x_6) throws Exception {
try {
// instructions
this.att_code=x_6.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","ENTITE -> namespace identc aco #htds ENTITES acf #namespace #gen ;"});
}
  }
private void action_htds_87(S_ACCES_MCS x_2, T_MCS x_4, S_HERITAGE_MCS x_5, S_DEFS_MCS x_8) throws Exception {
try {
// instructions
x_8.att_tds= new TDS(this.att_tds);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htds","ENTITE -> ACCES class identc HERITAGE aco #htds DEFS acf #classe #gen ;"});
}
  }
private void action_auto_inh_87(S_ACCES_MCS x_2, T_MCS x_4, S_HERITAGE_MCS x_5, S_DEFS_MCS x_8) throws Exception {
try {
// instructions
x_8.att_machine=this.att_machine;
x_5.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITE -> ACCES class identc HERITAGE aco #htds DEFS acf #classe #gen ;"});
}
  }
private void action_namespace_83(T_MCS x_3, S_ENTITES_MCS x_6) throws Exception {
try {
// locales
INFO loc_i;
// instructions
loc_i=this.att_tds.chercherNamespace(x_3.att_txt);
if (loc_i!=null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_namespace_declared, MCSMessages.namespace_declared,new Object[]{""+x_3.att_txt, ""+this.att_tds});

}
else {
this.att_tds.inserer(x_3.att_txt,  new INFONAMESPACE( new DTYPEImpl("namespace", 0), x_6.att_stds));
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#namespace","ENTITE -> namespace identc aco #htds ENTITES acf #namespace #gen ;"});
}
  }
private void action_decl_4(S_TYPE_MCS x_2, T_MCS x_3, S_DECL_MCS x_5) throws Exception {
try {
// instructions
x_5.att_ident=x_3.att_txt;
x_5.att_htype=x_2.att_type;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#decl","ENTITE -> TYPE ident #decl DECL #gen ;"});
}
  }
private void action_tds_80(ASM x_4) throws Exception {
try {
// instructions
x_4.att_tds_asm=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#tds","ENTITE -> asm #tds ASM #gen ;"});
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
private void action_auto_inh_83(T_MCS x_3, S_ENTITES_MCS x_6) throws Exception {
try {
// instructions
x_6.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","ENTITE -> namespace identc aco #htds ENTITES acf #namespace #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_typedef : // 1806
        regle3 () ;
      break ;
      case LEX_MCS.token_void : // 1801
        regle4 () ;
      break ;
      case LEX_MCS.token_int : // 1803
        regle4 () ;
      break ;
      case LEX_MCS.token_char : // 1804
        regle4 () ;
      break ;
      case LEX_MCS.token_identc : // 1843
        regle4 () ;
      break ;
      case LEX_MCS.token_struct : // 1805
        regle4 () ;
      break ;
      case LEX_MCS.token_bool : // 1815
        regle4 () ;
      break ;
      case LEX_MCS.token_asm : // 1802
        regle80 () ;
      break ;
      case LEX_MCS.token_namespace : // 1809
        regle83 () ;
      break ;
      case LEX_MCS.token_using : // 1810
        regle84 () ;
      break ;
      case LEX_MCS.token_public : // 1812
        regle87 () ;
      break ;
      case LEX_MCS.token_private : // 1813
        regle87 () ;
      break ;
      case LEX_MCS.token_class : // 1811
        regle87 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
