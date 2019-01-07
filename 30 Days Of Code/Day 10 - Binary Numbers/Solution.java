package com.company;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int consecutive = 0;
        int streak = 0;
        while (n != 0) {
            int remain = n % 2;
            if (remain == 1) {
                streak++;
                if (streak > consecutive) {
                    consecutive = streak;
                }
            } else {
                streak = 0;
            }
            n = n / 2;
        }
        System.out.println(consecutive);
        scanner.close();
    }
}
