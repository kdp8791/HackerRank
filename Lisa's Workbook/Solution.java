import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int page = 0, sp = 0;
        for (int i = 0; i < n; i++) {
            int problems = in.nextInt(), left = problems, last = 0;
            while (left > 0) {
                page++;
                last = left;
                left = left-k < 0 ? 0 : left-k;
                if (problems-last < page && problems-left >= page) sp++;
            }
        }
        System.out.println(sp);
    }
}
