package mcs.egg;
import java.util.Arrays;
import mg.egg.eggc.runtime.libjava.EGGException;
import mg.egg.eggc.runtime.libjava.messages.NLS;
import mg.egg.eggc.runtime.libjava.lex.LEXICAL4;
import mg.egg.eggc.runtime.libjava.lex.LEX_CONTEXTE;
import mg.egg.eggc.runtime.libjava.problem.IProblemReporter;
import mg.egg.eggc.runtime.libjava.problem.IProblem;
import mg.egg.eggc.runtime.libjava.problem.ProblemSeverities;
import mcs.compiler.*;
import mcs.tds.*;
import mcs.type.*;
import mcs.gc.*;
import java.util.*;
public class LEX_MCS extends LEXICAL4  {
 public static final int EOF = 0 ;
 public static final int token_sinon = 1 ;
 public static final int token_mod = 2 ;
 public static final int token_void = 3 ;
 public static final int token_public = 4 ;
 public static final int token_mult = 5 ;
 public static final int token_eg = 6 ;
 public static final int token_null = 7 ;
 public static final int token_this = 8 ;
 public static final int token_null2 = 9 ;
 public static final int token_ident = 10 ;
 public static final int token_div = 11 ;
 public static final int token_pv = 12 ;
 public static final int token_pt = 13 ;
 public static final int token_int = 14 ;
 public static final int token_using = 15 ;
 public static final int token_aco = 16 ;
 public static final int token_inf = 17 ;
 public static final int token_base = 18 ;
 public static final int token_acf = 19 ;
 public static final int token_identc = 20 ;
 public static final int token_ou = 21 ;
 public static final int token_arrow = 22 ;
 public static final int token_ref = 23 ;
 public static final int token_bool = 24 ;
 public static final int token_new = 25 ;
 public static final int token_moins = 26 ;
 public static final int token_neg = 27 ;
 public static final int token_malloc = 28 ;
 public static final int token_typedef = 29 ;
 public static final int token_dpts = 30 ;
 public static final int token_caractere = 31 ;
 public static final int token_chaine = 32 ;
 public static final int token_retour = 33 ;
 public static final int token_affect = 34 ;
 public static final int token_struct = 35 ;
 public static final int token_asm = 36 ;
 public static final int token_false = 37 ;
 public static final int token_private = 38 ;
 public static final int token_virg = 39 ;
 public static final int token_namespace = 40 ;
 public static final int token_entier = 41 ;
 public static final int token_si = 42 ;
 public static final int token_paro = 43 ;
 public static final int token_sup = 44 ;
 public static final int token_separateur = 45 ;
 public static final int token_comm = 46 ;
 public static final int token_parf = 47 ;
 public static final int token_class = 48 ;
 public static final int token_out = 49 ;
 public static final int token_supeg = 50 ;
 public static final int token_true = 51 ;
 public static final int token_plus = 52 ;
 public static final int token_non = 53 ;
 public static final int token_infeg = 54 ;
 public static final int token_char = 55 ;
 public static final int token_et = 56 ;
  static final int token_autre = 57 ;
  public static final String[][] tokenImages = {
    {"<EOF>"} ,{"sinon"},
{"mod"},
{"void"},
{"public"},
{"mult"},
{"eg"},
{"null"},
{"this"},
{"null2"},
    {"ident"} ,
{"div"},
{"pv"},
{"pt"},
{"int"},
{"using"},
{"aco"},
{"inf"},
{"base"},
{"acf"},
    {"identc"} ,
{"ou"},
{"arrow"},
{"ref"},
{"bool"},
{"new"},
{"moins"},
{"neg"},
{"malloc"},
{"typedef"},
{"dpts"},
    {"caractere"} ,
    {"chaine"} ,
{"retour"},
{"affect"},
{"struct"},
{"asm"},
{"false"},
{"private"},
{"virg"},
{"namespace"},
    {"entier"} ,
{"si"},
{"paro"},
{"sup"},
    {"separateur"} ,
    {"comm"} ,
{"parf"},
{"class"},
{"out"},
{"supeg"},
{"true"},
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
