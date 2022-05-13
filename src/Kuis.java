public class Kuis {
    Integer nilai_1, nilai_2, nilai_3;
    double hasil;


    public void setNilai(int nilai1,int nilai2, int nilai3){
        nilai_1 = nilai1;
        nilai_2 = nilai2;
        nilai_3 = nilai3;
    }

    public double getNilai() {
        hasil = (nilai_1 + nilai_2 + nilai_3) / 3;

        if(hasil >= 60){
            System.out.println("lulus");
        }else{
            System.out.println("gagal");
        }
        return  hasil;
    }

    public static void main(String[] args) {
        Kuis Kuisku = new Kuis();
        Kuisku.setNilai(60,60,60);
        System.out.println("Dengan nilai rata-rata " + Kuisku.getNilai());
    }

}
