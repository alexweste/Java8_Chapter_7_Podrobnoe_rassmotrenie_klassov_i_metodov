/*Подобно существованию массивов объектов любого другого типа,
могут существовать и массивы символьных строк.
 */
//Программа демонстрирует пример применения массивов объектов типа
//String
class StringDemo3 {
    public static void main(String[] args){
        String str[] = { "один", "два", "три"};

        for(int i=0; i<str.length; i++)
            System.out.println("str["+ i + "]: " + str[i]);
    }
}
