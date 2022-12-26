
import java.util.Random;
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
public class soru6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        Random rnd=new Random();
        System.out.println("İfadenizi giriniz");
        String N=input.nextLine();
        
        for(int i=0;i<N.length();i++){
            int X=rnd.nextInt(10);
            if(X%2==0){
                System.out.print(Character.toLowerCase(N.charAt(i)));
            }
            else{
                System.out.print(Character.toUpperCase(N.charAt(i)));
            }
        }
        
    }
    
}
