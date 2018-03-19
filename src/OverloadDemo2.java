// создаём класс OverloadDemo2, в котором отсутсовует метод test(int a) по сравнению с
// классом OverloadDemo
class OverloadDemo2 {

    // Перегружаемый метод без параметров
    void test(){
        System.out.println("Параметры отсутствуют");
    }

    // Перегружаемый метод с одним целочисленны параметром test(int a) отсутствует

    // Перегружаемый метод, в котором проверяется наличие двух целочисленных параметров
    void test(int a, int b){
        System.out.println("a и b: " + a + " " + b);
    }
    // Перегружаемый метод, в котором проверяется параметрa типа double
    void test(double a) {
        System.out.println("Внутреннее преобразование при вызове метода test(double) a: " + a);
    }
}
// Применяем в программе автоматическое преобразование типов int в double
class Overload2{
    public static void main(String[] args){
        OverloadDemo2 ob = new OverloadDemo2();
        int i = 94;

        // Вызываем все варианты метода test()
        ob.test();
        ob.test(30, 85);
        ob.test(i); // Так как в классе OverloadDemo2 отсутствует метод test(int i), в данном
                    // случае экземпляр ob вызывает метод test(double a), а переменная i преобразуется
                    // к типу double
        ob.test(103.54); // здесь непосредственно экземпляр ob вызывает метод test(double a)

    }
}