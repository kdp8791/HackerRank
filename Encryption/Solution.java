import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static final char NULL = '\u0000';

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s = in.next().replace(" ", "").toCharArray();
        int r = (int)Math.ceil(Math.sqrt(s.length));
        int c = (int)Math.ceil(((double)s.length/r));
        char[][] values = new char[r][c];
        int i = 0, j = 0;
        for (char ch : s) {
            if (i == r) {
                i = 0;
                j++;
            }
            values[i][j] = ch;
            i++;
        }

        for (int k = 0; k < r; k++) {
            for (int l = 0; l < c; l++) {
                if (values[k][l] != NULL) {
                    System.out.print(values[k][l]);
                }
            }
            System.out.print(" ");
        }
    }
}
