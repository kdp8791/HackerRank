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
            String numberStr = in.next();
            int number = Integer.parseInt(numberStr);
            char[] a = numberStr.toCharArray();
            int count = 0;
            for (char a_i : a) {
                int b = (int)Character.getNumericValue(a_i);
                if (b > 0 && number%b == 0) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
