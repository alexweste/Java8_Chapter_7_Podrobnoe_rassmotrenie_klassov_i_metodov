class OverloadCons2 {
    public static void main(String[] args){
        // создаём объекты параллелепипедов, используя разные конструкторы
        Box2 mybox1 = new Box2(12, 57, 18);
        Box2 mybox2 = new Box2();
        Box2 mybox3 = new Box2(5);

        // создаём копию объекта mybox1
        Box2 mybox4 = new Box2(mybox1);

        // получаем объёмы всех параллелепипедов
        System.out.println("Объём mybox1 равен: " + mybox1.volume());
        System.out.println("Объём mybox2 равен: " + mybox2.volume());
        System.out.println("Объём mybox3 равен: " + mybox3.volume());
        System.out.println("Объём mybox4 равен: " + mybox4.volume());


    }
}
