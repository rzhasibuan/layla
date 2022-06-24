package penjualan;

public class main extends Penjualan{

    public static void main(String[] args) {
       Penjualan jual = new Penjualan();
       float totalbayar = 0;
       float bonus = 0;
       float jumlah = 0;

       jual.setNama("reza afri suhangga hasibuan");
       jual.setNama_barang("laptop asus vivobook");
       jual.setHarga(4000000);
       jual.setJumlah(11);

       if(jual.getJumlah() > 10){
           jumlah = jual.getHarga() * jual.getJumlah();
           bonus = jumlah * 15 / 100;
           totalbayar = jumlah - bonus;
       }else{
           bonus = 0;
           totalbayar = jual.getHarga() * jual.getJumlah();
       }

        System.out.println("nama pembeli :" + jual.getNama());
        System.out.println("nama barang :" + jual.getNama_barang());
        System.out.println("jumlah beli :" + jual.getJumlah());
        System.out.println("bonus : Rp. " + bonus);
        System.out.println("total bayar : Rp. " + String.format("%.2f", totalbayar));


    }
}
