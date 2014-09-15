//Fernando Bolanos
//hw03-Bicycle
//09/15/2014
//Bicycle HW Assignment
//
//Enter information
//Compute distance and time.
//Compute average mph.
//
//Import scanner class
    import java.util.Scanner;
    
//Define class
public class Bicycle{
    
    //define method
    public static void main(String[ ] args) {
        
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        
        //Accept input
        System.out.print("Enter the number of seconds: ");
        //Accept user input
        int nSeconds=myScanner.nextInt();
        
        System.out.print("Enter the number of counts: ");
        int nCounts=myScanner.nextInt();
        
        //Define variables
        double wheelDiameter=27.0; //Wheel diameter
        double PI=3.14159; //PI constant
        double feetPerMile=5280;
        double inchesPerFoot=12;
        double distanceTrip;
        double nMinutes,nHours;
        int ones,tens,hundreds,ones1,tens1,hundreds1;
        double averageMPH;
        
        //Do calculations
        distanceTrip=nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        nMinutes=nSeconds/60;
        ones=(int)distanceTrip;
        tens=(int)(distanceTrip*10)%10;
        hundreds=(int)(distanceTrip*100)%10;
        nHours=nMinutes/60;
        averageMPH=distanceTrip/nHours;
        ones1=(int)averageMPH;
        tens1=(int)(averageMPH*10)%10;
        hundreds1=(int)(averageMPH*100)%10;
       
       //Print out results.
        System.out.println("The distance was "+ones+'.'+tens+hundreds+" miles and took "+nMinutes+" minutes.");
        System.out.println("The average mph is "+ones1+'.'+tens1+hundreds1);
    }
}