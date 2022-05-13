public class KuisHotel {
    String kodePelangan, namaPelangan, kodeKamar;
    Integer lamaNginap, tarifPermalam;
    Integer totalBayar;
    double pajak, diskon;
    double jumlahBayar;

    public void setPelangan(String kode_pelangan, String nama_pelangan, String kode_kamar, Integer lama_nginap, Integer tarif_permalam){
        kodePelangan = kode_pelangan;
        namaPelangan = nama_pelangan;
        kodeKamar = kode_kamar;
        lamaNginap = lama_nginap;
        tarifPermalam = tarif_permalam;
    }

    public double getPelangan(){
        totalBayar = lamaNginap * tarifPermalam;
        pajak = 0.1 * totalBayar;
        if (totalBayar >= 6000000){
            diskon = 0.05;
        }else{
           diskon = 0;
        }

        jumlahBayar = totalBayar + pajak - diskon;

        return  jumlahBayar;
    }

    public static void main(String[] args) {
        KuisHotel kuisHotelni1 = new KuisHotel();
        KuisHotel kuisHotelni2 = new KuisHotel();
        KuisHotel kuisHotelni3 = new KuisHotel();

        kuisHotelni1.setPelangan("k001", "riska", "1", 2, 2100000);
        kuisHotelni2.setPelangan("k002", "lili", "2", 3, 1300000);
        kuisHotelni3.setPelangan("k003", "karin", "3", 1, 1100000);

        System.out.println("jumlah yang harus di bayar " + kuisHotelni1.namaPelangan + " " + kuisHotelni1.getPelangan());
        System.out.println("jumlah yang harus di bayar " + kuisHotelni2.namaPelangan + " " + kuisHotelni2.getPelangan());
        System.out.println("jumlah yang harus di bayar " + kuisHotelni3.namaPelangan + " " + kuisHotelni3.getPelangan());

    }
}
