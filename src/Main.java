public class Main {

    public static void main(String[] args) {

        Calc calc = Calc.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);

        //В строчке далее мы разрываем пространство и время пытаясь поделить три на ноль!
        int c = calc.devide.apply(a, b);

        //для теста
        calc.println.accept(calc.abs.apply(-3));
        //для теста
        calc.println.accept(calc.pow.apply(5));

        calc.println.accept(calc.multiply.apply(3, 5));

        System.out.println(calc.isPositive.test(-7));

        calc.println.accept(c);

    }
}