public class TipeDataArray {
    public static void main(String[] args) {

        String[] arrayString;
        arrayString = new String[4];

        arrayString[0] = "Agus";
        arrayString[1] = "Sugiono";
        arrayString[2] = "Andra";
        arrayString[3] = "Sugiono";

    //Array Initializer

        int[] arrayInt = new int[]{
          10, 90, 80, 99, 900
        };
    // Array Long
        long[] arrayLong = {
                10,90,90000,9,9999
        };
    // Array di dalam array
        String[][] members ={
                {"Agus", "Sugiono", "Pranoto"},
                {"Devy", "Ramadhani"},
                {"Andra"}
        };
        // Akses Array dalam array
        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][0]);
        System.out.println(members[2][0]);

        System.out.println(arrayLong[4]);
        System.out.println(arrayInt[3]);
        System.out.println(arrayString[0]);
        System.out.println(arrayString[1]);
        System.out.println(arrayString[2]);
        System.out.println(arrayString[3]);
        // Mencari panjang array dengan Perintah Length

        System.out.println(arrayLong.length);
    }
}
