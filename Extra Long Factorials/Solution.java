import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger bi = new BigInteger("1");
        for (int i = n; i > 0; i--) {
            bi = bi.multiply(new BigInteger(String.valueOf(i)));
        }
        System.out.println(bi.toString());
    }
}
