import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        SimpleDateFormat inFormat = new SimpleDateFormat("hh:mm:ssaa");
        SimpleDateFormat outFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            Date date = inFormat.parse(time);
            System.out.println(outFormat.format(date));
        } catch (Exception e) {}
    }
}
