//Fernando Bolanos
//lab 09 - Methods
//11/12/2014
//Methods Lab Assignment

import java.util.Scanner;
public class Methods{
    public static void main(String [] arg){
	    Scanner scan=new Scanner(System.in);
	    int a,b,c;
	    System.out.println("Enter three ints");
	    a=getInt(scan);
	    b=getInt(scan);
	    c=getInt(scan);
	    System.out.println("The larger of "+a+" and "+b+" is "+larger(a,b));
	    System.out.println("The larger of "+a+", "+b+", and "+c+
                       	" is "+larger(a,larger(b,c)));
	    System.out.println("It is "+ascending(a,b,c)+" that "+a+", "+b+
                       	", and "+c+" are in ascending order");
    }
  
    public static int getInt(Scanner scan){//declare method
        System.out.print("Enter an int: ");
        while(!scan.hasNextInt()){//check if it is an integer and repeat if they dont
            scan.next();
            System.out.print("You did not enter an int, try again. ");
        }
        int a = scan.nextInt();//store the int
        return a;//return inputs
    }
    public static int larger(int a, int b){//declare method
        if(a > b){//check if the first int is larger
            return a;
        }
        else{//if it is not larger
            return b;
        }
    }
    public static String ascending(int a, int b, int c){//declare method to see if it is ascending
        if (a < b){//check if the first one is smaller than the second one
            if (b < c){//check if the second one is smaller than the third one
                return "True";//return it is true it is ascending
            }
            else{
                return "False";//return it is not ascending
            }
        }
        else{
            return "False";//return it is not ascending
        }
    }
}
