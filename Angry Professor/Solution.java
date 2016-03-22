import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int c_size = 0;
            for(int a_i=0; a_i < n; a_i++){
                 if (in.nextInt() <= 0) {
                     c_size++;
                 }
            }
            System.out.println(c_size < k ? "YES" : "NO");
        }
    }
}
