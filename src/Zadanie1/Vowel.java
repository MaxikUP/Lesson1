package Zadanie1;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class Vowel {
    public static int VowelCount() {
        Scanner str = new Scanner(System.in);
        String s = str.nextLine();
        int count = 0;
        char c;
        if (s.length() == 0) {
            return 0;
        } else {
            for (int i=0; i<s.length();i++) {
                c = s.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }
            return count;

        }
    }
}

