public class IFStatementPzn {
    public static void main(String[] args) {

        var nilai = 88;
        var absen = 70;
      //Penjabaran panjang Perbandingannya
        var lulusNilai= nilai >= 75;
        var lulusAbsen= absen >=75;
        var lulus = lulusNilai && lulusAbsen;

        if(nilai >=75 && absen >=75){ //Atau bisa juga langsung di tuliskan Kondisionalnya
            System.out.println("Selamat Anda Lulus");
        } else { //Jika Kondisi If tidak memenuhi bisa di tambahkan Else condition
            System.out.println("Silahkan Coba Lagi Tahun Depan");
        }

        // Menambahkan Kondisi Percabangan dg Else .. if

        if(nilai >=75 && absen >=75){
            System.out.println("Nilai Anda A");
        }else if (nilai >=70 && absen >=70){
            System.out.println("Nilai Anda B");
        }else if (nilai >=60 && absen >=60){
            System.out.println("Nilai Anda C");
        }else{
            System.out.println("Nilai Anda D");
        }
    }
}
