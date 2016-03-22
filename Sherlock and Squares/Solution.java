import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        for (int i = 0; i < testCases; i++) {
            int start = in.nextInt();
            int end = in.nextInt();
            int cnt = (int)(Math.floor(Math.sqrt(end)) - Math.ceil(Math.sqrt(start)) + 1);
            System.out.println(cnt);
        }
    }
}
