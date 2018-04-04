// В данном примере прказан вариант класса Stack с членом длины масива "length"
class Stack2 {
    private int stck[];
    private int tos;

    // выделяем память под стек и инициализируем его
    Stack2(int size) {
        stck = new int[size];
        tos = -1;
    }

    // размещаем элемент в стеке
    void push(int item){
        if(tos==stck.length-1)  // применили член длины массива "length"
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    // извлекаем элемент из стека
    int pop(){
        if(tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos++];
    }
}
