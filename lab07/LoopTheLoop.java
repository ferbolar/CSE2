//Fernando Bolanos
//lab07 - Loop The Loop
//10/16/2014
//Loop The Loop Lab Assignment
//
//This program uses while loops to print out stars.

//Import scanner class
import java.util.Scanner;
    
//Define class
public class LoopTheLoop{
    
    //define method
    public static void main(String[ ] args) {
        
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        
        //Enter variables
        int nStars=10;
        int n = 0;
        int m = 0;
        String nAgain="Y";
        
        while (nAgain.equals("Y") || nAgain.equals("y")){ 
            System.out.print("Enter an integer between 1 and 15: ");
        if (myScanner.hasNextInt()){
            int nInput=myScanner.nextInt();//enter input
            if (nInput>=1 && nInput<=15){
                    while (m < nInput){ 
                        while (n < nInput){
                            if (n == nInput-1){
                                System.out.println("*");
                            }
                            else {
                                System.out.print("*");
                            }
                            n++;
                        }
                        m++;
                        if (m == 1){
                            System.out.println("*");
                        }
                        else if (m == 2){
                            System.out.println("**");
                        }
                        else if (m == 3){
                            System.out.println("***");
                        }
                        else if (m == 4){
                            System.out.println("****");
                        }
                        else if (m == 5){
                            System.out.println("*****");
                        }
                        else if (m == 6){
                            System.out.println("******");
                        }
                        else if (m == 7){
                            System.out.println("*******");
                        }
                        else if (m == 8){
                            System.out.println("********");
                        }
                        else if (m == 9){
                            System.out.println("*********");
                        }
                        else if (m == 10){
                            System.out.println("**********");
                        }
                        else if (m == 11){
                            System.out.println("***********");
                        }
                        else if (m == 12){
                            System.out.println("************");
                        }
                        else if (m == 13){
                            System.out.println("*************");
                        }
                        else if (m == 14){
                            System.out.println("**************");
                        }
                        else if (m == 15){
                            System.out.println("***************");
                        }
                    
                    }
            }
            else {
                System.out.println("You did not enter an int in the range (1-15)");
                    
            }
                
        }
        else {
            System.out.println("You entered an invalid character.");
        }
                    System.out.println("**********");//print the first stars
        
                    while (nStars<=10 && nStars>0){//while loop for only the 10 stars
                        if (nStars==10){//if statement to increment the stars
                            System.out.println("*");
                            nStars--;
                        }
                        else if (nStars==9){
                            System.out.println("**");
                            nStars--;
                        }
                        else if (nStars==8){
                            System.out.println("***");
                            nStars--;
                        }
                        else if (nStars==7){
                            System.out.println("****");
                            nStars--;
                        }
                        else if (nStars==6){
                            System.out.println("*****");
                            nStars--;
                        }
                        else if (nStars==5){
                            System.out.println("******");
                            nStars--;
                        }
                        else if (nStars==4){
                            System.out.println("*******");
                            nStars--;
                        }
                        else if (nStars==3){
                            System.out.println("********");
                            nStars--;
                        }
                        else if (nStars==2){
                            System.out.println("*********");
                            nStars--;
                        }
                        else if (nStars==1){
                            System.out.println("**********");
                            nStars--;
                        }
                    }
            System.out.print("Do you want to go again?");
            nAgain=myScanner.next();
            if (nAgain.equals("Y") || nAgain.equals("y")){
                m = 0;
                n = 0;
            }
        }        
    }
}