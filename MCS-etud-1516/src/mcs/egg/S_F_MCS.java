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
  LEX_MCS att_scanner;
  int att_sdep;
  boolean att_code_est_adresse;
  DTYPE att_type;
  boolean att_hcode_est_adresse;
  DTYPE glob_71_t;
  INFOFONC glob_71_infofonc;
  INFOVAR glob_71_iv;
  private void regle61() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_caractere);
if  (att_eval)      action_gen_61(x_2);
  }
  private void regle60() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_chaine);
if  (att_eval)      action_gen_60(x_2);
  }
  private void regle71() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_FX_MCS x_4 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_71(x_2, x_4);
    x_2.analyser(LEX_MCS.token_ident);
if  (att_eval)      action_htype_71(x_2, x_4);
    x_4.analyser() ;
if  (att_eval)      action_gen_71(x_2, x_4);
  }
  private void regle62() throws Exception {

    //declaration
    S_OPUN_MCS x_2 = new S_OPUN_MCS(scanner,att_eval) ;
    S_F_MCS x_3 = new S_F_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_62(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_type_62(x_2, x_3);
if  (att_eval)      action_gen_62(x_2, x_3);
  }
  private void regle67() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_E_MCS x_3 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_FX_MCS x_6 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_67(x_3, x_6);
    x_2.analyser(LEX_MCS.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_addr_67(x_3, x_6);
    x_6.analyser() ;
if  (att_eval)      action_type_67(x_3, x_6);
if  (att_eval)      action_gen_67(x_3, x_6);
  }
  private void regle66() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_null);
if  (att_eval)      action_type_66();
  }
  private void regle69() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    T_MCS x_3 = new T_MCS(scanner ) ;
    S_E_MCS x_4 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_5 = new T_MCS(scanner ) ;
    //appel
if  (att_eval)      action_auto_inh_69(x_4);
    x_2.analyser(LEX_MCS.token_malloc);
    x_3.analyser(LEX_MCS.token_paro);
    x_4.analyser() ;
    x_5.analyser(LEX_MCS.token_parf);
if  (att_eval)      action_gen_69(x_4);
  }
  private void regle68() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_TYPE_MCS x_3 = new S_TYPE_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_F_MCS x_5 = new S_F_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_68(x_3, x_5);
    x_2.analyser(LEX_MCS.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_parf);
    x_5.analyser() ;
if  (att_eval)      action_type_68(x_3, x_5);
if  (att_eval)      action_gen_68(x_3, x_5);
  }
  private void regle59() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_entier);
if  (att_eval)      action_gen_59(x_2);
  }
  private void regle100() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_true);
if  (att_eval)      action_gen_100();
  }
  private void regle101() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_false);
if  (att_eval)      action_gen_101();
  }
  private void regle70() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_F_MCS x_3 = new S_F_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_70(x_3);
    x_2.analyser(LEX_MCS.token_mult);
    x_3.analyser() ;
if  (att_eval)      action_type_70(x_3);
if  (att_eval)      action_addr_70(x_3);
  }
private void action_type_67(S_E_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// instructions
if (!(x_3.att_type.compareTo(x_6.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_castError, MCSMessages.castError,new Object[]{""+x_3.att_type.getNom(), ""+x_6.att_type.getNom()});

}
else {
this.att_type=x_3.att_type;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> paro E parf #addr FX #type #gen ;"});
}
  }
private void action_type_68(S_TYPE_MCS x_3, S_F_MCS x_5) throws Exception {
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
private void action_type_66() throws Exception {
try {
// instructions
this.att_sdep=-(1);
this.att_type= new DTYPEImpl("PNULL", 1);
this.att_code_est_adresse=false;
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> null #type ;"});
}
  }
private void action_type_62(S_OPUN_MCS x_2, S_F_MCS x_3) throws Exception {
try {
// instructions
this.att_sdep=-(1);
if (!(x_3.att_type.compareOpUn(x_2.att_type))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_typeError_opUn, MCSMessages.typeError_opUn,new Object[]{""+x_3.att_type.getNom(), ""+x_2.att_type.getNom()});

}
else {
this.att_type=x_3.att_type;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> OPUN F1 #type #gen ;"});
}
  }
private void action_gen_60(T_MCS x_2) throws Exception {
try {
// instructions
this.att_sdep=-(1);
this.att_type= new DTYPEImpl("chaine", 3);
this.att_code_est_adresse=false;
this.att_code=this.att_machine.genCst(x_2.att_txt);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> chaine #gen ;"});
}
  }
private void action_gen_71(T_MCS x_2, S_FX_MCS x_4) throws Exception {
try {
// instructions
this.att_sdep=x_4.att_sdep;
this.att_type=x_4.att_type;
this.att_code=x_4.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> ident #htype FX #gen ;"});
}
  }
private void action_gen_62(S_OPUN_MCS x_2, S_F_MCS x_3) throws Exception {
try {
// instructions
this.att_code_est_adresse=false;
this.att_code=x_3.att_code+x_2.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> OPUN F1 #type #gen ;"});
}
  }
private void action_gen_61(T_MCS x_2) throws Exception {
try {
// instructions
this.att_sdep=-(1);
this.att_type= new DTYPEImpl("char", 1);
this.att_code_est_adresse=false;
this.att_code=this.att_machine.genCst(x_2.att_txt);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> caractere #gen ;"});
}
  }
private void action_auto_inh_62(S_OPUN_MCS x_2, S_F_MCS x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_3.att_hcode_est_adresse=this.att_hcode_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> OPUN F1 #type #gen ;"});
}
  }
private void action_addr_70(S_F_MCS x_3) throws Exception {
try {
// instructions
this.att_code=x_3.att_code+this.att_machine.genReadIndirectMem(1);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#addr","F -> mult F1 #type #addr ;"});
}
  }
private void action_gen_68(S_TYPE_MCS x_3, S_F_MCS x_5) throws Exception {
try {
// instructions
this.att_code=x_5.att_code;
this.att_code_est_adresse=x_5.att_code_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> paro TYPE parf F1 #type #gen ;"});
}
  }
private void action_auto_inh_67(S_E_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_6.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_6.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> paro E parf #addr FX #type #gen ;"});
}
  }
private void action_gen_67(S_E_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// instructions
this.att_code=x_6.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> paro E parf #addr FX #type #gen ;"});
}
  }
private void action_gen_59(T_MCS x_2) throws Exception {
try {
// instructions
this.att_sdep=-(1);
this.att_type= new DTYPEImpl("int", 1);
this.att_code_est_adresse=false;
this.att_code=this.att_machine.genCst(x_2.att_txt);
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> entier #gen ;"});
}
  }
private void action_auto_inh_68(S_TYPE_MCS x_3, S_F_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_5.att_tds=this.att_tds;
x_5.att_hcode_est_adresse=this.att_hcode_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> paro TYPE parf F1 #type #gen ;"});
}
  }
private void action_htype_71(T_MCS x_2, S_FX_MCS x_4) throws Exception {
try {
// locales
INFO loc_i;
INFO loc_i2;
String loc_code;
// instructions
x_4.att_ident=x_2.att_txt;
loc_i=this.att_tds.chercherGlobalement(x_2.att_txt);
if (loc_i==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_var_not_found, MCSMessages.var_not_found,new Object[]{""+x_2.att_txt, ""+"null"});

}
else {
if (loc_i instanceof INFOVAR ){
glob_71_iv=((INFOVAR)loc_i);
glob_71_t=glob_71_iv.getType();
x_4.att_hdep=glob_71_iv.getDep();
x_4.att_htype=glob_71_t;
this.att_code_est_adresse=false;
if (this.att_hcode_est_adresse){
loc_code=this.att_machine.genAdr(glob_71_iv.getTaille());
}
else {
loc_code=this.att_machine.genReadMem(glob_71_iv.getDep(), glob_71_iv.getTaille());
}
x_4.att_hcode=loc_code;
}
else if (loc_i instanceof INFOFONC ){
glob_71_infofonc=((INFOFONC)loc_i);
glob_71_t=glob_71_infofonc.getType();
x_4.att_htype=glob_71_t;
x_4.att_hcode="";
this.att_code_est_adresse=false;
loc_code="";
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_type_unknown, MCSMessages.type_unknown,new Object[]{""+x_2.att_txt, ""+loc_i.getType()});


}
x_4.att_htype=glob_71_t;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#htype","F -> ident #htype FX #gen ;"});
}
  }
private void action_gen_101() throws Exception {
try {
// instructions
this.att_sdep=-(1);
this.att_type= new DTYPEImpl("bool", 1);
this.att_code_est_adresse=false;
this.att_code=this.att_machine.genCst("0");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> false #gen ;"});
}
  }
private void action_auto_inh_69(S_E_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> malloc paro E parf #gen ;"});
}
  }
private void action_gen_69(S_E_MCS x_4) throws Exception {
try {
// instructions
this.att_sdep=x_4.att_sdep;
if (!(x_4.att_type.compareTo( new DTYPEImpl("int", 1)))){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_malloc_need_int, MCSMessages.malloc_need_int,new Object[]{""+x_4.att_type.getNom()});

}
else {
this.att_type= new DTYPEImpl("void", 0);
this.att_code_est_adresse=false;
this.att_code=x_4.att_code+this.att_machine.genOp("MAlloc");
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> malloc paro E parf #gen ;"});
}
  }
private void action_gen_100() throws Exception {
try {
// instructions
this.att_sdep=-(1);
this.att_type= new DTYPEImpl("bool", 1);
this.att_code_est_adresse=false;
this.att_code=this.att_machine.genCst("1");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","F -> true #gen ;"});
}
  }
private void action_addr_67(S_E_MCS x_3, S_FX_MCS x_6) throws Exception {
try {
// instructions
this.att_sdep=x_3.att_sdep;
x_6.att_hdep=x_3.att_sdep;
x_6.att_ident="";
this.att_code_est_adresse=x_3.att_code_est_adresse;
x_6.att_htype=x_3.att_type;
x_6.att_hcode=x_3.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#addr","F -> paro E parf #addr FX #type #gen ;"});
}
  }
private void action_type_70(S_F_MCS x_3) throws Exception {
try {
// locales
POINTEUR loc_p;
// instructions
this.att_sdep=x_3.att_sdep;
if (x_3.att_type instanceof POINTEUR ){
loc_p=((POINTEUR)x_3.att_type);
this.att_type=loc_p.getType();
this.att_code_est_adresse=true;
}
else {
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_not_pointeur, MCSMessages.not_pointeur,new Object[]{""+x_3.att_type.getNom()});


}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#type","F -> mult F1 #type #addr ;"});
}
  }
private void action_auto_inh_70(S_F_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_3.att_tds=this.att_tds;
x_3.att_hcode_est_adresse=this.att_hcode_est_adresse;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> mult F1 #type #addr ;"});
}
  }
private void action_auto_inh_71(T_MCS x_2, S_FX_MCS x_4) throws Exception {
try {
// instructions
x_4.att_machine=this.att_machine;
x_4.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> ident #htype FX #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_entier : // 1332
        regle59 () ;
      break ;
      case LEX_MCS.token_chaine : // 1334
        regle60 () ;
      break ;
      case LEX_MCS.token_caractere : // 1333
        regle61 () ;
      break ;
      case LEX_MCS.token_plus : // 1324
        regle62 () ;
      break ;
      case LEX_MCS.token_moins : // 1325
        regle62 () ;
      break ;
      case LEX_MCS.token_non : // 1331
        regle62 () ;
      break ;
      case LEX_MCS.token_null : // 1317
        regle66 () ;
      break ;
      case LEX_MCS.token_paro : // 1284
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MCS.token_entier : // 1332
            regle67 () ;
          break ;
          case LEX_MCS.token_chaine : // 1334
            regle67 () ;
          break ;
          case LEX_MCS.token_caractere : // 1333
            regle67 () ;
          break ;
          case LEX_MCS.token_plus : // 1324
            regle67 () ;
          break ;
          case LEX_MCS.token_moins : // 1325
            regle67 () ;
          break ;
          case LEX_MCS.token_non : // 1331
            regle67 () ;
          break ;
          case LEX_MCS.token_null : // 1317
            regle67 () ;
          break ;
          case LEX_MCS.token_paro : // 1284
            regle67 () ;
          break ;
          case LEX_MCS.token_malloc : // 1281
            regle67 () ;
          break ;
          case LEX_MCS.token_mult : // 1327
            regle67 () ;
          break ;
          case LEX_MCS.token_ident : // 1335
            regle67 () ;
          break ;
          case LEX_MCS.token_true : // 1309
            regle67 () ;
          break ;
          case LEX_MCS.token_false : // 1310
            regle67 () ;
          break ;
          case LEX_MCS.token_void : // 1294
            regle68 () ;
          break ;
          case LEX_MCS.token_int : // 1296
            regle68 () ;
          break ;
          case LEX_MCS.token_char : // 1297
            regle68 () ;
          break ;
          case LEX_MCS.token_identc : // 1336
            regle68 () ;
          break ;
          case LEX_MCS.token_struct : // 1298
            regle68 () ;
          break ;
          case LEX_MCS.token_bool : // 1308
            regle68 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MCS.token_paro);
        }
      break ;
      case LEX_MCS.token_malloc : // 1281
        regle69 () ;
      break ;
      case LEX_MCS.token_mult : // 1327
        regle70 () ;
      break ;
      case LEX_MCS.token_ident : // 1335
        regle71 () ;
      break ;
      case LEX_MCS.token_true : // 1309
        regle100 () ;
      break ;
      case LEX_MCS.token_false : // 1310
        regle101 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
