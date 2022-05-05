/*1. Fent servir la classe String, creeu un programa en Java que digui si una frase introduïda és un
palíndrom o no, és a dir, si es llegeix igual d'esquerra a dreta que de dreta a esquerra, sense
tenir en compte els espais, accents, apòstrofs, símbols ni majúscules.
(Pista: podeu utilitzar el mètode reverse() de la classe StringBuilder). */
package uf5_3;

/**
 *
 * @author Ramon
 */
public class Ex1 {

    public static void main(String[] args) {
        palíndrom("Amor a Roma");
    }

    public static String palíndrom(String str) {
        StringBuilder strb = new StringBuilder();
        str = str.toLowerCase();
        strb.append(str);
        strb.reverse().toString();
        if (strb.equals(str)) {
            System.out.println("Es un palindrom ");
        } else {
            System.out.println("No es un palindrom ");
        }

        return str;
    }

}
