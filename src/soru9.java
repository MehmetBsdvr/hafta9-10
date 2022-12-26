
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
public class soru9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("İfadenizi giriniz");
        String A=input.nextLine();
        
        char[] B={'a','e','ı','i','o','ö','u','ü'};
        int[] yer=new int[255];
        int s=0;
        for(int i=0;i<A.length();i++){
            char h=Character.toLowerCase(A.charAt(i));
            for(int j=1;j<8;j++){
                if(h==B[j]){
                    s=s+1;
                    yer[s]=(i);
                }
            }      
        }
        System.out.println("Sesli arflerin sayısı:"+s);
        for(int i=0;i<s;i++){
            System.out.print(yer[i]+"\t");
        }
    }
    
}
