package mcs.egg;
import mcs.compiler.MCSSourceFile;
import mcs.gc.IMachine;
import mg.egg.eggc.runtime.libjava.messages.CoreMessages;
import mg.egg.eggc.runtime.libjava.messages.ICoreMessages;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
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
  MCSSourceFile att_source;
  boolean att_eval;
  LEX_MCS att_scanner;
  IMachine glob_0_machine;
  private void regle0() throws Exception {

    //declaration
    S_ENTITES_MCS x_3 = new S_ENTITES_MCS(scanner,att_eval) ;
    //appel
if  (att_eval)      action_init_0(x_3);
    x_3.analyser() ;
if  (att_eval)      action_gen_0(x_3);
  }
private void action_gen_0(S_ENTITES_MCS x_3) throws Exception {
try {
// locales
// instructions
glob_0_machine.writeCode(this.att_source.getFileName(), "; no code\n");
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#gen","PROGRAMME -> #init ENTITES #gen ;"});
}
  }
private void action_init_0(S_ENTITES_MCS x_3) throws Exception {
try {
// locales
// instructions
glob_0_machine=this.att_source.getMachine();
if (glob_0_machine==null){
att_scanner._interrompre(IProblem.Semantic, att_scanner.getBeginLine(), IMCSMessages.id_NO_MACH, MCSMessages.NO_MACH,new Object[]{""+this.att_source.getMachName()});

}
else {
x_3.att_machine=glob_0_machine;
}
}catch(RuntimeException e) {       att_scanner._interrompre(IProblem.Internal,att_scanner.getBeginLine(),ICoreMessages.id_EGG_runtime_error, CoreMessages.EGG_runtime_error,new Object[] { "MCS", "#init","PROGRAMME -> #init ENTITES #gen ;"});
}
  }
  public void analyser () throws Exception {
    scanner.lit ( 1 ) ;
    switch ( scanner.fenetre[0].code ) {
      case LEX_MCS.token_typedef : // 139
        regle0 () ;
      break ;
      case LEX_MCS.token_void : // 134
        regle0 () ;
      break ;
      case LEX_MCS.token_int : // 136
        regle0 () ;
      break ;
      case LEX_MCS.token_char : // 137
        regle0 () ;
      break ;
      case LEX_MCS.token_identc : // 161
        regle0 () ;
      break ;
      case LEX_MCS.token_struct : // 138
        regle0 () ;
      break ;
      case LEX_MCS.token_asm : // 135
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
