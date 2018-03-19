public class Overload {
    public static void main(String[] args){
        OverloadDemo ob = new OverloadDemo();
        double result;

        // Вызываем все варианты метода test()
        ob.test();
        ob.test(4);
        ob.test(6, 93);
        result = ob.test(58.91);
        System.out.println("Результат вызова ob.test(58.91): " + result);
    }
}
