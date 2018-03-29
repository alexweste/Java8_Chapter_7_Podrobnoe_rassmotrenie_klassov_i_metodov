// Данный класс с помощью метода fact расчитывает и выводит значения факториалов
class Recursion {
    public static void main(String[] args){
        Factorial f = new Factorial();

        System.out.println("Факториал 2 равен: " + f.fact(2));
        System.out.println("Факториал 5 равен: " + f.fact(5));
        System.out.println("Факториал 7 равен: " + f.fact(7));
    }
}
