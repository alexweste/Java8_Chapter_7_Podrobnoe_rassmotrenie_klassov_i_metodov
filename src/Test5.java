/*В этой программе демонстрируется отличие
 модификаторов public и private
 */
class Test5{
    int a;          // сдесь доступ определяется по умолчанию
    public int b;   // доступ открыт
    private int c;  // доступ закрыт

    // создаём метод доступа к члену с данного класса
    void setc(int i) {  // устанавливаем значение члена "c" данного класса
        c = i * 20;
    }
    int getc(){     // возвращается значение члена "c" данного класса
        return c;
    }
}