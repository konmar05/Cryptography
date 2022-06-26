package classicCrypto.caesar;

import classicCrypto.caesar.Caesar;

public class CaesarFunc {

    String plaintext = "";

    Caesar caesar = new Caesar(plaintext);



    public void encrypt(int key) {

        // 1. foo(changeCharToNum())
        // 2. encrypt - Algorithm
        // 3. foo(changeNumToChar())
    } //todo

    public void decrypt(int key) {

        // 1. foo(changeCharToNum())
        // 2. decrypt - Algorithm
        // 3. foo(changeNumToChar())
    } //todo

    public void changeNumToChar() { //todo

        for (int i = 0; i < inputChar.length; i++) {
            switch (tmp[i]) {
                case 'A':
                    result[i] = "11";
                    break;
                case 'B':
                    result[i] = "21";
                    break;
                case 'C':
                    result[i] = "31";
                    break;
                case 'D':
                    result[i] = "41";
                    break;
                case 'E':
                    result[i] = "51";
                    break;
                case 'F':
                    result[i] = "12";
                    break;
                case 'G':
                    result[i] = "22";
                    break;
                case 'H':
                    result[i] = "32";
                    break;
                case 'I':
                    result[i] = "42";
                    break;
                case 'K':
                    result[i] = "52";
                    break;
                case 'L':
                    result[i] = "13";
                    break;
                case 'M':
                    result[i] = "23";
                    break;
                case 'N':
                    result[i] = "33";
                    break;
                case 'O':
                    result[i] = "43";
                    break;
                case 'P':
                    result[i] = "53";
                    break;
                case 'Q':
                    result[i] = "14";
                    break;
                case 'R':
                    result[i] = "24";
                    break;
                case 'S':
                    result[i] = "34";
                    break;
                case 'T':
                    result[i] = "44";
                    break;
                case 'U':
                    result[i] = "54";
                    break;
                case 'V':
                    result[i] = "15";
                    break;
                case 'W':
                    result[i] = "25";
                    break;
                case 'X':
                    result[i] = "35";
                    break;
                case 'Y':
                    result[i] = "45";
                    break;
                case 'Z':
                    result[i] = "55";
                    break;
                default:
                    break;
            }
        }
    }

    public void changeCharToNum(char[] inputNum) {} //todo
}
