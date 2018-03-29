/* рекурсия. Рекурсия в java - это средство, которое позволяет методу вызывать самого себя
Данный метод вычисляет факториал
 */
class Factorial {
    // создаём рекурсивный метод
    double fact(double n){
        double result;
        if(n==1) return 1;
        result = fact(n-1) * n;
        return result;
    }
}
