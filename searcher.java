import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class MyClass {
 
    public static void main(String args[]) throws Exception{
        Scanner scnr = new Scanner(System.in);
        String file = scnr.nextLine();
        Scanner input = new Scanner(Paths.get(file));
        String s;
        char c = scnr.next().charAt(0);
        String[] arr2 = new String[4000];
        int i =0;
        for(int j =0; j <arr2.length; ++j){
        
        arr2[j] = input.nextLine();
        }
        for
        (i = 0; i<arr2.length; ++i){
            if(arr2[i].charAt(0) == c)
            System.out.println(arr2[i]);
        }
        
            
        }
    }
