import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.event.*;

public class MyClass extends JFrame{
    public MyClass(){
        JFrame frame = new JFrame();
        frame.setBounds(200,200);
    }
 
    public static void main(String args[]) throws Exception{
        Scanner scnr = new Scanner(System.in);
        System.out.println("Type in the file's name:");
        String file = scnr.nextLine();
        System.out.println(file);
        Scanner input = new Scanner(Paths.get(file));
        int u =0;
        String s;
        while(input.hasNextLine()){
            s= input.nextLine();
            ++u;
        }
        System.out.println("Number of lines in the choosen file are: ");
        System.out.println(u);
        System.out.println("Type in the the character that the words you're searching for start with:");
        String c = scnr.nextLine().substring(0,1);
        System.out.println(c);
        
        String[] arr = new String[u];
        int i =0;
        Scanner input2 = new Scanner(Paths.get(file));
        for(int j =0; j <arr.length; ++j){
        if(input2.hasNextLine()){
        arr[j] = input2.nextLine();
            
        }
        
        }
        for(i = 0; i <arr.length; ++i){
            if(arr[i].substring(0,1).equalsIgnoreCase(c)){
            System.out.println(arr[i]);
            }
        }
        }
    }
