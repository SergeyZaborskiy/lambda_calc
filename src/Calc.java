import java.util.function.*;

public class Calc {

    static Supplier<Calc> instance = Calc::new;

    //по предлодению идеи заменил лямбду ссылкой на статичный метод
    BinaryOperator<Integer> plus = Integer::sum;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

    //С помощью тернарного оператора решаем проблему деления на ноль и спасаем вселенную
    BinaryOperator<Integer> devide = (x, y) -> y != 0 ? x / y : y;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
