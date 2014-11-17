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
  
    public static int getInt(Scanner scan){
        System.out.print("Enter an int: ");
        while(!scan.hasNextInt()){
            scan.next();
            System.out.print("You did not enter an int, try again. ");
        }
        int a = scan.nextInt();
        return a;
    }
    public static int larger(int a, int b){
        if(a > b){
            return a;
        }
        else{
            return b;
        }
    }
    public static String ascending(int a, int b, int c){
        if (a < b){
            if (b < c){
                return "True";
            }
            else{
                return "False";
            }
        }
        else{
            return "False";
        }
    }
}
