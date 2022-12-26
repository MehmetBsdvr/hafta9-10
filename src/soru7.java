
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
public class soru7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfadenizi giriniz");
        String N=input.nextLine();
        
        int s=0;
        for(int i=0;i<N.length();i++){
            int r=(s%4);
            if(r<2){
                System.out.print(Character.toLowerCase(N.charAt(i)));           
            }
            else{
                System.out.print(Character.toUpperCase(N.charAt(i)));
            }
            s=s+1;
        }
                
    }
    
}
