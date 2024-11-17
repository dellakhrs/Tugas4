public class Transaksi extends Barang { //inheritance
    private String noFaktur;
    private int jumlahBeli;
    private double total;

    // Konstruktor untuk menginisialisasi objek Transaksi
    public Transaksi(String noFaktur, String kodeBarang, String namaBarang, double hargaBarang, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang);
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
        this.total = hitungTotal(jumlahBeli);
    }

    // Metode untuk menampilkan detail transaksi
    public void tampilkanTransaksi() {
        System.out.println("No Faktur: " + noFaktur);
        System.out.println("Kode Barang: " + getKodeBarang());
        System.out.println("Nama Barang: " + getNamaBarang());
        System.out.println("Harga Barang: Rp " + getHargaBarang());
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total Harga: Rp " + total);
    }

    // Getter untuk No Faktur
    public String getNoFaktur() {
        return noFaktur;
    }

    public double getTotal() {
        return total;
    }
}
