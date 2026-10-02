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

        // do-while dipakai karena nilai pertama harus diminta dulu sebelum ada yang bisa dicek terhadap sentinel.

    do{
    System.out.println("Nilai ke-" + (jumlah + 1) + " : ");
    nilai = scanner.nextInt();

    if (nilai== SELESAI) {
    break;
    }

    if (nilai < 0 || nilai > 100){
        System.out.println(" ditolak - nilai harus 0..100");
        continue; //lewati sisa isi loop pada putaran ini, lalu lanjut ke putaran berikutnya." Loop-nya tidak berhenti. Hanya putaran yang sedang berjalan yang dipotong
    }
        char grade;
        if (nilai >= 90) {
            grade = 'A';
        } else if (nilai >= 80) {
            grade = 'B';
        } else if (nilai >= 70) {
            grade = 'C';
        } else if (nilai >= 60) {
            grade = 'D';
        } else {
            grade = 'E';
            // Percobaan urutan dibalik (nilai >= 60 ditaruh paling atas), hasil dijalankan:
            // nilai 85 jadi Grade D — Kurang (bukan B). Kondisi >= 60 sudah benar untuk 85,
            // jadi else if sisanya tidak pernah dicek. Ladder dievaluasi dari atas ke bawah
            //dan berhenti di kondisi pertama yang true, jadi kondisi paling ketat harus di atas.
        }

        String keterangan = switch (grade) {
            case 'A' -> "Sangat Baik";
            case 'B' -> "Baik";
            case 'C' -> "Cukup";
            case 'D' -> "Kurang";
            default  -> "Tidak Lulus";
        };

        System.out.println("  Grade " + grade + " — " + keterangan);

        total += nilai;
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