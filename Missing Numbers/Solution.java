import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < x; i++) {
            int a = in.nextInt();
            Integer ai = map.get(a) == null ? new Integer(-1) : map.get(a) - 1;
            map.put(a, ai);
        }
        int y = in.nextInt();
        for (int i = 0; i < y; i++) {
            int a = in.nextInt();
            Integer ai = map.get(a) == null ? new Integer(1) : map.get(a) + 1;
            map.put(a, ai);
        }

        for (Integer i : map.keySet()) {
            Integer ai = map.get(i);
            if (ai != null && ai > 0) {
                System.out.printf("%s ", i);
            }
        }
    }
}
