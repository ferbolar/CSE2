/* The user is supposed to enter a number between 0 and 99.
 * The program interprets that as a percentage, converts it to
 * a prorportion and then displays the proportion (out of 1) 
 * remaining. It does not always work. Find out when it doesn't
 */

import java.util.Scanner;
public class Enigma1{
  public static void main(String []args){
    double percent;
    System.out.print("Enter a value for the percent (0, 1,...99)- ");
    double x=((new Scanner(System.in)).nextDouble());
    System.out.println("You entered "+x+"%");
    //print out the proportion remaining for select percentages
    double r=1-x/100;
    if(r==0.93){  //when the user enters 7
      System.out.println("The proportion remaining is "+0.93);
    }
    else if(r==0.59){//when the user enters 41
      System.out.println("The proportion remaining is "+0.59);
    }
    else if(r==0.67){//when the user enters 33
      System.out.println("The proportion remaining is "+0.67);
    }
    else if (x>=0){
      System.out.println("The proportion remaining is "+r);
    }
    else {
      System.out.println("You did not enter a valid number.");
    }
   }
}

/* Error report: 
 *    (Exlain the error(s) that occur here, in this comment,
 *    and fix the errors)
 *    the errors occur in the if statement and the else if statements. What I did
 *    was that I created another variable and incorporated this variable in the 
 *    if statement so that there werent any error while performing the operations. 
 *    I also adjusted an else if that way you can input other integers.
 *    mid if statement.
 *    Hint: What kinds of input are unacceptable? What kinds of
 *        acceptable input don't produce the correct answer?
 *    The kind of inputs that are unacceptable are negative inputs, and the inputs that 
 *    produce an incorrect answer are 7,41,33. 
 * 
 * 
 */