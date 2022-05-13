public class PengunaanVariable {
    public static void main(String[] args) {
        String name;
        name = "reza afri suhangga hasibuan";
        // bisa juga mengunakan var di awal dan mendeklarikan isi dari variable tersebut
        // var nama; ini salah
        var nama = "reza afri suhangga hasibuan 2";

        // data yang tidak bisa diubah ubah mengunakan final mirip seperti constant

        final String namaku = "reza afri suhangga hasibuan";
        // namaku = "keren"; ini akan error
        System.out.println(name);
        System.out.println(nama);
        System.out.println(namaku);
    }
}
