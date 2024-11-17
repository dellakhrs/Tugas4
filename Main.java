import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try { //Exception
            // Input untuk No Faktur
            System.out.print("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();

            // Input untuk Kode Barang
            System.out.print("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            // Input untuk Nama Barang
            System.out.print("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();

            // Input untuk Harga Barang
            System.out.print("Masukkan Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            // Input untuk Jumlah Beli
            System.out.print("Masukkan Jumlah Beli: ");
            int jumlahBeli = scanner.nextInt();

            // Validasi input
            if (hargaBarang <= 0) {
                throw new IllegalArgumentException("Harga barang harus lebih besar dari 0.");
            }

            if (jumlahBeli <= 0) {
                throw new IllegalArgumentException("Jumlah beli harus lebih besar dari 0.");
            }

            // Membuat objek Transaksi
            Transaksi transaksi = new Transaksi(noFaktur, kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Menampilkan transaksi
            transaksi.tampilkanTransaksi();

        } catch (Exception e) { //Exception
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally { //Exception
            scanner.close();
        }
    }
}
