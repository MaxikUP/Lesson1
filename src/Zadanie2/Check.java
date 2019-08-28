package Zadanie2;

import java.util.Scanner;

public class Check {
    public static boolean Chek() {
        Scanner str = new Scanner(System.in);
        System.out.println("Введите первое слово:");
        String s1 = str.nextLine();
        System.out.println("Введите второе слово:");
        String s2 = str.nextLine();
        int n = s2.length();
        String s3 = s1.substring(s1.length() - n);
        return (s3.equals(s2));
    }
}
