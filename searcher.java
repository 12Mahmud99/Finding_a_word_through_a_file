import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;


public class MyClass {
 
    public static void main(String args[]) throws Exception{
        Scanner scnr = new Scanner(System.in);
        String file = scnr.nextLine();
        Scanner input = new Scanner(Paths.get(file));
        int u =0;
        String s;
        while(input.hasNextLine()){
            s= input.nextLine();
            ++u;
        }
        System.out.print(u);
        char c = scnr.nextLine().charAt(0);
        String[] arr2 = new String[u];
        int i =0;
        for(int j =0; j <arr2.length; ++j){
        if(input.hasNextLine()){
        arr2[j] = input.nextLine();
            
        }
        }
        for
        (i = 0; i<arr2.length; ++i){
            if(arr2[i].charAt(0) == c)
            System.out.println(arr2[i]);
        }
        
        
            
        }
    }

