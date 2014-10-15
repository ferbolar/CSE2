//Fernando Bolanos
//lab06-Roulette
//10/13/2014
//Roulette Assignment
//
//This program will perform 100,000 trys of a game of roulette picking random
//numbers and then it will display the results in terms of profit and loss.



public class Roulette{//define class
    
    public static void main(String [] args){//define method
        
        //Enter variables
        int n=0;
        int m=0;
        int profit=0;
        int number=0;
        int number1=0;
        int loss=0;
        int total=0;
        int totalLoss=0;
        
            while (m<=1000){//first while loop performing the 100 tries for 1000 times
                while (n<=100){//while loop performing the roulette game 100 times
                    int x = (int)(Math.random()*37);//choosing random number
                    int roulette= (int)(Math.random()*37);
                    switch (roulette){//when the roulette hits 37 turn into 00
                        case 37: roulette=00;
                        break;
                        default: 
                        break;
                    }
                    if (roulette==x){
                        number++;//counter for when the number hits
                        number1++;//counter for how many times you win
                    }

                    n++; 
                    if (number>=3){//if statement to count how many times you make a profit
                    profit++;
                    
                    }
                    else if (number==0){
                    loss++;
                    }
                    if (loss==100){//count the amount of times you loose everything
                        totalLoss++;
                        loss=0;
                    }
                    
                }
                n=0;
                m++;
                number=0;
                total=number1*36;//take profit in total
            }
                System.out.println("The number of times with total loss: "+totalLoss);
                System.out.println("The number of times with profit: "+profit);
                System.out.println("The amount of total profit: $"+total);
    }
}