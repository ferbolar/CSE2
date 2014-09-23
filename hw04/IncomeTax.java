//Fernando Bolanos
//hw04 - Income Tax
//09/22/2013
//Income Tax HW assignment
//
//It asks you to enter your income in thousands
//after you enter an integer it displays your income tax
//
//Import scanner class
    import java.util.Scanner;
    
//Define class
public class IncomeTax{
    
    //define method
    public static void main(String[ ] args) {
        
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        
        //Enter Variable
        double tax1=5.0;
        double tax2=7.0;
        double tax3=12.0;
        double tax4=14.0;
        double totalTax, totalTax1;
        
        //Enter input
        System.out.print("Enter income in thousands: ");
        
        //If statement for integer
        if (myScanner.hasNextInt()){
            int income=myScanner.nextInt();
            int income1=income*1000;
            
            //If statements
            if (income>=0){
                
                if (income>20){ //if statement for number between 0-19
                
                    if (income>40){ //if statement for numbers between 20-39
                    
                        if (income>78){ //if statement for numbers between 40-77
                        
                           if (income >=78){ //if statement for numbers 78 and up
                           
                                totalTax=income1*(tax4/100);
                                totalTax1=(int)totalTax;
                                System.out.println("The tax rate on $"+income+",000 is "+tax4+"% and the tax is $"+totalTax1);
                               
                           }
                           else {
                                
                           }
                            
                        }
                        else {
                            totalTax=income1*(tax3/100);
                            totalTax1=(int)totalTax;
                            System.out.println("The tax rate on $"+income+",000 is "+tax3+"% and the tax is $"+totalTax1);
                        }
                    } 
                    else {
                        totalTax=income1*(tax2/100);
                        totalTax1=(int)totalTax;
                        System.out.println("The tax rate on $"+income+",000 is "+tax2+"% and the tax is $"+totalTax1); 
                    }
                }
                else {
                  totalTax=income1*(tax1/100);
                  totalTax1=(int)totalTax;
                  System.out.println("The tax rate on $"+income+",000 is "+tax1+"% and the tax is $"+totalTax1);
                  
                }
            }
            else {
                System.out.println("You did not enter an integer > 0.");
            }
        }    
                   
        else {
            System.out.println("You did not enter an integer.");
        }
            
    }
}