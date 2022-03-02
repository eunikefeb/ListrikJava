/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listrik;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Listrik {
int hitung;
    static int hitung(int gol, int jumlah) {
        int hasil=0;

        if (gol == 1){
            hasil = jumlah *1000;
            if(hasil<50000)
            hasil = 50000;
        }else if (gol == 2){
            hasil = jumlah *1300;
            if (hasil<50000){
            hasil = 50000;
            }
        }else if (gol == 3){
            hasil = jumlah *1500;
            if (hasil<50000);
            hasil = 50000;
        }else{
            System.out.println("Kamu salah input golongan");
        }
        int hasilakhir = hasil + 13000;
        return hasilakhir;
    }
    
    public static void main(String[] args) {
        int IDPelanggan[]={1,2,3,4};
        String NamaPelanggan[]={"Galuh", "Indro", "Jedi", "Kanu"};
        int GolonganPelanggan[]={1,2,3,4};
        String AlamatPelanggan[]={"Sawojajar", "Kedungkandang", "Ijen", "Dinoyo"};
        
        System.out.print("Masukkan ID: ");
        Scanner inputID = new Scanner(System.in);
        String Id = inputID.nextLine();
        System.out.print("Masukkan jumlah kwh: ");
        Scanner inputJumlah = new Scanner(System.in);
        String Jumlah = inputJumlah.nextLine();
        
        System.out.println("-------------------------");
        
        int a= Integer.valueOf(Id); //id pelanggan
        int b= Integer.valueOf(Jumlah); //jumlah dalam kwh
        int tagihan = hitung(GolonganPelanggan[a-1], b);
        
        System.out.println("ID Pelanggan: "+a);
        System.out.println("Nama Pelanggan: "+NamaPelanggan[a-1]);
        System.out.println("Golongan Pelanggan: "+GolonganPelanggan[a-1]);
        System.out.println("Alamat Pelanggan: "+AlamatPelanggan[a-1]);
        System.out.println("Jumlah kwh: "+b);
        System.out.println("Tagihan: "+tagihan);
    }
}

