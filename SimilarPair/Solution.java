import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rocks = in.nextInt();
        boolean[][] map = new boolean[rocks][26];
        for (int i = 0; i < rocks; i++) {
            String rock = in.next();
            for (char c : rock.toCharArray()) {
                map[i][(int)c-97] = true;
            }
        }
        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            boolean gem = true;
            for (int j = 0; j < rocks; j++) gem &= map[j][i];
            if (gem) cnt++;
        }
        System.out.println(cnt);
    }
}
