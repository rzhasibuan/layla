import java.util.Scanner;

public class HitungLuasSegitiga {
    public static void main(String[] args) {
        Double luas;
        int alas, tinggi;
        Scanner baca = new Scanner(System.in);

        System.out.println("program hitung luas segitiga");
        System.out.println("input alas segitiga");
        alas = baca.nextInt();

        System.out.println("input tinggi segitiga");
        tinggi = baca.nextInt();

        luas = Double.valueOf((alas * tinggi) / 2);
        System.out.println("luas " + luas);

    }
}
