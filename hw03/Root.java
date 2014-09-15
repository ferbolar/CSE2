//Fernando Bolanos
//hw03-Root
//09/15/2014
//Root HW Assignment
//
//User enters a double
//Computes an estimate of its cube root
//
//Import java scanner class
    import java.util.Scanner;
    
//Define class
public class Root{
    
    //Define method
    public static void main(String[ ] args) {
        
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        
        //Accept input
        System.out.print("Enter a double, and I print its cube root- ");
        double nDouble=myScanner.nextDouble();
        
        //Define variables
        double guess,guess1;
        
        //Do calculations
        guess=nDouble/3;
        guess1=(guess*guess*guess*guess*guess*guess*guess*guess+nDouble)/(3*guess*guess*guess*guess*guess*guess*guess);
        
        System.out.println("The cube root is "+guess1);
    }
}