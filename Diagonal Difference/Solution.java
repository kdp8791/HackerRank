import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        int v1 = 0, v2 = 0, cnt = n;
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
                if (a_i == a_j)
                    v1 += a[a_i][a_j];
                if (a_i == n-cnt && a_j == cnt-1) {
                    v2 += a[a_i][a_j];
                    cnt--;
                }
            }
        }
        System.out.println(Math.abs(v1 - v2));
    }
}
