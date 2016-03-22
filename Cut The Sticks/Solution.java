import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] values = new int[in.nextInt()];
        int min = Integer.MAX_VALUE;
        int remaining = values.length;
        for (int i = 0; i < values.length; i++) {
            values[i] = in.nextInt();
        }

        System.out.println(remaining);

        while (remaining > 0) {
            int tmp = remaining;
            for (int i = 0; i < values.length; i++) {
                if (values[i] > 0) {
                    values[i]--;
                    if (values[i] == 0) tmp--;
                }
            }
            if (tmp != remaining) {
                remaining = tmp;
                if (remaining > 0) System.out.println(remaining);
            }
        }
    }
}
