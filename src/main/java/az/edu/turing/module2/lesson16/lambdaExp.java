package az.edu.turing.module2.lesson16;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.lang.Integer.compare;

public class lambdaExp {
    public static void main(String[] args) {
        Supplier<Integer> randomNumber = () -> 5;
        randomNumber.get();
        Consumer<Integer> integerConsumer = System.out::println;
        integerConsumer.accept(5);
        Predicate<Integer> predicate = integer -> integer < 5;
        System.out.println(predicate.test(4));
        //Print<Integer> a = System.out::println;
       // a.print(2);
        Comparator<Integer> compare = Integer::compare;
        compare(3,4);
        System.console();
         Print<Integer> a=new Print<Integer>(){
            @Override
            public int add(int a) {
                return a;
            }

            @Override
            public void print(Integer integer) {
                System.out.println(5);
            }
            public void foo(Integer i){
                System.out.println(i);
            }
        };
         a.print(5);
        System.out.println(a.add(4));

        System.out.println(LocalDate.now().getYear());

    }
}
