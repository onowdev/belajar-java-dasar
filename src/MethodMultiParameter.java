public class MethodMultiParameter {
    static void bioData(String nama, int usia){
        System.out.println(nama+"\\"+"berUsia"+"\\"+usia+"Tahun");
    }

    public static void main(String[] args) {
        bioData("Agus",31);
        bioData("Andra", 5);
        bioData("Devy", 31);
    }
}
