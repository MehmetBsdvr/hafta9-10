
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
public class soru2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        
        System.out.println("İfadenizi giriniz");
        int N=input.nextInt();
        int[] A=new int[N]; 
        for(int i=1;i<=N;i++){
            System.out.println("(A"+i+")");
            A[i]=input.nextInt();
        }
        
        int T=0,C=1,HT=0,T2=0;
        for(int i=1;i<=N;i++){
            T=T+A[i];
            C=C*A[i];
            HT=HT+1/A[i];
            T2=(int) (T2+Math.pow(A[i], 2));
        }
        int AO=T/N,GO=(int)Math.pow(C,1/N),HO=N/HT,KHO=T2/T;
        System.out.println("Aritmetik ortalama:"+AO);
        System.out.println("Geometrik ortalama:"+GO);
        System.out.println("Harmonik ortalama:"+HO);
        System.out.println("Kontraharmonik:"+KHO);
    }
    
}
