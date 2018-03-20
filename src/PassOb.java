// сравниваем объекты, передаваемые методу equals из класса Test в качестве параметров
public class PassOb {
    public static void main(String[] args){
        Test ob1 = new Test(5, 1); //создаём объекты
        Test ob2 = new Test(5, 1);
        Test ob3 = new Test(54, 13);
        Test ob4 = new Test(54, 13);
        Test ob5 = new Test(53, 13);

        // обращаемся к методу equals чтобы сравнить созданные объекты и выводим результат
        System.out.println("ob1 == ob2: " + ob1.equals(ob2));
        System.out.println("ob1 == ob3: " + ob1.equals(ob3));
        System.out.println("ob3 == ob4: " + ob3.equals(ob4));
        System.out.println("ob1 == ob5: " + ob1.equals(ob5));
    }
}
