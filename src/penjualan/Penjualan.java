package penjualan;

public class Penjualan {
    String nama, nama_barang;
    Integer jumlah;
    Integer bunus,harga;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public void setBunus(Integer bunus) {
        this.bunus = bunus;
    }

    public void setJumlah(Integer jumlah) {
        this.jumlah = jumlah;
    }

    public String getNama() {
        return nama;
    }

    public Integer getHarga() {
        return harga;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public Integer getJumlah() {
        return jumlah;
    }

    public Integer getBunus() {
        return bunus;
    }
}
