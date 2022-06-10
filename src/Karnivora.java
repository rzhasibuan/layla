public class Karnivora {
    public double berat;
    public String makanan, nama, jenis, lokasi;

    public void setBerat(double berat) {
        this.berat = berat;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }

    public void setMakanan(String makanan) {
        this.makanan = makanan;
    }

    public String getNama() {
        return nama;
    }

    public double getBerat() {
        return berat;
    }

    public String getJenis() {
        return jenis;
    }

    public String getLokasi() {
        return lokasi;
    }

    public String getMakanan() {
        return makanan;
    }

    public void tampilanDetail(){
        System.out.println("nama" + getNama());
        System.out.println("berat" + getBerat());
        System.out.println("makanan" + getMakanan());
        System.out.println("jenis" + getJenis());
        System.out.println("lokasi" + getLokasi());
    }
}
