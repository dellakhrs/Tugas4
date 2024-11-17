public class Barang {
    protected String kodeBarang;
    protected String namaBarang;
    protected double hargaBarang;

    // Konstruktor untuk menginisialisasi objek Barang
    public Barang(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Metode untuk menghitung total harga berdasarkan jumlah beli
    public double hitungTotal(int jumlahBeli) {
        return hargaBarang * jumlahBeli;
    }

    // Getter dan Setter untuk mendapatkan informasi barang
    public String getKodeBarang() {
        return kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public double getHargaBarang() {
        return hargaBarang;
    }
}
