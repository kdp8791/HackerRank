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
            long b = in.nextInt();
            long w = in.nextInt();
            long x = in.nextInt();
            long y = in.nextInt();
            long z = in.nextInt();

            if (z+y <= x) {
                System.out.println(y*w + (y+z)*b);
            } else if (z+x <= y) {
                System.out.println(x*b + (x+z)*w);
            } else {
                System.out.println(x*b + y*w);
            }
        }
    }
}
