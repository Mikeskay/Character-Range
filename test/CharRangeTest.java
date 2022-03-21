package charrange.test;

import charrange.base.CharRange;
import java.util.Scanner;

public class CharRangeTest {

    public static void main(String[] args) {
        
        try {
            Scanner reader = new Scanner(System.in);

            System.out.print("Please enter a single character: ");
            
            char ch = reader.next(".").charAt(0);
       
            CharRange test = new CharRange(ch);
    
            
            System.out.println( "Is this char a Capital: " + test.isCapital());
            System.out.println("Is this char a Roman: " + test.isRoman());      
    
            
        } catch (Exception e) {
            //TODO: handle exception
        }
       



    }
    
}
