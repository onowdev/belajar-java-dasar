public class SwitchStatement {
    public static void main(String[] args) {
        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Senin");
                break;
            case 2:
                System.out.println("Selasa");
                break;
            case  3:
                System.out.println("Rabu");
                break;
            case 4:
                System.out.println("Kamis");
                break;
            case 5:
                System.out.println("Jumat");
                break;
            case 6:
                System.out.println("Sabtu");
                break;
            case 7:
                System.out.println("Minggu");
                break;
        }

        int hari = 3;
        switch (hari) {
            case 6:
                System.out.println("ini Hari Sabtu");
                break;
            case 7:
                System.out.println("ini Hari Minggu");
                break;
            default:
                System.out.println("Ini Bukan Weekend");
        }
    }
}
