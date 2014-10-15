//Fernando Bolanos
//lab06 - Enigmas
//10/10/2014
//Enigma lab assignment
//
/*Sample of expected output:
 *   Enter an int- 9
 *   You entered 9
 *   sum is 25
 *   Again, you entered 9
 */

import java.util.Scanner;
public class Enigma0{
  public static void main(String args []){
    System.out.print("Enter an int- ");
    Scanner scan;
    scan=new Scanner(System.in);
    if(scan.hasNextInt()){
        int n=scan.nextInt();
        System.out.println("You entered "+n);
        int k=4,p=6,q=7,r=8;
        switch(k+p+q+r){
            case 25: System.out.println("sum is 25");
            default:
                System.out.println("Again, you entered "+n);
        }
    }
    else{
      System.out.println("You did not enter an integer. ");
    }
  }
}

/* Error report:
 *   Expand this comment: This program takes an integer and prints the integer
 *  many times and it performs a sum.
 *   Explain the error(s) that occurred here, and then fix them:
 *  The main error that this program had was that it had the switch statement
 *  outside of the if statement, so when you ran it, the program would only print 
 *  the first part of the if statement. Another error that I caught was in the if 
 *  statement, if you did not enter an integer the program would turn n into 4 which 
 *  would not be true. There was an error in the switch statement, and there was an "s"
 *  missing in args.
 */