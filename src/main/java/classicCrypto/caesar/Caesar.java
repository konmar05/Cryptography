package classicCrypto.caesar;

import java.lang.reflect.Array;

public class Caesar {

    String plaintext;
    String chipertext;


    public Caesar(String plaintext) {
        this.plaintext = plaintext;
        int len = plaintext.length();
        char[] cPlaintext = new char[len];
        char[] cChipertext = new char[len];
        cPlaintext = plaintext.toCharArray();
    }
}
