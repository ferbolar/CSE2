//Fernando Bolanos
//hw04 - Time Padding
//09/22/2013
//Time Padding HW assignment
//
//It asks to enter integer between 1-12
//it then prints the number of days in the month you chose
//
//Import scanner class
    import java.util.Scanner;
    
//Define class
public class TimePadding{
    
    //define method
    public static void main(String[ ] args) {
        
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        
        //Enter variables
        
        //Enter input
        System.out.print("Enter the time in seconds: ");
        
        //If statements
        if (myScanner.hasNextInt()){
            double nSeconds=myScanner.nextInt();
            if (nSeconds>=0){
                double nHours=(nSeconds/3600);
                int nHours1=(int)nHours;
                double nMinutes=(nSeconds/60)-(60*nHours1);
                int nMinutes1=(int)nMinutes;
                double nSeconds1=(nSeconds % 3600);
                double nSeconds2=(nSeconds1 % 60);
                int nSeconds3=(int)nSeconds2;
               
               System.out.print("The time is: ");
               System.out.printf("%02d",nHours1);
               System.out.print(":");
               System.out.printf("%02d",nMinutes1);
               System.out.print(":");
               System.out.printf("%02d \n",nSeconds3);
            }
            else {
                System.out.println("You did not enter a positive number.");
            }
        }
        else {
            System.out.println("You did not enter an integer.");
        }
    }
}