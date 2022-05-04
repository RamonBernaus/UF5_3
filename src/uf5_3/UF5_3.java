/*1. Fent servir la classe String, creeu un programa en Java que digui si una frase introduïda és un
palíndrom o no, és a dir, si es llegeix igual d'esquerra a dreta que de dreta a esquerra, sense
tenir en compte els espais, accents, apòstrofs, símbols ni majúscules.
(Pista: podeu utilitzar el mètode reverse() de la classe StringBuilder). */
package uf5_3;

/**
 *
 * @author Ramon
 */
public class UF5_3 {
    public static void main(String[] args) {
        palíndrom("Amor a Roma");
    }
    
    public static String palíndrom(String str){
        StringBuilder strb = new StringBuilder();
        strb.append(str);
        strb.reverse();
        System.out.println(strb + " " + str);
        return str;
    }

}
