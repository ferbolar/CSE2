/* Insert System.out.println() statements in the code
 * below, displaying the status of n and k, which 
 * should help you identify when n  or k becomes 0 and causes
 * the program to crash
 */

import java.util.Scanner;
public class Enigma3{
  public static void main(String [] arg){
    int n=40,k=60;
    String out="";
    switch(k%14){
      case 12: 
      case 13: out+=13;
         break;
      default: out+=40;
          n/=3;
          k-=7;
    }

    if(n*k%12< 12){
      n-=20;
      out+=n;
    }

    if(n*n>k){
      n=42;
      out+=n+k;
    }
    else {
      n=45;
      out+=n+k;
    }
    System.out.println(n);
    System.out.println(k);
    switch(n+k){
      case 114: 
        n-=11;
        k-=3;
        break;
      case 97:
        n-=14;
        k-=2;
        break;
      case 98:
        n/=5;
        k/=9;
      default:
        n-=3;
        k-=4;
    }
    System.out.println(n);
    System.out.println(k);
     out+=1/n + 1/k;   
    System.out.println(out);
  }
}

/*
 * Error report:
 * The whole program runs smoothely until it hits the last switch statement.
 * When n and k enter the switch statement their values are 45 and 53, so it 
 * will go into case 98. This will turn n into 9 and k into 5. Since the is no 
 * break in this case, it will go to default which will substract 3 from n and 5 from k.
 * Since k = 5 the new value for k will be 0. So when it goes into line 54, it will give
 * you an arithmetic error. 
 */