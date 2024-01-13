import java.util.*;
import java.io.*;

class LoopII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for (int index = 1; index <= n; index++) {
                int sum = a;
                for (int index2 = 0; index2 < index; index2++) {
                    sum += (int)(Math.pow(2, index2) * b);
                }
                System.out.printf("%d ", sum);
                sum = a;
            }
            System.out.printf("\n");
        }
        in.close();
    }
}
