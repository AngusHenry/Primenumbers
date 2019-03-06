/*
 * Angus Henry 
 *28/02/2019
 * EratosthenesJava.java
 * This program finds prime numbers
 */

package eratosthenes.java;

/**
 *
 * @author anhen3335
 */
public class EratosthenesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // Decalre array
        boolean[] numbers = new boolean[1000];
        // Convert all numbers to true
        for (int i = 1; i < numbers.length; i++){
            numbers[i] = true;
        }
      // Find the prime numbers        
      for (int p = 2; p*p <= numbers.length;){
          if (numbers[p] == true){
              for (int x = p*p; p <= numbers.length; x+=p){
                 if (x < numbers.length){
                     numbers[x] = false;
                 } else {
                     p++;
                 }
                }
            }
        }
      // Print out the numbers in a block
      int x = 0;
      for (int i = 2; i< numbers.length; i++){
          if (x<= 10){
              if (numbers[i] == true){
                  System.out.print (i +", ");
                  x+=1;
              }
          }
          else if (numbers[i]== true && x > 10){
             System.out.print ("\n");
             System.out.print (i +", "); 
            // reset the x variable to 0
             x = 0;
          }
      }
    }
    
}