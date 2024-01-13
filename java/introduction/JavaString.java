import java.io.*;
import java.util.*;

public class JavaString {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        
        int size = A.length() + B.length();
        String textA = A.substring(0, 1).toUpperCase() + A.substring(1, A.length()); 
        String textB = B.substring(0, 1).toUpperCase() + B.substring(1, B.length()); 
        boolean lexicographicallyALargerB = A.compareTo(B) > 0;
        
        
        System.out.println(size);
        System.out.println(lexicographicallyALargerB ? "Yes" : "No");
        System.out.println(textA + " " + textB);        
    }
}
