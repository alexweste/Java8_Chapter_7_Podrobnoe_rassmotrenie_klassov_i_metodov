// создаём класс с объектом в качестве парамтров
class Test {
    int a, b;

    // создаём конструктор Test
    Test(int i, int j){
        a = i;
        b = j;
    }

    // создаём переменную c типа Test и помещаем её в метод equals, который возвращает
    // true, если заданные переменные a и b совпадают и false - если не совпадают
    boolean equals(Test c){
        if(c.a == a && c.b == b) return true;
        else return false;
    }
}
