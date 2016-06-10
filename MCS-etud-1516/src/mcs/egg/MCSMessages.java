package mcs.egg;
import java.util.ResourceBundle;
import mg.egg.eggc.runtime.libjava.messages.NLS;
public class MCSMessages extends NLS {
  private static final long serialVersionUID = 1L;
  private static final String BUNDLE_NAME = "mcs.MCS";
  private MCSMessages() {
  // Do not instantiate
  }
  static {
  NLS.initializeMessages(BUNDLE_NAME, mcs.egg.MCSMessages.class);
  }
  private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
  public static ResourceBundle getResourceBundle() {
  return RESOURCE_BUNDLE;
  }		

  public static  String def_defined;
  public static  String namespace_declared;
  public static  String MCS_expected_eof;
  public static  String call_nomatch;
  public static  String champ_not_found;
  public static  String type_declared;
  public static  String classe_defined;
  public static  String wrong_typeFonc;
  public static  String namespace_unknown;
  public static  String castError;
  public static  String typeError_opUn;
  public static  String type_not_struct;
  public static  String type_undefined;
  public static  String MCS_expected_token;
  public static  String typeError_opBin;
  public static  String returnType_notCompatible;
  public static  String not_castable_as;
  public static  String not_bool;
  public static  String champ_declared;
  public static  String var_declared;
  public static  String access_not_pointeur;
  public static  String type_unknown;
  public static  String using_notNameSpace;
  public static  String var_not_found;
  public static  String not_infotype;
  public static  String NO_MACH;
  public static  String not_pointeur;
  public static  String malloc_need_int;
  public static  String MCS_unexpected_token;
  public static  String classe_undefined;
  public static  String affect_notCompatible;
  }
