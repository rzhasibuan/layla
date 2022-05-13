public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        // konversi tipe data number ada 2
        // 1. widening casting (otomatis) byte->short->int->long->float->double
        byte iniByte = 10;
        short iniShort = iniByte;
        int iniInt = iniShort;


        // 2. narrowing casting (manual) double->float->long->int->chart->short->byte
        int iniInt2 = 1000;
        short iniShort2 = (short) iniInt2;
        System.out.println(iniShort2);
    }
}
