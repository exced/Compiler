package mcs.egg;
import java.util.Arrays;

import mg.egg.eggc.runtime.libjava.EGGException;
import mg.egg.eggc.runtime.libjava.lex.LEXICAL4;
import mg.egg.eggc.runtime.libjava.lex.LEX_CONTEXTE;
import mg.egg.eggc.runtime.libjava.messages.NLS;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import mg.egg.eggc.runtime.libjava.problem.IProblemReporter;
import mg.egg.eggc.runtime.libjava.problem.ProblemSeverities;
public class LEX_MCS extends LEXICAL4  {
 public static final int EOF = 0 ;
 public static final int token_sinon = 1 ;
 public static final int token_void = 2 ;
 public static final int token_mod = 3 ;
 public static final int token_mult = 4 ;
 public static final int token_eg = 5 ;
 public static final int token_null = 6 ;
 public static final int token_ident = 7 ;
 public static final int token_div = 8 ;
 public static final int token_pv = 9 ;
 public static final int token_pt = 10 ;
 public static final int token_int = 11 ;
 public static final int token_aco = 12 ;
 public static final int token_inf = 13 ;
 public static final int token_acf = 14 ;
 public static final int token_identc = 15 ;
 public static final int token_ou = 16 ;
 public static final int token_arrow = 17 ;
 public static final int token_moins = 18 ;
 public static final int token_neg = 19 ;
 public static final int token_typedef = 20 ;
 public static final int token_caractere = 21 ;
 public static final int token_chaine = 22 ;
 public static final int token_affect = 23 ;
 public static final int token_retour = 24 ;
 public static final int token_struct = 25 ;
 public static final int token_asm = 26 ;
 public static final int token_virg = 27 ;
 public static final int token_entier = 28 ;
 public static final int token_si = 29 ;
 public static final int token_paro = 30 ;
 public static final int token_sup = 31 ;
 public static final int token_separateur = 32 ;
 public static final int token_comm = 33 ;
 public static final int token_parf = 34 ;
 public static final int token_supeg = 35 ;
 public static final int token_plus = 36 ;
 public static final int token_non = 37 ;
 public static final int token_infeg = 38 ;
 public static final int token_char = 39 ;
 public static final int token_et = 40 ;
  static final int token_autre = 41 ;
  public static final String[][] tokenImages = {
    {"<EOF>"} ,{"sinon"},
{"void"},
{"mod"},
{"mult"},
{"eg"},
{"null"},
    {"ident"} ,
{"div"},
{"pv"},
{"pt"},
{"int"},
{"aco"},
{"inf"},
{"acf"},
    {"identc"} ,
{"ou"},
{"arrow"},
{"moins"},
{"neg"},
{"typedef"},
    {"caractere"} ,
    {"chaine"} ,
{"affect"},
{"retour"},
{"struct"},
{"asm"},
{"virg"},
    {"entier"} ,
{"si"},
{"paro"},
{"sup"},
    {"separateur"} ,
    {"comm"} ,
{"parf"},
{"supeg"},
{"plus"},
{"non"},
{"infeg"},
{"char"},
{"et"},
  } ;
  private int [] separateurs = { 
token_separateur
, token_comm
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
  public LEX_MCS(IProblemReporter pr, LEX_CONTEXTE lc, int k) {
    super(pr, lc,k);
    dernier_accepte = 0 ;
    analyseur = new JLEX_MCS();
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
      _interrompre(IProblem.Syntax,getBeginLine(), IMCSMessages.id_MCS_expected_token, MCSMessages.MCS_expected_token,new Object[]{fenetre[0].getNom(), Arrays.asList(tokenImages[t])});
    }
  }
  public void accepter_fds() throws EGGException {
    lit ( 1 ) ;
    if ( fenetre[0].code != EOF ) {
      _interrompre(IProblem.Syntax,getBeginLine(), IMCSMessages.id_MCS_expected_token, MCSMessages.MCS_expected_eof, new Object[]{fenetre[0].getNom()});
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
