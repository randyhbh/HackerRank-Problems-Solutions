package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Solution {
    public static void main(String[] arg) {
        HashMap<String, Integer> directory = new HashMap<>(100);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            directory.put(name, phone);
        }

        while (in.hasNext()) {
            String s = in.next();
            System.out.println(directory.containsKey(s) ?
                    s + "=" + directory.get(s)
                    : "Not found");
        }
        in.close();
    }
}

