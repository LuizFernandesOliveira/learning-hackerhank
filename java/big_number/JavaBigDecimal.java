import java.io.*;
import java.util.*;
import java.math.*;

public class JavaBigDecimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = sc.next();
        }
        sc.close();

        Arrays.sort(arr, (String a,String b) -> {
            return new BigDecimal(b).compareTo(new BigDecimal(a));
        });

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}