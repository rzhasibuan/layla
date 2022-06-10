public class Biodata {
    private String nama,nis, kode_mk, mata_kuliah;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public void setKode_mk(String kode_mk) {
        this.kode_mk = kode_mk;
    }

    public void setMata_kuliah(String mata_kuliah) {
        this.mata_kuliah = mata_kuliah;
    }

    public String getNis() {
        return nis;
    }

    public String getNama() {
        return nama;
    }

    public String getKode_mk() {
        return kode_mk;
    }

    public String getMata_kuliah() {
        return mata_kuliah;
    }

    public void tampilkanBiodata()
    {
        System.out.println("Nama = " + getNama());
        System.out.println("Nis = " + getNis());
        System.out.println("Kode MK = " + getKode_mk());
        System.out.println("Mata Kuliah = " + getMata_kuliah());
    }

}
