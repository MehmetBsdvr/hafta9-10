
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
public class soru5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input=new Scanner(System.in);
        
        System.out.println("İfadenizi giriniz");
        String N=input.nextLine();
        
        for(int i=N.length()-1;i>=0;i--){
            char h=N.charAt(i);
            if(h%2==0){
                System.out.print(Character.toUpperCase(h));
            }
            else{
                System.out.print(h+" ");
            }
        }
    }
    
}
