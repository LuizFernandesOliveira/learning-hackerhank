import java.io.*;
import java.util.*;

public class JavaGenerics {

    public static void main(String[] args) {
        String[] texts = {"Hello", "World"};
        Integer[] integers = {1, 2, 3};    
        
        printArray(integers);
        printArray(texts);
    }
    
    public static <T> void printArray(T[] ins) {
        
        for (T in : ins) {
            System.out.println(in);
        }
    }
}