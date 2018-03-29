/* В данном примере рекурсивный метод printArray()выводит первые i элементов из массива values
 Ещё один пример реурсии
 */
class RecTest {
    int values[];
    RecTest(int i){
        values = new int[i];

    }

    // рекурсивно выводим элементы массива
    void printArray(int i){
        if(i==0) return;
        else printArray(i-1);
        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}
