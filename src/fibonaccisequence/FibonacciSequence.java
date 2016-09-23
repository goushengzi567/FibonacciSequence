/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fibonaccisequence;

/**
 *
 * @author apple1
 */
import java.util.*;
public class FibonacciSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.println("Please enter the number of items:");
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       System.out.println("The item at "+n+" is "+cal(n));
       
    }
    private static int cal(int e){
         int c;
        if(e==1||e==2) {
            c=1; 
            return c;
        } else{
        c = cal(e-1)+cal(e-2);
        return c;
        }
        
    }
}
