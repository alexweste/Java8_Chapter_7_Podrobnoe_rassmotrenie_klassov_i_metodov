// вычисляем объём параллелепипеда с перегрузкой конструктора
public class OverloadCons {
    public static void main(String[] args){
        /* создаём параллелепипеды: 1) со всеми исходными данными; 2) без исходных данных;
        3) задаём параметр куба;
         */
        Box mybox1 = new Box(5, 21, 37);
        Box mybox2 = new Box(3);
        Box mybox3 = new Box();


        // выводим результаты вычисления всех объёмов
        System.out.println("Объём mybox1 равен: " + mybox1.volume());
        System.out.println("Объём mybox2 равен: " + mybox2.volume());
        System.out.println("Объём mybox3 равен: " + mybox3.volume());
    }
}
