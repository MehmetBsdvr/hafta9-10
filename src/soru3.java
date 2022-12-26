
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
public class soru3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfadenizi giriniz");
        String A=input.nextLine();
        
        System.out.println("Karekterinizi giriniz");
        char B=input.nextLine().charAt(0);
        int s=0;
        int[] c=new int[100];
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)==B){
                s=s+1;
                c[s-1]=i+1;
            }
        System.out.println("HARF SAYISI:"+s);
        
       }
        for(int i=1;i<s;i++){
            System.out.println(c[i]+" ");
        }
    }
    
}
