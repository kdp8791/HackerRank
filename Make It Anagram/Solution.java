import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int[] v1 = new int[26];
        int result = 0;

        for (int i = 0; i < 26; i++) {
            v1[i] = 0;
        }

        for (char c : s1.toCharArray()) {
            int i = (int)c - 97;
            v1[i]++;
        }
        for (char c : s2.toCharArray()) {
            int i = (int)c - 97;
            v1[i]--;
        }
        for (int i = 0; i < 26; i++) {
            result += Math.abs(v1[i]);
        }
        System.out.println(result);
    }
}
