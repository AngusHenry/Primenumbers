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
        System.out.println ("hi");
        boolean numbers[] = new boolean[1000];
        
        for (int i = 0; i< numbers.length;){
        if (i == 1){
                 numbers[i]= true;
           System.out.println (numbers[i]);       
        }
        i++;
        }
    }
    
}

