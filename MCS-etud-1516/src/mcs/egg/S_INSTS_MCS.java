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
public class S_INSTS_MCS {
LEX_MCS scanner;
  S_INSTS_MCS() {
    }
  S_INSTS_MCS(LEX_MCS scanner, boolean eval) {
    this.scanner = scanner;
    this.att_eval = eval;
    this.att_scanner = scanner;
    }
int [] sync= new int[0];
  DTYPE att_htype;
  TDS att_tds;
  boolean att_eval;
  String att_code;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle26() throws Exception {

    //declaration
    S_INST_MCS x_2 = new S_INST_MCS(scanner,att_eval) ;
    S_INSTS_MCS x_3 = new S_INSTS_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_26(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
if  (att_eval)      action_gen_26(x_2, x_3);
  }
  private void regle25() throws Exception {

    //declaration
    //appel
if  (att_eval)      action_gen_25();
  }
private void action_gen_26(S_INST_MCS x_2, S_INSTS_MCS x_3) throws Exception {
try {
// instructions
this.att_code=x_2.att_code+x_3.att_code;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INSTS -> INST INSTS1 #gen ;"});
}
  }
private void action_gen_25() throws Exception {
try {
// instructions
this.att_code="";
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","INSTS -> #gen ;"});
}
  }
private void action_auto_inh_26(S_INST_MCS x_2, S_INSTS_MCS x_3) throws Exception {
try {
// instructions
x_2.att_machine=this.att_machine;
x_3.att_machine=this.att_machine;
x_2.att_htype=this.att_htype;
x_3.att_htype=this.att_htype;
x_2.att_tds=this.att_tds;
x_3.att_tds=this.att_tds;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","INSTS -> INST INSTS1 #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
<<<<<<< HEAD
      case LEX_MCS.token_acf : // 143
        regle25 () ;
      break ;
      case LEX_MCS.token_void : // 150
        regle26 () ;
      break ;
      case LEX_MCS.token_int : // 152
        regle26 () ;
      break ;
      case LEX_MCS.token_char : // 153
        regle26 () ;
      break ;
      case LEX_MCS.token_identc : // 192
        regle26 () ;
      break ;
      case LEX_MCS.token_struct : // 154
        regle26 () ;
      break ;
      case LEX_MCS.token_bool : // 164
        regle26 () ;
      break ;
      case LEX_MCS.token_entier : // 188
        regle26 () ;
      break ;
      case LEX_MCS.token_chaine : // 190
        regle26 () ;
      break ;
      case LEX_MCS.token_caractere : // 189
        regle26 () ;
      break ;
      case LEX_MCS.token_plus : // 180
        regle26 () ;
      break ;
      case LEX_MCS.token_moins : // 181
        regle26 () ;
      break ;
      case LEX_MCS.token_non : // 187
        regle26 () ;
      break ;
      case LEX_MCS.token_null : // 173
        regle26 () ;
      break ;
      case LEX_MCS.token_paro : // 140
        regle26 () ;
      break ;
      case LEX_MCS.token_malloc : // 137
        regle26 () ;
      break ;
      case LEX_MCS.token_mult : // 183
        regle26 () ;
      break ;
      case LEX_MCS.token_ident : // 191
        regle26 () ;
      break ;
      case LEX_MCS.token_true : // 165
        regle26 () ;
      break ;
      case LEX_MCS.token_false : // 166
        regle26 () ;
      break ;
      case LEX_MCS.token_aco : // 142
        regle26 () ;
      break ;
      case LEX_MCS.token_si : // 148
        regle26 () ;
      break ;
      case LEX_MCS.token_retour : // 171
        regle26 () ;
      break ;
      case LEX_MCS.token_asm : // 151
=======
      case LEX_MCS.token_acf : // 7612
        regle25 () ;
      break ;
      case LEX_MCS.token_void : // 7619
        regle26 () ;
      break ;
      case LEX_MCS.token_int : // 7621
        regle26 () ;
      break ;
      case LEX_MCS.token_char : // 7622
        regle26 () ;
      break ;
      case LEX_MCS.token_identc : // 7661
        regle26 () ;
      break ;
      case LEX_MCS.token_struct : // 7623
        regle26 () ;
      break ;
      case LEX_MCS.token_bool : // 7633
        regle26 () ;
      break ;
      case LEX_MCS.token_entier : // 7657
        regle26 () ;
      break ;
      case LEX_MCS.token_chaine : // 7659
        regle26 () ;
      break ;
      case LEX_MCS.token_caractere : // 7658
        regle26 () ;
      break ;
      case LEX_MCS.token_plus : // 7649
        regle26 () ;
      break ;
      case LEX_MCS.token_moins : // 7650
        regle26 () ;
      break ;
      case LEX_MCS.token_non : // 7656
        regle26 () ;
      break ;
      case LEX_MCS.token_null : // 7642
        regle26 () ;
      break ;
      case LEX_MCS.token_paro : // 7609
        regle26 () ;
      break ;
      case LEX_MCS.token_malloc : // 7606
        regle26 () ;
      break ;
      case LEX_MCS.token_mult : // 7652
        regle26 () ;
      break ;
      case LEX_MCS.token_ident : // 7660
        regle26 () ;
      break ;
      case LEX_MCS.token_true : // 7634
        regle26 () ;
      break ;
      case LEX_MCS.token_false : // 7635
        regle26 () ;
      break ;
      case LEX_MCS.token_aco : // 7611
        regle26 () ;
      break ;
      case LEX_MCS.token_si : // 7617
        regle26 () ;
      break ;
      case LEX_MCS.token_retour : // 7640
        regle26 () ;
      break ;
      case LEX_MCS.token_asm : // 7620
>>>>>>> 477cdfe2a07ecea959ec9e3d3c2138087d7362de
        regle26 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
