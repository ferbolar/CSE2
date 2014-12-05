//Fernando Bolanos
//hw11 - Poker Hands
//12/4/2014
//Poker Hands Homework Assignment

import java.util.Scanner;
public class PokerHands {
	public static void main(String [] args){
		Scanner scan=new Scanner(System.in);
		String hand[][]=new String [5][1];
		while (true){//ask for all the inputs
			System.out.print("Enter 'y' or 'Y' to enter a(nother) hand- ");
			String yes=scan.nextLine();
			if (yes.equals("y") || yes.equals("Y")){//ask if it wants to run
				for(int i=0; i<5; i++){//ask for five cards
					System.out.print("Enter the suit: 'c', 'd', 'h', or 's'- ");
					String suit=scan.nextLine();
					if (suit.equals("c") || suit.equals("d") || suit.equals("h") || suit.equals("s")){
							System.out.print("Enter one of 'a', 'k', 'q', 'j', '10', ...'2'- ");
							String card=scan.nextLine();
							if (card.equals("a") || card.equals("k") || card.equals("q") || card.equals("j") || card.equals("10") 
									|| card.equals("9") || card.equals("8") || card.equals("7") || card.equals("6") || card.equals("5") 
									|| card.equals("4") || card.equals("3") || card.equals("2")){
								hand[i][0]=suit+card;//add both inputs
							}	
					}
					else {
						System.out.println("You did not enter a valid response");
						i--;
						continue;
					}
				}
			}
			else{
				break;
			}
			//declare variables
			String club=" ";
			String diamonds=" ";
			String spades=" ";
			String hearts=" ";
			int ace=0;
			int dos=0;
			int tres=0;
			int cuatro=0;
			int cinco=0;
			int seis=0;
			int siete=0;
			int ocho=0;
			int nueve=0;
			int diez=0;
			int jack=0;
			int queen=0;
			int king=0;
			
			for(int j=0; j<5; j++){//run to check the suit and number
				char checkArray[]={'a', '2', '3', '4', '5', '6', '7', '8', '9', 'j', 'q', 'k'};//array with every option
				char [] suitArray=new char[5];
				char [] cardArray=new char[5];
				char suit1= hand[j][0].charAt(0);//get the first letter
				char card1= (char)(hand[j][0].charAt(1));//get the second letter
				suitArray[j]=suit1;
				cardArray[j]=card1;
				if (suit1 == 'c'){//add the number to each suit
					club+=cardArray[j]+" ";
				}
				else if (suit1 == 'd'){
					diamonds+=cardArray[j]+" ";
				}
				else if (suit1 == 's'){
					spades+=cardArray[j]+" ";
				}
				else if (suit1 == 'h'){
					hearts+=cardArray[j]+" ";
				}
					
				if (checkArray[0]==(cardArray[j])){//check how many of each number is repeated
					ace++;
				}
				else if (checkArray[1]==(cardArray[j])){
					dos++;
				}
				else if (checkArray[2]==(cardArray[j])){
					tres++;
				}
				else if (checkArray[3]==(cardArray[j])){
					cuatro++;
				}
				else if (checkArray[4]==(cardArray[j])){
					cinco++;
				}
				else if (checkArray[5]==(cardArray[j])){
					seis++;
				}
				else if (checkArray[6]==(cardArray[j])){
					siete++;
				}
				else if (checkArray[7]==(cardArray[j])){
					ocho++;
				}
				else if (checkArray[8]==(cardArray[j])){
					nueve++;
				}
				else if (checkArray[9]==(cardArray[j])){
					jack++;
				}
				else if (checkArray[10]==(cardArray[j])){
					queen++;
				}
				else if (checkArray[11]==(cardArray[j])){
					king++;
				}
			}
			//print the number of each suit
			System.out.println("Clubs: "+club);
			System.out.println("Diamonds: "+diamonds);
			System.out.println("Spades: "+spades);
			System.out.println("Hearts: "+hearts);
			
			int [] checkHand={ace, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, jack, queen, king};
			int twoPair=0;
			int fullHouse=0;
			for (int w=0; w<12; w++){//check to se what type of hand you have
				for(int r=1; r<12; r++){
					if(checkHand[w]==2 && checkHand[r]==2){
						twoPair++;
					}
					else if(checkHand[w]==3 && checkHand[r]==2){
						fullHouse=1;
					}
				}
			}
			
			if (king==1 && queen==1 && jack==1 && diez==1 && nueve==1){// check to see what type of hand you got
				System.out.println("This is a royal flush");
			}
			else if(king==4 || queen==4 || jack==4 || diez==4 || nueve==4 || ocho==4 || siete==4 ||
					seis==4 || cinco==4 || cuatro==4 || tres==4 || dos==4 || ace==4){
				System.out.println("This is a four of a kind");
			}
			else if(twoPair==4){
				System.out.println("This is a two pair");
			}
			else if(fullHouse==1){
				System.out.println("This is a full house");
			}
			
		}
	}
}