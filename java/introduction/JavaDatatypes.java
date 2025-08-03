import java.util.*;
import java.io.*;


class JavaDatatypes {
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        
        byte BYTE_MIN = -128;
        byte BYTE_MAX = 127;
        
        short SHORT_MIN = -32768;
        short SHORT_MAX = 32767;
        
        int INT_MIN = -2147483648; 
        int INT_MAX = 2147483647;
        
        long LONG_MIN = -9223372036854775808L; 
        long LONG_MAX = 9223372036854775807L;

        for(int i=0;i<t;i++) {
            try {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=BYTE_MIN && x<=BYTE_MAX)System.out.println("* byte");
                if (x>=SHORT_MIN && x<=SHORT_MAX)System.out.println("* short");
                if (x>=INT_MIN && x<=INT_MAX)System.out.println("* int");
                if (x>=LONG_MIN && x<=LONG_MAX)System.out.println("* long");
                if (x>LONG_MAX)throw new Error("error");
            } catch(Exception e) {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
        sc.close();
    }
}
