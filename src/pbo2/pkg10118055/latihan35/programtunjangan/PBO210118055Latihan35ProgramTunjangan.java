/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PBO210118055Latihan35ProgramTunjangan {
 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("==========================================");
        Scanner userInput = new Scanner (System.in);
        hasilGaji input = new hasilGaji();
         System.out.print("Berapa gaji pokok anda perbulan?: ");  
           input.gaji = userInput.nextDouble();
       
       
         System.out.println("Berapa gaji pokok anda perbulan?: "+input.gaji);  
        System.out.println("status anda?");
        input.status = userInput.next();
        System.out.println("==========================================");
        
         System.out.println("gaji pokok:"+input.gapok());
          System.out.println("tunjangan:"+input.tunjangGaji());
           System.out.println("total gaji:"+input.tolgat());
    }
    
}
