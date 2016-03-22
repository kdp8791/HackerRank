import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            String s1 = in.next();
            String s2 = in.next();
            boolean[] values = new boolean[26];
            boolean sub = false;
            for (char c : s1.toCharArray()) {
                values[(int)c - 97] = true;
            }
            for (char c : s2.toCharArray()) {
                if (values[(int)c - 97]) {
                    sub = true;
                    break;
                }
            }
            System.out.println(sub ? "YES" : "NO");
        }
    }
}
