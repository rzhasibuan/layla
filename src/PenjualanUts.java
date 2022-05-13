public class PenjualanUts {


    public static void main(String[] args) {
        String namaBarang = "LCD";
        Integer jumlahBarang = 7;
        Integer hargaBarang = 68000;
        Integer potonganDiskon = 3;
        Integer totalHarga, totalBayar;
        totalHarga = jumlahBarang * hargaBarang;
        totalBayar = totalHarga * potonganDiskon / 100 ;

        System.out.println("Nama barang = " + namaBarang);
        System.out.println("Jumlah barang = " + jumlahBarang);
        System.out.println("Harga barang = " + hargaBarang);
        System.out.println("Potongan disko = " + potonganDiskon + "%");
        System.out.println("Total harga = " + totalHarga);
        System.out.println("Total bayar = " +totalBayar);
//        System.out.println(totalBayar);

    }


}
