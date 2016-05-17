package mcs.egg;
import java.util.ResourceBundle;
import mg.egg.eggc.runtime.libjava.messages.NLS;
public class ASMMessages extends NLS {
  private static final long serialVersionUID = 1L;
  private static final String BUNDLE_NAME = "mcs.ASM";
  private ASMMessages() {
  // Do not instantiate
  }
  static {
  NLS.initializeMessages(BUNDLE_NAME, mcs.egg.ASMMessages.class);
  }
  private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME);
  public static ResourceBundle getResourceBundle() {
  return RESOURCE_BUNDLE;
  }		

  public static  String NOT_A_VAR;
  public static  String ASM_expected_eof;
  public static  String ASM_unexpected_token;
  public static  String UNKNOWN;
  public static  String ASM_expected_token;
  }
