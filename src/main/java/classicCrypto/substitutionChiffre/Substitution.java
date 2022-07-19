package classicCrypto.substitutionChiffre;

public class Substitution {

    public char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    public int[] order = {};

    public static void encrypt(String plaintext, int key1, int key2) {
        char[] tmp = plaintext.toCharArray();
        int[] intArray = new int[tmp.length];
        intArray = changeC2I(tmp);

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (key1 * intArray[i] + key2) % 26;
        }

        tmp = changeI2C(intArray);

        System.out.println(String.valueOf(tmp));
    }

    public static void encrypt(String plaintext, int key2) {
        char[] tmp = plaintext.toCharArray();
        int[] intArray = new int[tmp.length];
        intArray = changeC2I(tmp);

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (1 * intArray[i] + key2) % 26;
        }

        tmp = changeI2C(intArray);

        System.out.println(String.valueOf(tmp));
    }

    public void decrypt(String cyphertext) {
    }

    public static int[] changeC2I(char[] input) {
        int[] tmpInt = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case 'A':
                    tmpInt[i] = 0;
                    break;
                case 'B':
                    tmpInt[i] = 1;
                    break;
                case 'C':
                    tmpInt[i] = 2;
                    break;
                case 'D':
                    tmpInt[i] = 3;
                    break;
                case 'E':
                    tmpInt[i] = 4;
                    break;
                case 'F':
                    tmpInt[i] = 5;
                    break;
                case 'G':
                    tmpInt[i] = 6;
                    break;
                case 'H':
                    tmpInt[i] = 7;
                    break;
                case 'I':
                    tmpInt[i] = 8;
                    break;
                case 'J':
                    tmpInt[i] = 9;
                    break;
                case 'K':
                    tmpInt[i] = 10;
                    break;
                case 'L':
                    tmpInt[i] = 11;
                    break;
                case 'M':
                    tmpInt[i] = 12;
                    break;
                case 'N':
                    tmpInt[i] = 13;
                    break;
                case 'O':
                    tmpInt[i] = 14;
                    break;
                case 'P':
                    tmpInt[i] = 15;
                    break;
                case 'Q':
                    tmpInt[i] = 16;
                    break;
                case 'R':
                    tmpInt[i] = 17;
                    break;
                case 'S':
                    tmpInt[i] = 18;
                    break;
                case 'T':
                    tmpInt[i] = 19;
                    break;
                case 'U':
                    tmpInt[i] = 20;
                    break;
                case 'V':
                    tmpInt[i] = 21;
                    break;
                case 'W':
                    tmpInt[i] = 22;
                    break;
                case 'X':
                    tmpInt[i] = 23;
                    break;
                case 'Y':
                    tmpInt[i] = 24;
                    break;
                case 'Z':
                    tmpInt[i] = 25;
                    break;
                default:
                    break;
            }
        }

        return tmpInt;
    }

    public static char[] changeI2C(int[] input) {
        char[] tmpChar = new char[input.length];

        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case 0:
                    tmpChar[i] = 'A';
                    break;
                case 1:
                    tmpChar[i] = 'B';
                    break;
                case 2:
                    tmpChar[i] = 'C';
                    break;
                case 3:
                    tmpChar[i] = 'D';
                    break;
                case 4:
                    tmpChar[i] = 'E';
                    break;
                case 5:
                    tmpChar[i] = 'F';
                    break;
                case 6:
                    tmpChar[i] = 'G';
                    break;
                case 7:
                    tmpChar[i] = 'H';
                    break;
                case 8:
                    tmpChar[i] = 'I';
                    break;
                case 9:
                    tmpChar[i] = 'J';
                    break;
                case 10:
                    tmpChar[i] = 'K';
                    break;
                case 11:
                    tmpChar[i] = 'L';
                    break;
                case 12:
                    tmpChar[i] = 'M';
                    break;
                case 13:
                    tmpChar[i] = 'N';
                    break;
                case 14:
                    tmpChar[i] = 'O';
                    break;
                case 15:
                    tmpChar[i] = 'P';
                    break;
                case 16:
                    tmpChar[i] = 'Q';
                    break;
                case 17:
                    tmpChar[i] = 'R';
                    break;
                case 18:
                    tmpChar[i] = 'S';
                    break;
                case 19:
                    tmpChar[i] = 'T';
                    break;
                case 20:
                    tmpChar[i] = 'U';
                    break;
                case 21:
                    tmpChar[i] = 'V';
                    break;
                case 22:
                    tmpChar[i] = 'W';
                    break;
                case 23:
                    tmpChar[i] = 'X';
                    break;
                case 24:
                    tmpChar[i] = 'Y';
                    break;
                case 25:
                    tmpChar[i] = 'Z';
                    break;
                default:
                    break;
            }
        }

        return tmpChar;
    }

    public static void main(String[] args) {
        encrypt("STUDIUM", 12, 3);
        encrypt("STUDIUM", 3);
    }
}

