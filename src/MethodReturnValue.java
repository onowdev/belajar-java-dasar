public class MethodReturnValue {
    public static void main(String[] args) {

        var result1 = sum(900, 800);
        System.out.println(result1);

        System.out.println(sum(900,700));

    }

    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }

}
