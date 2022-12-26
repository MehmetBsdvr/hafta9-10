
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
public class soru8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("İfadeniz giriniz");
        String A=input.nextLine();
        
        System.out.println("Karakterinizi giriniz");
        char B=input.nextLine().charAt(0);
        
        System.out.println("Yeni harf giriniz");
        char C=input.nextLine().charAt(0);
        
        
        char[] K=new char[255];
        for(int i=0;i<A.length();i++){
            K[i]=A.charAt(i);
            if(K[i]==B){
                K[i]=C;
            }
        }
        for(int i=0;i<A.length();i++){
            System.out.print(K[i]+" ");
        }
    }
    
}
