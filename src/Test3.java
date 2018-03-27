// Объекты передаются по ссылке на них
class Test3 {
    int a, b;

    //Создаём конструктор
    Test3(int i, int j){
        a = i;
        b = j;
    }

    // передаём объект методу
    void meth(Test3 o){
        o.a *= 2;
        o.b /= 2;
    }
}
