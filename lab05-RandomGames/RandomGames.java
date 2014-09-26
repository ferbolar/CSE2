//Fernando Bolanos
//lab05 - Random Games
//09/25/2014
//Random Games Lab Assignment
//
//It asks to enter string which will choose a game to play and 
//it will display the result of the random game.
//
//Import scanner class
    import java.util.Scanner;
    
//Define class
public class RandomGames{
    
    //define method
    public static void main(String[ ] args) {
        
        Scanner myScanner;
        myScanner=new Scanner( System.in);
        
        //Enter variables
        int length,number;
        String card="";
        int card1=0;
        String suit="suit";
        
        //Enter input
        System.out.print("Enter R or r for Roulette, C or c for craps, P or p for pick a card: ");
        
        String lGame=myScanner.nextLine();
        
        length=lGame.length();
        
        if (length<=1){
            if (lGame.equals("R")||lGame.equals("r")){
                int roulette= (int)(Math.random()*37);
                switch (roulette){
                    case 37: number=00;
                    System.out.println("Roulette is: "+number);
                    break;
                    default: 
                    System.out.println("Roulette is: "+roulette);
                    break;
                }
                
            }
            else if (lGame.equals("c")||lGame.equals("C")){
                int die1=(int)(Math.random()*6+1);
                int die2=(int)(Math.random()*6+1);
                int craps=die1+die2;
                System.out.println("Craps: "+die1+" + "+die2+" = "+craps);
                
            }
            else if (lGame.equals("P")||lGame.equals("p")){
                int nCard=(int)(Math.random()*13+1);
                int nSuit=(int)(Math.random()*4+1);
                switch (nCard){
                    case 1: card="Ace";
                    break;
                    case 2: card="2";
                    break;
                    case 3: card="3";
                    break;
                    case 4: card="4";
                    break;
                    case 5: card="5";
                    break;
                    case 6: card="6";
                    break;
                    case 7: card="7";
                    break;
                    case 8: card="8";
                    break;
                    case 9: card="9";
                    break;
                    case 10: card="10";
                    break;
                    case 11: card="Jack";
                    break;
                    case 12: card="Queen";
                    break;
                    case 13: card="King";
                    break;
                }
                
                switch (nSuit){
                    case 1: suit="Hearts";
                    break;
                    case 2: suit="Diamond";
                    break;
                    case 3: suit="Spades";
                    break;
                    case 4: suit="Clubs";
                    break;
                }
                System.out.println("Pick a card: "+card+" of "+suit);
            }
            else {
                System.out.println("Invalid character.");
            }
        }
        else {
            System.out.println("A single character is expected");
        }
    }
}