package com.company;

import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int max = arr[0][0] + arr[0][1] + arr[0][2] + arr[1][1] + arr[2][0] + arr[2][1] + arr[2][2];
        for (int i = 0; i <= arr.length / 2; i++) {
            for (int j = 0; j <= arr.length / 2; j++) {
                int total = arr[i][j] + arr[i][j + 1] + arr[i][j + 2];
                total += arr[i + 1][j + 1];
                total += arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
                if (total > max) {
                    max = total;
                }
            }
        }
        System.out.println(max);
        scanner.close();
    }
}
