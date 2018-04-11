/* В классе String содержится ряд методов, которыми можно пользоваться,
программируя на Java. Обсудим вкратце некоторые из них. Так, с
помощью метода equals() можно проверить две строки на равенство,
а метод length() позволяет выяснить длину символьной строки.
Вызывая метод charAt(), можно получить символ по заданному индексу.
 */
// Продемонстрируем действие методов equals() length() charAt()
// при работе с классом String
class StringDemo {
    public static void main(String[] args){
        String strOb1 = "Первая строка ";
        String strOb2 = "Вторая строка ";
        String strOb3 = strOb1;

        System.out.println("Длина строки strOb1: " + strOb1.length());
        System.out.println("Символ по индексу 3 в строке strOb1: " + strOb1.charAt(3));

        if(strOb1.equals(strOb2))
            System.out.println("strOb1 == strOb2");
        else
            System.out.println("strOb1 != strOb2");

        if(strOb1.equals(strOb3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");
    }
}
