import java.util.Scanner;

public class Kuis05Tyo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jam;
        int total = 0;
        int jumlahKendaraan = 0;
        int lamaParkirTerlama = 0;
        int lebihDari3Jam = 0;

        System.out.print("Lama parkir (jam, 0 = selesai): ");
        jam = sc.nextInt();


        while (jam != 0) {
            if (jam < 1 || jam > 24) {
                System.out.println("Input tidak valid");
                System.out.print("Lama parkir (jam, 0 = selesai): ");
                jam = sc.nextInt();
                continue;
            }
            // Tarif: jam pertama Rp 5000, jam berikutnya Rp 3000 per jam
            jumlahKendaraan++;
            int biaya = 5000 + (jam - 1) * 3000;
            total += biaya;
            if (jam > lamaParkirTerlama) {
                lamaParkirTerlama = jam;
            }
            if (jam > 3) {
                lebihDari3Jam++;
            }
            System.out.println("Biaya parkir: Rp " + biaya);

            System.out.print("Lama parkir (jam, 0 = selesai): ");
            jam = sc.nextInt();
        }
        
        System.out.println("=== RINGKASAN ===");
        System.out.println("Jumlah kendaraan : " + jumlahKendaraan);
        System.out.println("Total pemasukan  : Rp " + total);
        System.out.println("Lama parkir terlama : " + lamaParkirTerlama + " jam");
        System.out.println("Kendaraan parkir lebih dari 3 jam : " + lebihDari3Jam);
        sc.close();
    }
}

