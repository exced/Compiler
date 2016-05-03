package mcs.egg;
import mcs.tds.TDS;
import mg.egg.eggc.runtime.libjava.lex.LEX_CONTEXTE;
import mg.egg.eggc.runtime.libjava.problem.IProblemReporter;
public class ASM {
  LEX_ASM scanner;
  protected IProblemReporter problemReporter;
    private S_TAM_ASM axiome ;
    public  S_TAM_ASM getAxiom(){return axiome;}
  public ASM() {
    axiome = new S_TAM_ASM();
    }
  public ASM(IProblemReporter pr, LEX_CONTEXTE lc){
      scanner = new LEX_ASM (pr, lc, 2);
      att_scanner = scanner;
    }
  public void compile() throws Exception {
    axiome = new S_TAM_ASM(scanner,att_eval);
    att_scanner = scanner;
    axiome.att_scanner = this.att_scanner ;
    axiome.att_eval = this.att_eval ;
    axiome.att_tds_asm = this.att_tds_asm ;
    axiome.analyser() ;
    this.att_code_asm = axiome.att_code_asm ;
    }
  String att_code_asm;
  public void set_code_asm(String a_code_asm){
    att_code_asm = a_code_asm;
  }
  public String get_code_asm(){
    return att_code_asm;
  }
  boolean att_eval;
  public void set_eval(boolean a_eval){
    att_eval = a_eval;
  }
  public boolean get_eval(){
    return att_eval;
  }
  TDS att_tds_asm;
  public void set_tds_asm(TDS a_tds_asm){
    att_tds_asm = a_tds_asm;
  }
  public TDS get_tds_asm(){
    return att_tds_asm;
  }
  LEX_ASM att_scanner;
  public void set_scanner(LEX_ASM a_scanner){
    att_scanner = a_scanner;
  }
  public LEX_ASM get_scanner(){
    return att_scanner;
  }
  }
