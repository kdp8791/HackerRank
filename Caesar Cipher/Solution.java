import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            char f = c;
            if (c >= 'a' && c <= 'z') {
                f = (char)((c+k-'a')%26+'a');
            } else if (c >= 'A' && c <= 'Z') {
                f = (char)((c+k-'A')%26+'A');
            }
            sb.append(f);
        }
        System.out.println(sb.toString());
    }
}
