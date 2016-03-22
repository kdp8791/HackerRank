import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int dollars = in.nextInt();
            int items = in.nextInt();
            int[] costs = new int[items];
            for (int j = 0; j < costs.length; j++) {
                costs[j] = in.nextInt();
            }
            for (int j = 0; j < costs.length; j++) {
                for (int k = j+1; k < costs.length; k++) {
                    if (costs[j] + costs[k] == dollars) {
                        System.out.printf("%s %s\n", j+1, k+1);
                        break;
                    }
                }
            }
        }
    }
}
