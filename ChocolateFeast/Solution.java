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
            int c = in.nextInt();
            int m = in.nextInt();

            int bars = (int)(n/c);
            int wrappers = bars;
            while (wrappers > 0 && wrappers >= m) {
                int newBars = (int)(wrappers/m);
                bars += newBars;
                wrappers = wrappers - newBars*m + newBars;
            }
            System.out.println(bars);
        }
    }
}
