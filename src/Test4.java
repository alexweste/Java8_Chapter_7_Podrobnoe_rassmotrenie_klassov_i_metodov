// Пример возврата объекта
class Test4 {
    int a;

    // создаём конструктор Test4
    Test4(int i){
        a = i;
    }

    // создаём метод incrByTen, возвращающий объект
    Test4 incrByTen(){
        Test4 temp = new Test4(a + 27);
        return temp;
    }
}
