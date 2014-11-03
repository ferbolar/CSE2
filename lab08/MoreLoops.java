//Fernando Bolanos
//lab08 - More Loops
//10/31/2014
//More Loops Lab Assignment


import java.util.Scanner;
public class MoreLoops{
	public static void main(String[] arg){
    Scanner scan=new Scanner(System.in);
    int n=0;
    
    System.out.print("Enter an int- ");//ask for input
    do {
    	if (!scan.hasNextInt()){//if statement if the input is not an int
    	scan.next();//get rid of the junk entered by user
    	System.out.print("You did not enter an int; try again- ");
    	}
    } while (!scan.hasNextInt());//condition to re do the do while loop
    
    //COMMENT OUT THE ABOVE 5 LINES AND REPLACE THE CODE WITH A
    //DO-WHILE LOOP
    	n=scan.nextInt();
    
    int j=0;//define counter for first while loop
    while(j<n && j<40){//conditions for first while loop
        j++;//add one to the counter
        int k=0;//define another counter
    	while(k<j){//conditions for second while loop
    	    k++;//add one to the counter
   	        System.out.print('*');//print a star
    	}
    	System.out.println();
    }
    //COMMENT OUT THE ABOVE SIX LINES OF CODE AND REPLACE WITH
    //WHILE STATEMENTS
 	 
    int k=4;//define variable

    while(k<=4){//condition for while loop
    	System.out.println("k="+k);//print the value of k
    	k++;//add one to the counter
    }
     	
    	//COMMENT OUT THE ABOVE FIVE LINES AND REPLACE THE CODE
    //WITH A WHILE LOOP
    System.out.println(n);
    if(n<=5 && n>=1){//if statement for the int to be between 5 and 1
        for(int count=0; count<10;){//for loop and conditions
            if(n==4){//start if statement for when n=4
                System.out.println("Case 4 ");//print
                System.out.println("Case 5 ");
                count++;//add one to counter
            }
            else if(n==5){//else if for when n=5
                System.out.println("Case 5 ");
                count++;//add one to counter
            }
            else if(n==2 || n==1){//else if for the infinite loop
                System.out.print("Case 2 ");
            }
            else if(n==3){//else if for n=3
                break;
            }
        }
    }
    else {//else if it is not between 5 and 1
        System.out.println(n+" is > 5 or < 1.");
    }
    //COMMENT OUT THE ABOVE 21 LINES AND REWRITE THE CODE USING
    // ONLY FOR LOOPS AND IF STATEMENS. BEFORE DOING SO, TRY
    //RUNNING THE CODE WITH VARIOUS INPUTTED VALUES, E.G.,
    //   -5, 1, 20, 5, ETC.
    //IF YOU GET AN INFINITE LOOP, YOU CAN STOP IT BY
    //SIMULTANEOUSLY PRESSING THE CTRL KEY AND THE C KEY
	}
}