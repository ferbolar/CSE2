import java.util.Scanner;
public class Enigma2{
  public static void main(String [] args){
    int n=40,k=60;
    String out="";
    switch(n){
      case 12: 
      case 13: out+=13;
      case 40: out+=40/1;
    }
    System.out.println(out);
  }
}

/*
 * Error Report: Explain how you can use the java.lang exception to
 *     identify the runtime error in the above code.
 * 
 * The java.lang told me that there was an error in line 9, and there is
 * 40 is divided by 0 which is an error. This is why the program has a  
 * runtime error. I just changed the 0 for a 1 and this fixed the problem,
 * the value of out is 40.
 */
