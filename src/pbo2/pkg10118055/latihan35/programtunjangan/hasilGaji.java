/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118055.latihan35.programtunjangan;

/**
 *
 * @author User
 */
public class hasilGaji {
   public double gaji,tunjang; 
    public String status;
    
    public double tunjangGaji(){
    return (status.equals("menikah"))?gaji*0.35:0;
   
    }
    public double tolgat(){
        return tunjangGaji() + gaji;
    }
    public double gapok(){
    return gaji;
    }
}