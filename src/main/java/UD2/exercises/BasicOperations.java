package UD2.exercises;

import java.util.Scanner;
import java.util.Locale;

public class BasicOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in).useLocale(Locale.US);
        int a = in.nextInt();
        int b = in.nextInt();

        int divisio = a / b;

        System.out.println("Divisió: " + divisio);
    }
}