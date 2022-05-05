/*2. Fent servir la classe String, creeu un programa en Java que compti el nombre d'aparicions
d'un caràcter a una frase. */
package uf5_3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ramon
 */
public class Ex2 {

    public static void main(String[] args) {
        String text = "Contarem quants cops es repeteix la lletra 'e' en aquesta frase ";
        contadorString(text);
    }

    public static String contadorString(String text) {
        int i = 0;
        Pattern regles = Pattern.compile("e");
        Matcher textAnalitzar = regles.matcher(text);
        while (textAnalitzar.find() == true) {

            // The string which has produced the last coincidence is shown 
            System.out.print("Cadena: " + textAnalitzar.group());

            // Index of the character where the last coincidence has been found
            System.out.print(" (Inici: " + textAnalitzar.start());

            // Index of the first character after the last coincidence
            System.out.println(", Fi: " + textAnalitzar.end() + ")");

            i++;
        }
        System.out.println("La paraula es ha aparegut un total de " + i);
        return text;
    }

}
