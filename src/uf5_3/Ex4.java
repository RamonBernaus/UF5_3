/*4. Fent servir expressions regulars, creeu un programa en Java que verifiqui si un NIF és
correcte. No cal validar la lletra, només cal validar el format.  */
package uf5_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static jdk.nashorn.tools.ShellFunctions.input;

/**
 *
 * @author ramon
 */
public class Ex4 {
    public static void main(String[] args) {
        Nif();
    }

public static String Nif(){
      String str = "123456789";
      Pattern p = Pattern.compile("[A-Z][0-9]");
      Matcher m = p.matcher(str);
      p = Pattern.compile("[^a-z.@_-~#]+?¿");
      m = p.matcher(str);
      StringBuffer sb = new StringBuffer();
      boolean resultado = m.find();
      boolean caracteresIlegales = false;
      if (caracteresIlegales) {
         System.out.println("EL NIF conte caracters ilegals");
      } else {
          System.out.println("El Nif es correcte");
}
return str;
}
}
