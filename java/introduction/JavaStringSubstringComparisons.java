import java.util.Scanner;

public class JavaStringSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        for (int index = 0; (s.length() - (index)) >= k; index++) {
            String current = s.substring(index, index + k);
            if (smallest.isEmpty()) {
                smallest = current;
            }
            if (largest.isEmpty()) {
                largest = current;
            }
            if (smallest.compareTo(current) > 1) {
                smallest = current;
            }
            if (largest.compareTo(current) < 1) {
                largest = current;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}