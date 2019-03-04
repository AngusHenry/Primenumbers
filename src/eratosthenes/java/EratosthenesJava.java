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
        boolean[] numbers = new boolean[1001];
        int number = 1000;  
        
        for (int i = 1; i < number; i++){
            numbers[i] = true;
        }
              
      for (int p = 2; p*p <= number; p++ ){
          System.out.println ("hi" + p);
          if (numbers[p] == true){
              for (int x = p*p; p <= number; x+=p){
                  System.out.println ("hi" + x); 
                  numbers[x] = false;
                }
            }
        }
      int x = 0;
      for (int i = 2; i<= number; i++){
          if (x<= 10){
              if (numbers[i] == true){
                  System.out.print (i +", ");
                  x+=1;
              }
          }
          else if (numbers[i]== true && x > 10){
             System.out.print ("\n");
             System.out.print (i +", "); 
          }
      }
    }
    
}