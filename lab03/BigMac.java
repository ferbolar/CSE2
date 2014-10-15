//Fernando Bolanos
//lab03-BigMac
//09/12/2014
//BigMac Lab Assignment
//
//Compute the cost of buying big macs.
//Compute the percent tax.
//Compute total cost.
//
//Import scanner class.
    import java.util.Scanner;
    
//Define class.
public class BigMac{
    
    //Public method
    public static void main(String[ ] args) {
       
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        
        //Accept input.
        System.out.print("Enter the number of Big Macs (an integer > 0: ");
        
        //Accept user input.
        int nBigMacs=myScanner.nextInt();
        
        //Accept more input.
        System.out.print("Enter the cost per Big Mac as"+
         " a double (in the form xx.xx): ");
        double bigMac$=myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole number (xx): ");
        double taxRate=myScanner.nextDouble();
        taxRate/=100; //user enters percentage and it converts.
        
        //Print out the output
        //Declare variables
        double cost$;
        int dollars;   //whole dollar amount of cost 
        int dimes, pennies; 
            //Get the total cost.
            cost$ = nBigMacs*bigMac$*(1+taxRate);
            //Get the the amount for each decimal point.
            dollars=(int)cost$;
            //Do calculations to figure out variables.
            dimes=((int)((cost$-dollars)*10));
            pennies=(int)(cost$*100)%10;
        //Print out final statement.
        System.out.println("The total cost of " +(nBigMacs)+
         " BigMacs, at $"+(bigMac$) +" per bigMac, with a"+  
         " sales tax of "+ ((int)(taxRate*100))+
             "%, is $"+dollars+'.'+dimes+pennies);
    }
}