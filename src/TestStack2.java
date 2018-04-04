// Вариани класса TestStack, который работает с экземпляром класса Stack2
class TestStack2 {
    public static void main(String[] args){
        Stack2 mystack1 = new Stack2(5);
        Stack2 mystack2 = new Stack2(8);


        // вводим числа в стек
        for(int i=0; i<5; i++) mystack1.push(i);
        for(int i=0; i<8; i++) mystack1.push(i);

        // извлекаем эти числа из стека
        System.out.println("Стек в mystack1: ");
        for(int i=0; i<5; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек в mystack2: ");
        for(int i=0; i<8; i++)
            System.out.println(mystack2.pop());
    }
}
