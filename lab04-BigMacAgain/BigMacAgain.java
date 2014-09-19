//Fernando Bolanos
//lab04-BigMacAgain
//09/19/2014
//Big Mac Again Lab Assignment
//
//It asks you for number of big macs yo want
//after you enter an integer it asks you if you want fries
//if you do it computes your total cost
//
//Import scanner class
    import java.util.Scanner;
    
//Define class
public class BigMacAgain{
    
    //define method
    public static void main(String[ ] args) {
        
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        
        //Enter Variables
        double bigMac=2.22;
        double fries=2.15;
        double cost;
        
        //Enter if statements and input
        System.out.print("Enter the number of Big Macs: ");
        if (myScanner.hasNextInt()){
            int nBigMac=myScanner.nextInt();
            cost=nBigMac*bigMac;
            
            //if statement for a negative number
            if (nBigMac<=0){
                System.out.println("You did not enter an int > 0");
            }
            else {
                System.out.print("Do you want an order of fries (Y/y/N/n)? ");
                String fries1=myScanner.next();
        
                //if statement for fries
                if (fries1.equals("Y") || fries1.equals("y")) {
                    System.out.println("You ordered fries at a cost of $2.15");
                    cost=cost+fries;
                    System.out.printf("Your total cost is: $%.2f\n", (cost));
                }
                else if (fries1.equals("N") || fries1.equals("n")){
                    System.out.printf("Your total cost is: $%.2f\n", (cost));
                }
                else {
                    System.out.println("You did not enter a valid character");
                }
            }
        }
        else {
            System.out.println("You did not enter an int");
        }
    
    }
}