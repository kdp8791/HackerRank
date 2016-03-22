import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            strings.add(in.next());
        }
        int q = in.nextInt();
        for (int i = 0; i < q; i++) {
            System.out.println(Collections.frequency(strings, in.next()));
        }
    }
}
