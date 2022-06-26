package mainApplication;

import classicCrypto.polybius.Polybius;

public class Application extends Polybius {

    public static void main(String[] args) {
        plainText = "BEISPIEL";
        System.out.println("Plainttext: " + plainText);
        chiperText = encrypt(plainText);
        System.out.println("Chipertext: " + chiperText);
    }
}

