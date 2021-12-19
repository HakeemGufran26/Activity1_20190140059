
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Perhitungan {
    public int Harga ()
    {
        Scanner input = new Scanner(System.in);
        int hrg_kilo = 0;
        int jml_beli = 0;
        int hrg_awal;
        
        
        //menentukan harga awal dari harga per kilo di kali jumlah yang di beli
        hrg_awal = (hrg_kilo * jml_beli);
        return hrg_awal;
    }
    
     public int Diskon(int hrg_awal)
    {
        Scanner input = new Scanner(System.in);
        int diskon;
        
      
        if (hrg_awal < 16000){
            return hrg_awal;
        }
        else if(hrg_awal >= 16000 && hrg_awal < 25000)
        {
            diskon = hrg_awal * 10 / 100;
            return diskon;
        }
        else 
        {
            diskon = hrg_awal * 15/100;
            return diskon;
        }
    }  
     
    public int jumlah_diskon( int diskon, int hrg_awal) {
       
       int total_diskon;
       total_diskon = (hrg_awal = diskon);
       return total_diskon;
    }
    
     public int bayar(int hrg_awal, int total_diskon){
        
        
        int hrg_byr;
        hrg_byr = (hrg_awal - total_diskon);
        return hrg_byr;
    } 
}
//class PerhitunganDiskon{
//    public int Diskon(int hrg_awal)
//    {
//        int hrg_kilo;
//        int diskon;
//        
//      
//        if (hrg_awal < 16000){
//            return hrg_awal;
//        }
//        else if(hrg_awal >= 16000 && hrg_awal < 25000)
//        {
//            diskon = hrg_awal * 10 / 100;
//            return diskon;
//        }
//        else 
//        {
//            diskon = hrg_awal * 15/100;
//            return diskon;
//        }
//    }  
//}

//class HargaDiskon{
//    public int jumlah_diskon( int diskon, int hrg_awal) {
//        PerhitunganDiskon pd = new PerhitunganDiskon();
//        Perhitungan Dsc = new Perhitungan();
//       
//       int total_diskon;
//       total_diskon = (hrg_awal = diskon);
//       return total_diskon;
//    }
//}

//class HargaBayar{
//    public int bayar(){
//        Perhitungan Dsc = new Perhitungan();
//        HargaDiskon hd = new HargaDiskon();
//        
//        int hrg_byr;
//        hrg_byr = (Hrg_awal - total_diskon);
//        
//    }

