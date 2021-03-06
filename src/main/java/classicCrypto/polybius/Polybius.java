/**
 * @author: Markus Konietzka
 * @date: 26-06-2022
 * @version 1.0
 *
 * @description: encrypt(), decrypt(),
 *
 * @todo:   decrypt() - decrypt chipertext given as a String
 *          printCiphertext() - print in command Window
 *          encrypt() - with parameter
 */

package classicCrypto.polybius;

import java.util.Arrays;

public class Polybius {

    public char[][] square = {
            {'A','F','L','Q','V'},
            {'B','G','M','R','W'},
            {'C','H','N','S','X'},
            {'D','I','O','T','Y'},
            {'E','K','P','U','Z'}};

    public static String plainText = "";
    public static String chiperText = "";

    public static String encrypt(String input) {
        char[] tmp = input.toCharArray();
        String[] result = new String[tmp.length];
        String retResult;

        for (int i = 0; i < tmp.length; i++) {
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
        retResult = Arrays.toString(result);
        return retResult;
    }

}
