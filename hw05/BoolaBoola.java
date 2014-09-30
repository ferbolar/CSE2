//Fernando Bolanos
//HW05 - Boola Boola
//09/25/2014
//Boola Boola HW Assignment
//
//It asks to enter string which will choose a game to play and 
//it will display the result of the random game.
//
//Import scanner class
    import java.util.Scanner;
    
//Define class
public class BoolaBoola {
    
    //define method
    public static void main(String[ ] args) {
        
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        
        //Define variables
        boolean x1=true;
        boolean x2=true;
        boolean x3=true;
        int d1,d2,d3,d4;
        String lChoice;
    
        //choose random number for variables
        d1=(int)(Math.random()*11+1);
        d2=(int)(Math.random()*11+1);
        d3=(int)(Math.random()*11+1);
        d4=(int)(Math.random()*5+1);
    
        //switch statement to define true or false
        switch (d1){//get value of first variable
            case 1: x1=true;
            break;
            case 2: x1=true;
            break;
            case 3: x1=true;
            break;
            case 4: x1=true;
            break;
            case 5: x1=true;
            break;
            case 6: x1=false;
            break;
            case 7: x1=false;
            break;
            case 8: x1=false;
            break;
            case 9: x1=false;
            break;
            case 10: x1=false;
            break;
            
        }
        switch (d2){//get value on second variable
            case 1: x2=true;
            break;
            case 2: x2=true;
            break;
            case 3: x2=true;
            break;
            case 4: x2=true;
            break;
            case 5: x2=true;
            break;
            case 6: x2=false;
            break;
            case 7: x2=false;
            break;
            case 8: x2=false;
            break;
            case 9: x2=false;
            break;
            case 10: x2=false;
            break;
            
        }
        switch (d3){//get value of third variable
            case 1: x3=true;
            break;
            case 2: x3=true;
            break;
            case 3: x3=true;
            break;
            case 4: x3=true;
            break;
            case 5: x3=true;
            break;
            case 6: x3=false;
            break;
            case 7: x3=false;
            break;
            case 8: x3=false;
            break;
            case 9: x3=false;
            break;
            case 10: x3=false;
            break;
            
        }
        
        //turn formula into boolean
        boolean a1=x1||x2||x3;
        boolean a2=x1||x2&&x3;
        boolean a3=x1&&x2||x3;
        boolean a4=x1&&x2&&x3;
        
        switch (d4){//switch statement to do random numbers
            case 1:
                System.out.println("Does "+x1+" || "+x2+" || "+x3+" have the value true (T or t) or false (F or f)? ");
                lChoice=myScanner.nextLine();
                if (lChoice.equals("T") && a1==true){
                    System.out.println("Correct");
                }
                else if (lChoice.equals("t") && a1==true){
                    System.out.println("Correct");
                }
                else if (lChoice.equals("F") && a1==false){
                    System.out.println("Correct");
                }
                else if (lChoice.equals("f") && a1==false){
                    System.out.println("Correct");
                }
                else {
                    System.out.println("Wrong. Try again.");
                }
            break;
                
            case 2:// second way to put it
                System.out.println("Does "+x1+" || "+x2+" && "+x3+" have the value true (T or t) or false (F or f)? ");
                lChoice=myScanner.nextLine();
                if (lChoice.equals("T") && a2==true){
                    System.out.println("Correct");
                }
                else if (lChoice.equals("t") && a2==true){
                    System.out.println("Correct");
                }
                else if (lChoice.equals("F") && a2==false){
                    System.out.println("Correct");
                }
                else if (lChoice.equals("f") && a2==false){
                    System.out.println("Correct");
                }
                else {
                    System.out.println("Wrong. Try again.");
                }
            break;
                
            case 3://third case of ways to put it
                System.out.println("Does "+x1+" && "+x2+" || "+x3+" have the value true (T or t) or false (F or f)? ");
                lChoice=myScanner.nextLine();
                if (lChoice.equals("T") && a3==true){
                    System.out.println("Correct");
                }
                else if (lChoice.equals("t") && a3==true){
                    System.out.println("Correct");
                }
                else if (lChoice.equals("F") && a3==false){
                    System.out.println("Correct");
                }
                else if (lChoice.equals("f") && a3==false){
                    System.out.println("Correct");
                }
                else {
                    System.out.println("Wrong. Try again.");
                }
            break;
                
            case 4://fourth case of ways to put it 
                System.out.println("Does "+x1+" && "+x2+" && "+x3+" have the value true (T or t) or false (F or f)? ");
                lChoice=myScanner.nextLine();
                if (lChoice.equals("T") && a4==true){
                    System.out.println("Correct");
                }
                else if (lChoice.equals("t") && a4==true){
                    System.out.println("Correct");
                }
                else if (lChoice.equals("F") && a4==false){
                    System.out.println("Correct");
                }
                else if (lChoice.equals("f") && a4==false){
                    System.out.println("Correct");
                }
                else {
                    System.out.println("Wrong. Try again.");
                }
            break;      
            
        }
        
    
    }
}