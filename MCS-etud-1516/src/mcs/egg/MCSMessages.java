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

  public static  String B_11;
  public static  String B_10;
  public static  String MCS_expected_eof;
  public static  String type_declared;
  public static  String type_undefined;
  public static  String MCS_expected_token;
  public static  String B_08;
  public static  String returnType_notCompatible;
  public static  String champ_declared;
  public static  String B_01;
  public static  String var_declared;
  public static  String not_infotype;
  public static  String NO_MACH;
  public static  String not_int;
  public static  String not_pointeur;
  public static  String MCS_unexpected_token;
  public static  String affect_notCompatible;
  public static  String B_12;
  }
