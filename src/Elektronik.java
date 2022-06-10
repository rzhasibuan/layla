public class Elektronik {
    public String merek, berat, warna, ram;

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBerat(String berat) {
        this.berat = berat;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getWarna() {
        return warna;
    }

    public String getMerek() {
        return merek;
    }

    public String getBerat() {
        return berat;
    }

    public String getRam() {
        return ram;
    }

    public void tampilanElektoronik () {
        System.out.println("merek : " +getMerek());
        System.out.println("berat : " +getBerat() );
        System.out.println("ram : " +getRam());
        System.out.println("warna : "+getWarna() );
    }
}
