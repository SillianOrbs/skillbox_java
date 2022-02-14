package module3.FactorialCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int value = new Scanner(System.in).nextInt();
        int answer = 1;

        for (int i = 1; i <= value; i++) {
            answer *= i;
        }

        System.out.println(value + "! = " + answer);
    }
}
