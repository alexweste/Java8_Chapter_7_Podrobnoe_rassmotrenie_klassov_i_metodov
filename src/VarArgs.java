/* Для указания аргументов переменной длиы служат три точки (...).
Метод vaTest() можно объявить с агументами переменной длины  выражением
static void vaTest(int ... v) {}
В данной синтаксической конструкции компилятору предписывается, что
метод vaTest() может вызываться без аргументов или с несколькими
аргументами. В итоге массив v неявно объявляется как массив типа
int[]. Таким образом, в теле метода vaTest() доступ к массиву v
осуществляется с помощью синтаксиса обычного массива.
 */
// Прогорамма демонстрирует применение аргументов переменной длинны

class VarArgs {
    // Метод vaTest() объявляется с аргументами переменной длины
    static void vaTest(int ... v){
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");

        for(int x : v)
            System.out.print(x + " ");

        System.out.println();
    }
    public static void main(String[] args){
        // Обратите внимание на возможные способы вызова
        // метода vaTest() с аргументами переменной длины
        vaTest(10);        // 1 аргумент
        vaTest(1, 2, 4);   // 3 аргумента
        vaTest();              // без аргументов

    }
}