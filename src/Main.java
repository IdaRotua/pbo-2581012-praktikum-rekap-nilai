import java.util.Scanner;

public class RekapNilai {


    static final int SELESAI = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        int jumlah =0;

        System.out.println("====REKAP NILAI KELAS===");
        System.out.println("ketik -1 kalau sudah selesai.");
        int nilai;

        //inijanagan lupa

    do{
    System.out.println("Nilai ke-" + (jumlah + 1) + " : ");
    nilai = scanner.nextInt();

    if (nilai== SELESAI) {
    break;
    }

    if (nilai < 0 || nilai > 100){
        System.out.println(" ditolak - nilai harus 0..100");
        continue; //jangan lupa!!
    }
    }
    }