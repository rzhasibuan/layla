public class Mobil {

    public String warna, merek, roda, tipe, harga;

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setRoda(String roda) {
        this.roda = roda;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }

    public String getRoda() {
        return roda;
    }

    public String getTipe() {
        return tipe;
    }

    public String getWarna() {
        return warna;
    }

    public String getHarga() {
        return harga;
    }

    public void tampilDetail(){
        System.out.println("Merek mobil " + getMerek());
        System.out.println("jumlah roda " + getRoda());
        System.out.println("tipe mobil " + getTipe());
        System.out.println("warna mobil " +getWarna());
        System.out.println("harga mobil ini adalah ");
    }
}
