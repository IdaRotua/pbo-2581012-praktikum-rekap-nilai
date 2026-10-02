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
        char grade;
        if (nilai >= 60) {
            grade = 'D';
        } else if (nilai >= 70) {
            grade = 'C';
        } else if (nilai >= 80) {
            grade = 'B';
        } else if (nilai >= 90) {
            grade = 'A';
        } else {
            grade = 'E';   //jangan lupa ini terbalik

        }
        String keterangan = switch (grade) {
            case 'A' -> "Sangat Baik";
            case 'B' -> "Baik";
            case 'C' -> "Cukup";
            case 'D' -> "Kurang";
            default  -> "Tidak Lulus";
        };

        System.out.println("  Grade " + grade + " — " + keterangan);

        total += nilai; // augmented assignment
        jumlah++;       // pencacah hanya naik untuk nilai sah

    } while (nilai != SELESAI);

        System.out.println();
        System.out.println("Nilai sah   : " + jumlah);

        // Jaga kasus tidak ada nilai sah supaya tidak membagi dengan nol
        if (jumlah == 0) {
            System.out.println("Rata-rata   : -");
            System.out.println("Status      : -");
        } else {
            double rata = total / jumlah;
            String status = rata >= 60 ? "LULUS" : "TIDAK LULUS"; // ternary
            System.out.println("Rata-rata   : " + String.format("%.2f", rata));
            System.out.println("Status      : " + status);
        }

        scanner.close();
    }
}


