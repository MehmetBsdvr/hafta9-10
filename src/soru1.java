
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
public class soru1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfadenizi giriniz");
        int N=input.nextInt();
        int[] A=new int[N];       
        int[] B=new int[N];
        
        int sc=0;
        for(int i=1;i<N;i++){
            System.out.println("(A"+i+")"+" (B"+i+")");
            A[i]=input.nextInt();
            B[i]=input.nextInt();   
            
        } 
        for(int i=1;i<N;i++){
            sc=sc+A[i]*B[i];
        }
        System.out.println("İki dizinin carpımı:"+sc);
        
        
        
        
        
        
        
    }
    
}
