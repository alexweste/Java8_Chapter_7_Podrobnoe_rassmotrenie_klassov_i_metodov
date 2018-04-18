/*Перегрузка методов с аргументами переменной длины
  В данной прогпамме метод vaTest3() перегружается три раза
 */
public class VarArgs3 {
    static void vaTest3(int ... v){
        System.out.print("vaTest(int ...): " +
                        "Количество аргументов: " + v.length +
                        " Содержимое: ");

        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest3(boolean ... v){
        System.out.print("vaTest(boolean ...): " +
                "Количество аргументов: " + v.length +
                " Содержимое: ");
        for(boolean x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest3(String msg, int ... v) {
        System.out.print("vaTest(String, int ...): " +
                msg + v.length +
                " Содержимое: ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    static void vaTest3( int x) {
        System.out.print("vaTest(int ): " +
                "Количество аргументов: 1" +
                " Содержимое: ");

            System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args){
        vaTest3(3, 3+3, 4);
        vaTest3("Проверка: ", 7, 6*10);
        vaTest3(true, false, true);
        vaTest3(5);
    }
}
