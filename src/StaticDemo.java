/* В данном примере в теле метода main() происходит обращение к статическому методу callme()
и статической переменной "b" по имени их класса StaticDemo
 */
class StaticDemo {
    static int a = 45;
    static int b;

    static void callme(){
        System.out.println("a = " + a);
    }
}
