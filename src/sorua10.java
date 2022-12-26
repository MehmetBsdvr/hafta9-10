
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
public class sorua10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfadesini giriniz");
        String N=input.nextLine();
        
        char[] sesli={'a','e','ı','i','u','ü','o','ö'};
        
        String K1=" ";
        String K2=" ";
        
        
        for(int i=0;i<N.length();i++){           
            for(int j=0;j<8;j++){
            if(N.charAt(i)==sesli[j]){
                K1=K1+N.charAt(i);  
            }
            else{
                K2=K2+N.charAt(i);
            }
        }
        }
        System.out.println("Sesli harfleri:"+K1);
        System.out.println("Sessiz harfler:"+K2);
    }
    
}
