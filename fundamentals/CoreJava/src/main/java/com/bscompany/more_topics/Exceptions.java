package com.bscompany.more_topics;

class HandleException extends Exception{
    public HandleException (String message) {
        super(message);
    }
}

public class Exceptions {
    
    public static void main(String[] args) {
        
        int nums[] = new int[4];
        
        try {
            // ArithmeticException
            System.out.println("9/0=" + 9/0);
            
            // ArrayIndexOutOfBoundsException
            System.out.println(nums[6]);
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Sometime went wrong, you cannot save value int te collection because is too short!");
        } catch (Exception e) {
            System.out.println("Sometime went wrong, please check the logs: " + e.getMessage());
        } finally {
            System.out.println("Finished the code!!!");
        }
    }
}
