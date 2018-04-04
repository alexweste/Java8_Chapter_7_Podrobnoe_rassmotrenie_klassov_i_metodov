/* В данном примере демонстрируется применение члена (оператора) длины массива "length"

 */
class Length {
    public static void main(String[] args){
        int m1[] = new int[10];
        int m2[] = {1, 3, 5, 2, 6};
        int m3[] = {23, 56, 55, 55};

        System.out.println("длина m1 равна " + m1.length); // оператор "length" возвращает
        System.out.println("длина m2 равна " + m2.length); // количество переменных в массивах
        System.out.println("длина m3 равна " + m3.length); // m1, m2 и m3
    }

}
