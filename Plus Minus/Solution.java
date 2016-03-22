import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int neg = 0, pos = 0, zero = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            int v = in.nextInt();
            if (v == 0) zero++;
            else if (v < 0) neg++;
            else if (v > 0) pos++;
        }

        System.out.println((double)pos/n);
        System.out.println((double)neg/n);
        System.out.println((double)zero/n);
    }
}
