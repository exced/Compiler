package mcs.egg;
import mcs.gc.IMachine;
import mg.egg.eggc.runtime.libjava.messages.CoreMessages;
import mg.egg.eggc.runtime.libjava.messages.ICoreMessages;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
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
  boolean att_eval;
  IMachine att_machine;
  LEX_MCS att_scanner;
  private void regle62() throws Exception {

    //declaration
    S_OPUN_MCS x_2 = new S_OPUN_MCS(scanner,att_eval) ;
    S_F_MCS x_3 = new S_F_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_62(x_2, x_3);
    x_2.analyser() ;
    x_3.analyser() ;
  }
  private void regle60() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_chaine);
  }
  private void regle61() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_caractere);
  }
  private void regle66() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_null);
  }
  private void regle67() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_E_MCS x_3 = new S_E_MCS(scanner,att_eval) ;
    T_MCS x_4 = new T_MCS(scanner ) ;
    S_FX_MCS x_5 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_67(x_3, x_5);
    x_2.analyser(LEX_MCS.token_paro);
    x_3.analyser() ;
    x_4.analyser(LEX_MCS.token_parf);
    x_5.analyser() ;
  }
  private void regle59() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    //appel
    x_2.analyser(LEX_MCS.token_entier);
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
  }
  private void regle69() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_F_MCS x_3 = new S_F_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_69(x_3);
    x_2.analyser(LEX_MCS.token_mult);
    x_3.analyser() ;
  }
  private void regle70() throws Exception {

    //declaration
    T_MCS x_2 = new T_MCS(scanner ) ;
    S_FX_MCS x_3 = new S_FX_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_auto_inh_70(x_2, x_3);
    x_2.analyser(LEX_MCS.token_ident);
    x_3.analyser() ;
  }
private void action_auto_inh_62(S_OPUN_MCS x_2, S_F_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> OPUN F1 ;"});
}
  }
private void action_auto_inh_67(S_E_MCS x_3, S_FX_MCS x_5) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
x_5.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> paro E parf FX ;"});
}
  }
private void action_auto_inh_69(S_F_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> mult F1 ;"});
}
  }
private void action_auto_inh_68(S_TYPE_MCS x_3, S_F_MCS x_5) throws Exception {
try {
// instructions
x_5.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> paro TYPE parf F1 ;"});
}
  }
private void action_auto_inh_70(T_MCS x_2, S_FX_MCS x_3) throws Exception {
try {
// instructions
x_3.att_machine=this.att_machine;
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#auto_inh","F -> ident FX ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_entier : // 157
        regle59 () ;
      break ;
      case LEX_MCS.token_chaine : // 159
        regle60 () ;
      break ;
      case LEX_MCS.token_caractere : // 158
        regle61 () ;
      break ;
      case LEX_MCS.token_plus : // 149
        regle62 () ;
      break ;
      case LEX_MCS.token_moins : // 150
        regle62 () ;
      break ;
      case LEX_MCS.token_non : // 156
        regle62 () ;
      break ;
      case LEX_MCS.token_null : // 142
        regle66 () ;
      break ;
      case LEX_MCS.token_paro : // 124
        scanner.lit ( 2 ) ;
        switch ( scanner.fenetre[1].code ) {
          case LEX_MCS.token_entier : // 157
            regle67 () ;
          break ;
          case LEX_MCS.token_chaine : // 159
            regle67 () ;
          break ;
          case LEX_MCS.token_caractere : // 158
            regle67 () ;
          break ;
          case LEX_MCS.token_plus : // 149
            regle67 () ;
          break ;
          case LEX_MCS.token_moins : // 150
            regle67 () ;
          break ;
          case LEX_MCS.token_non : // 156
            regle67 () ;
          break ;
          case LEX_MCS.token_null : // 142
            regle67 () ;
          break ;
          case LEX_MCS.token_paro : // 124
            regle67 () ;
          break ;
          case LEX_MCS.token_mult : // 152
            regle67 () ;
          break ;
          case LEX_MCS.token_ident : // 160
            regle67 () ;
          break ;
          case LEX_MCS.token_void : // 134
            regle68 () ;
          break ;
          case LEX_MCS.token_int : // 136
            regle68 () ;
          break ;
          case LEX_MCS.token_char : // 137
            regle68 () ;
          break ;
          case LEX_MCS.token_identc : // 161
            regle68 () ;
          break ;
          case LEX_MCS.token_struct : // 138
            regle68 () ;
          break ;
          default :
                   scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[1].getNom()});
scanner.accepter_sucre(LEX_MCS.token_paro);
        }
      break ;
      case LEX_MCS.token_mult : // 152
        regle69 () ;
      break ;
      case LEX_MCS.token_ident : // 160
        regle70 () ;
      break ;
      default :
               scanner._interrompre(IProblem.Syntax, scanner.getBeginLine(), IMCSMessages.id_MCS_unexpected_token,MCSMessages.MCS_unexpected_token,new String[]{scanner.fenetre[0].getNom()});
    }
  }
  }
