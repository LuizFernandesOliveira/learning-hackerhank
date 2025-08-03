import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class JavaEndOfFile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        short NUMBER_LINE = 1;
        while (scan.hasNext()) {
            System.out.printf("%d %s \n", NUMBER_LINE, scan.nextLine());
            
            NUMBER_LINE += 1;
        }
        
        scan.close();
    }
}
