import java.io.*;
import java.math.*;

public class JavaPrimalyTest {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger value = new BigInteger(n);
        
        if (value.isProbablePrime(100)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
 
        bufferedReader.close();
    }
}