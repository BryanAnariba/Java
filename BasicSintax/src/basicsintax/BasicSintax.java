package basicsintax;

import java.util.Scanner;

/**
 *
 * @author Bryan
 */
public class BasicSintax {
    public static void main(String[] args) {
        String userName = "";
        Scanner inputData = new Scanner( System.in );
        System.out.println( "Please Write your name: " );
        userName = inputData.nextLine();
        System.out.println( "Hello: " + userName );
        
        // Variables
        byte numberOne = 120;
        System.out.println( "Min Byte Value: " + Byte.MIN_VALUE + ", Max Byte Value: " + Byte.MAX_VALUE );
        System.out.println( numberOne );
        System.out.println("----------------------------------------------------------");
        short shortNumer = 10;
        System.out.println( "Min Short Value: " + Short.MIN_VALUE +  ", Short Max Value: " + Short.MAX_VALUE );
        System.out.println( shortNumer );
        System.out.println("----------------------------------------------------------");
        int integerNumber = 120000;
        System.out.println( "Min Int Value: " + Integer.MIN_VALUE + ", Max Int Value: " + Integer.MAX_VALUE );
        System.out.println( integerNumber );
        System.out.println("----------------------------------------------------------");
        long longNumber = 1500000;
        System.out.println( "Long Min Value: " + Long.MIN_VALUE + ", Long Max Value: " + Long.MAX_VALUE );
        System.out.println( longNumber );
        
        
    }    
}
