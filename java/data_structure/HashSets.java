import java.util.*;

public class HashSets {

    public static void main(String[] args) {
        

        Set<String> lists = new HashSet<>();
        
        for (int i = 0; i < t; i++) {
            if (pair_left[i] != pair_right[i]) {
                lists.add(pair_left[i]+"-"+pair_right[i]);
            }
            System.out.println(lists.size());
        }


    }
}