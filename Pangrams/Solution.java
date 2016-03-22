import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        boolean[] bools = new boolean[26];
        for (char c : sentence.toCharArray()) {
            int i = (int)c;
            if (i > 64 && i < 91) bools[i-65] = true;
            else if (i > 96 && i < 123) bools[i-97] = true;
        }

        boolean panagram = true;
        for (boolean b : bools) {
            if (!b) {
                panagram = false;
                break;
            }
        }
        System.out.println(panagram ? "pangram" : "not pangram");
    }
}
