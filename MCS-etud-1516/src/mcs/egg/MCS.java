package mcs.egg;
import mcs.compiler.*;
import mcs.tds.*;
import mcs.type.*;
import mcs.gc.*;
import java.util.*;
import mg.egg.eggc.runtime.libjava.EGGException;
import mg.egg.eggc.runtime.libjava.ISourceUnit;
import mg.egg.eggc.runtime.libjava.lex.LEX_CONTEXTE;
import mg.egg.eggc.runtime.libjava.problem.IProblemReporter;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import mg.egg.eggc.runtime.libjava.problem.ProblemSeverities;
import mg.egg.eggc.runtime.libjava.messages.NLS;
public class MCS {
  LEX_MCS scanner;
  protected IProblemReporter problemReporter;
    private S_PROGRAMME_MCS axiome ;
    public  S_PROGRAMME_MCS getAxiom(){return axiome;}
  public MCS(IProblemReporter pr){
	   this.problemReporter = pr;
  }
  public void compile(ISourceUnit cu) throws Exception {
    try{
      System.err.println("MCS Version 0.0.1");
      LEX_CONTEXTE contexte;
      contexte = new LEX_CONTEXTE(cu);
      scanner = new LEX_MCS(problemReporter, contexte, 2);
      scanner.analyseur.fromContext(contexte);
      att_scanner = scanner;
      axiome = new S_PROGRAMME_MCS(scanner,att_eval);
      axiome.att_scanner = this.att_scanner ;
      axiome.att_eval = this.att_eval ;
      axiome.att_source = this.att_source ;
      axiome.analyser() ;
      scanner.accepter_fds() ;
    }catch (EGGException e){
      problemReporter.handle(e.getCategory(), e.getCode(),0, NLS.bind(e.getId(),e.getArgs()),ProblemSeverities.Error,0,0,e.getArgs());
    }
    }
  boolean att_eval;
  public void set_eval(boolean a_eval){
    att_eval = a_eval;
  }
  public boolean get_eval(){
    return att_eval;
  }
  LEX_MCS att_scanner;
  public void set_scanner(LEX_MCS a_scanner){
    att_scanner = a_scanner;
  }
  public LEX_MCS get_scanner(){
    return att_scanner;
  }
  MCSSourceFile att_source;
  public void set_source(MCSSourceFile a_source){
    att_source = a_source;
  }
  public MCSSourceFile get_source(){
    return att_source;
  }
  }
