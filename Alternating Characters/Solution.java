import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            String s = in.next();
            int cnt = 0;
            for (int j = 0; j < s.length()-1; j++)
                if (s.charAt(j) == s.charAt(j+1))
                    cnt++;
            System.out.println(cnt);
        }
    }
}
