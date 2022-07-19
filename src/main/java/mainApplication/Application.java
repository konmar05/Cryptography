package mainApplication;

import classicCrypto.polybius.Polybius;
import classicCrypto.vigenere.Vigenere;

public class Application extends Polybius {

    public static void main(String[] args) {

        /*
        plainText = "BEISPIEL";
        System.out.println("Plainttext: " + plainText);
        chiperText = encrypt(plainText);
        System.out.println("Chipertext: " + chiperText);
        */

        Vigenere vig = new Vigenere("WELTMEISTER");
        vig.encrpyt("HAUS");

        System.out.println(vig.printCyphertext());

        vig.decrypt("HAUS");
        System.out.println(vig.printPlaintext());
    }
}

