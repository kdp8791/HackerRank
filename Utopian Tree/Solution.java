import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            int testCases = in.nextInt();
            for (int i = 0; i < testCases; i++) {
                int cycles = in.nextInt();
                int height = 1;
                for (int j = 1; j < cycles+1; j++) {
                    if(j == 1 || j%2 == 1) height*=2;
                    else height+=1;
                }
                System.out.println(height);
           }
        } catch(Exception ex){}
    }
}
