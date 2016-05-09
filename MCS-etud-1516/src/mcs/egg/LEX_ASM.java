package mcs.egg;
import java.util.Arrays;
import mg.egg.eggc.runtime.libjava.EGGException;
import mg.egg.eggc.runtime.libjava.messages.NLS;
import mg.egg.eggc.runtime.libjava.lex.LEXICAL4;
import mg.egg.eggc.runtime.libjava.lex.LEX_CONTEXTE;
import mg.egg.eggc.runtime.libjava.problem.IProblemReporter;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import mg.egg.eggc.runtime.libjava.problem.ProblemSeverities;
import mcs.tds.*;
import mcs.type.*;
import java.util.*;
import mcs.gc.*;
public class LEX_ASM extends LEXICAL4  {
 public static final int EOF = 0 ;
 public static final int token_loadl = 1 ;
 public static final int token_dpts = 2 ;
 public static final int token_call = 3 ;
 public static final int token_store = 4 ;
 public static final int token_loadi = 5 ;
 public static final int token_nb = 6 ;
 public static final int token_jumpif = 7 ;
 public static final int token_loada = 8 ;
 public static final int token_separ = 9 ;
 public static final int token_cro = 10 ;
 public static final int token_jump = 11 ;
 public static final int token_crf = 12 ;
 public static final int token_aco = 13 ;
 public static final int token_chaine = 14 ;
 public static final int token_paro = 15 ;
 public static final int token_acf = 16 ;
 public static final int token_parf = 17 ;
 public static final int token_moins = 18 ;
 public static final int token_var = 19 ;
 public static final int token_subr = 20 ;
 public static final int token_ident = 21 ;
 public static final int token_pop = 22 ;
 public static final int token_car = 23 ;
 public static final int token_jumpi = 24 ;
 public static final int token_load = 25 ;
 public static final int token_push = 26 ;
 public static final int token_calli = 27 ;
 public static final int token_return = 28 ;
 public static final int token_storei = 29 ;
 public static final int token_info = 30 ;
 public static final int token_nl = 31 ;
 public static final int token_halt = 32 ;
  static final int token_autre = 33 ;
  public static final String[][] tokenImages = {
    {"<EOF>"} ,{"loadl"},
{"dpts"},
{"call"},
{"store"},
{"loadi"},
    {"nb"} ,
{"jumpif"},
{"loada"},
    {"separ"} ,
{"cro"},
{"jump"},
{"crf"},
{"aco"},
    {"chaine"} ,
{"paro"},
{"acf"},
{"parf"},
{"moins"},
    {"var"} ,
{"subr"},
    {"ident"} ,
{"pop"},
    {"car"} ,
{"jumpi"},
{"load"},
{"push"},
{"calli"},
{"return"},
{"storei"},
    {"info"} ,
{"nl"},
{"halt"},
  } ;
  private int [] separateurs = { 
token_separ
    } ;
  public int[] getSeparateurs(){
    return separateurs;
    }
  private int [] comments = { 
    } ;
  public int[] getComments(){
    return comments;
    }
  private int le_comment = -1;
  public int getComment(){
    return le_comment;
    }
  public LEX_ASM(IProblemReporter pr, LEX_CONTEXTE lc, int k) {
    super(pr , lc,k);
    dernier_accepte = 0 ;
    analyseur = new JLEX_ASM();
  }
  public void setSource ( LEXICAL4 scanner) throws EGGException{
    scanner.analyseur.toContext(scanner.contexte);
    analyseur.fromContext(scanner.contexte);
  }
  public void setReader ( LEXICAL4 scanner) {
    scanner.analyseur.setReader(scanner.contexte.source);
  }
  public void accepter_sucre ( int t ) throws EGGException {
    if ( fenetre[0].code == t ) {
      dernier_accepte = fenetre[0].ligne ;
      recovery = false;
      decaler () ;
    }else {
      _interrompre(IProblem.Syntax,getBeginLine(), IASMMessages.id_ASM_expected_token, ASMMessages.ASM_expected_token,new Object[]{fenetre[0].getNom(), Arrays.asList(tokenImages[t])});
    }
  }
  public void accepter_fds() throws EGGException {
    lit ( 1 ) ;
    if ( fenetre[0].code != EOF ) {
      _interrompre(IProblem.Syntax,getBeginLine(), IASMMessages.id_ASM_expected_token, ASMMessages.ASM_expected_eof, new Object[]{fenetre[0].getNom()});
      }
     else {
      dernier_accepte = fenetre[0].ligne ;
      }
    }
  public int ligneDepart () {
    return getBeginLine() + getEndLine() ;
    }
  public void _interrompre (int cat,  int line, int id,  String c , Object [] m )  {
      //recovery = true;
      recovery = false;
      contexte.errors++;
        problemReporter.handle(cat, id,line  , NLS.bind(c,m), getOffset(), getOffset() + getLength() - 1,ProblemSeverities.Error,m);
    }
    public void _signaler ( int cat, int line, int id, String c , Object [] m )  {
        problemReporter.handle(cat , id, line  , NLS.bind(c,m),getOffset(), getOffset() + getLength() - 1,ProblemSeverities.Warning,m);
    }
  }
