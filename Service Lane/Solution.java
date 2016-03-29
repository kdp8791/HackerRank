import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int width[] = new int[n];
        for(int i = 0; i < n; i++){
            width[i] = in.nextInt();
        }
        for(int i = 0; i < t; i++){
            int j = in.nextInt();
            int k = in.nextInt();
            int min = 3;
            for (int l = j; l <= k; l++) {
                if (width[l] < min) min = width[l];
            }
            System.out.println(min);

        }
    }
}
