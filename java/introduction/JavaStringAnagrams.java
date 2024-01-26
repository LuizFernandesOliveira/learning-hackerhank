import java.util.Scanner;

public class JavaStringAnagrams {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;
        
        String aLower = a.toLowerCase();
        String bLower = b.toLowerCase();
        
        String rest = aLower;
        for (int index = 0; index < a.length(); index += 1) {
            rest = rest.replaceFirst(bLower.split("")[index], "");
        }
        
        if (rest.equals("")) return true;
        return false;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
