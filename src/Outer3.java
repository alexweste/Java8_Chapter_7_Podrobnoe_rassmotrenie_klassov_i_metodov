/*Внутренние классы можно определять и в области действия любого
блока кода. Например, вложенный класс можно определить в блоке кода,
относящегося к методу, или даже в теле цикла for:

// Определяем внутренний класс в цикле for
class Outer3 {
    int oter_x = Integer.valueOf(args [0]);

    void test() {
        for(int i=0; i<10; i++){
            class Inner3{
                void display(){
                    System.out.println("вывод: outer_x = " + outer_x);
                }
            }
            Inner3 inner = new Inner3();
            inner.display();
        }
    }
}
 */
