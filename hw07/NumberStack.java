//Fernando Bolanos
//HW07 - Number Stack
//10/20/2014
// Number Stack HW Assignment
//
//The propgram uses for, while, and do-while loops
//to display number stacks.

import java.util.Scanner;//import scanner

public class NumberStack{//define class
    
    public static void main(String[] args){//define method
        
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        
        //define variables
        int number1;
        int n=1;
        int m=0;
        int o=0;
        int f=0;
        
        System.out.print("Enter an integer between 1 - 9: ");//ask for input
        
        if (myScanner.hasNextInt()){//conditions
           number1=myScanner.nextInt();
            if (number1 > 0 && number1 <= 9){//conditions
                System.out.println("With while loop:");
                while (n <= number1){//while loop to determine conditions
                        while (m < number1){
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
                    n++;//add the counter
                }   
                System.out.println("With do while loop:");
                do { o++;// do, performs the program one time
                    if (o == 1){// if statement that does the stack 
                        System.out.println("         1");
                        System.out.println("         -");
                    }
                    else if (o == 2){
                        System.out.println("        222");
                        System.out.println("        222");
                        System.out.println("        ---");
                    }
                     else if (o == 3){
                        System.out.println("       33333");
                        System.out.println("       33333");
                        System.out.println("       33333");
                        System.out.println("       -----");
                    }
                    else if (o == 4){
                        System.out.println("      4444444");
                        System.out.println("      4444444");
                        System.out.println("      4444444");
                        System.out.println("      4444444");
                        System.out.println("      -------");
                    }
                    else if (o == 5){
                        System.out.println("     555555555");
                        System.out.println("     555555555");
                        System.out.println("     555555555");
                        System.out.println("     555555555");
                        System.out.println("     555555555");
                        System.out.println("     ---------");
                    }
                    else if (o == 6){
                        System.out.println("    66666666666");
                        System.out.println("    66666666666");
                        System.out.println("    66666666666");
                        System.out.println("    66666666666");
                        System.out.println("    66666666666");
                        System.out.println("    66666666666");
                        System.out.println("    -----------");
                    }
                    else if (o == 7){
                        System.out.println("   7777777777777");
                        System.out.println("   7777777777777");
                        System.out.println("   7777777777777");
                        System.out.println("   7777777777777");
                        System.out.println("   7777777777777");
                        System.out.println("   7777777777777");
                        System.out.println("   7777777777777");
                        System.out.println("   -------------");
                    }
                    else if (o == 8){
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
                    else if (o == 9){
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
                } while (o < number1);//condition to perform do while loop
                
                System.out.println("With for loop:");
                
                for (f = 0; f <= number1; f++){//for loop for the stack
                    if (f == 1){// if statement that does the stack
                        System.out.println("         1");
                        System.out.println("         -");
                    }
                    else if (f == 2){
                        System.out.println("        222");
                        System.out.println("        222");
                        System.out.println("        ---");
                    }
                     else if (f == 3){
                        System.out.println("       33333");
                        System.out.println("       33333");
                        System.out.println("       33333");
                        System.out.println("       -----");
                    }
                    else if (f == 4){
                        System.out.println("      4444444");
                        System.out.println("      4444444");
                        System.out.println("      4444444");
                        System.out.println("      4444444");
                        System.out.println("      -------");
                    }
                    else if (f == 5){
                        System.out.println("     555555555");
                        System.out.println("     555555555");
                        System.out.println("     555555555");
                        System.out.println("     555555555");
                        System.out.println("     555555555");
                        System.out.println("     ---------");
                    }
                    else if (f == 6){
                        System.out.println("    66666666666");
                        System.out.println("    66666666666");
                        System.out.println("    66666666666");
                        System.out.println("    66666666666");
                        System.out.println("    66666666666");
                        System.out.println("    66666666666");
                        System.out.println("    -----------");
                    }
                    else if (f == 7){
                        System.out.println("   7777777777777");
                        System.out.println("   7777777777777");
                        System.out.println("   7777777777777");
                        System.out.println("   7777777777777");
                        System.out.println("   7777777777777");
                        System.out.println("   7777777777777");
                        System.out.println("   7777777777777");
                        System.out.println("   -------------");
                    }
                    else if (f == 8){
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
                    else if (f == 9){
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
            }
        }
    }
}