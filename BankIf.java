package percabangan;
import java.util.Scanner;
public class BankIf {
    public static void main(String[] args) {
        Scanner masukan = new Scanner (System.in);
        System.out.println("Selamat Datang di Bank Unan");
        int saldo, jumlahUang;
        saldo = 100000;
        System.out.println("saldo saat ini: Rp. " + saldo);
        
        System.out.print("Masukkan nilai uang yang mau dimasukkan: Rp. ");
        jumlahUang = masukan.nextInt();
        saldo = saldo + jumlahUang;
        
        System.out.println("Saldo saat ini: Rp." + saldo); 
        System.out.print("Masukkan uang yang ingin anda ambil: Rp. ");
        jumlahUang = masukan.nextInt();
        
        saldo = saldo - jumlahUang;
        if (jumlahUang < saldo){
            System.out.println("Saldo anda tidak mencukupi");
        } else{
            System.out.println("Saldo saat ini: Rp. " + saldo);
        }
    }
}
