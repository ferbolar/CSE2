//Fernando Bolanos
//hw08 - HW08
//10/27/2014
//Methods HW Assignment
import java.util.Scanner;
public class HW8{
  public static void main(String []arg){//define main method
	int n;
	char input;
	Scanner scan=new Scanner(System.in);//define scanner
	System.out.print("Enter 'C' or 'c' to continue- ");
	input=getInput(scan,"Cc");//tells that it will go to another method to perform 
	System.out.println("You entered '"+input+"'");
	System.out.print("Enter 'y', 'Y', 'n', or 'N'- ");
	input=getInput(scan,"yYnN",5); //give up after 5 attempts for this method
	if(input!=' '){
   	System.out.println("You entered '"+input+"'");
	}
	input=getInput(scan,"Choose a digit.","0123456789");//another method for the program
	System.out.println("You entered '"+input+"'");
  }//end of method
  
  public static char getInput(Scanner input, String string){//method for the first part of the program
    while (true){
        String Input = input.next();//input a string
        if (Input.length() == 1){//if statement for only one character
            char nInput = Input.charAt(0);//turn it into a char
            if (nInput == 'C' || nInput == 'c'){//if statement to return char
                return nInput;//return char
            }
            else {
                System.out.print("Please enter one of the following characters, C or c.- ");//please enter a valid char
                continue;//go back to the begining of the while loop
            }
        }
        else {
            System.out.print("Please enter one of the following characters, C or c.- ");//please enter a valid char
            continue;//go back to the begining of the while loop
        }
    }
  }//end of method
  
  public static char getInput(Scanner input, String string, int n){//method for second part of program
    n = 1;//counter
    char nInput = ' ';
    while (n <= 5){//while loop for five tries
        String Input = input.next();//input string
        if (Input.length() == 1){//if statement for only one character
            nInput = Input.charAt(0);//turn it into a char
            if (n == 5){//if statement for when you waste your tries
                System.out.println("You failed after 5 tries.");
                return nInput = ' ';//return input
            
            }
            if (nInput == 'Y' || nInput == 'y' || nInput == 'N' || nInput == 'n'){//if statement for the correct chars
                return nInput;//return char
            }
            else {
                System.out.print("Please enter one of the following characters, YyNn. Try Again- ");
                ++n;//add one to the counter
                continue;//go back to the begining of the loop
            }
        }
        else {
            System.out.print("Please enter one of the following characters, YyNn. Try Again- ");
            ++n;//add one to the counter
            continue;//go back to the begining of the loop
        }
    }
    return nInput;
  }//end of method
  
  public static char getInput(Scanner input, String string, String n){//method for the last part of the program
    System.out.print("Enter one of: '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'- ");
    while (true){
        String Input = input.next();//input string
        if (Input.length() == 1){//if statement for only one character
            char nInput = Input.charAt(0);//turn it into a char
            if (nInput == '0' || nInput == '1' || nInput == '2' || nInput == '3' || nInput == '4' || nInput == '5' || nInput == '6' || nInput == '7' || nInput == '8' || nInput == '9'){
                return nInput;//return the input
            }
            else {
                System.out.print("Please enter one of the following characters, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'.- ");
                continue;//go back to the beginning of the loop
            }
        }
        else {
            System.out.print("Please enter one of the following characters, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'.- ");
            continue;//go back to the beginning of the loop
        }
    }
  }//end of method
}