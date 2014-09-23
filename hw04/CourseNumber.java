//Fernando Bolanos
//hw04 - Course Number
//09/22/2013
//Course Number HW assignment
//
//It asks to enter a course number and it will
//display the semester and the year the course was offered
//
//Import scanner class
    import java.util.Scanner;
    
//Define class
public class CourseNumber{
    
    //define method
    public static void main(String[ ] args) {
        
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        
        //enter variables
        
        //enter input
        System.out.print("Enter the six digit course number: ");
        
        //if statement for integer
        if (myScanner.hasNextInt()){
            int nCourse=myScanner.nextInt();
            if (nCourse>=186510){
                if (nCourse<=201440){
                    //Get the year and code
                    double nYear=nCourse/100;
                    int nYear1=(int)nYear;
                    int nCode=nCourse%100;
                    if (nCode==10){
                        System.out.println("The course was offered on the Spring of "+nYear1);
                    }
                    else if (nCode==20){
                        System.out.println("The course was offered on the Summer 1 of "+nYear1);
                    }
                    else if (nCode==30){
                        System.out.println("The course was offered on the Summer 2 of "+nYear1);
                    }
                    else if (nCode==40){
                        System.out.println("The course was offered on the Fall of "+nYear1);
                    }
                    else {
                        System.out.println(nCode+" is not a legitimate code.");
                    }
                }
                else {
                    System.out.println("The number was outside the range [186510,201440]");    
                }
            }   
            else {
                System.out.println("The number was outside the range [186510,201440]");
            }
        }
        else {
            System.out.println("You did not enter an integer.");
            
        }
    }
}