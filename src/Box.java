/* данный класс с помощью перегрузки конструкторов Box рассчитывает объём параллелепипеда
при разных исходных условиях
 */
public class Box {
    double width;
    double height;
    double depth;

    // создаём конструктор, используемый при указании всех параметров параллелепипеда
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // создаём конструктор, используемый, если ни один параметр не указан
    Box(){
        width = 1;
        height = 1;
        depth = 1;
    }

    // создаём конструктор, используемый при создании куба
    Box(double len){
        width = height = depth = len;
    }

    // создаём метод рассчитывающий и возвращрющий объём
    double volume(){
        return width * height * depth;
    }
}