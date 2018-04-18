/* В данном примере показано как можно одновременно задавать
аргументы переменной длинны и стандартные аргументы
 */
public class VarArgs2 {
    /* В данном примере msg - обычный параметр,
    а v - параметр переменной длины
     */
    static void vaTest2(String msg, int ... v){
        System.out.print(msg + v.length + " Содержимое: ");

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }
    public static void main(String[] args){
        vaTest2("Один параметр переменной длины: ", 10);
        vaTest2("Пять параметров переменной длины: ", 5, 2, 6, 7, 24);
        vaTest2("Без параметров переменной длины: ");
    }
}
