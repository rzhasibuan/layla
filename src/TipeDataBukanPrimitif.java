public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        // tipe data bukan primitif sederhananya adalah tipe data yang apabila tidak di isi nilainya maka otomatis akan bernilai null
        // berbeda dengan tipe data primitif yang apabila tidak di isi nilai nya maka akan memiliki nilai dafault yaitu 0 dan apabila tidak di isi pada saat pendeclarasian maka akan otomatis error



        Integer iniInteger = 1000;
        Long iniLong = 10000L;
        Byte iniByte = null;

        // data primitif
        int intInt = 100;

        // konversi ke tipe data bukan primitif
        Integer iniObject = intInt;


        System.out.println(iniObject.intValue());

    }
}
