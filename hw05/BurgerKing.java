//Fernando Bolanos
//HW05 - Burger King
//09/25/2014
//Burger King HW Assignment
//
//It asks to enter what type of food you want
//after you choose it gives you more options to personalize.
//
//Import scanner class
    import java.util.Scanner;
    
//Define class
public class BurgerKing{
    
    //define method
    public static void main(String[ ] args) {
        
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        
        //Enter input
        System.out.println("Enter a letter to indicate the choice of");
        System.out.println("Burger (B or b)");
        System.out.println("Soda (S or s)");
        System.out.print("Fries (F or f) ");
        
        String lChoice=myScanner.nextLine();
        
        //Enter variables
        int length=lChoice.length();
        lChoice.charAt(0);
        String lToppings,lSoda,lFries;
        
        //if statement to make sure only one character is entered
        if (length<=1){
            switch (lChoice){//switch statement to choose food
                case "B": 
                    System.out.println("Enter A or a for 'all toppings'");
                    System.out.println("C or c for cheese");
                    System.out.print("N or n for none of the above ");
                    lToppings=myScanner.nextLine();
                    lToppings.charAt(0);
                   
                    switch (lToppings){//switch statement to choose toppings
                        case "A":
                            System.out.println("You ordered a burger with every topping");
                            break;
                        case "a":
                            System.out.println("You ordered a burger with every topping");
                            break;
                        case "C":
                            System.out.println("You ordered a burger with cheese");
                            break;
                        case "c":
                            System.out.println("You ordered a burger with cheese");
                            break;
                        case "N":
                            System.out.println("You ordered a burger with no toppings");
                            break;
                        case "n":
                            System.out.println("You ordered a burger with no toppings");
                            break;
                    }
                    break;
                    
                case "b": 
                    System.out.println("Enter A or a for 'all toppings'");
                    System.out.println("C or c for cheese");
                    System.out.print("N or n for none of the above ");
                    lToppings=myScanner.nextLine();
                    lToppings.charAt(0);
                    
                    switch (lToppings){// switch statement to choose toppings
                        case "A":
                            System.out.println("You ordered a burger with every topping");
                            break;
                        case "a":
                            System.out.println("You ordered a burger with every topping");
                            break;
                        case "C":
                            System.out.println("You ordered a burger with cheese");
                            break;
                        case "c":
                            System.out.println("You ordered a burger with cheese");
                            break;
                        case "N":
                            System.out.println("You ordered a burger with no toppings");
                            break;
                        case "n":
                            System.out.println("You ordered a burger with no toppings");
                            break;
                    }
                    break;
                    
                case "S":
                    System.out.println("Do you want Pepsi (P or p), Coke (C or c), ");
                    System.out.print("Sprite (S or s), or Mountain Dew (M or m)? ");
                    lSoda=myScanner.nextLine();
                    lSoda.charAt(0);
                    
                    switch (lSoda){//switch statement to choose soda
                        case "P":
                            System.out.println("You ordered a Pepsi");
                            break;
                        case "p":
                            System.out.println("You ordered a Pepsi");
                            break;
                        case "C":
                            System.out.println("You ordered a Coca Cola");
                            break;
                        case "c":
                            System.out.println("You ordered a Coca Cola");
                            break;
                        case "S":
                            System.out.println("You ordered a Sprite");
                            break;
                        case "s":
                            System.out.println("You ordered a Sprite");
                            break;
                        case "M":
                            System.out.println("You ordered a Mountain Dew");
                            break;
                        case "m":
                            System.out.println("You ordered a Mountain Dew");
                            break;
                    }
                    break;
                    
                case "s":
                    System.out.println("Do you want Pepsi (P or p), Coke (C or c), ");
                    System.out.print("Sprite (S or s), or Mountain Dew (M or m)? ");
                    lSoda=myScanner.nextLine();
                    lSoda.charAt(0);
                    
                    switch (lSoda){//switch statement to choose soda
                        case "P":
                            System.out.println("You ordered a Pepsi");
                            break;
                        case "p":
                            System.out.println("You ordered a Pepsi");
                            break;
                        case "C":
                            System.out.println("You ordered a Coca Cola");
                            break;
                        case "c":
                            System.out.println("You ordered a Coca Cola");
                            break;
                        case "S":
                            System.out.println("You ordered a Sprite");
                            break;
                        case "s":
                            System.out.println("You ordered a Sprite");
                            break;
                        case "M":
                            System.out.println("You ordered a Mountain Dew");
                            break;
                        case "m":
                            System.out.println("You ordered a Mountain Dew");
                            break;
                    }
                    break;
                
                case "F":
                    System.out.print("Do you want large or small fries? (L, l, S, or s) ");
                    lFries=myScanner.nextLine();
                    lFries.charAt(0);
                    
                    switch (lFries){//switch statement to choose fries
                        case "L":
                            System.out.println("You ordered large fries");
                            break;
                        case "p":
                            System.out.println("You ordered large fries");
                            break;
                        case "S":
                            System.out.println("You ordered a small fries");
                            break;
                        case "s":
                            System.out.println("You ordered a small fries");
                            break;
                    }
                    break;
                
                case "f":
                    System.out.print("Do you want large or small fries? (L, l, S, or s) ");
                    lFries=myScanner.nextLine();
                    lFries.charAt(0);
                    
                    switch (lFries){//switch statement to choose fries
                        case "L":
                            System.out.println("You ordered large fries");
                            break;
                        case "p":
                            System.out.println("You ordered large fries");
                            break;
                        case "S":
                            System.out.println("You ordered a small fries");
                            break;
                        case "s":
                            System.out.println("You ordered a small fries");
                            break;
                    }
                    break;
                    
                default://if an invalid character is entered
                    System.out.println("You did not enter a valid character");
                    break;
                    
            }
            
        }
        else {
            System.out.println("A single character is expected.");
        }
        
    }
}