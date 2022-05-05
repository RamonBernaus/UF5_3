/*6. Fent servir expressions regulars, creeu un programa en Java que verifiqui si una contrasenya
compleix les següents condicions:
• Mínim té un dígit
• Mínim té un caràcter de puntuació (considereu 10 possibles)
• Mínim té un caràcter en majúscula
• Mida mínima de 6 caràcters */
package uf5_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ramon
 */
public class Ex6 {
    public static void main(String[] args) {
String contrasenya = "A21rambertor-";
ValidarContra(contrasenya);
    }
    public static String ValidarContra(String contra){
Pattern regles = Pattern.compile("{1,10} [,.-?¿%$!¡{}]A-Za-z");
Matcher textAnalitzar = regles.matcher(contra);
if(textAnalitzar.find()){
        System.out.println("La contrasenya es correcta");
} else {
    System.out.println("La contrasenya es incorrecta");
}
return contra;
}
}
