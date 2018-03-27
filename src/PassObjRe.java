// Покажем как изменения объекта в теле метода оказывают влияние на объект,
// указываемый в качестве аргумента
class PassObjRe {
    public static void main(String[] args){
        Test3 ob = new Test3(10, 20);
        System.out.println("ob.a и ob.b до вызова: " + ob.a + " " + ob.b);

        // Вызываем метод meth
        ob.meth(ob);
        System.out.println("ob.a и ob.b после вызова метода meth равны: " + ob.a + " " + ob.b);

    }
}
