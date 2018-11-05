package com.company;
import java.util.Scanner;

public class Main {

        public static int recursion(int n) {
            if (n == 0) {
                return 0;
            }
            return recursion(n / 10) + n%10;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your number : ");
            int n = sc.nextInt();
            System.out.println("\nSum = " + recursion(n));
        }

}
