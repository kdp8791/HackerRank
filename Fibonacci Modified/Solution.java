import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger first = new BigInteger(in.next());
        BigInteger second = new BigInteger(in.next());
        int n = in.nextInt();
        System.out.println(modFib(second, first, n-2));
    }

    public static BigInteger modFib(BigInteger second, BigInteger first, int n) {
        if (n == 0) return second;
        return modFib(second.pow(2).add(first), second, n-1);
    }
}
