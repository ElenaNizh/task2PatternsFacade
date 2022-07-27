public class Main {
    public static void main(String[] args) {
        BinOps bins = new BinOps();
        //демонстрация


        String resultSum = bins.sum("10011", "1000"); //19 и 8
        String resultMult = bins.mult("1001", "1001"); // 9 и 9


        System.out.println("Результат суммы в двоичной записи: "
                + resultSum);
        System.out.println("Результат умножения в двоичной записи: "
                + resultMult);
    }
}