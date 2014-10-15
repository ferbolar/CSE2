//Fernando Bolanos
//hw06 - Root
//10/14/2014
//Root HW Assignment
//
//This program will ask you to enter a number and it will compute the 
//square root.

//Import scanner class
import java.util.Scanner;
    
//Define class
public class Root{
    
    //define method
    public static void main(String[ ] args) {
        
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        
        //ask for the input
        System.out.print("Enter a double: ");
        double root=myScanner.nextDouble();
        
        //define variables and perform operations
        double low=0;
        double high=1+root;
        double middle=0;
        //if loop to enter a positive number
        if (root>=0){
             
             while ((high-low)>=0.0000001*(high)){//while loop to perfor operations
                middle=(high+low)/2;
                
                if (middle*middle>root){//adjusting the variables
                    high=middle;
                }
                else if (middle*middle<root){
                    low=middle;

                }
            }
            System.out.println("The square root of "+root+" is "+middle);
        }
    }
}