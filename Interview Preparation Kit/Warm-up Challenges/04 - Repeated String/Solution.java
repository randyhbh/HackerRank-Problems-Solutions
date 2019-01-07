import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        if (s.length() == 1) {
             if (s.charAt(0) == 'a') {
                 return n;
            } else {
                 return 0;
            }
        }
        
        int amountOfLetterA = amountOfLetterA(s);
        long repeat = n / s.length();
        long result = amountOfLetterA * repeat;
        long rest = n % s.length();
        return result += amountOfLetterA(s.substring(0,(int)rest));
    }

    static int amountOfLetterA(String chain){
        return chain.chars().mapToObj(i -> (char) i).filter(character -> character.equals('a'))
                .collect(Collectors.toList()).size();
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
