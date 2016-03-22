import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            String s = in.next();
            String r = new StringBuilder(s).reverse().toString();
            boolean funny = true;
            for (int j = 1; j < s.length(); j++) {
                if (Math.abs((int)s.charAt(j)-(int)s.charAt(j-1)) != Math.abs((int)r.charAt(j)-(int)r.charAt(j-1))) {
                    funny = false;
                }
            }
            System.out.println(funny ? "Funny" : "Not Funny");
        }
    }
}
