import java.io.*;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int amount = scanner.nextInt();

        for(int i = 0; i < amount; i++) {
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            String text = scanner.nextLine();
            String evenChar = "";
            String oddChar = "";

            for(int j = 0; j < text.length(); j++) {

                if (j % 2 == 0) {
                    evenChar += String.valueOf(text.charAt(j));
                } else {
                    oddChar += String.valueOf(text.charAt(j));
                }
            }
            System.out.println(evenChar + " " + oddChar);
        }

            
    }
}

