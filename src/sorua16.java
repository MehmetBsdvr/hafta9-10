
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
public class sorua16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfadenizi giriniz");
        String N=input.nextLine();
        
        for(int i=0;i<N.length();i++){
            System.out.print(N.charAt(i)+"=>");
            for(int j=0;j<N.charAt(i)-96;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    
}
