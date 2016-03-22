import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = n; i > 0; i--) {
            String spaces = (i-1) == 0 ? "" : String.format("%" + (i-1) + "s","");
            for (int j = 0; j < (n-i+1); j++) {
                spaces += '#';
            }
            System.out.println(spaces);
        }
    }
}
