
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehmet
 */
public class sorua15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
        
        System.out.println("İfadenizi giriniz");
        String N=input.nextLine();
        int x=N.length()/2;
        for(int i=0;i<x;i++){
            System.out.print((N.charAt(i+x)));
            System.out.print((N.charAt(x+1-i)));
        }
    }
    
}
