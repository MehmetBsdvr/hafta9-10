
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
public class sorua17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfadenizi giriniz");
        String N=input.nextLine();
        
        int x=N.length()/2;
        for(int i=x;i>=0;i--){
            System.out.print(N.charAt(i)+" ");
        }
        for(int j=x+1;j>=0;j--){
            System.out.print(N.charAt(j)+" ");
        }
    }
    
}
