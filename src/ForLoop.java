public class ForLoop {
    public static void main(String[] args) {
        var counter = 1;

        for (;counter <=10;){
            System.out.println("Perulangan ke-" +counter);
            counter++;
        }
        //For dengan initStatement

        for (var hitung = 1; hitung <=10;){ // letakkan Var di dalam kurung for
            System.out.println("For initstatement ke-" + hitung);
            hitung++;
        }
        //For dengan PostStatement

        for (var bilangan = 1; bilangan <=10; bilangan++){
            System.out.println("ForPostStatement ke-" + bilangan);
        }
    }
}
