//Fernando Bolanos
//lab02-Cyclometer
//08/09/2014
//Cyclometer Lab Program
//
//  Print the number of minutes for each trip.
//  Print the number of counts for each trip.
//  Print the distance of each trip in miles.
//  Print the distance for the two trips combined.
//
// Define Class
public class Cyclometer{
    
// Public method
    public static void main(String[ ] args) {
        
        int secsTrip1=480;  //time it took for first trip.
        int secsTrip2=3220; //time it took for second trip.
        int countsTrip1=1561;   //counts for first trip.
        int countsTrip2=9037;   //counts for second trip.
        
        double wheelDiameter=27.0;  //wheel diameter.
        double PI=3.14159; //pi constant.
        double feetPerMile=5280;   //how many feet are in a mile.
        double inchesPerFoot=12;   //how many inches are in a foot.
        double secondsPerMinute=60;    //how many seconds are in a minute.
        double distanceTrip1, distanceTrip2, totalDistance; //Total distance in both trips.
        
        //Calculations
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute) +" minutes and had "+
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute) +" minutes and had "+
            countsTrip2+" counts.");
            
        distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        // Above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
         //distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip1+distanceTrip2;
        
        
            //Print all the data.
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
    }
}