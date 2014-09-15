//Fernando Bolanos
//hw03-Four Digits
//09/15/2014
//Four Digits HW Assignment
//
//Enter information
//Compute so you would get the first four digits after the decimal point.
//
//Import java scanner class
    import java.util.Scanner;
    
//Define class
public class FourDigits{
    
    //Define method
    public static void main(String[ ] args) {
        
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        
        //Accept input
        System.out.print("Enter a double and I display the four digits to the right of the decimal point- ");
        double nNumber=myScanner.nextDouble();
        
        //Define variables
        int ones,tens,hundreds,thousands;
        
        //Do calculations
        ones=(int)(nNumber*10)%10;
        tens=(int)(nNumber*100)%10;
        hundreds=(int)(nNumber*1000)%10;
        thousands=(int)(nNumber*10000)%10;
        
        //Print results
        System.out.println("The four digits are "+ones+tens+hundreds+thousands);
    }
}