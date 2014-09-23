//Fernando Bolanos
//hw04 - Month
//09/22/2013
//Month HW assignment
//
//It asks to enter integer between 1-12
//it then prints the number of days in the month you chose
//
//Import scanner class
    import java.util.Scanner;
    
//Define class
public class Month{
    
    //define method
    public static void main(String[ ] args) {
        
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        
        //enter variables
        int even=30;
        int odd=31;
        int feb1=28;
        int feb2=29;
        
        //Enter input
        System.out.print("Enter number of the month (1-12):");
        
        //If statements
        if (myScanner.hasNextInt()){
            int nNumber=myScanner.nextInt();
            if (nNumber>0){
                if (nNumber<=12){
                    //31 day months
                    if (nNumber==1||nNumber==3||nNumber==5||nNumber==7||nNumber==8||nNumber==10||nNumber==12){
                        System.out.println("The month has "+odd+" days.");
                    }  
                    //30 day months
                    else if (nNumber==4||nNumber==6||nNumber==9||nNumber==11){
                        System.out.println("The month has "+even+" days.");
                    }
                    else {
                        System.out.print("Enter the year: ");
                        int nYear=myScanner.nextInt();
                        //determine if it is a leap year
                        boolean leapYear = ((nYear % 4 == 0) && (nYear % 100 != 0) || (nYear % 400 == 0));
                        if (leapYear){
                            System.out.println("The month has "+feb2+" days.");
                        }
                        else {
                            System.out.println("The month has "+feb1+" days.");
                        }
                    }
                }
                else {
                    System.out.println("You did not enter an int between 1-12.");  
                }
            } 
            else {
                System.out.println("You did not enter an int between 1-12.");
            }
        }
        else {
            System.out.println("You did not enter an integer.");
        }
    }
}