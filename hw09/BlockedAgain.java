//Fernando Bolanos
//HW09 - Blocked Again
//11/03/2014
//Blocked Again HW Assignment

import java.util.Scanner;
public class BlockedAgain{
    public static void main(String []s){
    int m;
    //force user to enter int in range 1-9, inclusive.
    m = getInt(); 
    allBlocks(m);
    }
    
    public static int getInt(){//method to get the int
        System.out.print("Enter an integer between 1 and 9: ");
        Scanner scan=new Scanner(System.in);
        int n = checkRange(scan);//asking for the method that check range
        return n;//return int
    }
    
    public static int checkRange(Scanner scan){//method that checks range
        int k;
        while (true){
            checkInt(scan);//asking for the method that checks if it is an int
            k = scan.nextInt();//ask for input
            if (k>=1 && k<=9){//if statement for range
                return k;// return value if it is between range
            }
            else {//return to the begining and ask for another int
                System.out.print("Please enter an integer between 1 and 9: ");
            }
        }
    }
    
    public static void checkInt(Scanner scan){//checks if it is an int
        while (!scan.hasNextInt()){//checks if it is not an int
            scan.next();
            System.out.print("Please enter an integer: ");
        }
    }
    public static void allBlocks(int j){//method that prints the blocks
         int t = 1;
         int m = 0;
         while (t <= j){//while loop to determine conditions
            while (m < j){
                m++;//add to the counter
                if (m == 1){// if statement to perform the stack
                    System.out.println("         1");
                    System.out.println("         -");
                }
                else if (m == 2){
                    System.out.println("        222");
                    System.out.println("        222");
                    System.out.println("        ---");
                }
                else if (m == 3){
                    System.out.println("       33333");
                    System.out.println("       33333");
                    System.out.println("       33333");
                    System.out.println("       -----");
                }
                else if (m == 4){
                    System.out.println("      4444444");
                    System.out.println("      4444444");
                    System.out.println("      4444444");
                    System.out.println("      4444444");
                    System.out.println("      -------");
                }
                else if (m == 5){
                    System.out.println("     555555555");
                    System.out.println("     555555555");
                    System.out.println("     555555555");
                    System.out.println("     555555555");
                    System.out.println("     555555555");
                    System.out.println("     ---------");
                }
                else if (m == 6){
                    System.out.println("    66666666666");
                    System.out.println("    66666666666");
                    System.out.println("    66666666666");
                    System.out.println("    66666666666");
                    System.out.println("    66666666666");
                    System.out.println("    66666666666");
                    System.out.println("    -----------");
                }
                else if (m == 7){
                    System.out.println("   7777777777777");
                    System.out.println("   7777777777777");
                    System.out.println("   7777777777777");
                    System.out.println("   7777777777777");
                    System.out.println("   7777777777777");
                    System.out.println("   7777777777777");
                    System.out.println("   7777777777777");
                    System.out.println("   -------------");
                }
                else if (m == 8){
                    System.out.println("  888888888888888");
                    System.out.println("  888888888888888");
                    System.out.println("  888888888888888");
                    System.out.println("  888888888888888");
                    System.out.println("  888888888888888");
                    System.out.println("  888888888888888");
                    System.out.println("  888888888888888");
                    System.out.println("  888888888888888");
                    System.out.println("  ---------------");
                }
                else if (m == 9){
                    System.out.println(" 99999999999999999");
                    System.out.println(" 99999999999999999");
                    System.out.println(" 99999999999999999");
                    System.out.println(" 99999999999999999");
                    System.out.println(" 99999999999999999");
                    System.out.println(" 99999999999999999");
                    System.out.println(" 99999999999999999");
                    System.out.println(" 99999999999999999");
                    System.out.println(" 99999999999999999");
                    System.out.println(" -----------------");
                }
            }
        t++;//add the counter
        }   
    }
}