import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int moves = 0;
            String str = in.next();
            for (int j = 0; j < str.length()/2; j++) {
                int k = (int)str.charAt(j);
                int l = (int)str.charAt(str.length()-j-1);
                moves += Math.abs(k-l);
            }
            System.out.println(moves);
        }
    }
}
