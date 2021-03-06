/* Внутренний класс имеет доступ ко всем элементам своего внешнего
кдасса, но не наоборот. Члены внутреннего класса доступны только в
области действия внутреннего класса и не могут быть использованы
внешним классом. Как показано в привеленном ниже примере программы,
переменная "y" объявлена как переменная экземпляра класса Inner.
Поэтому она недоступна за пределами этого класса и не может
использоваться в методе showy().

// Эта программа не подлежит компиляции
// Внешний класс
class Outer2 {
    int outer_x = 100;

    void test() {
        Inner2 inner = new Inner2();
        inner.display();
    }

    // Внутренний класс
    class Inner2 {
        int y = 10; // "y" - локальная переменная класса Inner
        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }
    //void showy() {
        System.out.println(y); // ошибка, так как переменная "y" тут
                                // недоступна



   // }

}

class InnerClassDemo2 {
    public static void main(String[] args){
        Outer3 outer = new Outer3();
        outer.test();
    }
}
*/